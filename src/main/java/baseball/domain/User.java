package baseball.domain;

public class User {

    private String userNumbers;

    public void saveUserNumbers(String userNumbers) {

        this.userNumbers = userNumbers;
        validate(userNumbers);
    }

    private void validate(String userNumbers) {

        String regex = "[1-9]+";

        if(!userNumbers.matches(regex)) {
            throw new IllegalArgumentException("입력에 숫자가 아닌 값이 포함되어 있습니다.");
        }

        if(userNumbers.length() != 3) {
            throw new IllegalArgumentException("입력한 숫자의 길이가 3이 아닙니다.");
        }
    }

    public String getUserNumbers() {
        return userNumbers;
    }
}
