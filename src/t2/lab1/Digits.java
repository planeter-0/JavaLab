package t2.lab1;

public enum Digits {
    ONE(1,new char[][]{{'|'}, {'|'}, {'|'}, {'|'}, {'|'}}),
    TWO(2,new char[][]{{'-','-'}, {' ',' ','|'}, {'-','-'}, {'|'}, {'-','-'}}),
    THREE(3,new char[][]{{'-','-'}, {' ',' ','|'}, {'-','-'}, {' ',' ','|'}, {'-','-'}}),
    FOUR(4,new char[][]{{}, {}, {}, {}, {}}),
    FIVE(5,new char[][]{{}, {}, {}, {}, {}}),
    SIX(6,new char[][]{{}, {}, {}, {}, {}}),
    SEVEN(7,new char[][]{{}, {}, {}, {}, {}}),
    EIGHT(8,new char[][]{{}, {}, {}, {}, {}}),
    NINE(9,new char[][]{{}, {}, {}, {}, {}});

    private Digits(int num, char[][] str) {
        this.num = num;
        this.str = str;
    }
    private int num;
    private char[][] str;

    public char[][] getStr() {
        return str;
    }

}
