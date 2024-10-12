package guessingnumber.io;

public class ConsoleOutputHandler {
    public void showGameStartComment(){
        System.out.println("숫자 추리 게임을 시작합니다");
        System.out.println();
    }
    public void showCommentForChoosingNumber(){
        System.out.println("1부터 100 사이 숫자 중 하나를 골라주세요.");
    }
    public void showAnswerComment(){
        System.out.println("정답입니다!");
    }
    public void showLowerInputComment(){
        System.out.println("더 낮습니다.");
    }
    public void showLargerInputComment(){
        System.out.println("더 높습니다.");
    }
    public void showCommentForRestartingGame(){
        System.out.println("게임을 다시 시작하겠습니까? (예: y, 아니오: n)");
    }
    public void showEndingComment(){
        System.out.println("게임 종료");
    }
    public void showRestartComment(){
        System.out.println("게임을 다시 시작합니다.");
    }
    public void showCommentForChoosingAgain(){
        System.out.println("잘못된 입력입니다. y, n 중 하나를 선택해야 합니다.");
    }
}
