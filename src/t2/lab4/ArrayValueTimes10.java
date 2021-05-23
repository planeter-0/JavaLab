package t2.lab4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArrayValueTimes10 {
    public static boolean checkArray(int[] arr, int i) {
        if (i ==arr.length) return false;
        for (int j = i; j < arr.length; j++) {
            if (arr[j] == 10 * arr[i])
                return true;
        }
        return checkArray(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int arr[] = new int[len];
        for (int i = 0;i<len;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(checkArray(arr,0));
    }
}
