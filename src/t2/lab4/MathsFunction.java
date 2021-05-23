package t2.lab4;

import java.util.Scanner;

public class MathsFunction {
    public static int q2Iterative(int n) {
        int an = 0;
        if (n == 1) {
            an = 2;
        }
        if (n >= 2) {
            int prev = 2;
            for (int i = 2; i <= n; i++) {
                an = 4 * prev - 3 * i;
                prev = an;
            }
        }
        return an;
    }

    public static int q2Recursive(int n) {
        if (n == 1) return 2;
        return 4 * q2Recursive(n - 1) - 3 * n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(q2Iterative(i));
        System.out.println(q2Recursive(i));
    }
}
