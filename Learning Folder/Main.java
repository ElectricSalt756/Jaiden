public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        System.out.println(deck.drawCard().toString());
    }
}
