package guessingnumber.io;

import java.util.Scanner;

public class ConsoleInputHandler {

    public static final Scanner SCANNER = new Scanner(System.in);

    public int getUserNumberInput(){
        String userInput = SCANNER.nextLine();
        return Integer.parseInt(userInput);
    }

    public String getSelectionIfUserRestart(){
        return SCANNER.nextLine();
    }
}
