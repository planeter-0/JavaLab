package t2.lab3;

import java.util.Scanner;

public class ValidName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String name = in.next();
            if(isValid(name)){
                System.out.println(name);
                System.out.println("Name is valid");
                break;
            }else{
                System.out.println("Name is NOT valid");
            }
        }
    }
    public static boolean isValid(String str){
        String pattern = "[A-Z][a-z]{1,24}";
        return str.matches(pattern);
    }
}
