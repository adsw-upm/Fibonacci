package es.upm.dit.adsw.fibonacci;

/**
 * Cálculo recursivo de la sucesión de Fibonacci con memoria
 * <p>
 * Created by jpuente on 19/12/16.
 */
public class FibonacciRecursivoConMemoria implements Fibonacci {

    private int[] tabla = new int[20];

    /**
     * Calcular un término de la sucesión de Fibonacci
     *
     * @param n entero positivo
     * @return término n-ésimo de la sucesión
     * @throws IllegalArgumentException si n es negativo
     */
    @Override
    public int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        if (n < 1)
            return 0;
        if (n == 1)
            return 1;
        assert n > 1;
        if (n < tabla.length) {
            int resultado = tabla[n];
            if (resultado > 0)
                return resultado;
            resultado = fibonacci(n - 1) + fibonacci(n - 2);
            tabla[n] = resultado;
            return resultado;
        }
        assert n >= tabla.length;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
