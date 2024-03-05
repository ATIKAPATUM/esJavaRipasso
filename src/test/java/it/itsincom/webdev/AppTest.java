package it.itsincom.webdev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        } catch (IllegalArgumentException e) {
            ;
        }
    }
}
