package baseball.view;

import baseball.constant.OutputMessage;
import baseball.controller.BaseballGameController;

public class OutputView {

    private final BaseballGameController baseballController;

    public OutputView(BaseballGameController baseballController) {

        this.baseballController = baseballController;
    }

    public void generateResult() {
        baseballController.generateResult();
    }

    public boolean printResult() {
        baseballController.printResult();
        return baseballController.isMatch();
    }

    public void printGameEndMessage() {
        System.out.println(OutputMessage.GAME_END_MESSAGE);
    }
}
