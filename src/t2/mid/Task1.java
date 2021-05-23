package t2.mid;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/9 14:10
 * @status dev
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int discNum = sc.nextInt();
        HanoiTower(discNum);
    }

    public static void HanoiTower(int discNum) {
        //Initial
        Stack<Integer> pole1 = new Stack<Integer>();
        Stack<Integer> pole2 = new Stack<Integer>();
        Stack<Integer> pole3 = new Stack<Integer>();
        for (int i = 1; i < discNum + 1; i++) {
            pole1.add(i);
        }
        //Map
//        Map<Stack<Integer>,String> map= new HashMap<>();
//        map.put(pole1,"1");
//        map.put(pole2,"2");
//        map.put(pole3, "3");
        move(discNum, pole1, pole2, pole3);
        System.out.println("end");
    }

    public static void move(Integer n, Stack<Integer> p1, Stack<Integer> p2, Stack<Integer> p3) {
        if (n == 1) {
            int moved = p1.pop();
            p3.add(moved);
            System.out.println("Move " + moved + " from " + p1 + " --> " + p3);
        } else {
            move(n - 1, p1, p3, p2);
            int moved = p1.pop();
            p3.add(moved);
            System.out.println("Move " + moved + " from " + p1 + " --> " + p3);
            move(n - 1, p2, p1, p3);
        }
    }

}
