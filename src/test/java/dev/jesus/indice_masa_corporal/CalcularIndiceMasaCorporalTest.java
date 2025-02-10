package dev.jesus.indice_masa_corporal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularIndiceMasaCorporalTest {

    @Test
    public void testCalcularIMC() {
        assertEquals(22.86, CalcularIndiceMasaCorporal.calcularIMC(70, 1.75), 0.01);
        assertEquals(24.69, CalcularIndiceMasaCorporal.calcularIMC(80, 1.80), 0.01);
    }

}
