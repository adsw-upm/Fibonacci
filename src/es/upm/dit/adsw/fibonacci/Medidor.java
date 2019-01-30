package es.upm.dit.adsw.fibonacci;

/**
 * Medidor de tiempos de ejecución para el cálculo de los números de Fibonacci
 * <p>
 * Created by jpuente on 21/12/16.
 */
public class Medidor {

    public static void main(String[] args) {

        /*
         * Valores de prueba para el cálculo
         */
        int[] N = {1000,                //precalentamiento
                10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        /*
         * Número de veces que se ejecuta el método de cálculo
         */
        int max = 1000000;

        /*
         * Cambiar según la versión que se quiera medir.
         */
//        Fibonacci F = new FibonacciRecursivo();
//       Fibonacci F = new FibonacciIterativo();
        Fibonacci F = new FibonacciRecursivoConMemoria();
//        Fibonacci F = new FibonacciRecursivoConMemoriaLimitada();
//        Fibonacci F = new FibonacciBinet();

        for (int n : N) {
            long t0 = System.nanoTime();
            for (int i = 0; i < max; i++) {
                F.fibonacci(n);
            }
            long t1 = System.nanoTime();
            System.out.printf("%s %d%n", n, t1 - t0);
        }
    }

}
