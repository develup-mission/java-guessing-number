package guessingnumber;

public record Count(int count, int threshold) {
    private static final int DEFAULT_TRY_COUNT = 3;

    public Count() {
        this(0, DEFAULT_TRY_COUNT);
    }

    public Count increase() {
        if (this.count == threshold) {
            throw new IllegalStateException("시도 횟수를 초과 했습니다.");
        }
        return new Count(this.count + 1, threshold);
    }
}
