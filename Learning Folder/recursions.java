public class recursions {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static void countdown(int num) {
        if (num >= 0) {
            System.out.println(num);
            num--;
            countdown(num);
        }
    }

    public static void countup(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            start++;
            countup(start, end);
        }
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    public static int multiply(int count, int num) {
        if (count > 0) {
            return multiply(count--, num) + num;
        }
        return 0;
    }

    public static int digits(int num) {
        if (num <= 0) {
            return num;
        }
        int digit = num % 10;
        return digits(num / 10) + digit;
    }
    public static int fib(int num){
        if (num == 1 || num == 2){
            return 1;
        }
        return fib(num-2) + fib(num-1);
    }
}
