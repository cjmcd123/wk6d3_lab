import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

public class PlayerTest {

    Player player1;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Craig");
        deck = new Deck();
        deck.populate();
    }

    @Test
    public void playerHasName(){
        assertEquals("Craig", player1.getName());
    }

    @Test
    public void playerHasHand(){
        assertEquals(0, player1.getHand().size());
    }

    @Test
    public void playerStartsValueZero(){
        assertEquals(0, player1.getHandValue());
    }

    @Test
    public void playerCanTakeCard(){
        player1.takeCard(deck);
        assertEquals(1, player1.getHand().size());
        assertEquals(51, deck.getCards().size());
    }
}
