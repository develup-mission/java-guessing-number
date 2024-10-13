package guessingnumber;

import guessingnumber.controller.MainController;
import guessingnumber.util.NumberGenerator;
import guessingnumber.view.InputView;
import guessingnumber.view.OutputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class ApplicationTest {
    private static final String YES_OPTION = "y";
    private static final String NO_OPTION = "n";

    @DisplayName("3번 내에 정답 후 종료")
    @Test
    void startGame() {
        try (MockedStatic<NumberGenerator> mockNumberGenerator = Mockito.mockStatic(NumberGenerator.class);
             MockedStatic<InputView> mockInputView = Mockito.mockStatic(InputView.class);
             MockedStatic<OutputView> mockOutputView = Mockito.mockStatic(OutputView.class)) {

            mockNumberGenerator.when(NumberGenerator::generateByRandom).thenReturn(42);

            mockInputView.when(InputView::inputNumber).thenReturn(50, 40, 42);
            mockInputView.when(InputView::inputGameLoop).thenReturn(NO_OPTION);

            MainController controller = new MainController();
            controller.run();

            mockOutputView.verify(OutputView::printStartMessage);
            mockOutputView.verify(OutputView::printLowMessage);
            mockOutputView.verify(OutputView::printHighMessage);
            mockOutputView.verify(OutputView::printCorrectMessage);
        }
    }

    @DisplayName("게임시작 후 재시작")
    @Test
    void restartGame() {
        try (MockedStatic<NumberGenerator> mockNumberGenerator = Mockito.mockStatic(NumberGenerator.class);
             MockedStatic<InputView> mockInputView = Mockito.mockStatic(InputView.class);
             MockedStatic<OutputView> mockOutputView = Mockito.mockStatic(OutputView.class)) {

            mockNumberGenerator.when(NumberGenerator::generateByRandom).thenReturn(42, 55);

            mockInputView.when(InputView::inputNumber).thenReturn(42, 55);
            mockInputView.when(InputView::inputGameLoop).thenReturn(YES_OPTION, NO_OPTION);

            MainController controller = new MainController();
            controller.run();

            mockOutputView.verify(OutputView::printStartMessage, times(2));
            mockOutputView.verify(OutputView::printCorrectMessage, times(2));
        }
    }
}
