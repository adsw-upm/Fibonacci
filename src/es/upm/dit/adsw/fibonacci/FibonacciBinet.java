package es.upm.dit.adsw.fibonacci;

/**
 * Cálculo directo de la sucesión de Fibonacci con la fórmula de Binet
 * <p>
 * Created by jpuente on 19/12/16.
 */
public class FibonacciBinet implements Fibonacci {

    private static final double SQRT_5 = Math.sqrt(5);

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
        if (n == 0)
            return 0;
        assert n > 0;
        if (n <= 2)
            return 1;
        assert n > 1;
        double t1 = Math.pow((1 + SQRT_5)/2, n)- Math.pow((1 - SQRT_5)/2, n);
        return (int) Math.round(t1 / SQRT_5);
    }

}
