package org.example;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryCalculatorTest {

    @Test
    public void testSumaBinariaCorrecta() {
        // Prueba de suma de dos números binarios válidos
        String binario1 = "1010"; // 10 en decimal
        String binario2 = "110";  // 6 en decimal
        String resultadoEsperado = "10000"; // 16 en binario

        String resultado = BinaryCalculator.sumarBinarios(binario1, binario2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumaConCeros() {
        // Prueba de suma con ceros
        String binario1 = "0";
        String binario2 = "0";
        String resultadoEsperado = "0";

        String resultado = BinaryCalculator.sumarBinarios(binario1, binario2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumaConUnSoloCero() {
        // Prueba de suma donde uno de los números es cero
        String binario1 = "0";
        String binario2 = "101"; // 5 en decimal
        String resultadoEsperado = "101"; // 5 en binario

        String resultado = BinaryCalculator.sumarBinarios(binario1, binario2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test()
    public void testEntradaInvalida() {
        // Prueba de entrada no válida (número que no es binario)
        String binario1 = "102"; // No es binario
        String binario2 = "110";

        // Debería lanzar una excepción
        BinaryCalculator.sumarBinarios(binario1, binario2);
    }
}
