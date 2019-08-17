package sample;

import java.util.List;
//Dealer class used to initalize all the cards and deal them
public class Dealer {
    private Deck deck;
//Initializes all the cards
    public Dealer()
    {
        deck = new Deck(new Card("Spade",2));
        //deck.getDeck().add(new Card("Spade",2));
        deck.getDeck().add(new Card("Spade",3));
        deck.getDeck().add(new Card("Spade",4));
        deck.getDeck().add(new Card("Spade",5));
        deck.getDeck().add(new Card("Spade",6));
        deck.getDeck().add(new Card("Spade",7));
        deck.getDeck().add(new Card("Spade",8));
        deck.getDeck().add(new Card("Spade",9));
        deck.getDeck().add(new Card("Spade",10));
        deck.getDeck().add(new Card("Spade","Jack"));
        deck.getDeck().add(new Card("Spade","Queen"));
        deck.getDeck().add(new Card("Spade","King"));
        deck.getDeck().add(new Card("Diamond",2));
        deck.getDeck().add(new Card("Diamond",3));
        deck.getDeck().add(new Card("Diamond",4));
        deck.getDeck().add(new Card("Diamond",5));
        deck.getDeck().add(new Card("Diamond",6));
        deck.getDeck().add(new Card("Diamond",7));
        deck.getDeck().add(new Card("Diamond",8));
        deck.getDeck().add(new Card("Diamond",9));
        deck.getDeck().add(new Card("Diamond",10));
        deck.getDeck().add(new Card("Diamond","Jack"));
        deck.getDeck().add(new Card("Diamond","Queen"));
        deck.getDeck().add(new Card("Diamond","King"));
        deck.getDeck().add(new Card("Club",2));
        deck.getDeck().add(new Card("Club",3));
        deck.getDeck().add(new Card("Club",4));
        deck.getDeck().add(new Card("Club",5));
        deck.getDeck().add(new Card("Club",6));
        deck.getDeck().add(new Card("Club",7));
        deck.getDeck().add(new Card("Club",8));
        deck.getDeck().add(new Card("Club",9));
        deck.getDeck().add(new Card("Club",9));
       deck.getDeck().add(new Card("Club","Jack"));
        deck.getDeck().add(new Card("Club","Queen"));
        deck.getDeck().add(new Card("Club","King"));
        deck.getDeck().add(new Card("Heart",2));
        deck.getDeck().add(new Card("Heart",3));
        deck.getDeck().add(new Card("Heart",4));
        deck.getDeck().add(new Card("Heart",5));
        deck.getDeck().add(new Card("Heart",6));
        deck.getDeck().add(new Card("Heart",7));
        deck.getDeck().add(new Card("Heart",8));
        deck.getDeck().add(new Card("Heart",9));
        deck.getDeck().add(new Card("Heart",10));
        deck.getDeck().add(new Card("Heart","Jack"));
        deck.getDeck().add(new Card("Heart","Queen"));
        deck.getDeck().add(new Card("Heart","King"));

    }
    public Deck getDeck()
    {
        return deck;
    }
    //Shuffle the cards
    public void shuffle()
    {
        deck.shuffle();
    }
 /*   public void printDeck()
    {
        for(Card a : deck)
        {
            System.out.println(a.getSuit() + " "+ a.getValue());
        }
    }*/
    //Deals the cards
    public void deal(List<Player> playerList /*, int numPlayers*/)
    {
        deck.shuffle();//Shuffles the cards before dealing
        //Deals to all players who have less than 5 cards
        for(Player a : playerList)
        {
            while(a.getDeckSize()<6)
            {

               a.addToDeck(deck.remove(deck.getDeckSize()-1));//);

              // System.out.println(a.getDeckSize());

                //a.addToDeck(deck.remove(deck.getDeckSize()-1));
            }
        }
    }


}
