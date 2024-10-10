package guessingnumber;

public class Computer {
    private final Number number;

    public Computer(final Number number) {
        this.number = number;
    }

    public AnswerStatus answer(final Number questionNumber) {
        if (this.number.isEqual(questionNumber)) {
            return AnswerStatus.EQUAL;
        }
        return this.number.isGreaterThan(questionNumber) ? AnswerStatus.HIGH : AnswerStatus.LOW;
    }
}
