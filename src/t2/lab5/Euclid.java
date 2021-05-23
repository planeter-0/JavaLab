package t2.lab5;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/16 12:35
 * @status dev
 */
public class Euclid {
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b, a%b);
    }

    public static void main(String[] args) {
        System.out.println(GCD(741, 285));
        System.out.println(GCD(366, 6));
    }
}
