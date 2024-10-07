package task02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeRegexTest {
    @Test
    void matchesDate() {
        assertFalse(new DateTimeRegex().matches("2023-10-05"));
    }

    @Test
    void matchesDateTime() {
        assertFalse(new DateTimeRegex().matches("2023-10-05T14:48:00"));
    }

    @Test
    void matchesTime() {
        assertFalse(new DateTimeRegex().matches("14:48:00"));
    }

    @Test
    void doesNotMatchInvalidDate() {
        assertFalse(new DateTimeRegex().matches("2023-13-05"));
    }

    @Test
    void doesNotMatchInvalidDateTime() {
        assertFalse(new DateTimeRegex().matches("2023-10-05T25:48:00"));
    }

    @Test
    void doesNotMatchInvalidTime() {
        assertFalse(new DateTimeRegex().matches("14:60:00"));
    }
}