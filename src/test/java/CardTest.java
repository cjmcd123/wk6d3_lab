import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.SeparatorUI;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.KING, card.getRank());
    }

    @Test
    public void canGetValueFromCard(){
        assertEquals(10, card.getValueFromRank());
    }

    @Test
    public void canGetName(){
        assertEquals("King of Hearts", card.niceName());
    }

    @Test
    public void canGetCardSuitValue(){
        assertEquals("Hearts", card.getValueFromSuit());
    }
}
