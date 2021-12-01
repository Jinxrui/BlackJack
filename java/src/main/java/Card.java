public class Card
{
    Suit suit;
    Value value;

    public Card()
    {

    }
    // Make a card with specified suit and value
    public Card(Suit aSuit, Value aValue) {
        suit = aSuit;
        value = aValue;
    }

    // Returns the suit of the card
    public Suit getSuit() {
        return suit;
    }

    // Returns the value of the card
    public Value getValue() {
        return value;
    }

    // Returns state of card (suit and value)
    public String toString() {
        return value + " OF " + suit;
    }

}