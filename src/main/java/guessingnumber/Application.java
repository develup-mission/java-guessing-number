package guessingnumber;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        boolean flag = false;

        while (!flag) {
            GameManage gameManage = new GameManage();
            gameManage.gameStart();

            if (!gameManage.restart()) {
                flag = true;
            }
        }
    }
}
