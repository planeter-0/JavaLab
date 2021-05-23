package t2.lab4;

import java.util.Scanner;

public class SumDigits {
    public static int recursiveSum(int num) {
        if (num / 10 == 0) return num % 10;
        return recursiveSum(num/10) + num%10;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ret = recursiveSum(num);
        System.out.println("Res: "+ret);
    }
}
