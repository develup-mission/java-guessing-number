package guessingnumber;

import java.util.Random;
import java.util.Scanner;

public class Application {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final int MIN_COUNT = 1;
    private static final int MAX_COUNT = 3;

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.println("숫자 추리 게임을 시작합니다.");
        int answer = setAnswer();

        for (int count = MIN_COUNT; count <= MAX_COUNT; count++) {
            System.out.println(System.lineSeparator() + "1부터 100 사이 숫자 중 하나를 골라주세요.");
            int userExpectedAnswer = Integer.parseInt(SCANNER.nextLine());
            String result = compare(answer, userExpectedAnswer, count);
            System.out.println(result);
            if ("정답입니다!".equals(result) || "오답입니다!".equals(result)) {
                break;
            }
        }

        System.out.println("\n게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
        String input = SCANNER.nextLine();
        if ("y".equals(input)) {
            startGame();
        }
    }

    private static int setAnswer() {
        return new Random().nextInt(MAX_VALUE) + MIN_VALUE;
    }

    private static String compare(int answer, int userExpectedAnswer, int count) {
        if (answer == userExpectedAnswer) {
            return "정답입니다!";
        }
        if (count == MAX_COUNT) {
            return "오답입니다!";
        }
        if (answer < userExpectedAnswer) {
            return "더 낮습니다.";
        }
        return "더 높습니다.";
    }
}
