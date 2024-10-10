package guessingnumber;

public class GameBoard {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int DEFAULT_TRY_COUNT = 3;

    private Computer computer;
    private Count count;

    public static GameBoard create() {
        final var computer = createComputer();
        final var count = createCount();
        return new GameBoard(computer, count);
    }

    private static Computer createComputer() {
        return new Computer(new Number(RandomNumberGenerator.generate(MIN_NUMBER, MAX_NUMBER)));
    }

    private static Count createCount() {
        return new Count(DEFAULT_TRY_COUNT);
    }

    public GameBoard(final Computer computer, final Count count) {
        this.computer = computer;
        this.count = count;
    }

    public void start() {
        do {
            OutputView.printIntro();
            playGame();
        } while (reStart());
    }

    private void playGame() {
        while (count.isUnderThreshold() && computer.isNotFinished()) {
            final var number = Number.from(InputView.inputNumber());
            count.increase();
            final AnswerStatus status = computer.answer(number);
            OutputView.printAnswer(status);
        }
    }

    private boolean reStart() {
        final GameCommand gameCommand = GameCommand.from(InputView.inputGameCommand());
        if (gameCommand.isYes()) {
            this.computer = createComputer();
            this.count = createCount();
            return true;
        }
        return false;
    }
}
