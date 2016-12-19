package es.upm.dit.adsw.fibonacci;

/**
 * Cálculo iterativo de la sucesión de Fibonacci
 * <p>
 * Created by jpuente on 19/12/16.
 */
public class FibonacciIterativo implements Fibonacci {

    /**
     * Calcular un término de la sucesión de Fibonacci
     *
     * @param n entero positivo
     * @return término n-ésimo de la sucesión
     * @throws IllegalArgumentException si n es negativo
     */
    public int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        if (n == 0)
            return 0;
        assert n > 0;
        int f0 = 0;
        int f1 = 1;
        for (int i = 2; i <= n; i++) {
            int fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return f1;
    }
}
