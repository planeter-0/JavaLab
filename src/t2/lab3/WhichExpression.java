package t2.lab3;

import java.util.Scanner;

public class WhichExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        checkStr(str);
    }
    private static void checkStr(String str){
        boolean flag = false;
        String p1 = "a(b|a)b";
        String p2 = "(ab)*b";
        String p3 = "a(b|a)*";
        String p4 = "((a|b)a)*";
        if (str.matches(p1)) {System.out.println("1"); flag = true;}
        if (str.matches(p2)) {System.out.println("2"); flag = true;}
        if (str.matches(p3)) {System.out.println("3"); flag = true;}
        if (str.matches(p4)) {System.out.println("4"); flag = true;}
        if(!flag) System.out.println("Not in the language");
    }
}
