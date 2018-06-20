import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void deckCanPopulate(){
        deck.populate();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void deckCheckFirstCard(){
        deck.populate();
        String foundCard = deck.getCards().get(0).niceName();
        assertEquals("Ace of Hearts", foundCard);
    }

    @Test
    public void deckCanShuffle(){
        deck.populate();
        deck.shuffle();
        String foundCard = deck.getCards().get(0).niceName();
        assertNotSame("Ace of Hearts", foundCard);
    }

    @Test
    public void deckCanRemoveCard(){
        deck.populate();
        deck.removeCard();
        assertEquals(51, deck.getCards().size());
    }
}
