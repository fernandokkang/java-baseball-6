package baseball.service;

import baseball.domain.Computer;
import baseball.domain.Result;
import baseball.domain.User;

public class BaseballGameServiceImpl implements BaseballGameService {

    private Computer computer = new Computer();
    private User user = new User();
    private Result result = new Result();

    @Override
    public void createRandomNumbers() {

        computer.createNumbers();
    }

    @Override
    public void readNumbers(String numbers) {

        user.saveUserNumbers(numbers);
        result.initializeResult();
    }

    @Override
    public void generateResult() {

        result.makeResult(computer.getComputerNumbers(), user.getUserNumbers());
    }

    @Override
    public void printResult() {

        System.out.println(result.resultInfo());
    }

    @Override
    public boolean getMatchResult() {

        return result.isAnswer();
    }
}