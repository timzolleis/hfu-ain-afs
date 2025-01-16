package task08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddTest {

    @Test
    void isOdd() {
        assertEquals(0, Odd.isOdd(0));
        assertEquals(1, Odd.isOdd(1));
        assertEquals(0, Odd.isOdd(2));
        assertEquals(1, Odd.isOdd(3));
        assertEquals(0, Odd.isOdd(4));
    }
}