package t2.lab3;

// 832003325

// Do Not Remove these

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
//Do Not remove above

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programming3 {
    static int lives = 7;

    public static void main(String[] args) {

        /*
            This line will use the methods provided below to get all
            the words from the dictionary.txt file that is >= 8 Characters long.
            It will then return a word from that List to wordToGuess as your
            word for the game.
        */
        final String wordToGuess = getRandomWord();
        Scanner in = new Scanner(System.in);
        // Game initialize
        int numOfChar = wordToGuess.length();
        System.out.println(wordToGuess);
        R r = new R("");
        for (int i = 0; i < numOfChar; i++) {
            r.word += '_';
            System.out.print('_');
        }
        System.out.println();
        // Round
        while (!wordToGuess.equals(r.word)) {
            if (lives == 0) {
                System.out.println("You lose");
                break;
            }
            System.out.println("lives: " + lives);
            System.out.println("What letter do you choose?");
            String letter = in.next();
            update(letter, wordToGuess, r);
        }
        if (lives != 0)
            System.out.println("You win");
    }

    /** --------------------------------------- **/
    /** DO NOT CHANGE ANYTHING IN THESE METHODS **/
    /**
     * ---------------------------------------
     **/
    public static String[] wordsReader() {
        //Path to file to read in
        String myfile = "resource/dictionary.txt";
        //Create an ArrayList (a dynamic type of Array)
        ArrayList<String> lines = new ArrayList<String>();
        try {
            // try to read in the File
            BufferedReader abc = new BufferedReader(new FileReader(myfile));

            String line;
            while ((line = abc.readLine()) != null) {
                //If words length greater than 8 keep it otherwise discard it
                if (line.length() > 8) {
                    lines.add(line);
                }
            }
            abc.close();
        } catch (FileNotFoundException ex) {
            //If the File is not found print to screen
            System.out.println(
                    "Unable to open file '" +
                            myfile + "'");
        } catch (IOException ex) {
            //If file is corrupted print to screen
            System.out.println(
                    "Error reading file '"
                            + myfile + "'");
        }
        //Convert from ArrayList to Array
        return lines.toArray(new String[]{});
    }

    public static String getRandomWord() {
        // Return a random word from the list
        String[] words = wordsReader();
        int len = words.length;
        Random rand = new Random();
        int x = rand.nextInt(len);
        return words[x];
    }
    /** ------------------------------------------ **/
    /** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
    /**
     * ------------------------------------------
     **/
    public static void charArrPrinter(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void update(String letter, String wordToGuess, R r) {
        boolean flag = false;
        Pattern p = Pattern.compile(letter);
        Matcher m = p.matcher(wordToGuess);
        // True
        while (m.find()) {
            flag = true;
            //update word
            int pos = m.start(m.groupCount());
            char[] arr = r.word.toCharArray();
            arr[pos] = letter.charAt(0);
            r.word = String.valueOf(arr);
        }
        if (flag) {
            System.out.println("Your are right");
            System.out.println("word: " + r.word);
        } else {
            System.out.println("Sorry, there is no " + letter + " in the word.");
            lives--;
        }
    }
}

class R {
    public String word;

    public R(String word) {
        this.word = word;
    }
}
