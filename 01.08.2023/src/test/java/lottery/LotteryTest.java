package lottery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LotteryTest {
    @Test
    void testRandom(){
        Lottery lottery = new Lottery();

        lottery.initializeWinningNumbers();

        int[] random = lottery.getWinningNumbers();
        assertNotNull(random, "Массив winningNumbers не должен быть null");
        assertEquals(5, random.length, "Массив winningNumbers должен иметь длину 6");
    }
}
