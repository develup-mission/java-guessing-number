package guessingnumber;

public class Application {
    public static void main(String[] args) {
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
