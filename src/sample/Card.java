package sample;

public class Card {
    private String suit;
    private int  value;
    private String valueString;

    public Card(String suitInput, int valueInput)
    {
        suit = suitInput;
        value = valueInput;
        valueString= "NAN";

    }
    public Card(String suitInput, String valueInput)
    {
        suit = suitInput;

        valueString = valueInput;

        if(valueInput == "Jack")
        {
            value = 11;
        }
        else if(valueInput == "Queen")
        {
            value = 12;
        }
        else if(valueInput=="King")
        {
            value = 13;
        }
        else
        {
            value = -99;
        }

    }
    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value > 1 && value < 11)
            this.value = value;
        else
            System.out.println("Card Does not fit in settings!!");

    }
}
