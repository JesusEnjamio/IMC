package dev.jesus.indice_masa_corporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularIndiceMasaCorporalTest {

    @Test
    public void testCalcularIMC() {
        assertEquals(22.86, CalcularIndiceMasaCorporal.calcularIMC(70, 1.75), 0.01);
        assertEquals(24.69, CalcularIndiceMasaCorporal.calcularIMC(80, 1.80), 0.01);
    }

    @Test
    public void testClasificarIMC() {
        assertEquals("Delgadez severa", CalcularIndiceMasaCorporal.clasificarIMC(15.5));
        assertEquals("Delgadez moderada", CalcularIndiceMasaCorporal.clasificarIMC(16.5));
        assertEquals("Delgadez leve", CalcularIndiceMasaCorporal.clasificarIMC(17.8));
        assertEquals("Peso normal", CalcularIndiceMasaCorporal.clasificarIMC(22.0));
        assertEquals("Sobrepeso", CalcularIndiceMasaCorporal.clasificarIMC(27.0));
        assertEquals("Obesidad leve", CalcularIndiceMasaCorporal.clasificarIMC(32.0));
        assertEquals("Obesidad moderada", CalcularIndiceMasaCorporal.clasificarIMC(38.0));
        assertEquals("Obesidad mórbida", CalcularIndiceMasaCorporal.clasificarIMC(45.0));
    }


}


