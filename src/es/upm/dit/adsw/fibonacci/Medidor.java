package es.upm.dit.adsw.fibonacci;

/**
 * Medidor de tiempos de ejecución para el cálculo de los números de Fibonacci
 *
 * Created by jpuente on 21/12/16.
 */
public class Medidor {

    public static void main(String[] args) {

        /*
         * Valores de prueba para el cálcuo
         */
        int[] N = {50,                //precalentamiento
                10, 20, 30, 40, 50};

        /*
         * Número de veces que se ejecuta el método de cálculo
         */
        int max = 1000;

        /*
         * Cambiar según la versión que se quiera medir.
         */
        Fibonacci F = new FibonacciIterativo();

        for (int n : N) {
            long t0 = System.nanoTime();
            for (int i =0; i < max; i++) {
                F.fibonacci(n);
            }
            long t1 = System.nanoTime();
            System.out.printf("%s %d%n", n, t1-t0);
        }
    }

}
