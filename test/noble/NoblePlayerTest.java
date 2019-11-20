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

@RunWith(Enclosed.class)
public class NoblePlayerTest {


  public static class コンストラクタの動作確認 {

    private NobleMaster _master;
    private NobleTable _table;
    private NobleRule _rule;

    @Before
    public void setUp() throws Exception {
      _master = new NobleMaster();
      _table = new NobleTable();
      _rule = new NobleRule();
    }

    @Test //キャラは生成セれたので成功
    public void コンストラクタ() throws Exception{
      NoblePlayer instance = new NoblePlayer("太郎", _master, _table, _rule);
      assertThat(instance.toString(), is("太郎"));
    }
  }

  public static class 順番指定の動作確認 {
    private NobleMaster _master;
    private NobleTable _table;
    private NobleRule _rule;

    @Before
    public void setUp() throws Exception {
      _master = new NobleMaster();
      _table = new NobleTable();
      _rule = new NobleRule();

    }

    @Test
    public void 順番を見る() throws Exception{
      NoblePlayer instance1 = new NoblePlayer("太郎", _master, _table, _rule);
      NoblePlayer instance2 = new NoblePlayer("太郎", _master, _table, _rule);
      instance1.play(instance2);
      // assertThat()

    }

  public static class テーブルに出す{
    
  }



  //     Hand expected = new Hand();
  //     expected.addCard(new Card(Card.SUIT_CLUB, 1));
  //     expected.addCard(new Card(Card.SUIT_SPADE, 4));
  //     expected.addCard(new Joker());
  //
  //     NoblePlayer instance = new NoblePlayer("太郎", _master, _table, _rule);
  //     instance.receiveCard(new Card(Card.SUIT_CLUB, 1));
  //     instance.receiveCard(new Card(Card.SUIT_DIAMOND, 2));
  //     instance.receiveCard(new Card(Card.SUIT_HEART, 3));
  //     instance.receiveCard(new Card(Card.SUIT_SPADE, 4));
  //     instance.receiveCard(new Card(Card.SUIT_HEART, 2));
  //     instance.receiveCard(new Card(Card.SUIT_DIAMOND, 3));
  //     instance.receiveCard(new Joker());
  //     Hand hand_ = instance.showHand();
  //     assertThat(hand_, IsHand.handof(expected));
  //
  //   }
  //
  //   @Test
  //   public void 全てそろったカードを配る() throws Exception{
  //
  //     int expected = 0; // サイズが0であることを確認
  //
  //     NoblePlayer instance = new NoblePlayer("太郎", _master, _table, _rule);
  //     // CA, D2, H3, S4, H2, D3, HA, C4
  //     instance.receiveCard(new Card(Card.SUIT_CLUB, 1)); // CA
  //     instance.receiveCard(new Card(Card.SUIT_DIAMOND, 2)); // D2
  //     instance.receiveCard(new Card(Card.SUIT_HEART, 3)); // H3
  //     instance.receiveCard(new Card(Card.SUIT_SPADE, 4)); // S4
  //     instance.receiveCard(new Card(Card.SUIT_HEART, 2)); // H2
  //     instance.receiveCard(new Card(Card.SUIT_DIAMOND, 3)); // D3
  //     instance.receiveCard(new Card(Card.SUIT_HEART, 1)); // HA
  //     instance.receiveCard(new Card(Card.SUIT_CLUB, 4));
  //     Hand hand_ = instance.showHand();
  //     int size = hand_.getNumberofCards();
  //     assertThat(size, is(expected));
  //
  //   }
	// }
  //
  // public static class playの動作確認 {
  //   private NobleMaster _master;
  //   private NobleTable _table;
  //   private NobleRule _rule;
  //   private NoblePlayer taro;
  //   private NoblePlayer hanako;
  //
  //   @Before
  //   public void setUp() throws Exception {
  //     _master = new NobleMaster();
  //     _table = new NobleTable();
  //     _rule = new NobleRule();
  //     taro = new NoblePlayer("太郎", _master, _table, _rule);
  //     taro.receiveCard(new Card(Card.SUIT_DIAMOND, 1));
  //     taro.receiveCard(new Card(Card.SUIT_DIAMOND, 2));
  //     taro.receiveCard(new Card(Card.SUIT_HEART, 3));
  //     taro.receiveCard(new Card(Card.SUIT_SPADE, 4));
  //     taro.receiveCard(new Joker());
  //
  //     hanako = new NoblePlayer("花子", _master, _table, _rule);
  //     hanako.receiveCard(new Card(Card.SUIT_HEART, 2));
  //     hanako.receiveCard(new Card(Card.SUIT_DIAMOND, 3));
  //     hanako.receiveCard(new Card(Card.SUIT_DIAMOND, 13));
  //
  //   }
  //
  //   @Test
  //   public void 引いたカードが揃う() throws Exception{
  //
  //     Hand expected = new Hand();
  //     expected.addCard(new Card(Card.SUIT_SPADE, 1));
  //     expected.addCard(new Card(Card.SUIT_SPADE, 4));
  //     expected.addCard(new Joker());
  //
  //     taro.play(hanako);
  //     taro.play(hanako);
  //
  //     Hand hand_ = taro.showHand();
  //     // assertThat(hand_, IsHand.handof(expected));
  //   }
  //
    }


	// エントリーポイント
	public static void main(String[] args)
  {
		org.junit.runner.JUnitCore.main(NoblePlayerTest.class.getName());
	}
}
