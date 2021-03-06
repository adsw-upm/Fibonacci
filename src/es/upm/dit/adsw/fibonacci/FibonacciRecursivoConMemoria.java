package es.upm.dit.adsw.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Cálculo recursivo de la sucesión de Fibonacci con memoria
 * <p>
 * Created by jpuente on 19/12/16.
 */
public class FibonacciRecursivoConMemoria implements Fibonacci {

    private Map<Integer, Integer> memoria = new HashMap<>();

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
        Integer resultado = memoria.get(n);
        if (resultado != null)
            return resultado;
        resultado = fibonacci(n - 1) + fibonacci(n - 2);
        memoria.put(n, resultado);
        return resultado;
    }
}
