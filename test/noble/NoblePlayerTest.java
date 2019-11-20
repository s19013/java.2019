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


  public static class テーブルに出す{
    private NobleMaster _master;
    private NobleTable _table;
    private NobleRule _rule;
    @Before
    public void setUp() throws Exception {
      _master = new NobleMaster();
      _table = new NobleTable();
      Card [] cards = new Card []{
        new Card(Card.SUIT_CLUB, 5)
      };
      _table.putCard(cards);
      _rule = new NobleRule();

    }

    @Test
    public void テーブルに出せる() throws Exception {
      NoblePlayer p1 = new NoblePlayer("太郎1", _master, _table, _rule);
      p1.receiveCard(new Card(Card.SUIT_CLUB, 1));
      p1.receiveCard(new Card(Card.SUIT_CLUB, 3));

      NoblePlayer p2 = new NoblePlayer("太郎", _master, _table, _rule);

      p1.play(p2);
    }
  }

  public static class テーブルに出せない{
    private NobleMaster _master;
    private NobleTable _table;
    private NobleRule _rule;
    @Before
    public void setUp() throws Exception {
      _master = new NobleMaster();
      _table = new NobleTable();
      Card [] cards = new Card []{
        new Card(Card.SUIT_CLUB, 5)
      };
      _table.putCard(cards);
      _rule = new NobleRule();

    }

    @Test
    public void テーブルに出せない() throws Exception {
      NoblePlayer p1 = new NoblePlayer("太郎1", _master, _table, _rule);
      p1.receiveCard(new Card(Card.SUIT_CLUB, 4));

      NoblePlayer p2 = new NoblePlayer("太郎", _master, _table, _rule);

      p1.play(p2);
    }

  }
  public static class 上がり{
    private NobleMaster _master;
    private NobleTable _table;
    private NobleRule _rule;
    @Before
    public void setUp() throws Exception {
      _master = new NobleMaster();
      _table = new NobleTable();
      Card [] cards = new Card []{
        new Card(Card.SUIT_CLUB, 5)
      };
      _table.putCard(cards);
      _rule = new NobleRule();
    }

    @Test
    public void テーブルに出せる() throws Exception {
      NoblePlayer p1 = new NoblePlayer("太郎1", _master, _table, _rule);
      p1.receiveCard(new Card(Card.SUIT_CLUB, 1));

      NoblePlayer p2 = new NoblePlayer("太郎", _master, _table, _rule);
      p2.receiveCard(new Card(Card.SUIT_CLUB, 1));
      _master.registerPlayer(p1);
      _master.registerPlayer(p2);



      p1.play(p2);
    }
  }







	// エントリーポイント
	public static void main(String[] args)
  {
		org.junit.runner.JUnitCore.main(NoblePlayerTest.class.getName());
	}
}
