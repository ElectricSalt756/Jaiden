public class Car {
    private String color;
    private int milage;
    private String brand;
    private boolean isNew;
    private String owner;
    public Car(String color, int milage, boolean isNew, String brand, String owner){
        this.color = color;
        this.milage = milage;
        this.brand = brand;
        this.isNew = isNew;
        this.owner = owner;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getMilage(){
        return milage;
    }
    public void setMilage(int milage){
        this.milage = milage;
    }
    public boolean getIsNew(){
        return isNew;
    }
    public void setIsNew(boolean isNew){
        this.isNew = isNew;
    }
    public String toString(){
        return "color: " + color + ", milage: " + milage + ", brand: " + brand + ", isNew: " + isNew + ", owner:" + owner;
    } 
}
