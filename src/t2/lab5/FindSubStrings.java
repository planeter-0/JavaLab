package t2.lab5;

import java.util.Scanner;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/16 12:33
 * @status dev
 */
public class FindSubStrings {
    public static boolean checkForSub(String origin, String sub, int times) {
        if (times == 0) return true;
        int index = hasSub(origin, sub, 0);
        if (index == -1) return false;
        return checkForSub(origin.substring(index + sub.length()), sub, times - 1);
    }

    public static int hasSub(String origin, String sub, int index) {
        if (sub.length() >= origin.length()) return -1;
        if (origin.substring(index, index + sub.length()).equals(sub)) return index;
        return hasSub(origin, sub, index + 1);
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String origin = in.next();
//        String sub = in.next();
//        int times = in.nextInt();
//        System.out.println(checkForSub(origin, sub, times));
        System.out.println(checkForSub("catcowcat", "cat", 2));
        System.out.println(checkForSub("catcowcat", "cow", 2));
        System.out.println(checkForSub("catcowcat", "cow", 1));
    }
}
