package t1.lab6;

import java.util.ArrayList;

public class PrintVowels {
    public static void main(String[] args) {
        String message = new String(" A Java program must have one or more classes.The name of the source file and\n" +
                "the name of the class must be the same.If we want make a Java program\n" +
                "executable, we must provide a main method.The main method is an indicator\n" +
                "and a signature for Java Virtual Machine to find the entry point of the program\n" +
                "for execution.").replace('\n', ' ').replace('.', ' ');
        var list = PrintVowels.findV(message);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }

    public static ArrayList<String> findV(String str) {
        ArrayList<String> words = PrintVowels.split_(str);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                char c = words.get(i).charAt(j);
                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                    list.add(words.get(i));
                    break;
                }
            }
        }
        return list;
    }

    public static ArrayList<String> split_(String s) {
        ArrayList<String> words = new ArrayList<>();
        int lasti = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words.add(s.substring(lasti, i));
                lasti = i;
            }
        }
        return words;
    }
}
