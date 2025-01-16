package task08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTest {
    @Test
    void testGetMinimum() {
        assertEquals(3, Minimum.getMinimum(3, 5));
        assertEquals(3, Minimum.getMinimum(5, 3));
    }

    @Test
    void sign() {
        assertEquals(0, Minimum.sign(0));
        assertEquals(1, Minimum.sign(5));
        assertEquals(1, Minimum.sign(4));
    }
}

//M is smaller than n

