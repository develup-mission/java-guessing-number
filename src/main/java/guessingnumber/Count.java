package guessingnumber;

import java.util.Objects;

public class Count {
    private int value;
    private final int threshold;


    public Count(final int threshold) {
        this(0, threshold);
    }

    public Count(final int value, final int threshold) {
        this.value = value;
        this.threshold = threshold;
    }

    public void increase() {
        if (this.value == threshold) {
            throw new IllegalStateException("시도 횟수를 초과 했습니다.");
        }
        this.value += 1;
    }

    public boolean isUnderThreshold() {
        return this.value < threshold;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Count count1)) return false;
        return value == count1.value && threshold == count1.threshold;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, threshold);
    }
}
