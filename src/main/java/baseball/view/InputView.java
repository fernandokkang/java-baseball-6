package baseball.view;

import baseball.constant.InputMessage;
import baseball.controller.BaseballGameController;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final BaseballGameController baseballController;

    public InputView(BaseballGameController baseballController) {

        this.baseballController = baseballController;
    }

    public void printGameStartMessage() {

        System.out.println(InputMessage.BASEBALL_GAME_START_MESSAGE);
        baseballController.createRandomNumbers();
    }

    public void readNumbers() {

        System.out.print(InputMessage.ENTER_NUMBERS);
        String numbers = Console.readLine();
        baseballController.readNumbers(numbers);
    }

    public String readGameRestartCommand() {

        System.out.println(InputMessage.BASEBALL_GAME_RE_START_MESSAGE);
        String command = Console.readLine();

        if(!command.equals(InputMessage.RESTART)
                && !command.equals(InputMessage.EXIT)) {
            throw new IllegalArgumentException("유효한 명령어 입력이 아닙니다.");
        }

        return command;
    }
}
