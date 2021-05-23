package t2.lab6;

import java.util.Scanner;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/23 14:31
 * @status dev
 */
class TestBasicCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BasicCircle c1 = new BasicCircle(5);
        BasicCircle c2 = new BasicCircle(7);
        BasicCircle c3 = new BasicCircle(3);
        System.out.println("Circle 1 has a radius of " + c1.getRadius());
        System.out.println("Circle 2 has a radius of " + c2.getRadius());
        System.out.println("Circle 3 has a radius of " + c3.getRadius());

        System.out.println("Circle 1 has a circumference of " + c1.getCircumference());
        System.out.println("Circle 2 has a circumference of " + c2.getCircumference());
        System.out.println("Circle 3 has a circumference of " + c3.getCircumference());

        System.out.println("Circle 1 has an area of " + c1.getArea());
        System.out.println("Circle 2 has an area of " + c2.getArea());
        System.out.println("Circle 3 has an area of " + c3.getArea());

    }
}

public class BasicCircle {
    private double radius;

    public BasicCircle() {
        radius = 1;
    }

    public BasicCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        double res = 2 * Math.PI * radius;
        return Math.round(res * 100.0) / 100.0;
    }

    public double getArea() {
        double res = Math.PI * Math.pow(radius, 2);
        return Math.round(res * 100.0) / 100.0;
    }
}
