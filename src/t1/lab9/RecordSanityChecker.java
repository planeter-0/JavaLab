package t1.lab9;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecordSanityChecker {
    public static void main(String[] args) throws IOException {
        File f = new File("src/com/lab9/StudentScore.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));

        String headers = br.readLine();
        System.out.println(headers);

        String student;
        while ((student = br.readLine()) != null) {
            if (!RecordSanityChecker.isValid(student))
                System.out.println(student);
        }
    }


    public static boolean isValid(String stu) {
        String stuNum, score;
        //Get Student Number, Student Score
        stuNum = stu.substring(0, 9).replaceAll(" ", "");
        score = stu.substring(10).replaceAll(" ", "");
        //Student Number
        Pattern stuNum_p = Pattern.compile("T00(\\d){6}");
        Matcher m = stuNum_p.matcher(stuNum);
        boolean stuNumBoolean = m.matches();
        //Student Score
        boolean scoreBoolean;
        int score_ = 0;
        try {
            score_ = Integer.parseInt(score);
            if (score_ >= 0 || score_ <= 100) scoreBoolean = true;
            else scoreBoolean = false;
        } catch (NumberFormatException e) {
            scoreBoolean = false;
        }
        return (stuNumBoolean && scoreBoolean);
    }
}
