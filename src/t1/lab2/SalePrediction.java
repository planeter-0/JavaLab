package t1.lab2;

import java.util.Scanner;

public class SalePrediction {
    public static void main(String args[]) {
        double[] xary = {230.1, 44.5, 17.2, 151.5, 180.8, 8.7, 57.5, 120.2, 8.6, 199.8};
        double[] yary = {22.1, 10.4, 9.3, 18.5, 12.9, 7.2, 11.8, 13.2, 4.8, 10.6};
        double xsum = 0, x_ = 0, beta1_up = 0;
        double ysum = 0, y_ = 0, beta1_down = 0;
        double beta0 = 0;
        double beta1 = 0;
        double sale = 0;
        double adv = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Input advertising money:");
        adv = in.nextDouble();

        for (int i = 0; i < 10; i++) {
            xsum += xary[i];
            ysum += yary[i];
        }
        x_ = xsum / 10;
        y_ = ysum / 10;
        System.out.println("y_= " + y_);
        System.out.println("x_= " + x_);

        for (int i = 0; i < 10; i++) {
            beta1_up += (xary[i] - x_) * (yary[i] - y_);
            beta1_down += (xary[i] - x_);
        }
        beta1 = beta1_up / beta1_down;
        beta0 = y_ - beta1 * x_;
        // Prediction
        sale = beta0 + beta1 * adv;
        System.out.println("sale= " + sale);
    }
}
