package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //validarPalindromo("te amoo rebecca");
    }

    public boolean validarPalindromo(String palabra) {
        List<Character> letras = new ArrayList<>();
        String palabraInversa = "";
        palabra = palabra.trim().replaceAll("\\s+", "").toLowerCase();

        for (int i = palabra.length(); i > 0; i--) {
            palabraInversa = palabraInversa.concat(String.valueOf(palabra.charAt(i-1)));
            letras.add(palabra.charAt(i-1));
        }

        return palabra.equals(palabraInversa);
    }
}