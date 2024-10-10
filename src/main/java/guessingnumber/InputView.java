package guessingnumber;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputNumber() {
        System.out.println("1부터 100 사이 숫자 중 하나를 골라주세요.");
        return SCANNER.nextLine();
    }

    public static String inputGameCommand() {
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
        return SCANNER.nextLine();
    }

    private InputView() {}
}
