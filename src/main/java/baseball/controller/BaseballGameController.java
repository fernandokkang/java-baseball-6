package baseball.controller;

import baseball.service.BaseballGameService;
import baseball.service.BaseballGameServiceImpl;

public class BaseballGameController {

    private final BaseballGameService baseballService = new BaseballGameServiceImpl();

    public void createRandomNumbers() {
        baseballService.createRandomNumbers();
    }

    public void readNumbers(String numbers) {
        baseballService.readNumbers(numbers);
    }

    public void generateResult() {
        baseballService.generateResult();
    }

    public void printResult() {
        baseballService.printResult();
    }

    public boolean isMatch() {
        return baseballService.getMatchResult();
    }
}
