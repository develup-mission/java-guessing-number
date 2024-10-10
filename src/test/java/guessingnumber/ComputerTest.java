package guessingnumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerTest {

    @Test
    @DisplayName("숫자가 동일하면, EQUAL 를 반환한다.")
    void equal_case() {
        final Computer computer = new Computer(new Number(10));

        final AnswerStatus answer = computer.answer(new Number(10));
        assertThat(answer).isEqualTo(AnswerStatus.EQUAL);
    }

    @Test
    @DisplayName("숫자가 높으면, HIGH 를 반환한다.")
    void high_case() {
        final Computer computer = new Computer(new Number(42));

        final AnswerStatus answer = computer.answer(new Number(40));
        assertThat(answer).isEqualTo(AnswerStatus.HIGH);
    }

    @Test
    @DisplayName("숫자가 낮으면, LOW 를 반환한다.")
    void low_case() {
        final Computer computer = new Computer(new Number(42));

        final AnswerStatus answer = computer.answer(new Number(50));
        assertThat(answer).isEqualTo(AnswerStatus.LOW);
    }

    @Test
    @DisplayName("정답을 맞추면, 종료 상태를 반환한다.")
    void answer_equal_change_isFinished(){
        final Computer computer = new Computer(new Number(20));

        assertThat(computer.isNotFinished()).isTrue();
        computer.answer(new Number(20));
        assertThat(computer.isNotFinished()).isFalse();
    }
}
