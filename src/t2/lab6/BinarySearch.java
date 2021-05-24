package t2.lab6;

import java.util.Scanner;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/23 14:14
 * @status dev
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int n = in.nextInt();
        binarySearch(x, y, n);
    }

    public static void binarySearch(int x, int y, int n) {
        int middle = 0;
        int times = 0;
        while (x <= y) {
            times++;
            middle = (x + y) / 2;
            if (middle < n) {
                x = middle + 1;
            } else if (middle >n) {
                y = middle - 1;
            } else {
                break;
            }
        }
        System.out.println("The number is: "+n);
        System.out.println("It took "+times+" tries!");
    }
}
