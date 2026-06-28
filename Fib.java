import java.util.Scanner;

public class Fib {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        System.out.println("How many numbers do you want to know in the sequence?");
        int length = sca.nextInt();
        sca.nextLine();
        int[] seq = new int[length];
        seq[0] = 0;
        seq[1] = 1;
        for(int i=2;i<length;i++){
            seq[i] = seq[i-1] + seq[i-2];
        }
        for(int i=0;i<length;i++){
            System.out.println(seq[i]);
        }
    }
}
