package guessingnumber;

import guessingnumber.controller.MainController;

public class Application {
    public static void main(String[] args) {
        final MainController mainController = new MainController();
        mainController.run();
    }
}
