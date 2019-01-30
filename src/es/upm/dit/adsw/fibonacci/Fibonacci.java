package es.upm.dit.adsw.fibonacci;

/**
 * Interfaz genérica para calcular el n-ésimo término de la sucesión de es.upm.dit.adsw.fibonacci.Fibonacci

 * Created by jpuente on 19/12/16.
 */
public interface Fibonacci {

    /**
     * Calcular un término de la sucesión de Fibonacci
     *
     * @param n entero positivo
     * @return término n-ésimo de la sucesión
     * @throws IllegalArgumentException si n es negativo
     */
    public int fibonacci(int n);

}
