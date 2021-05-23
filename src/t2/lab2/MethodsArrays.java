package t2.lab2;

import java.util.Scanner;

public class MethodsArrays {
    public static void main(String[] args) {
        int[] arr = fillArray();
        System.out.println("Sum = "+sumArray(arr));
        System.out.println("Average = "+avgArray(arr));
        printArray(arr);
    }
    public static int[] fillArray(){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for(int i = 0;i < len;i++){
            arr[i] = in.nextInt();
        }
        return arr;
    }
    public static int sumArray(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    public static double avgArray(int[] arr){
        double sum = sumArray(arr);
        return sum/arr.length;
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
