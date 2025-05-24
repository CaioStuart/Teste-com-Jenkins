package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaTest1 {

    @Test
    public void testeSoma() {
        Soma soma = new Soma();
        assertEquals(5, soma.soma(2, 3));
    }
}

