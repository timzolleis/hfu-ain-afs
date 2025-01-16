package task08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    void multiply() {
        final int a = 5;
        final int b = 3;
        final int expected = 15;
        final int result = Multiply.multiply(a, b);
        assertEquals(expected, result);
    }

}