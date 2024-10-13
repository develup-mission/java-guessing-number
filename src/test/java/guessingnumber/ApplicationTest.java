package guessingnumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    private GuessNumGame game;


    @BeforeEach
    void setUp() {
        // 각 테스트 실행 전에 game 객체를 초기화,시작
        game = new GuessNumGame();
        game.start();
    }

    @Test
    void 게임세팅이_정상인지_확인(){
        //게임은 1~100사이의 답안을 가지고 있어야한다.
        //게임은 3개의 생명을 가지고 시작한다.
        //assert
        assertEquals(game.getLifes(),3);
        assertTrue(game.getAnswer()<=100 && game.getAnswer()>=1);
    }

    @Test
    void 사용자가_더높은답안을_제출한경우_오답판단(){
        int user_input=game.getAnswer()+1;

    }
    @Test
    void 사용자가_더낮은답안을_제출한경우_오답판단(){

    }

    @Test
    void 사용자가_정답을_제출한경우_정답판단(){

    }

    @Test
    void life가_0이되면_게임이패배된다(){

    }
    @Test
    void 게임종료후_다시_게임재개를_묻는다(){

    }

}
