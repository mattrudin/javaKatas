package OddCountKata;

import OddCountKata.Odd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddTest {

    @Test
    void countShouldReturn3() {
        int result = 3;
        assertEquals(result, Odd.count(7));
    }

    @Test
    void countShouldReturn15() {
        int result = 7;
        assertEquals(result, Odd.count(15));
    }

    @Test
    void countShouldReturn7511() {
        int result = 7511;
        assertEquals(result, Odd.count(15023));
    }
}