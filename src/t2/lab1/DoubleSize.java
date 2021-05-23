package t2.lab1;

import java.util.Scanner;

public class DoubleSize {
    public static void main(String[] args) {
        while(true){
            Scanner in = new Scanner(System.in);
            double num1 = in.nextDouble();
            double num2 = in.nextDouble();
            determineSize(num1,num2);
        }
    }
    public static void determineSize(double n1,double n2){
        if(n1 < n2){
            System.out.println("The first is smaller than the second.");
        }else if(n1>n2){
            System.out.println("The first is bigger than the second.");
        }
        else System.out.println("The first is the same as the second.");
    }
}
