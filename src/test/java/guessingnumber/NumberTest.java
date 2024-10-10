package guessingnumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberTest {

    @Test
    @DisplayName("숫자 문자열을 통해 생성 가능하다.")
    void create_with_number_string() {
        final Number number1 = new Number(5);
        final Number number2 = Number.from("5");

        assertThat(number1).isEqualTo(number2);
    }

    @Test
    @DisplayName("숫자가 아닌 값이 들어오면 예외를 발생한다.")
    void throw_exception_when_not_number_string() {
        assertThatThrownBy(() -> Number.from("Not Number"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("숫자가 동일하면 참을 반환한다.")
    void return_true_when_equals() {
        final Number number1 = new Number(5);
        assertThat(number1.equals(new Number(5))).isTrue();
    }

    @Test
    @DisplayName("숫자가 더 크면 참을 반환한다.")
    void return_true_when_greater() {
        final Number number1 = new Number(5);
        assertThat(number1.isGreaterThan(new Number(3))).isTrue();
    }

    @Test
    @DisplayName("숫자가 더 작으면 거짓을 반환한다.")
    void return_false_when_greater() {
        final Number number1 = new Number(5);
        assertThat(number1.isGreaterThan(new Number(6))).isFalse();
    }
}
