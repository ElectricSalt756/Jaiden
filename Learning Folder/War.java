import java.util.ArrayList;

public class War {
    public static void main(String[] args) throws InterruptedException {
        Deck deck = new Deck();
        deck.shuffleDeck();
        ArrayList<Card> p1Hand = new ArrayList<Card>();
        ArrayList<Card> p2Hand = new ArrayList<Card>();
        ArrayList<Card> extraCards = new ArrayList<Card>();
        while (deck.getSize() > 0) {
            p1Hand.add(deck.drawCard());
            p2Hand.add(deck.drawCard());
        }
        while (p1Hand.size() > 0 && p2Hand.size() > 0) {
            Card temp1 = p1Hand.get(0);
            System.out.println("Player 1 has a " + temp1.toString());
            Card temp2 = p2Hand.get(0);
            System.out.println("Player 2 has a " + temp2.toString());
            if (temp1.getValue() > temp2.getValue()) {
                System.out.println("Player 1 wins this round.");
                p1Hand.remove(0);
                p2Hand.remove(0);
                p2Hand.addAll(extraCards);
                p1Hand.add(temp1);
                p1Hand.add(temp2);
                extraCards.clear();

            }
            else if (temp1.getValue() < temp2.getValue()) {
                System.out.println("Player 2 wins this round.");
                p2Hand.remove(0);
                p1Hand.remove(0);
                p2Hand.addAll(extraCards);
                p2Hand.add(temp1);
                p2Hand.add(temp2);
                extraCards.clear();
            }
            else {
                System.out.println("A war has happened!");
                for (int i=0;i<4;i++){
                    Card warCards1 = p1Hand.get(0);
                    extraCards.add(warCards1);
                    p1Hand.remove(0);
                    Card warCards2 = p2Hand.get(0);
                    extraCards.add(warCards2);
                    p1Hand.remove(0);
                }
            }
            Thread.sleep(500);
        }
        if (p1Hand.size() == 0){
            System.out.println("Player 2 has won the game!");
        }
        if (p2Hand.size() == 0){
            System.out.println("Player 1 has won the game!");
        }
    }
}
