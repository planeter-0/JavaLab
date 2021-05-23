package t2.lab4;

// 832003325

// Do Not Remove these

import java.io.*;
import java.util.ArrayList;
//Do Not remove above

import java.util.Scanner;
import java.util.regex.Pattern;

public class Programming4 {
    public static void main(String[] args) {
        System.out.println(getMark("E:\\Projects\\IDEA\\Lab\\resource\\Student1.java"));
        System.out.println(getMark("E:\\Projects\\IDEA\\Lab\\resource\\Student2.java"));
        System.out.println(getMark("E:\\Projects\\IDEA\\Lab\\resource\\Student3.java"));
        System.out.println(getMark("E:\\Projects\\IDEA\\Lab\\resource\\Student4.java"));
    }

    public static boolean checkLine(String s, String pattern) {
        return s.matches(pattern);
    }

    public static int getMark(String path) {
        // Pass filename into the codeReader method here
        String[] code = codeReader(path);
        String[] pattern = new String[]{
                ".*public class.*",
                ".*void main\\(String \\[\\] args\\).*",
                ".*for\\(.*;.*;.*\\).*",
                ".*%.*",
                ".*System\\.out\\.print.*"};
        String content = "";
        for (int i = 0; i < code.length; i++) {
            content += code[i];
        }
        int mark = 0;
        for (int i = 0; i < pattern.length; i++) {
            if (Pattern.matches(pattern[i], content))
                mark += 10;
        }
        return mark;
    }


    /** --------------------------------------- **/
    /** DO NOT CHANGE ANYTHING IN THESE METHODS **/
    /**
     * ---------------------------------------
     **/
    public static String[] codeReader(String fileName) {
        //Path to file to read in
        String myfile = fileName;
        //Create an ArrayList (a dynamic type of Array)
        ArrayList<String> lines = new ArrayList<String>();
        try {
            // try to read in the File
            BufferedReader abc = new BufferedReader(new FileReader(myfile));

            String line;
            while ((line = abc.readLine()) != null) {
                lines.add(line);
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
    /** ------------------------------------------ **/
    /** DO NOT CHANGE ANYTHING IN THE METHODS ABOVE **/
    /** ------------------------------------------ **/
}
