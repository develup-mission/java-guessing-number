package guessingnumber;

public enum GameStatus {
    IN_PROGRESS("진행중"),
    FINISH("종료");
    private final String description;

    GameStatus(String description) {
        this.description = description;
    }
}
