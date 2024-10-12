package guessingnumber;

import guessingnumber.io.ConsoleInputHandler;
import guessingnumber.io.ConsoleOutputHandler;

public class Application {
    public static void main(String[] args) {
        ConsoleOutputHandler outputHandler = new ConsoleOutputHandler();
        ConsoleInputHandler inputHandler = new ConsoleInputHandler();
        AnswerGenerator generator = new AnswerGenerator();

        GuessingNumber game = new GuessingNumber(inputHandler, outputHandler, generator);

        game.run();
    }
}
