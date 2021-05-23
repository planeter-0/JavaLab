package t2.lab1;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int rows = in.nextInt();
            printStarTriangle(rows);
        }
    }

    public static void printStarTriangle(Integer rows) {
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        } else System.out.println("Not a valid number");
    }
}
