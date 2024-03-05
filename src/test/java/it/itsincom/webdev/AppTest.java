package it.itsincom.webdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void parsedoubleShouldNotWorkOnWordAfterDot() {
        try {
            Double value = App.parseDouble("123.a");
            Assertions.fail(
                    "Parsedouble non può tornare un valore in caso di stringa con caratteri non numerici dopo il punto");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception

        }

    }

    public void parsedoubleShouldNotWorkOnWordBeforDot() {
        try {
            Double value = App.parseDouble("a.123");
            Assertions.fail(
                    "Parsedouble non può tornare un valore in caso di stringa con caratteri non numerici prima il punto");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception

        }

    }

    public void parsedoubleShouldNotWorkIfThereIsNothingAfterDot() {
        try {
            Double value = App.parseDouble("123.");
            Assertions.fail("Parsedouble non può tornare un valore in caso di stringa senza caratteri dopo il punto");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception

        }

    }

    public void parsedoubleShouldNotWorkIfThereIsNothingBeforDot() {
        try {
            Double value = App.parseDouble("123.");
            Assertions.fail("Parsedouble non può tornare un valore in caso di stringa senza caratteri prima il punto");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception

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
    public void parseIntShouldWorkWithNegativeIntegers() {
        try {
            Double value = App.parseDouble("-42.687");
            Assertions.assertEquals(-42.687, value);
        } catch (IllegalArgumentException e) {

        }
    }

}
