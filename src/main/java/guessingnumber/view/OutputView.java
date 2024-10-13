package guessingnumber.view;

public class OutputView {
    private static final String START_MESSAGE = "숫자 추리 게임을 시작합니다.";
    private static final String LOW_MESSAGE = "더 낮습니다.";
    private static final String HIGH_MESSAGE = "더 높습니다.";
    private static final String CORRECT_MESSAGE = "정답입니다!";

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printLowMessage() {
        System.out.println(LOW_MESSAGE);
    }

    public static void printHighMessage() {
        System.out.println(HIGH_MESSAGE);
    }

    public static void printCorrectMessage() {
        System.out.println(CORRECT_MESSAGE);
    }
}
