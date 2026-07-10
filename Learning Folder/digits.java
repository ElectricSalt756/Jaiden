import java.util.Scanner;

public class digits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your number");
        int number = scan.nextInt();
        System.out.println("Your number has " + digits(number) + " digits");
    }
    public static int digits(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}
