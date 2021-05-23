package t1.lab5;

public class DivideBy2 {
    public static void main(String[] args) {
        int num1 = 40;
        int count = 0;
        while (num1>=2){
            num1/=2;
            count++;
        }
        System.out.println(count);
    }
}
