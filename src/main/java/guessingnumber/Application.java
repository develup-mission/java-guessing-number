package guessingnumber;

import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    static Computer computer = new Computer();

    public static void main(String[] args) {
        boolean isContinue = true;

        while (isContinue) {
            playGame();
            isContinue = wannaPlayAgain();
            System.out.println();   // 마지막 줄바꿈 위해서
        }
    }

    private static void playGame() {
        computer.setRandomNum();
        System.out.println("숫자 추리 게임을 시작합니다.\n");

        int tryCnt = 0; // 추측 시도 횟수
        for (; tryCnt < 3; tryCnt++) {
            int guessNum = getUserInput();
            if (computer.isAnswer(guessNum)) {
                break;
            }
        }
        if (tryCnt == 3) {
            System.out.println("패배하셨습니다. 정답은 " + computer.getRandomNum() + "입니다:(\n");
        }
        
        scanner.nextLine(); // nextInt() 후에 버퍼에 남아있는 개행 문자 처리
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
    }

    private static int getUserInput() {
        System.out.println("1부터 100 사이 숫자 중 하나를 골라주세요.");
        return scanner.nextInt();
    }

    private static boolean wannaPlayAgain() {
        String res = scanner.nextLine();
        return res.equals("y");
    }
}
