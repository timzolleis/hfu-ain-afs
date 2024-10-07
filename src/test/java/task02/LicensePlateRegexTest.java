package task02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LicensePlateRegexTest {

    @Test
    void matchesValidLicensePlate() {
        assertTrue(new LicensePlateRegex().matches("ABC DE 1234"));
    }

    @Test
    void matchesValidLicensePlateWithOptionalH() {
        assertTrue(new LicensePlateRegex().matches("ABC DE 1234H"));
    }

    @Test
    void matchesValidLicensePlateWithOptionalE() {
        assertTrue(new LicensePlateRegex().matches("ABC DE 1234E"));
    }

    @Test
    void doesNotMatchInvalidLicensePlateWithNumbersInFirstPart() {
        assertFalse(new LicensePlateRegex().matches("A1C DE 1234"));
    }

    @Test
    void doesNotMatchInvalidLicensePlateWithTooManyLetters() {
        assertFalse(new LicensePlateRegex().matches("ABCD DE 1234"));
    }

    @Test
    void doesNotMatchInvalidLicensePlateWithTooManyNumbers() {
        assertFalse(new LicensePlateRegex().matches("ABC DE 12345"));
    }

    @Test
    void doesNotMatchInvalidLicensePlateWithSpecialCharacters() {
        assertFalse(new LicensePlateRegex().matches("ABC DE 1234!"));
    }
}