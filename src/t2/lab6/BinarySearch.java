package t2.lab6;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/23 14:14
 * @status dev
 */
public class BinarySearch {
    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        int n = 7;
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
