package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pitch {
    Card trump;
    boolean run = true;
    List<Player> winners = new ArrayList<>();
    List<Player> players = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Pitch(int numPlayers) {
        String playerName;
        for (int i = 0; i < 1; i++) {
           // playerName = scan.nextLine();
            //Ask for name somehow
            players.add(new Player("TEST"));
        }
        Dealer dealer = new Dealer();
        dealer.getDeck().printDeck();
        dealer.deal(players);
    }

    public List<Card> playerCards() {
        return players.get(0).getDeck().getDeck();
    }

    public void run() {
        while (run) {

            //End of while loop check if players score is reached
            for (Player a : players) {
                if (a.getScore() >= 7) {
                    winners.add(a); //If score is >= 7 add to the back of the list
                    run = false;
                }
            }
        }
        if (winners.isEmpty()) {
            System.out.println("There are no winners"); //Place holder for no winners
        } else if (winners.size() == 1) {
            System.out.println("The winnner is .." + winners.get(0).getName());// Place holder for one winner make sure to display
            //all the winners
        } else if (winners.size() > 1) {
            System.out.println("There are multiple winners"); //Place holder for multiple winners
            //Make sure to display all the winners

        }
    }
}
