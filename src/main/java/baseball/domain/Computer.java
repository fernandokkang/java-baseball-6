package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> computerNumbers;

    public void createNumbers() {

        computerNumbers = new ArrayList<>();

        while (computerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
    }

    public void compareUserNumbers(String numbers) {

        validate(numbers);
    }

    private void validate(String numbers) {

        if(numbers.length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getComputerNumbers() {

        return computerNumbers;
    }
}
