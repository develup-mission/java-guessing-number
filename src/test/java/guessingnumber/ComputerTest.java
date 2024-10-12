package guessingnumber;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    private Computer computer;

    private static ByteArrayOutputStream outputMessage; //

    void setUpStreams() {   // 콘솔창 출력 테스트하기 위해서
        outputMessage = new ByteArrayOutputStream();    // OutputStream 생성
        System.setOut(new PrintStream(outputMessage));  // 생성한 OutputStream으로 설정
    }

    @BeforeEach
    void setUp() {
        computer = new Computer();
        setUpStreams();
    }

    @AfterEach
    void restoresStreams() {    // 원상복구
        System.setOut(System.out);
    }

    @DisplayName("난수 범위 테스트")
    @Test
    public void setRandomNumTest() {
        computer.setRandomNum();
        int randomNum = computer.getRandomNum();
        Assertions.assertTrue(randomNum >= 1 && randomNum <= 100, "Random Number is between 1 and 100.");
    }

    @DisplayName("추측 < 정답 경우 테스트")
    @Test
    public void checkNumTest_lowerGuess() {
        computer.setRandomNum();
        int answer = computer.getRandomNum();
        int lowerGuess = answer == 1 ? 1 : answer - 1;  // 정답이 1이 아닌 경우, 정답보다 작은 추측값 가지도록 설정

        computer.checkNum(lowerGuess);

        String actualOutput = outputMessage.toString().trim();  // 개행문자 제거
        String expectedOutput = "더 높습니다.";

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @DisplayName("추측 > 정답 경우 테스트")
    @Test
    public void checkNumTest_upperGuess() {
        computer.setRandomNum();
        int answer = computer.getRandomNum();
        int upperGuess = answer == 100 ? 100 : answer + 1;  // 정답이 100이 아닌 경우, 정답보다 큰 추측값 가지도록 설정

        computer.checkNum(upperGuess);

        String actualOutput = outputMessage.toString().trim();  // 개행문자 제거
        String expectedOutput = "더 낮습니다.";

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @DisplayName("추측 == 정답 경우 테스트")
    @Test
    public void checkNumTest_rightGuess() {
        computer.setRandomNum();
        int rightGuess = computer.getRandomNum();

        computer.checkNum(rightGuess);

        String actualOutput = outputMessage.toString().trim();  // 개행문자 제거
        String expectedOutput = "정답입니다!";

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
