package guessingnumber;

import java.util.Random;

public class Computer {
    private int randomNum;

    public void setRandomNum() {
        Random random = new Random();
        //random.setSeed(System.currentTimeMillis());
        this.randomNum = random.nextInt(100) + 1;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public boolean isAnswer(int guessNum) { // 추측이 정답이면 true, 아니면 false 반환
        checkNum(guessNum);
        return guessNum == randomNum;
    }

    public void checkNum(int guessNum) {    // 추측과 정답 비교 결과를 출력함
        if (guessNum == randomNum) {
            System.out.println("정답입니다!\n");
        } else if (guessNum < randomNum) {
            System.out.println("더 높습니다.\n");
        } else {
            System.out.println("더 낮습니다.\n");
        }
    }
}
