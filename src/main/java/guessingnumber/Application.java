package guessingnumber;

public class Application {
    public static void main(String[] args) {
        final var gameBoard = GameBoard.create();
        gameBoard.start();
    }
}
