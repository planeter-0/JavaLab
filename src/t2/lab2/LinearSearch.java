package t2.lab2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        double[] arr = new double[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextDouble();
        }
        double x = in.nextDouble();
        if (findElement(arr, x)) {
            System.out.println(x + " was found in the array.");
        } else {
            System.out.println(x + " was NOT found in the array.");
        }
    }

    public static boolean findElement(double[] arr, double x) {
        for (double d : arr) {
            if (d == x) return true;
        }
        return false;
    }
}
