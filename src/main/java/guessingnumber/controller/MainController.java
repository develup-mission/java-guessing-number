package guessingnumber.controller;

import guessingnumber.util.NumberGenerator;
import guessingnumber.view.InputView;
import guessingnumber.view.OutputView;

public class MainController {
    private static final int START_NUM = 1;
    private static final int END_NUM = 100;


    public void run() {
        do {
            start();
        } while (isRetry());
    }

    private void start() {
        OutputView.printStartMessage();
        int computerNum = NumberGenerator.generateByRandom();
        int userNum;

        do {
            userNum = InputView.inputNumber();
        } while (!validate(userNum, computerNum));
    }

    private boolean isRetry() {
        String input;
        do {
            input = InputView.inputGameLoop();
        } while (!input.equals("y") && !input.equals("n"));
        return input.equals("y");
    }

    private boolean validate(int userNum, int computerNum) {
        if (userNum < START_NUM || userNum > END_NUM) {
            return false;
        }

        if (userNum == computerNum) {
            OutputView.printCorrectMessage();
            return true;
        } else if (userNum < computerNum) {
            OutputView.printHighMessage();
        } else if (userNum > computerNum) {
            OutputView.printLowMessage();
        }

        return false;
    }

}
