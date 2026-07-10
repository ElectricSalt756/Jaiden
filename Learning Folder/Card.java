public class Card {
    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString() {
        if (value == 11) {
            return "Jack of " + suit;
        } else if (value == 12) {
            return "Queen of " + suit;
        } else if (value == 13) {
            return "King of " + suit;
        } else if (value == 1) {
            return "Ace of " + suit;
        } else {
            return value + " of " + suit;
        }
    }

    public int blackjackValue() {
        if (value == 11) {
            return 10;
        } else if (value == 12) {
            return 10;
        } else if (value == 13) {
            return 10;
        } else if (value == 1) {
            return 11;
        } else {
            return value;
        }
    }
}
