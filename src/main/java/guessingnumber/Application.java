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
    private Random random=new Random();
    private int randomNumber;
    static final int minnumber=1;
    static final int maxnumber=100;
    private int chance=3; // 현재 기회
    Scanner sc= new Scanner(System.in);

    //random한 숫자를 정하는 메서드
    public ChooseNum(){
       randomNumber= random.nextInt(maxnumber)+1; //1~100 범위의 랜덤 숫자
       System.out.println("숫자 추리 게임을 시작합니다.");
   }

   //게임 진행 메서드
   public String playGame(){
       while(chance!=0) {
           System.out.println(minnumber+"부터"+maxnumber+ "사이 숫자 중 하나를 골라주세요.");
            int x= sc.nextInt();

            if (x > randomNumber) {
                System.out.println("더 낮습니다.");
            } else if (x < randomNumber) {
                System.out.println("더 높습니다");
            } else {
                System.out.println("정답입니다.");
                break; //정답을 맞추면 반복 종료
            }
            chance--;
        }

    String s;
    //예외처리
       while(true) {
           System.out.println("게임을 다시 시작하겠습니까? (예 :y, 아니오:n)");
           s = sc.next();
           if (s.equalsIgnoreCase("y")|| s.equalsIgnoreCase("n")) {
               break;
           }else{
               System.out.println("잘못된 입력입니다. y또는 n을 입력하세요");
           }
       }
       return s;
   }
}


