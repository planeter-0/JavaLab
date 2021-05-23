package t1.lab4;

public class ChessBoardColour {
    public static void main(String[] args) {
        ChessBoardColour cbc = new ChessBoardColour();
        cbc.checkColour('f', 1);
        cbc.checkColour('G', 7);
        cbc.checkColour('J', 1);
    }

    public void checkColour(char letter, int number) {
        letter = Character.toUpperCase(letter);
        if (letter >= 'A' && letter <= 'H') {
            if (letter % 2 == number % 2) {
                System.out.println("Dark");
            } else {
                System.out.println("White");
            }
        } else {
            System.out.println("Wrong Code!");
        }
    }
}