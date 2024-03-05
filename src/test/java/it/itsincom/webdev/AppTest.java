package it.itsincom.webdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
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
}
