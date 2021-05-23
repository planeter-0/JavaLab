package t2.lab4;

import java.util.Scanner;

public class MinimumValue {
    public static int q1Iterative(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min < a[i]) min = a[i];
        }
        return min;
    }

    public static int q1Recursive(int[] a, int start) {
            for (int i =start;i<a.length;i++){
                if(a[i]<a[start]) return q1Recursive(a,i);
            }
            return a[start];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int arr[] = new int[len];
        for (int i = 0;i<len;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(q1Iterative(arr));
        System.out.println(q1Recursive(arr,0));
    }
}
