package guessingnumber;

import java.util.Random;

public class GuessNumGame {

    int answer;
    int life;
    public GuessNumGame() {
    }

    public void start() {
        answer=new Random().nextInt(100)+1;
        life=3;
    }

    public int getAnswer() {
        return answer;
    }

    public int getLife() {
        return life;
    }
}
