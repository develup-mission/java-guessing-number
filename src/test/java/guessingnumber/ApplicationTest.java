package guessingnumber;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {

    private static ByteArrayOutputStream outputMessage;
    private static InputStream systemIn = System.in;

    @BeforeEach
    void setUp() {  // 콘솔창 출력 테스트하기 위해서
        outputMessage = new ByteArrayOutputStream();    // OutputStream 생성
        System.setOut(new PrintStream(outputMessage));  // 생성한 OutputStream으로 설정
    }

    @AfterEach
    void restoresStreams() {    // 원상복구
        System.setOut(System.out);
        System.setIn(systemIn);
    }
    
}
