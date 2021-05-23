package t1.lab6;

public class Thanksgiving {
    public static void main(String[] args) {
        String text = new String("These are some treats for your hard works.");
        int len = text.length();
        int pos = text.indexOf('h');
        String lower_case = text.toLowerCase();
        String upper_case = text.toUpperCase();

        System.out.println(len);
        System.out.println(pos);
        System.out.println(lower_case);
        System.out.println(upper_case);
    }
}
