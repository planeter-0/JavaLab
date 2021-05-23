package t2.lab1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            if(num>=0){
                if (isEven(num)) System.out.println("Even");
                else System.out.println("Odd");
            }else{
                System.out.println("Not a valid entry!");
            }
        }
    }
    public static boolean isEven(int num){
        if(num%2 == 0) return true;
        else return false;
    }
}
