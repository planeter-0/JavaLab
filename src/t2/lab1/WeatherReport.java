package t2.lab1;

import java.util.Scanner;

public class WeatherReport {
    public static void main(String[] args) {
        while (true) {
            WeatherReport.printWeatherReport();
        }
    }

    public static void printWeatherReport() {
        Scanner in = new Scanner(System.in);
        int degree = in.nextInt();
        if (degree < 0 || degree > 45) {
            System.out.println("Not a valid number");
        } else if (degree <= 8) {
            System.out.println("It is cold outside, bring a jacket!");
        } else if (degree <= 16) {
            System.out.println("The sun is coming out, and it is getting warmer");
        } else if (degree <= 32) {
            System.out.println("Time to sit beside the pool and relax");
        } else {
            System.out.println("Too hot, can't move!");
        }
    }
}
