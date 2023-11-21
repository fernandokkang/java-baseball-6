package baseball.constant;

public enum ErrorMessage {

    NUMBER_SIZE_ERROR("[ERROR] 잘못된 입력입니다."),
    NO_NUMBER_ERROR("[ERROR] 잘못된 입력입니다.");

    private String message;

    private ErrorMessage(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
