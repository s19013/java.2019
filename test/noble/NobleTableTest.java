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
public class NobleTableTest {

  public static class コンストラクタの動作確認 {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void コンストラクタ() throws Exception{
      NobleTable instance = new NobleTable();
      assertThat((instance instanceof NobleTable), is(true));
    }
  }

  public static class カードを置く_見る{
    private NobleTable _table;
    @Test
    public void putAndGet() throws Exception{
      Card [] cards = new Card []{
        new Card(Card.SUIT_CLUB, 5)
      };
      _table.putCard(cards);
      // assertThat(cards,is(5));
      Card [][] b= _table.getCards();
      assertThat(b,is(5));
    }
  }

  public static class toStringtest{
    private NobleTable _table;
    @Test
    public void put() throws Exception{
      Card [] card1 = new Card []{
        new Card(Card.SUIT_CLUB, 5)
      };
      _table.putCard(card1);
      _table.getCards();
      String A = _table.toString();
    assertThat(A,is("C5"));
    }
  }







  public static void main(String[] args){
    org.junit.runner.JUnitCore.main(NobleTableTest.class.getName());
  }
}
