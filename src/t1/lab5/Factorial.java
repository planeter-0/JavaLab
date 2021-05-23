package t1.lab5;

public class Factorial {
    public static void main(String[] args) {
        int num = 7;
        int result = 1;
        int origin = num;
        while (num > 0) {
            result *= num;
            num--;
        }
        System.out.println("The factorial of " + origin + " is " + result);
    }
}
