package es.upm.dit.adsw.fibonacci;

import java.util.IllegalFormatCodePointException;

/**
 * Cálculo recursivo de la sucesión de Fibonacci
 * <p>
 * Created by jpuente on 19/12/16.
 */
public class FibonacciRecursivo  implements Fibonacci {

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
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
