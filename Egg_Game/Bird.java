package Egg_Game;

public class Bird {
    private String birdType;
    private String birdRarity;
    private int eggsPerMinute;
    private int eggsProduced;
    public Bird(String birdRarity, String birdType, int eggsPerMinute, int eggsProduced){
        this.birdRarity = birdRarity;
        this.eggsPerMinute = eggsPerMinute;
        this.eggsProduced = eggsProduced;
        this.birdType = birdType;
    }
    public String getBirdRarity(){
        return birdRarity;
    }
    public void setBirdRarity(String birdRarity){
        this.birdRarity = birdRarity;
    }
    public int getEggsPerMinute(){
        return eggsPerMinute;
    }
    public void setEggsPerMinute(int eggsPerMinute){
        this.eggsPerMinute = eggsPerMinute;
    }
    public int getEggsProduced(){
        return eggsProduced;
    }
    public void setEggsProduced(int eggsProduced){
        this.eggsProduced = eggsProduced;
    }
    public String getBirdType(){
        return birdType;
    }
    public void setBirdType(String birdType){
        this.birdType = birdType;
    }
    public String toString(){
        return "You have a " + birdRarity + " bird that produces " + eggsPerMinute + " per minute.";
    }
}
