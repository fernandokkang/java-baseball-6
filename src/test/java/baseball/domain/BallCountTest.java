package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallCountTest {

    @Test
    void makeResultTest() {

        List<Integer> computerNumbers = List.of(1,2,4);
        String userNumbers = "241";

        for(int i=0; i<3; i++) {
            int userNumber = userNumbers.charAt(i) - '0';
            for (BallCount result : BallCount.values()) {
                if (result.isMatch(computerNumbers, userNumber, i)) {
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}
