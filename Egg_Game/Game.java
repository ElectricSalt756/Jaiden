package Egg_Game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import java.util.Random;
import java.util.Scanner;

public class Game {
    static int count = 0;
    static double epms = 0;
    static int money = 0;
    static int chickenAmount = 0;
    static int pMoney = 0;
    static Egg[] inventory = new Egg[10];
    static int eggCount = 0;
    static ArrayList<Egg> shop = new ArrayList<>();
    static int maxSize = 15;

    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                count++;
                money = (int) (count * epms) + pMoney;
            }
        };
        TimerTask printMoney = new TimerTask() {
            @Override
            public void run() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("You have $" + money);
                System.out.println("You have " + chickenAmount + " chickens");
                // System.out.println(count / 1000);
            }
        };
        timer.scheduleAtFixedRate(printMoney, 0, 100);
        Bird bird = new Bird("common", "ocean", 6, 0);
        JFrame myJFrame = new JFrame();
        myJFrame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_H) {
                    epms = moneyCalculator(bird, epms);
                    chickenAmount++;
                    pMoney = money;
                    count = 0;
                }
            }
        });
        myJFrame.setVisible(true);
        timer.scheduleAtFixedRate(task, 0, 1);
    }

    public static double moneyCalculator(Bird bird, double epms) {
        int epm = bird.getEggsPerMinute();
        double tempEpm = epm / 60000.0;
        return tempEpm + epms;
    }

    public static void buyEgg(String theme) {

    }

    public static void printShop() {

    }

    public static void shopAddEgg() {
        Random rand = new Random();
        int n = rand.nextInt(5);
        Egg egg;
        if (shop.size() < maxSize) {
            if (n == 0) {
                egg = new Egg(10, "Ocean");
            } else if (n == 1) {
                egg = new Egg(10, "Jungle");
            } else if (n == 2) {
                egg = new Egg(10, "City");
            } else if (n == 3) {
                egg = new Egg(10, "Forest");
            } else {
                egg = new Egg(10, "Snowy");
            }
            shop.add(egg);
        }
    }

    public static void shopRemEgg() {

    }
}
