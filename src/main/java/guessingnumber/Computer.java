package guessingnumber;

import java.util.Random;

public class Computer {

    private final int randomNumber;
    private static final Computer computer = new Computer();

    public static Computer getInstance() {
        return computer;
    }

    private Computer() {
        randomNumber = setNumberOfComputer();
    }

    private int setNumberOfComputer() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

}
