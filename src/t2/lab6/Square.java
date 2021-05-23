package t2.lab6;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/23 14:47
 * @status dev
 */
class TestSquare {
    public static void main(String[] args) {
        Square[] squares = new Square[4];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square();
        }
        squares[0].setLength(10);
        squares[2].setLength(10);
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square " + (i + 1) + " has a side length of " + squares[i].getLength());
        }
        System.out.println("Square 1 has an area of " + squares[0].getArea());
        System.out.println("Square 2 has an area of " + squares[1].getArea());
        System.out.println(squares[2].toString());
    }

}

public class Square {
    private double length;

    public Square() {
        length = 1;
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length*length;
    }

    @Override
    public String toString() {
        return "LENGTH: " + length;
    }
}
