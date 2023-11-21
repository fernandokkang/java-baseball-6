package baseball.domain;

import java.util.List;

public enum BallCount {

    STRIKE("스트라이크") {
        @Override
        public boolean isMatch(List<Integer> computerNumbers, int userNumber, int index) {
            return computerNumbers.get(index) == userNumber;
        }
    },
    BALL("볼") {
        @Override
        public boolean isMatch(List<Integer> computerNumbers,int userNumber, int index) {
            return computerNumbers.contains(userNumber);
        }
    },
    NOTHING("낫싱") {
        @Override
        public boolean isMatch(List<Integer> computerNumbers,int userNumber, int index) {
            return false;
        }
    };

    private String ballCountName;
    BallCount(String ballCountName) {

        this.ballCountName = ballCountName;
    }

    public abstract boolean isMatch(List<Integer> computerNumbers, int userNumber, int index);
}
