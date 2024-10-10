package guessingnumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CountTest {
    @Test
    @DisplayName("횟수는 0부터 시작한다.")
    void start_with_zero() {
        final Count count = new Count(3);
        assertThat(count).isEqualTo(new Count(0,3));
    }

    @Test
    @DisplayName("횟수를 1씩 증가시킨다.")
    void increase_count() {
        final Count count = new Count(3);
        count.increase();
        assertThat(count).isEqualTo(new Count(1,3));
    }

    @Test
    @DisplayName("횟수가 기준치를 초과하면, 증가 시 예외를 발생한다.")
    void throw_exception_when_count_exceed_threshold() {
        final Count count = new Count(1, 1);
        assertThatThrownBy(() -> count.increase())
                .isInstanceOf(IllegalStateException.class);
    }
}
