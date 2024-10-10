package guessingnumber;

import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberGeneratorTest {

    @RepeatedTest(1000)
    void some() {
        final int min = 1;
        final int max = 100;
        final int number = RandomNumberGenerator.generate(min, max);
        assertThat(number).isGreaterThanOrEqualTo(min)
                .isLessThanOrEqualTo(max);
    }
}
