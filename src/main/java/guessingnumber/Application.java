package guessingnumber;
import java.util.Scanner;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현(숫자야구 3번만에 맞추기)
        String playAgain = "y";
        while(playAgain.equals("y")) {
            ChooseNum chooseNum= new ChooseNum();
            playAgain = chooseNum.playGame();
        }
    }

}


class ChooseNum{
    Random random=new Random();
    int randomNumber;

   public ChooseNum(){
       randomNumber= random.nextInt(100)+1; //1~100 범위의 랜덤 숫자
       System.out.println("숫자 추리 게임을 시작합니다.");
   }

   public String playGame(){
       Scanner sc= new Scanner(System.in);
       for(int i=0; i<3; i++) {
        System.out.println("1부터 100 사이 숫자 중 하나를 골라주세요.");
        int x= sc.nextInt();

        if (x > randomNumber) {
            System.out.println("더 낮습니다.");
        } else if (x < randomNumber) {
            System.out.println("더 높습니다");
        } else {
            System.out.println("정답입니다.");
            break; //정답을 맞추면 반복 종료
        }
    }
    System.out.println("게임을 다시 시작하겠습니까? (예 :y, 아니오:n)");
    String s = sc.next();
    return s;
   }
}


