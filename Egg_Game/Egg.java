package Egg_Game;

public class Egg {
    private int cost;
    private int sellCost;
    private boolean isHatchable;
    private String eggTheme;
    public Egg(int cost, int sellCost){
        this.cost = cost;
        this.sellCost = sellCost;
    }
    public Egg(int cost, String eggTheme){
        this.cost = cost;
        this.sellCost = (int)(cost * 0.75);
        this.isHatchable = true;
        this.eggTheme = eggTheme;
    }
    public int getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    public int getSellCost(){
        return sellCost;
    }
    public void setSellCost(int sellCost){
        this.sellCost = sellCost;
    }
    public boolean getIsHatchable(){
        return isHatchable;
    }
    public void setIsHatchable(boolean isHatchable){
        this.isHatchable = isHatchable;
    }
    public String getEggTheme(){
        return eggTheme;
    }
    public void setEggTheme(String eggTheme){
        this.eggTheme = eggTheme;
    }
    public String toString(){
        return "You have a " + eggTheme + " egg that has a sell value of $" + sellCost; 
    }
}
