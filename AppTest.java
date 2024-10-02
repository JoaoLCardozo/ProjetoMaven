package com.exemplo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testSomar() {
        App app = new App();
        int resultado = app.somar(2, 3);
        assertEquals(5, resultado);
    }
}
