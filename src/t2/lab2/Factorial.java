package t2.lab2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        getFactorial(n, m);
    }

    public static void getFactorial(int n, int m) {
        if (n < 0 || m < 0) {
            System.out.println("Not Valid!");
        } else {
            int factorial = n;
            System.out.println(factorial);
            for (int i = n+1; i <= m; i++) {
                factorial *= i;
                System.out.println(factorial);
            }
        }
    }
}
