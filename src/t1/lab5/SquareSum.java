package t1.lab5;

public class SquareSum {
    public static void main(String[] args) {
        int sum1 = 0,sum2 = 0;

        for (int i = 1; i <= 100; i++) {
            //Point 1
            if (i % 13 == 0) {
                sum1 += i;
            }
            //Point 2
            sum2+=square(i);

        }
        System.out.println("THe sum of all numbers divisible by 13 is " + sum1);
        System.out.println("THe sum of all square is " + sum2);
    }

    public static double square(int num) {
        return Math.pow(num, 2);
    }
}
