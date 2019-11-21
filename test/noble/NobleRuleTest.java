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
    private OldMaidTable _table;
    private OldMaidRule _rule;


    @Before public void setUp() throws Exception{
      NoblePlayer p1 = new NoblePlayer("太郎1", _master, _table, _rule);
      p1.receiveCard(new Card(Card.SUIT_SPADE, 5));
      Card [] cards = new Card(Card.SUIT_SPADE, 4);
      _table.putCard(cards);


    }

  }

  public static void main(String[] args){
		org.junit.runner.JUnitCore.main(NobleRuleTest.class.getName());
	}
}
