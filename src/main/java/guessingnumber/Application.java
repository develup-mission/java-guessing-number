package guessingnumber;

import java.util.Random;
import java.util.Scanner;

public class Application {
    static boolean play = true;
    static int answer;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (play) {
            System.out.println("숫자 추리 게임을 시작합니다.");
            startGame();
            playAgain();
        }
    }

    private static void startGame() {
        Random random = new Random();
        answer = random.nextInt(100) + 1;
        boolean correct = false;

        for (int i = 0; i < 3; i++) {
            int guessNumber = getValidGuess();
            if (guessNumber < answer) {
                System.out.println("더 높습니다.");
            } else if (guessNumber > answer) {
                System.out.println("더 낮습니다.");
            } else {
                System.out.println("정답입니다!");
                correct = true;
                break;  // 정답을 맞추면 반복을 종료
            }
        }

        if (!correct) {
            System.out.println("아쉽습니다. 정답은 " + answer + "였습니다.");
        }
    }

    private static int getValidGuess() {
        int guessNumber = -1;
        while (true) {
            System.out.println("1부터 100 사이 숫자 중 하나를 골라주세요.");
            if (sc.hasNextInt()) {
                guessNumber = sc.nextInt();
                if (guessNumber >= 1 && guessNumber <= 100) {
                    break;
                } else {
                    System.out.println("1부터 100 사이의 숫자를 입력해주세요.");
                }
            } else {
                System.out.println("숫자를 입력해주세요.");
                sc.next();
            }
        }
        return guessNumber;
    }

    private static void playAgain() {
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("y")) {
                play = true;
                break;
            } else if (input.equalsIgnoreCase("n")) {
                play = false;
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 예: y, 아니오: n 중 하나를 입력해주세요.");
            }
        }
    }
}
