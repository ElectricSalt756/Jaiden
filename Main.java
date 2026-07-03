import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner acs = new Scanner(System.in);
        System.out.println("How many items do you want in your shopping list?");
        int length = acs.nextInt();
        String[] list = new String[length];
        acs.nextLine();
        for (int i = 0; i < length; i++) {
            System.out.println("What do you want to add to your shopping list?");
            list[i] = acs.nextLine();
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
