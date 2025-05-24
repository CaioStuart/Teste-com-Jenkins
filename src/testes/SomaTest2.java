package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SomaTest2 {

    @Test
    public void testeSoma() {
        Soma soma = new Soma();
        assertEquals(30, soma.soma(10, 20));
    }
}