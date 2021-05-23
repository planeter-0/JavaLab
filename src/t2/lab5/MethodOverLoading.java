package t2.lab5;

import java.util.Scanner;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/16 12:34
 * @status dev
 */
public class MethodOverLoading {
    //manipulation (String) -> Remove all whitespace from the String.
    public static String manipulation(String s) {
        s = s.toLowerCase();
        return s.replaceAll(" ", "");
    }

    //manipulation (String, char) -> Remove all instances of the given character from the String.
    public static String manipulation(String s, char c) {
        c = Character.toLowerCase(c);
        s = s.toLowerCase();
        return s.replace(String.valueOf(c), "");
    }

    //manipulation (String, int) -> Remove all instances in the String of the character from the given index from the String.
    public static String manipulation(String s, int x) {
        s = s.toLowerCase();
        char c = s.charAt(x);
        return s.replace(String.valueOf(c), "");
    }

    //manipulation (String, int, int) -> Remove all characters between the given indices (exclusive) from the String.
    public static String manipulation(String s, int start, int end) {
        s = s.toLowerCase();
        String str = s.substring(0, start+1) + s.substring(end);
        return str;
    }

    //manipulation (String, char, char) -> Remove all characters between the given characters (exclusive) from the String.
    // This should happen between the first instance of the first character and the last instance of the second character
    // in the String and if the characters are the same it should remove everything between the first and last instance
    // of the character.
    public static String manipulation(String s, char c, char c2) {
        c = Character.toLowerCase(c);
        c2 = Character.toLowerCase(c2);
        s = s.toLowerCase();
        String str = s.substring(0,findFirst(s,c)+1) + s.substring(findLast(s,c)-1);
        return str;
    }

    //manipulation (String, char, int) -> Remove all characters from the start of the String up to the xth character given.
    // For example: given manipulation("cuckoo", 'c', 2) the method would remove all characters before the second c that occurs in the string.
    // The output would then be "ckoo".
    //Each manipulation method should be called from the main method and should work irrespective of the letter case.
    // All output should be printed in lower case.
    public static String manipulation(String s, char c, int times) {
        c = Character.toLowerCase(c);
        s = s.toLowerCase();
        return s.substring(find(s, c, times));
    }

    public static int findFirst(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) return i;
        }
        return 0;
    }

    public static int findLast(String s, char c) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) index = i;
        }
        return index;
    }

    public static int find(String s, char c, int times) {
        int index = 0;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                n++;
                if (n == times) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;//the number of words in the string
        String text = "THE CAT SAT ON THE MAT";//the string
        int x = 1;
        int x1 = 12;//x and x1 are integer values
        char c = 'a';
        char c1 = 'm';//c and c1 are characters.
        System.out.println(manipulation(text));
        System.out.println(manipulation(text, c));
        System.out.println(manipulation(text, x));
        System.out.println(manipulation(text, x, x1));
        System.out.println(manipulation(text, c, c1));
        System.out.println(manipulation(text, c, x));
    }
}
