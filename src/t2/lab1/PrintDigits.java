package t2.lab1;

import java.util.*;

public class PrintDigits {
    public static HashMap<Integer, char[][]> map = new HashMap<>();

    static {
        map.put(0, new char[][]{{' ', '-', '-', ' '}, {'|', ' ', ' ', '|'}, {' ', '-', '-', ' '}, {'|', ' ', ' ', '|'}, {' ', '-', '-', ' '}});
        map.put(1, new char[][]{{' ','|',' ',' '}, {' ','|',' ',' '}, {' ','|',' ',' '}, {' ','|',' ',' '}, {' ','|',' ',' '}});
        map.put(2, new char[][]{{' ', '-', '-', ' '}, {' ', ' ', ' ', '|'}, {' ', '-', '-', ' '}, {'|', ' ', ' ', ' '}, {' ', '-', '-', ' '}});
        map.put(3, new char[][]{{' ', '-', '-', ' '}, {' ',' ', ' ', '|'}, {' ', '-', '-', ' '}, {' ',' ', ' ', '|'}, {' ', '-', '-', ' '}});
        map.put(4, new char[][]{{' ', ' ', ' ', ' '}, {'|', ' ', ' ', '|'}, {' ', '-', '-', ' '}, {' ', ' ', ' ', '|'}, {' ', ' ', ' ', ' '}});
        map.put(5, new char[][]{{' ', '-', '-', ' '}, {'|', ' ', ' ', ' '}, {' ', '-', '-', ' '}, {' ', ' ', ' ', '|'}, {' ', '-', '-', ' '}});
        map.put(6, new char[][]{{' ', '-', '-', ' '}, {'|', ' ', ' ', ' '}, {' ', '-', '-', ' '}, {'|', ' ', ' ', '|'}, {' ', '-', '-', ' '}});
        map.put(7, new char[][]{{' ', '-', '-', ' '}, {' ', ' ', ' ', '|'}, {' ', ' ', ' ', ' '}, {' ', ' ', ' ', '|'}, {' ', ' ', ' ', ' '}});
        map.put(8, new char[][]{{' ', '-', '-', ' '}, {'|', ' ', ' ', '|'}, {' ', '-', '-', ' '}, {'|', ' ', ' ', '|'}, {' ', '-', '-', ' '}});
        map.put(9, new char[][]{{' ', '-', '-', ' '}, {'|', ' ', ' ', '|'}, {' ', '-', '-', ' '}, {' ', ' ', ' ', '|'}, {' ', '-', '-', ' '}});
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            PrintDigits.MultiDigitPrinter(number);
//            PrintDigits.singleDigitPrinter(number);
        }
    }

    public static void MultiDigitPrinter(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 0;
        do {
            temp = num % 10;
            num /= 10;
            list.add(temp);
        }
        while (num >0);
        Collections.reverse(list);
        for (Integer number : list) {
            PrintDigits.singleDigitPrinter(number);
        }
    }

    public static void singleDigitPrinter(int num) {
        char[][] arr = map.get(num);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
