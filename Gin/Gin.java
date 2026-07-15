package Gin;

import java.util.ArrayList;
import java.util.Scanner;

public class Gin {
    public static void main(String[] args) throws InterruptedException {
        Deck deck = new Deck();
        ArrayList<Card> p1Hand = new ArrayList<>();
        ArrayList<Card> p2Hand = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean isGameRunning = true;
        boolean p1Turn = true;
        Card dCard;
        String pDec;
        int count;
        boolean p1_3kind = false;
        boolean p1_4kind = false;
        boolean p1_3row = false;
        boolean p1_4row = false;
        ArrayList<Card> p1HandCopy = new ArrayList<>();
        ArrayList<Card> p2HandCopy = new ArrayList<>();
        ArrayList<Card> tInRow = new ArrayList<>();
        ArrayList<Card> fInRow = new ArrayList<>();
        deck.shuffleDeck();
        System.out.println("The cards are being dealed...");
        Thread.sleep(6000);
        p1Hand.add(new Card(3, "Spades"));
        p1Hand.add(new Card(4, "Spades"));
        p1Hand.add(new Card(5, "Spades"));
        p1Hand.add(new Card(6, "Spades"));
        p1Hand.add(new Card(11, "Spades"));
        p1Hand.add(new Card(11, "Hearts"));
        p1Hand.add(new Card(11, "Clubs"));
        for (int i = 0; i < 7; i++) {
            // p1Hand.add(deck.drawCard());
            p2Hand.add(deck.drawCard());
        }
        dCard = deck.drawCard();
        System.out.println("The first card down is a " + dCard.toString());
        Thread.sleep(1000);
        while (isGameRunning) {
            if (p1Turn) {
                System.out.println("It is now player 1's turn. Please ask player 2 to look away");
                Thread.sleep(5000);
                while (p1Turn) {
                    System.out.println("Your hand:");
                    Thread.sleep(1000);
                    for (int i = 0; i < p1Hand.size(); i++) {
                        System.out.println(p1Hand.get(i));
                    }
                    Thread.sleep(1000);
                    System.out.println("Do you want to pickup the card or draw?");
                    pDec = scan.nextLine();
                    if (pDec.equals("pickup")) {
                        p1Hand.add(dCard);
                        System.out.println("You picked up the " + dCard.toString());
                        for (int i = 0; i < p1Hand.size(); i++) {
                            System.out.println(p1Hand.get(i));
                        }
                        Thread.sleep(1000);
                        System.out.println("Please choose a card to discard corresponding to the numbers 0-7");
                        int disHand = scan.nextInt();
                        dCard = p1Hand.get(disHand);
                        p1Hand.remove(dCard);
                        System.out.println("You discarded a " + dCard.toString());
                        for (int i = 0; i < p1Hand.size(); i++) {
                            System.out.println(p1Hand.get(i));
                        }
                        Thread.sleep(5000);
                        p1Turn = false;
                    } else if (pDec.equals("draw")) {
                        p1Hand.add(deck.drawCard());
                        System.out.println("You drew a " + p1Hand.get(p1Hand.size() - 1).toString());
                        for (int i = 0; i < p1Hand.size(); i++) {
                            System.out.println(p1Hand.get(i));
                        }
                        Thread.sleep(1000);
                        System.out.println("Please choose a card to discard corresponding to the numbers 0-7");
                        int disHand = scan.nextInt();
                        dCard = p1Hand.get(disHand);
                        p1Hand.remove(dCard);
                        System.out.println("You discarded a " + dCard.toString());
                        for (int i = 0; i < p1Hand.size(); i++) {
                            System.out.println(p1Hand.get(i));
                        }
                        Thread.sleep(5000);
                        p1Turn = false;
                    } else {
                        System.out.println("Please choose an option.");
                        Thread.sleep(1000);
                    }
                }
            } else {
                while (!p1Turn) {
                    System.out.println("Your hand:");
                    Thread.sleep(1000);
                    for (int i = 0; i < p2Hand.size(); i++) {
                        System.out.println(p2Hand.get(i));
                    }
                    Thread.sleep(1000);
                    System.out.println("Do you want to pickup the card or draw?");
                    pDec = scan.nextLine();
                    if (pDec.equals("pickup")) {
                        p2Hand.add(dCard);
                        System.out.println("You picked up the " + dCard.toString());
                        for (int i = 0; i < p2Hand.size(); i++) {
                            System.out.println(p2Hand.get(i));
                        }
                        Thread.sleep(1000);
                        System.out.println("Please choose a card to discard corresponding to the numbers 0-7");
                        int disHand = scan.nextInt();
                        dCard = p2Hand.get(disHand);
                        p2Hand.remove(dCard);
                        System.out.println("You discarded a " + dCard.toString());
                        for (int i = 0; i < p2Hand.size(); i++) {
                            System.out.println(p2Hand.get(i));
                        }
                        Thread.sleep(5000);
                        p1Turn = true;
                    } else if (pDec.equals("draw")) {
                        p2Hand.add(deck.drawCard());
                        System.out.println("You drew a " + p2Hand.get(p2Hand.size() - 1).toString());
                        for (int i = 0; i < p2Hand.size(); i++) {
                            System.out.println(p2Hand.get(i));
                        }
                        Thread.sleep(1000);
                        System.out.println("Please choose a card to discard corresponding to the numbers 0-7");
                        int disHand = scan.nextInt();
                        dCard = p2Hand.get(disHand);
                        p2Hand.remove(dCard);
                        System.out.println("You discarded a " + dCard.toString());
                        for (int i = 0; i < p2Hand.size(); i++) {
                            System.out.println(p2Hand.get(i));
                        }
                        Thread.sleep(5000);
                        p1Turn = true;
                    } else {
                        System.out.println("Please choose an option.");
                        Thread.sleep(1000);
                    }
                }
            }
            p1HandCopy.clear();
            fInRow.clear();
            tInRow.clear();
            for (int i = 0; i < 7; i++) {
                count = 0;
                for (int j = i; j < 7; j++) {
                    if (p1Hand.get(i).getValue() == p1Hand.get(j).getValue()) {
                        count++;
                    }
                }
                p1HandCopy.addAll(p1Hand);
                p1HandCopy = sort(p1HandCopy);
                for (int j = 0; j < 3; j++) {
                    if (p1HandCopy.get(j).getSuit() == p1HandCopy.get(j + 1).getSuit()) {
                        if (p1HandCopy.get(j).getValue() == p1HandCopy.get(j + 1).getValue() - 1) {
                            p1HandCopy.remove(j);
                            fInRow.add(p1HandCopy.get(j));
                            tInRow.add(p1HandCopy.get(j));
                            if (fInRow.size() == tInRow.size()) {
                                tInRow.clear();
                            }
                        }
                    }
                }
                for (int j = 0; j < p1HandCopy.size() - 1; j++) {
                    if (p1HandCopy.get(j).getSuit() == p1HandCopy.get(j + 1).getSuit()) {
                        if (p1HandCopy.get(j).getValue() == p1HandCopy.get(j + 1).getValue() - 1) {
                            p1HandCopy.remove(j);
                            fInRow.add(p1HandCopy.get(j));
                            tInRow.add(p1HandCopy.get(j));
                            if (fInRow.size() == tInRow.size()) {
                                tInRow.clear();
                            }
                        }
                    }
                }
                if (count == 3) {
                    p1_3kind = true;
                } else if (count == 4) {
                    p1_4kind = true;
                } else if (fInRow.size() == 4) {
                    p1_4row = true;
                } else if (tInRow.size() == 3) {
                    p1_3row = true;
                }
            }
            if ((p1_3kind || p1_3row) && (p1_4kind || p1_4row)) {
                System.out.println("Player 1 has won!");
                isGameRunning = false;
                break;
            }
        }
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