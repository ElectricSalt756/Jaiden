import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you trying to find celsius or farenheit?");
        String calc = scan.nextLine();
        if(calc.equals ("farenheit")){
            System.out.println("What is your degree value?");
            double degree = scan.nextDouble();
            System.out.println("Your degrees in farenheit are " + celsiusToFarenheit(degree));
        }
        else if(calc.equals ("celsius")){
            System.out.println("What is your degree value?");
            double degree = scan.nextDouble();
            System.out.println("Your degrees in celsius are " + farenheitToCelcius(degree));
        }
    }

    public static double farenheitToCelcius(double degrees) {
        double celsius = (degrees - 32) * 5.0 / 9.0;
        return celsius;
    }

    public static double celsiusToFarenheit(double degrees) {
        double farenheit = (degrees * 9.0/5.0) + 32;
        return farenheit;
    }
}
