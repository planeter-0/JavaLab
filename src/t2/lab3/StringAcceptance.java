package t2.lab3;

import java.util.Scanner;

public class StringAcceptance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        checkStr(str);
    }
    private static void checkStr(String str){
        String pattern = "[01]+";
        System.out.println(str.matches(pattern));
    }
}
