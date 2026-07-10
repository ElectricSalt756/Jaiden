import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) throws InterruptedException {
        Deck deck = new Deck();
        ArrayList<Card> pCards = new ArrayList<Card>();
        ArrayList<Card> dCards = new ArrayList<Card>();
        Scanner scan = new Scanner(System.in);
        deck.shuffleDeck();
        int pSum;
        int dSum;
        int drawnCard = 2;
        int pMoney = 100;
        int amountBet = 0;
        boolean isGameRunning = true;
        boolean isOver;
        while (isGameRunning) {
            isOver = false;
            pCards.clear();
            dCards.clear();
            deck.shuffleDeck();
            drawnCard = 2;
            while (!isOver) {
                System.out.println("How much would you like to bet? You have $" + pMoney + ".");
                amountBet = scan.nextInt();
                scan.nextLine();
                if (amountBet <= pMoney) {
                    System.out.println("You bet $" + amountBet);
                    isOver = true;
                } else {
                    System.out.println("You don't have enough money. Please bet a different amount.");
                }
            }
            pCards.add(deck.drawCard());
            pCards.add(deck.drawCard());
            dCards.add(deck.drawCard());
            dCards.add(deck.drawCard());
            pSum = pCards.get(0).blackjackValue() + pCards.get(1).blackjackValue();
            System.out.print("You have a " + pCards.get(0).toString());
            System.out.println(" and you have a " + pCards.get(1).toString());
            Thread.sleep(500);
            System.out.println("Your cards have a sum of " + pSum);
            Thread.sleep(500);
            System.out.println("The dealer has a " + dCards.get(0).toString() + " and an unknown card");
            while (pSum < 22) {
                System.out.println("Would you like to hit or stand?");
                String input = scan.nextLine();
                if (input.equals("stand")) {
                    break;
                }
                pCards.add(deck.drawCard());
                System.out.println("You drew a " + pCards.get(drawnCard).toString());
                pSum += pCards.get(drawnCard).blackjackValue();
                Thread.sleep(500);
                System.out.println("Your cards have a sum of " + pSum);
                drawnCard++;
            }
            if (pSum > 21) {
                Thread.sleep(1000);
                pMoney -= amountBet;
                System.out.println("You lost. But remember, 99% of gamblers quit before they win big.");
            } else {
                dSum = dCards.get(0).blackjackValue() + dCards.get(1).blackjackValue();
                System.out.println("The unkown card is a " + dCards.get(1).toString());
                Thread.sleep(500);
                System.out.println("The dealer also has a " + dCards.get(0).toString());
                Thread.sleep(500);
                System.out.println("The dealer's cards have a sum of " + dSum);
                drawnCard = 2;
                while (dSum < 22) {
                    if (dSum >= 17) {
                        Thread.sleep(500);
                        System.out.println("The dealer chose to stand.");
                        break;
                    }
                    dCards.add(deck.drawCard());
                    System.out.println("The dealer drew a " + dCards.get(drawnCard).toString());
                    dSum += dCards.get(drawnCard).blackjackValue();
                    Thread.sleep(500);
                    System.out.println("The dealer's cards have a sum of " + dSum);
                    drawnCard++;
                }
                if (dSum > 21) {
                    pMoney += amountBet;
                    System.out.println("You won!");
                } else if (pSum > dSum) {
                    pMoney += amountBet;
                    System.out.println("You won!");
                } else if (pSum < dSum) {
                    pMoney -= amountBet;
                    System.out.println("You lost. But remember, 99% of gamblers quit before they win big.");
                } else {
                    System.out.println("It's a shove.");
                }
            }
            if (pMoney <= 0) {
                System.out.println("You are broke!");
                break;
            }
        }
    }
}
