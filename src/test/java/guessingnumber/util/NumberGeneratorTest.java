package guessingnumber.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberGeneratorTest {

    @DisplayName("랜덤숫자 범위 검사")
    @Test
    void generateByRandom() {
        int num = NumberGenerator.generateByRandom();
        assertThat(num)
                .isGreaterThanOrEqualTo(1)
                .isLessThanOrEqualTo(100);
    }
}
