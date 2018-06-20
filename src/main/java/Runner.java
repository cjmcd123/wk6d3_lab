import java.util.ArrayList;
import java.util.Scanner;




public class Runner {

    public static void main(String[] args) {
        System.out.println("Player1, type your name:");
        Scanner scanner = new Scanner(System.in);
        String player1name = scanner.nextLine();
        System.out.println("Player2, type your name:");
        Scanner scanner1 = new Scanner(System.in);
        String player2name = scanner1.nextLine();
        Player player1 = new Player(player1name);
        Player player2 = new Player(player2name);
        System.out.println("Player1 your name is: " + player1.getName());
        System.out.println("Player2 your name is: " + player2.getName());

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);

        Deck deck = new Deck();
        deck.populate();
        deck.shuffle();


        System.out.println("How many Cards would you like to play with?");
        Scanner scanner2 = new Scanner(System.in);
        String cardNum = scanner2.nextLine();
        int numCards = Integer.parseInt(cardNum);

        System.out.println("Dealing Cards.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dealing Cards..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dealing Cards...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Game game = new Game(players, deck);
        game.dealMultipleCards(numCards);
        String result = game.comparePlayerHands();

        System.out.println(player1.getName() + ", your hand is " + player1.prettyHand());
        System.out.println(player2.getName() + ", your hand is " + player2.prettyHand());
        System.out.println(result);
    }

}
