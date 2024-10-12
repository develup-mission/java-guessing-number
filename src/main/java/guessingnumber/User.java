package guessingnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    private int userNumber = Integer.MAX_VALUE;

    public int getUserNumber() {
        return userNumber;
    }

    public void selectUserNumber() throws IOException {
        while (true) {
            System.out.println(GameManage.START_NUMBER + "부터 " + GameManage.END_NUMBER + " 사이 숫자 중 하나를 골라주세요.");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input = br.readLine();

            if (!isTypeValid(input)) {
                System.out.println("잘못된 타입 입니다. 숫자를 입력해주세요");
            } else if (!isRangeValid(userNumber)) {
                System.out.println("주어진 범위 사이의 숫자를 선택해주세요.");
            } else {
                break;
            }
        }
    }

    private boolean isRangeValid(int user) {
        return user >= GameManage.START_NUMBER && user <= GameManage.END_NUMBER;
    }

    private boolean isTypeValid(String input) {
        try {
            userNumber = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

}
