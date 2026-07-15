package Gin;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Card> hand = new ArrayList<>();
        Deck deck = new Deck();
        deck.shuffleDeck();
        for (int i = 0; i < 7; i++) {
            hand.add(deck.drawCard());
        }
        System.out.println(hand);
        hand = sort(hand);
        System.out.println(hand);
    }

    public static ArrayList<Card> sort(ArrayList<Card> sortHand) {
        ArrayList<Card> sortedHand = new ArrayList<>();
        ArrayList<Card> spades = new ArrayList<>();
        ArrayList<Card> hearts = new ArrayList<>();
        ArrayList<Card> clubs = new ArrayList<>();
        ArrayList<Card> diamonds = new ArrayList<>();
        Card cTemp;
        Card cTemp2;
        for (int i = 0; i < sortHand.size(); i++) {
            if (sortHand.get(i).getSuit() == "Spades") {
                spades.add(sortHand.get(i));
            } else if (sortHand.get(i).getSuit() == "Hearts") {
                hearts.add(sortHand.get(i));
            } else if (sortHand.get(i).getSuit() == "Clubs") {
                clubs.add(sortHand.get(i));
            } else if (sortHand.get(i).getSuit() == "Diamonds") {
                diamonds.add(sortHand.get(i));
            }
        }
        for (int i = 0; i < spades.size(); i++) {
            for (int j = 0; j < spades.size() - 1; j++) {
                if (spades.get(j).getValue() > spades.get(j + 1).getValue()) {
                    cTemp = spades.get(j);
                    cTemp2 = spades.get(j + 1);
                    spades.set(j, cTemp2);
                    spades.set(j + 1, cTemp);
                }
            }
        }
        for (int i = 0; i < hearts.size(); i++) {
            for (int j = 0; j < hearts.size() - 1; j++) {
                if (hearts.get(j).getValue() > hearts.get(j + 1).getValue()) {
                    cTemp = hearts.get(j);
                    cTemp2 = hearts.get(j + 1);
                    hearts.set(j, cTemp2);
                    hearts.set(j + 1, cTemp);
                }
            }
        }
        for (int i = 0; i < clubs.size(); i++) {
            for (int j = 0; j < clubs.size() - 1; j++) {
                if (clubs.get(j).getValue() > clubs.get(j + 1).getValue()) {
                    cTemp = clubs.get(j);
                    cTemp2 = clubs.get(j + 1);
                    clubs.set(j, cTemp2);
                    clubs.set(j + 1, cTemp);
                }
            }
        }
        for (int i = 0; i < diamonds.size(); i++) {
            for (int j = 0; j < diamonds.size() - 1; j++) {
                if (diamonds.get(j).getValue() > diamonds.get(j + 1).getValue()) {
                    cTemp = diamonds.get(j);
                    cTemp2 = diamonds.get(j + 1);
                    diamonds.set(j, cTemp2);
                    diamonds.set(j + 1, cTemp);
                }
            }
        }
        sortedHand.addAll(spades);
        sortedHand.addAll(hearts);
        sortedHand.addAll(clubs);
        sortedHand.addAll(diamonds);
        return sortedHand;
    }
}
