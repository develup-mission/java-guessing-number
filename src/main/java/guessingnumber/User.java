package guessingnumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    private int userNumber;

    public int getUserNumber() {
        return userNumber;
    }

    public void selectUserNumber() {
        try {
            System.out.println(GameManage.START_NUMBER + "부터 " + GameManage.END_NUMBER + " 사이 숫자 중 하나를 골라주세요.");
            Scanner sc = new Scanner(System.in);
            userNumber = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
            e.printStackTrace();
        }
    }

}
