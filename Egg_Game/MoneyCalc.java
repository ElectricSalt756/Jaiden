package Egg_Game;
import java.lang.Runnable;

public class MoneyCalc implements Runnable {
    private int money;

    public MoneyCalc(int money){
        this.money = money;
    }
    public void run(){
        money++;
    }
    public int getMoney(){
        return money;
    }
}
