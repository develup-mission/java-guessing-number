package guessingnumber;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        int answer = (int) (Math.random() * 100 + 1);

        int count = 0;

        boolean continueCheck = true;

        Scanner input = new Scanner(System.in);

        System.out.println();

        while (continueCheck) {
            System.out.println("숫자 추리 게임을 시작합니다.");
            while (count < 3) {
                System.out.println("1부터 100 사이 숫자 중 하나를 골라주세요.");
                int user = input.nextInt();
                if (answer == user) {
                    System.out.println("정답입니다!");
                    break;
                } else if (answer > user) {
                    System.out.println("더 높습니다.");
                } else {
                    System.out.println("더 낮습니다.");
                }
                count++;
            }
            count = 0;
            System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
            String decision = input.next();

            if (decision.equals("n")) {
                continueCheck = false;
            }
        }


    }
}
