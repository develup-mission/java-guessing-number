package guessingnumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class GameCommandTest {
    @Test
    @DisplayName("없는 명령어를 입력 시, 예외를 발생한다.")
    void throw_exception_when_not_exist_command() {
        assertThatThrownBy(() -> GameCommand.from("NOT EXIST COMMAND"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
