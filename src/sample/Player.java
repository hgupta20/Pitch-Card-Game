package sample;
//----------------------------------------
//Player class
public class Player {
    private String name;
    private Deck deck = new Deck();
    private int score;

    public Player(String name)
    {

        this.name=name;
        //deck();
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
    public int getDeckSize()
    {
        return deck.getDeckSize();
    }
    public void addToDeck(Card temp)
    {
        deck.add(temp);
    }

}
