package guessingnumber;

import java.util.Scanner;

public class User {
    private final int userNumber;

    public User() {
        userNumber = selectUserNumber();
    }


    public int getUserNumber() {
        return userNumber;
    }

    private int selectUserNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


}
