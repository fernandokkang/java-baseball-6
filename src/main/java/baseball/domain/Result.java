package baseball.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    private Map<BallCount, Integer> result = new HashMap<>();

    public void initializeResult() {

        for(BallCount ballCount : BallCount.values()) {
            result.put(ballCount, 0);
        }
    }

    public void makeResult(List<Integer> computerNumbers, String userNumbers) {

        for(int i=0; i<computerNumbers.size(); i++) {
            int userNumber = userNumbers.charAt(i) - '0';
            for(BallCount ballCount : BallCount.values()) {
                if(ballCount.isMatch(computerNumbers, userNumber, i)) {

                    saveResult(ballCount);
                    break;
                }
            }
        }
    }
    private void saveResult(BallCount ballCount) {
        result.put(ballCount, result.get(ballCount) + 1);
    }

    public String resultInfo() {

        StringBuilder builder = new StringBuilder();

        int ball = getBallCount(BallCount.BALL);
        int strike = getBallCount(BallCount.STRIKE);

        if(ball == 0 && strike == 0) {
            builder.append("낫싱");
            return builder.toString();
        }

        if(ball == 0) {

            builder.append(strike).append("스트라이크");
            return builder.toString();
        }

        if(strike == 0) {
            builder.append(ball).append("볼");
            return builder.toString();
        }

        builder.append(ball).append("볼").append(" ")
                .append(strike).append("스트라이크");

        return builder.toString();
    }

    private int getBallCount(BallCount ballCount) {
        return result.get(ballCount);
    }

    public boolean isAnswer() {

        if(getBallCount(BallCount.STRIKE) == 3){
            return true;
        }
        return false;
    }
}
