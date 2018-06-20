import java.util.ArrayList;
import java.util.*;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck(){
        cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void populate() {
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card removeCard() {
        Card takenCard = cards.get(0);
        cards.remove(0);
        return takenCard;
    }
}
