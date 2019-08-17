package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Deck class used to store an array list of cards
public class Deck {
    private List<Card> deck= new ArrayList<>(); //Array list of cards

    //Constructor classes
    public Deck(Card a)
    {
        deck.add(a);
    }
    public Deck(String suit, int value)
    {
        deck.add(new Card(suit, value));
    }
    public Deck(String suit, String value)
    {
        deck.add(new Card(suit, value));
    }
    public Deck()
    {

    }
    //Get and setters functions
    public int getDeckSize()
    {
        return deck.size();
    }
    public Card remove(int index)
    {
        return deck.remove(index);
    }
    public void add(Card temp)
    {
        deck.add(temp);
    }
    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    //--------------------------------------------------------------------
    //shuffle the cards function
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
    //----------------------------------------------------------------
    //Get top of card function
    public Card getTop()
    {
        return deck.get(deck.size()-1);
    }
    //Print the deck
    public void printDeck()
    {
        for(Card a : deck)
        {
            System.out.println("The suit of the card is " + a.getSuit());
            if( a.getValue()==-1)
            {
                System.out.print(" and the value is " + a.getValueString());
            }
            else
            {
                System.out.print(" and the value is "+ a.getValue());
            }
        }
    }
}
