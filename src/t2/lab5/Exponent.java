package t2.lab5;

import java.util.Scanner;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/16 12:34
 * @status dev
 */
public class Exponent {
    public static int powerTo(int base, int power) {
        if (power <= 0) return 1;
        if (power == 1) return base;
        if (power % 2 == 0) return powerTo(base * base, power / 2);
        else return base * powerTo(base * base, power / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(powerTo(in.nextInt(), in.nextInt()));
    }
}
