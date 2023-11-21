package baseball;

import baseball.constant.InputMessage;
import baseball.controller.BaseballGameController;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {

        final BaseballGameController baseballController = new BaseballGameController();
        final InputView inputView = new InputView(baseballController);
        final OutputView outputView = new OutputView(baseballController);

        inputView.printGameStartMessage();

        while (true) {
            inputView.readNumbers();
            outputView.generateResult();

            if (outputView.printResult()) {
                if (inputView.readGameRestartCommand().equals(InputMessage.EXIT)) {
                    outputView.printGameEndMessage();
                    break;
                }
                baseballController.createRandomNumbers();
            }
        }
    }
}
