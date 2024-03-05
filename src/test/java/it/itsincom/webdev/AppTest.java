package it.itsincom.webdev;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */

class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void parseDoubleShouldNotWorkOnWordAfterDot() {
        try {
            Double value = App.parseDouble("123.a");
            Assertions.fail(
                    "Parsedouble non può tornare un valore in caso di stringa con caratteri non numerici dopo il punto");
        } catch (IllegalArgumentException e) {

        }
    }

    public void parseDoubleShouldNotWorkOnWordBeforeDot() {
        try {
            Double value = App.parseDouble("a.123");
            Assertions.fail(
                    "Parsedouble non può tornare un valore in caso di stringa con caratteri non numerici prima il punto");
        } catch (IllegalArgumentException e) {

        }
    }

    public void parsedoubleShouldNotWorkIfThereIsNothingAfterDot() {
        try {
            Double value = App.parseDouble("123.");
            Assertions.fail("Parsedouble non può tornare un valore in caso di stringa senza caratteri dopo il punto");
        } catch (IllegalArgumentException e) {

        }
    }

    public void parsedoubleShouldNotWorkIfThereIsNothingBeforDot() {
        try {
            Double value = App.parseDouble(".123");
            Assertions.fail("Parsedouble non può tornare un valore in caso di stringa senza caratteri prima il punto");
        } catch (IllegalArgumentException e) {

        }
    }

    public void parseDoubleShouldNotWorkOnEmptyString() {
        try {
            double value = App.parseDouble("");
            Assertions.fail("La stringa inserita è vuota");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldNotWorkWithNull() {
        try {
            double value = App.parseDouble(null);
            Assertions.assertNotNull("Impossibile parsare una stringa di valore null");
        } catch (NullPointerException e) {

        }
    }

    @Test
    public void parseDoubleShouldNotWorkWithoutDot() {
        try {
            double value = App.parseDouble("123");
            Assertions.fail("La stringa inserita è un numero intero");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseIntShouldWorkWithNegativeNumbers() {
        try {
            Double value = App.parseDouble("-42.687");
            Assertions.assertEquals(-42.687, value);
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldNotWorkWithoutNumbers() {
        try {
            double value = App.parseDouble("ciao");
            Assertions.fail("La stringa inserita non contiene numeri");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void parseDoubleShouldWorkWithDecimalNumber() {
        try {
            double value = App.parseDouble("12.56");
            Assertions.assertEquals(12.56, value);
        } catch (IllegalArgumentException e) {

        }
    }
}
