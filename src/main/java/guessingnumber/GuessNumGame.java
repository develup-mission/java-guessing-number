package guessingnumber;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class GuessNumGame {

    int answer;
    int life;
    Scanner scanner=new Scanner(System.in);
    public GuessNumGame() {
    }

    public void start() {
        answer=new Random().nextInt(100)+1;
        life=3;
        System.out.println("숫자 추리 게임을 시작합니다.");
        while (life>0){
            //답안 묻기
            int userInput=getUserInput();
            //답안 확인
            int result=confirmAnswer(userInput);
        }
        //게임 종료시 재진행 여부 묻기
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
        char input=scanner.next().charAt(0);
        if(input=='y'){
            start();
        } else if (input=='n') {
            return;
        }
    }

    int getUserInput(){
        System.out.println("1부터 100 사이 숫자 중 하나를 골라주세요.");
        return scanner.nextInt();
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
            System.out.println("정답입니다!");
            return 0;
        }else if(answer>userInput){
            life-=1;
            System.out.println("더 높습니다.");
            return -1;
        }else{
            life-=1;
            System.out.println("더 낮습니다.");
            return 1;
        }
    }
}
