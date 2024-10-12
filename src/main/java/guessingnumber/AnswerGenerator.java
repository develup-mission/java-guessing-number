package guessingnumber;

import java.util.Random;

public class AnswerGenerator {
    private static final Random RANDOM_GENERATOR = new Random();
    public int getAnswer(){
        return RANDOM_GENERATOR.nextInt(100) + 1;
    }
}
