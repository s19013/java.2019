import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.runner.RunWith;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.Theories;
import org.junit.Test;
import org.junit.Before;
import trump.Card;
import trump.Master;
import trump.Hand;
import trump.Joker;
import trump.Player;
import trump.Table;
import trump.Rule;

@RunWith(Enclosed.class)
public class MasterTest {


  public static class コンストラクタの動作確認 {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void コンストラクタ() throws Exception{
      Master instance = new Master();
      assertThat((instance instanceof Master), is(true));
    }
  }

  public static class Masterクラスの動作確認 {

    private Master _master;
    private Player _player1;
    private Player _player2;
    private Table _table;
    private Rule _rule;
    private Hand _hand;

    @Before
    public void setUp() throws Exception {
      _master = new Master();
      _table = new OldMaidTable();
      _rule = new OldMaidRule();
      _hand = createTrump();
      _player1 = new OldMaidPlayer("太郎", _master, _table, _rule);
      _player2 = new OldMaidPlayer("花子", _master, _table, _rule);
    }

    @Test
    public void registerPlayerの動作確認() throws Exception{
      // ユーザを登録
      _master.registerPlayer(_player1);
      _master.registerPlayer(_player2);

      // ゲームの準備をする
      _master.prepareGame(_hand);

      // ゲームを開始する
      _master.startGame();
    }

    /**
     * 52枚のトランプを生成する。
     *
     * @return トランプを格納したHand
     */
    private static Hand createTrump() {
        Hand trump = new Hand();

        // 各スート52枚のカードを生成する

        for (int number = 1; number <= 13; number++) {
            trump.addCard(new Card(Card.SUIT_CLUB, number));
            trump.addCard(new Card(Card.SUIT_DIAMOND, number));
            trump.addCard(new Card(Card.SUIT_HEART, number));
            trump.addCard(new Card(Card.SUIT_SPADE, number));

        }
        trump.addCard(new Joker());
        return trump;
    }
  }

	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(MasterTest.class.getName());
	}
}
