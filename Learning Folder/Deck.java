import java.util.Random;

public class Deck {
    private Card[] stack;
    private int size;

    public Deck() {
        size = 52;
        stack = new Card[52];
        int startSuit = 1;
        for (int i = 0; i < 13; i++) {
            stack[i] = new Card(startSuit, "Spades");
            startSuit++;
        }
        startSuit = 1;
        for (int i = 13; i < 26; i++) {
            stack[i] = new Card(startSuit, "Clubs");
            startSuit++;
        }
        startSuit = 1;
        for (int i = 26; i < 39; i++) {
            stack[i] = new Card(startSuit, "Diamonds");
            startSuit++;
        }
        startSuit = 1;
        for (int i = 39; i < 52; i++) {
            stack[i] = new Card(startSuit, "Hearts");
            startSuit++;
        }
    }

    public Card drawCard() {
        size--;
        return stack[size];
    }

    public void shuffleDeck() {
        Random rand = new Random();
        size = 52;
        for (int i = 0; i < 52; i++) {
            int r = rand.nextInt(52);
            Card temp = stack[i];
            stack[i] = stack[r];
            stack[r] = temp;
        }
    }

    public int getSize(){
        return size;
    }
}
