package t2.lab3;

import java.util.Scanner;

public class FlightsCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String code = in.next();
            if(isValid(code)){
                System.out.println(code);
                System.out.println("Flight code is valid");
                break;
            }else{
                System.out.println("Flight code is NOT valid");
            }
        }
    }
    public static boolean isValid(String str){
        String pattern = "[A-Z]{2,3}[0-9]{3,4}";
        return str.matches(pattern);
    }
}
