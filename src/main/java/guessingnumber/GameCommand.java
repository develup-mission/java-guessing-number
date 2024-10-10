package guessingnumber;

import java.util.Arrays;

public enum GameCommand {
    YES("y"),
    NO("n");
    private final String command;

    GameCommand(final String command) {
        this.command = command;
    }

    public static GameCommand from(final String command) {
        return Arrays.stream(values())
                .filter(gameCommand -> gameCommand.command.equals(command))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s 에 해당하는 명령어가 없습니다.", command)));
    }

    public boolean isYes(){
        return this == YES;
    }
}
