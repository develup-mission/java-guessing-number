package guessingnumber;

import java.util.Scanner;

public class GameManage {
    private final Computer computer = Computer.getInstance(); // 컴퓨터는 하나라고 가정
    private final User user = new User();
    public static final int START_NUMBER = 1;
    public static final int END_NUMBER = 100;
    private boolean restart;

    public GameManage() {
        System.out.println("숫자 추리 게임을 시작합니다.");
        user.selectUserNumber();
    }

    public void gameStart() {

        while (!isValid(user.getUserNumber())) { // 컴퓨터는 랜덤 난수라 따로 검사 생략
            System.out.println("주어진 범위 사이의 숫자를 선택해주세요.");
            user.selectUserNumber();
        }

        while (!isRight(user.getUserNumber(), computer.getRandomNumber())) {
            if (user.getUserNumber() > computer.getRandomNumber()) {
                System.out.println("더 높습니다");
            } else if (user.getUserNumber() < computer.getRandomNumber()) {
                System.out.println("더 낮습니다.");
            }

            user.selectUserNumber();
        }
    }

    public boolean restart() {
        System.out.println("정답입니다!");
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();

        return answer.equals("y");

    }

    private boolean isRight(int com, int user) {
        return com == user;
    }

    private boolean isValid(int user) {
        return user >= START_NUMBER && user <= END_NUMBER;
    }

}
