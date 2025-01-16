package task02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberRegexTest {

    @Test
    void matches() {
        NumberRegex numberRegex = new NumberRegex();
        assertTrue(numberRegex.matches("0011"));
        assertTrue(numberRegex.matches("0101"));
        assertTrue(numberRegex.matches("1010"));
        assertTrue(numberRegex.matches("110011001100"));
        assertTrue(numberRegex.matches("01010101"));
        assertTrue(numberRegex.matches("111111000000"));
        assertTrue(numberRegex.matches("011111100000"));
        assertTrue(numberRegex.matches("00"));
        assertTrue(numberRegex.matches("1111"));


        assertFalse(numberRegex.matches("1011"));
        assertFalse(numberRegex.matches("1010101010"));
        assertFalse(numberRegex.matches("010101"));
        assertFalse(numberRegex.matches("111110"));
        assertFalse(numberRegex.matches("1111100"));
        assertFalse(numberRegex.matches("01"));
        assertFalse(numberRegex.matches("011"));
        assertFalse(numberRegex.matches("01110000"));
        assertFalse(numberRegex.matches("0111"));
        assertFalse(numberRegex.matches("100011"));
        assertFalse(numberRegex.matches("000"));














    }
}