public class function {
    public static void main(String[] args){
        adder2(multiplier(3,3), multiplier(3,4));
    }
    public static int adder(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void adder2(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }
    public static int multiplier(int num1, int num2){
        int area = num1*num2;
        return area;
    }
}
