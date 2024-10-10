package guessingnumber;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

    public static int generate(final int min, final int max) {
        return ThreadLocalRandom.current()
                .nextInt(min, max);
    }

    private RandomNumberGenerator() {}
}
