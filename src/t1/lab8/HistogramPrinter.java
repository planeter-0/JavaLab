package t1.lab8;

import java.util.Arrays;

public class HistogramPrinter {
    public static void main(String[] args) {
        int[] times = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String numbers = "1022473578476949426110832338899437170338449409627474102214022150928";
        //Counter
        for (int i = 0; i < numbers.length(); i++) {
            int number = numbers.charAt(i) - '0';
            times[number]++;
        }
        //maxTimes
        int maxTimes = times[0];
        for (int i = 0; i < 9; i++) {
            if (times[i] > maxTimes)
                maxTimes = times[i];
        }
        //Printer
        for (int i = maxTimes; i >= 0; i--) {//行,i为y坐标
            for (int j = 0; j < 9; j++) {//列
                if (times[j] < i) {
                    System.out.print("       ");
                } else {
                    System.out.print("  [" + j + "]  ");
                }
            }
            System.out.println();
        }
    }
}