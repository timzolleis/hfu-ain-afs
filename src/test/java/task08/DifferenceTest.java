package task08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceTest {

    @Test
    void difference() {
        final int a = 5;
        final int b = 3;
        final int expected = 2;
        final int result = Difference.diff(a, b);
        assertEquals(expected, result);
    }

    @Test
    void differenceToZero() {
        final int a = 5;
        final int b = 6;
        final int expected = 0;
        final int result = Difference.diff(a, b);
        assertEquals(expected, result);
    }

    @Test
    void absoluteDifferenceWithSmallerA() {
        final int a = 3;
        final int b = 5;
        final int expected = 2;
        final int result = Difference.absoluteDifference(a, b);
        assertEquals(expected, result);
    }

    @Test
    void absoluteDifferenceWithSmallerB() {
        final int a = 5;
        final int b = 3;
        final int expected = 2;
        final int result = Difference.absoluteDifference(a, b);
        assertEquals(expected, result);
    }
}