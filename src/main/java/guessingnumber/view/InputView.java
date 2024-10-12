package guessingnumber.view;

import java.util.Scanner;

public class InputView {
    private static final String NUMBER_INPUT_MESSAGE = "1부터 100 사이 숫자 중 하나를 골라주세요.";
    private static final String GAME_LOOP_MESSAGE = "게임을 다시 시작하겠습니까? (예: y, 아니오: n)";

    public static int inputNumber() {
        System.out.println(NUMBER_INPUT_MESSAGE);
        return readInput().nextInt();
    }

    public static String inputGameLoop() {
        System.out.println(GAME_LOOP_MESSAGE);
        return readInput().next();
    }

    private static Scanner readInput() {
        return new Scanner(System.in);
    }
}
