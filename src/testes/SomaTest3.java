package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaTest3 {

    @Test
    public void testeSoma() {
        Soma soma = new Soma();
        assertEquals(0, soma.soma(-5, 5));
    }
}
