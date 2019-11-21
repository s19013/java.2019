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
public class NobleRuleTest {


  public static class コンストラクタの動作確認 {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void コンストラクタ() throws Exception{
      NobleRule instance = new NobleRule();
      assertThat((instance instanceof NobleRule), is(true));
    }
  }

  public static class カードを探す{
    private Hand _hand;
    private NobleTable _table;
    private NobleRule _rule;
    private NobleMaster _master;

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
    public void test() throws Exception{
      NoblePlayer p1 = new NoblePlayer("太郎1", _master, _table, _rule);
      p1.receiveCard(new Card(Card.SUIT_CLUB, 1));
      p1.receiveCard(new Card(Card.SUIT_CLUB, 3));
      NoblePlayer p2 = new NoblePlayer("太郎", _master, _table, _rule);

      p1.play(p2);
      _table.getCards();
      String A = _table.toString();

      assertThat(A,is("CA \n"));

    }

  }



	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(NobleRuleTest.class.getName());
	}
}
