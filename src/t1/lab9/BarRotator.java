package t1.lab9;

import java.io.IOException;
import java.util.Scanner;

public class BarRotator {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please input a degree:");
            String degree = in.nextLine();
            if (degree.toLowerCase().equals("exit")) break;
            int degree_ = Integer.parseInt(degree);
            if (degree_ >= 180) degree_ -= 180;
            int[][] rotatedMatrix = BarRotator.matrixCreator(degree_);
            //Printer
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    System.out.print(rotatedMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


    public static int[][] matrixCreator(int degree) {
        int[][] matrix = new int[12][12];
        if(degree == 0){
            matrix = new int[][]{{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0, 0},{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
        } else if (degree == 45) {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    if (j == i - 1 || j == i + 1)
                        matrix[i][j] = 0;
                    else matrix[i][j] = 1;
                }
            }
        } else if (degree == 90 || degree == 180) {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    if (j == 5 || j == 6)
                        matrix[i][j] = 0;
                    else matrix[i][j] = 1;
                }
            }
        } else if (degree == 135) {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    if (j == 10 - i || j == 12 - i)
                        matrix[i][j] = 0;
                    else matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}
