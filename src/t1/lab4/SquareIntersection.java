package t1.lab4;


public class SquareIntersection {
    public static void main(String[] args) {
        Square square1 = new Square(6, 7, 3);
        Square square2 = new Square(4, 5, 7);
        Square.sorted(square1, square2)[0].check(Square.sorted(square1, square2)[1]);
    }

}

class Square {
    protected double x, y;
    protected double l;

    public Square(double x, double y, double l) {
        this.x = x;
        this.y = y;
        this.l = l;
    }

    public void check(Square another) {
        if (this.isIntersects(another)) {
            if (this.isContains(another)) {
                System.out.println("Square1 contains Square2");
            }
            if (another.isContains(this)) {
                System.out.println("Square2 contains Square1");
            }
            System.out.println("Square1 intersects with Square2");
        }
    }

    public static Square[] sorted(Square s1, Square s2) {
        if (s1.l > s2.l) {
            return new Square[]{s1, s2};
        } else {
            return new Square[]{s2, s2};
        }
    }

    public boolean isContains(Square another) {
        return Math.sqrt(Math.pow(x - another.x, 2) + Math.pow(y - another.y, 2))
                + another.l / 2 < l / 2;
    }

    public boolean isIntersects(Square another) {
        return Math.abs(x - another.x) < (l + another.l) / 2 ||
                Math.abs(y - another.y) < (l + another.l) / 2;
    }

}