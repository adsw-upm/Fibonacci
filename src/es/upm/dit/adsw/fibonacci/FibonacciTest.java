package es.upm.dit.adsw.fibonacci;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias de la sucesión de Fibonacci
 * Created by jpuente on 19/12/16.
 */
public class FibonacciTest {

    private Fibonacci F;

    @Before
    public void setUp() throws Exception {
//        F = new FibonacciRecursivo();
//        F = new FibonacciRecursivoConMemoria();
        F = new FibonacciRecursivoConMemoriaLimitada();
//        F = new FibonacciIterativo();
//        F = new FibonacciBinet();
    }

    /**
     * Caso límite
     */
    @Test
    public void test00() {
        assertEquals(0, F.fibonacci(0));
    }

    /**
     * Caso inicial
     */
    @Test
    public void test01() {
        assertEquals(1, F.fibonacci(1));
    }

    /**
     * Caso inicial
     */
    @Test
    public void test02() {
        assertEquals(1, F.fibonacci(2));
    }

    /**
     * Caso normal
     */
    @Test
    public void test05() {
        assertEquals(5, F.fibonacci(5));
    }

    /**
     * Caso normal
     */
    @Test
    public void test10() {
        assertEquals(55, F.fibonacci(10));
    }

    /**
     * Caso grande
     */
    @Test
    public void test25() {
        assertEquals(75025, F.fibonacci(25));
    }

    /**
     * Argumento incorrecto
     */
    @Test(expected = IllegalArgumentException.class)
    public void test11() {
        F.fibonacci(-1);
        fail("Debería haber saltado una excepción - no se puede calcular el factorial de un número negativo");
    }

}