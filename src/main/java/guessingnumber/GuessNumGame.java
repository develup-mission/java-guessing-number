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

    public int confirmAnswer(int userInput) {
        //life 처리.
        if(answer==userInput){
            return 0;
        }else if(answer>userInput){
            life-=1;
            return -1;
        }else{
            life-=1;
            return 1;
        }
    }
}
