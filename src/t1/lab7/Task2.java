package t1.lab7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input:");
        while (true) {
            String data = in.nextLine();
            if (data.equals("exit")) break;
            // isOctal
            int times = 0;
            for (int i = 0; i < data.length(); i++) {
                char c = data.charAt(i);
                if (!Character.isDigit(c)) {
                    System.out.println("Please input a valid Octal Number:");
                    break;
                } else if (c == '7' || c == '6' || c == '5' || c == '4' || c == '3' || c == '2' || c == '1' || c == '0') times++;
            }
            if (times != data.length()) {
                System.out.println("Please input a valid Octal Number:");
            } else {
            // Covert
                int num = Integer.parseInt(data);
                Task2.binToHex(Task2.octalToBin(num));
            }
        }
    }

    public static long octalToBin(int num) {
        long result = 0;
        for (int j = 1; num > 0; j *= 1000) {
            int digit = num % 10;
            num /= 10;
            int binDigit;
            //8进制数的一位
            for (int i = 1; digit > 0; i *= 10) {
                binDigit = digit % 2;
                digit = digit / 2;
                result += binDigit * i * j;
            }
        }
        System.out.println("Binary: " + result);
        return result;
    }

    public static String binToHex(long num) {
        int power = 0;
        long res = 0;
        while (num > 0) {
            res = res + ((num % 2) * (int) (Math.pow(2, power)));
            power++;
            num = num / 10;
        }
        String digits = "0123456789ABCDEF";
        StringBuilder number = new StringBuilder();
        long digit;
        while (res > 0) {
            digit = res % 16;
            number.insert(0, digits.charAt((int)digit));
            res = res / 16;
        }
        System.out.println("Hexadecimal: " + number);
        return number.toString();
    }
}