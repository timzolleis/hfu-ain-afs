package task02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloatRegexTest {

    @Test
    void matchesInteger() {
        assertEquals(true, new FloatRegex().matches("1"));
    }

    @Test
    void matchesDecimal() {
        assertEquals(true, new FloatRegex().matches("1.0"));
    }

    @Test
    void matchesScientificNotationNegativeExponent() {
        assertEquals(true, new FloatRegex().matches("1.0e-1"));
    }

    @Test
    void matchesScientificNotationPositiveExponentWithPlus() {
        assertEquals(true, new FloatRegex().matches("1.0e+1"));
    }

    @Test
    void matchesScientificNotationPositiveExponentWithoutPlus() {
        assertEquals(true, new FloatRegex().matches("1.0e1"));
    }

    @Test
    void matchesScientificNotationWithoutDecimal() {
        assertEquals(true, new FloatRegex().matches("1e1"));
    }

    @Test
    void doesNotMatchIncompleteScientificNotation() {
        assertEquals(false, new FloatRegex().matches("1.0e"));
    }

    @Test
    void doesNotMatchNonNumeric() {
        assertEquals(false, new FloatRegex().matches("a"));
    }
}