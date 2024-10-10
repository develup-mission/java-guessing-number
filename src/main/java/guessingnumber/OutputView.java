package guessingnumber;

public class OutputView {
    public static void printIntro() {
        System.out.println("숫자 추리 게임을 시작합니다.");
    }

    public static void printAnswer(final AnswerStatus status) {
        switch (status) {
            case HIGH -> System.out.println("더 높습니다.");
            case LOW -> System.out.println("더 낮습니다.");
            case EQUAL -> System.out.println("정답입니다!");
        }
    }

    private OutputView() {}
}
