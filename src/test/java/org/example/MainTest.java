package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void validarPalidromo1() {
        Main main = new Main();
        boolean valor = main.validarPalindromo("somos o no s omos");
        Assertions.assertTrue(valor);
    }

    @Test
    public void validarPalidromo2() {
        Main main = new Main();
        boolean valor = main.validarPalindromo("A luna ese anula");
        Assertions.assertTrue(valor);
    }

    @Test
    public void validarPalidromo3() {
        Main main = new Main();
        boolean valor = main.validarPalindromo("oyee te quiero");
        Assertions.assertFalse(valor);
    }

}
