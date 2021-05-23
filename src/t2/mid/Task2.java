package t2.mid;

import java.util.Scanner;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/9 14:30
 * @status ok
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNumber = sc.next();
        System.out.println(ValidPhoneNumber(phoneNumber));
    }

    public static boolean ValidPhoneNumber(String phoneNumber) {
        boolean valid = false;
//        String regex = "(\\(?\\d{3}\\)?)(-?|\\.?| ?)(\\d{3})(-?|\\.?| ?)(\\d{4})(( x\\d{4})|( ext\\d{4}))?";
        String regex1 = "\\d{10}";
        String regex2 = "\\d{3}-\\d{3}-\\d{4}";
        String regex3 = "\\d{3}-\\d{3}-\\d{4} x\\d{4}";
        String regex4 = "\\d{3}-\\d{3}-\\d{4} ext\\d{4}";
        String regex5 = "\\(\\d{3}\\)-\\d{3}-\\d{4}";
        String regex6 = "\\d{3}\\.\\d{3}\\.\\d{4}";
        String regex7 = "\\d{3} \\d{3} \\d{4}";
        if (phoneNumber.matches(regex1)) {
            valid = true;
        } else if (phoneNumber.matches(regex2)) {
            valid = true;
        } else if (phoneNumber.matches(regex3)) {
            valid = true;
        } else if (phoneNumber.matches(regex4)) {
            valid = true;
        } else if (phoneNumber.matches(regex5)) {
            valid = true;
        } else if (phoneNumber.matches(regex6)) {
            valid = true;
        } else if (phoneNumber.matches(regex7)) {
            valid = true;
        }
        return valid;
    }
}
