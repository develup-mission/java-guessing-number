package guessingnumber;

public class Computer {
    private final Number number;
    private boolean isFinished;

    public Computer(final Number number) {
        this.number = number;
        this.isFinished = false;
    }

    public AnswerStatus answer(final Number questionNumber) {
        if (this.number.isEqual(questionNumber)) {
            this.isFinished = true;
            return AnswerStatus.EQUAL;
        }
        return this.number.isGreaterThan(questionNumber) ? AnswerStatus.HIGH : AnswerStatus.LOW;
    }

    public boolean isNotFinished() {
        return !this.isFinished;
    }
}
