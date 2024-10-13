package guessingnumber.util;

import java.util.Random;

public class NumberGenerator {

    private static final int START_NUM = 1;
    private static final int END_NUM = 100;

    public static int generateByRandom() {
        Random random = new Random();
        return random.nextInt(END_NUM) + START_NUM;
    }
}
