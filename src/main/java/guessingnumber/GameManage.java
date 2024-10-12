package guessingnumber;

import java.io.IOException;
import java.util.Scanner;

public class GameManage {
    public static final int START_NUMBER = 1;
    public static final int END_NUMBER = 100;
    private final Computer computer = new Computer();
    private final User user = new User();
    private int chance;

    public GameManage() throws IOException {
        System.out.println("숫자 추리 게임을 시작합니다.");
        //System.out.println(computer.getRandomNumber()); // 디버그용

        chance = 3;
    }

    public void gameStart() throws IOException {
        while (true) {
            user.selectUserNumber(); // 숫자 선택

            if (user.getUserNumber() > computer.getRandomNumber()) {
                System.out.println("더 높습니다");
            } else if (user.getUserNumber() < computer.getRandomNumber()) {
                System.out.println("더 낮습니다.");
            } else {
                System.out.println("정답입니다!");
                break;
            }

            chance--;

            if (!hasChance(chance)) {
                System.out.println("횟수를 초과했습니다.");
                break;
            }
        }
    }

    public boolean restart() {
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");

        Scanner sc = new Scanner(System.in);
        String answer = sc.next();

        // 예외 처리
        if (answer.equals("y")) {
            return true;
        } else if (answer.equals("n")) {
            return false;
        }

        System.out.println("y 또는 n만 입력해주세요.");
        return restart();
    }

    private boolean hasChance(int chance) {
        return chance > 0;
    }

}
