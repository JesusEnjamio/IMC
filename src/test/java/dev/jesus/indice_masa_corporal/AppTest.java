package dev.jesus.indice_masa_corporal;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {

    @Test
    public void testMainEjecutaSinErrores() {
        String input = "70\n1.75\n";  
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}