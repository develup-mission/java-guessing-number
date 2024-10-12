package guessingnumber;

import guessingnumber.io.ConsoleInputHandler;
import guessingnumber.io.ConsoleOutputHandler;

public class GuessingNumber {
    public static final int INITIAL_LIFE = 3;
    private final ConsoleInputHandler inputHandler;
    private final ConsoleOutputHandler outputHandler;
    private final AnswerGenerator answerGenerator;

    private int answer;
    private GameStatus gameStatus = GameStatus.IN_PROGRESS;

    public GuessingNumber(ConsoleInputHandler inputHandler, ConsoleOutputHandler outputHandler, AnswerGenerator answerGenerator) {
        this.inputHandler = inputHandler;
        this.outputHandler = outputHandler;
        this.answerGenerator = answerGenerator;
    }

    public void run(){
        while(isInProgress()){
            initialize();

            playGame();

            decideIfUserWantToFinish();
        }
    }

    private void playGame() {
        for(int i = INITIAL_LIFE; i > 0; i--){
            int userInput = getNumberInput();

            if(isAnswerSameWith(userInput)){
                outputHandler.showAnswerComment();
                break;
            }

            if(isAnswerSmallerThan(userInput)){
                outputHandler.showLargerInputComment();
                continue;
            }

            outputHandler.showLowerInputComment();
        }
    }

    private void decideIfUserWantToFinish() {
        while(true){
            outputHandler.showCommentForRestartingGame();
            String userInput = inputHandler.getSelectionIfUserRestart();

            if(doesUserWantToFinish(userInput)){
                outputHandler.showEndingComment();
                changeStatusToFinish();
                return;
            }

            if(doesUserWantToRestart(userInput)){
                outputHandler.showRestartComment();
                return;
            }

            outputHandler.showCommentForChoosingAgain();
        }
    }

    private void initialize() {
        answer = answerGenerator.getAnswer();
        outputHandler.showGameStartComment();
    }

    private boolean isAnswerSmallerThan(int userInput) {
        return userInput > answer;
    }

    private boolean isAnswerSameWith(int userInput) {
        return userInput == answer;
    }

    private int getNumberInput() {
        outputHandler.showCommentForChoosingNumber();
        return inputHandler.getUserNumberInput();
    }


    private boolean isInProgress() {
        return gameStatus == GameStatus.IN_PROGRESS;
    }

    private void changeStatusToFinish() {
        gameStatus = GameStatus.FINISH;
    }

    private static boolean doesUserWantToRestart(String userInput) {
        return "y".equals(userInput);
    }

    private static boolean doesUserWantToFinish(String userInput) {
        return "n".equals(userInput);
    }
}
