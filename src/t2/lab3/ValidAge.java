package t2.lab3;

import java.util.Scanner;

public class ValidAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String age = in.next();
            if(isValid(age)){
                System.out.println(age);
                System.out.println("Age is valid");
                break;
            }else{
                System.out.println("Age is NOT valid");
            }
        }
    }
    public static boolean isValid(String str){
        String pattern = "[0-9]{1,2}|1([0-4])[0-9]";
        return str.matches(pattern);
    }
}
