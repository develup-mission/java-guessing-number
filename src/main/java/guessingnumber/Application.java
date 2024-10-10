package guessingnumber;

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        do {
            int num = random.nextInt(1, 100);
            startGame(sc, num);

        } while (askToRestart(sc));
    }

    private static void startGame(Scanner sc, int num) {
        System.out.println("숫자 추리 게임을 시작합니다.");

        int count = 0;

        while (count++ < 3) {
            int userInput = getUserInput(sc);
            if (evaluateGuess(num, userInput)) {
                System.out.println("정답입니다!");
                break;
            }
        }

        if (count > 3) {
            System.out.println("패배했습니다.");
        }
    }

    private static int getUserInput(Scanner sc) {
        System.out.println("1부터 100 사이 숫자 중 하나를 골라주세요.");
        int userInput = sc.nextInt();
        sc.nextLine();
        return userInput;
    }

    private static boolean evaluateGuess(int correctNum, int userGuess) {
        if (userGuess > correctNum) {
            System.out.println("더 낮습니다.");
            return false;
        }
        if (userGuess < correctNum) {
            System.out.println("더 높습니다.");
            return false;
        }
        return true;
    }

    private static boolean askToRestart(Scanner sc) {
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
        String answer = sc.nextLine();
        return !answer.equals("n");
    }
}
