import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(ArrayList<Player> players, Deck deck){
        this.players = players;
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void dealCards() {
        for (Player player : players){
            player.takeCard(this.deck);
        }
    }

    public String comparePlayerHands() {
        int player1Hand = players.get(0).getHandValue();
        int player2Hand = players.get(1).getHandValue();

        if (player1Hand > player2Hand){
            return players.get(0).getName() + " wins";
        } if (player1Hand == player2Hand){
            return "Draw";
        } else {
            return players.get(1).getName() + " wins";
        }
    }

    public void dealMultipleCards(int numCards) {
        for (int i = 0; i < numCards; i++){
            dealCards();
        }
    }

}
