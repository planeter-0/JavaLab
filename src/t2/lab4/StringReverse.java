package t2.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static String reverseRecursive(String s){
        if(s.length()<=1){
            return s;
        }
        return reverseRecursive(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(reverseRecursive(s));
    }
}
