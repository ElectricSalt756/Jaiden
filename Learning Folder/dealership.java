
public class dealership {
    public static void main(String[] args) {
        Car automobile = new Car("blue", 30000, true, "ferarri", "Jaiden");
        Car automobile2 = new Car("red", 60000, true, "lambrogini", "Jaiden");
        automobile.setMilage(35000);
        System.out.print(automobile.toString());
    }
}
