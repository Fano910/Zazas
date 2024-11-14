package tst.random;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author leona
 */
public class RandomDistributionTest {

    private static final Random r = new Random();
    private static final ThreadLocalRandom tlr = ThreadLocalRandom.current();
    private static final SecureRandom sr = new SecureRandom();

    // Generar números aleatorios y contar su frecuencia en el rango de 1 a 100
    private static Map<Integer, Integer> generateRandomNumbers(int n, char generatorType) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 1; i <= 100; i++) {
            frequencyMap.put(i, 0);
        }

        for (int i = 0; i < n; i++) {
            int randomNumber = switch (generatorType) {
                case 'R' -> r.nextInt(100) + 1;
                case 'T' -> tlr.nextInt(1, 101);
                case 'S' -> sr.nextInt(100) + 1;
                default -> 0;
            };
            frequencyMap.put(randomNumber, frequencyMap.get(randomNumber) + 1);
        }

        return frequencyMap;
    }

    // Realizar una prueba de chi-cuadrado para verificar uniformidad
    private static double chiSquareTest(Map<Integer, Integer> frequencyMap, int expectedFrequency) {
        double chiSquare = 0.0;

        for (int frequency : frequencyMap.values()) {
            chiSquare += Math.pow(frequency - expectedFrequency, 2) / (double) expectedFrequency;
        }

        return chiSquare;
    }

    public static void main(String[] args) throws InterruptedException {
        int n = 1000; // Número de muestras
        int expectedFrequency = n / 100; // Frecuencia esperada por número en el rango 1-100

        // Contadores para los métodos más uniformes
        int randomBestCount = 0;
        int threadLocalBestCount = 0;
        int secureRandomBestCount = 0;

        for (int i = 0; i < 1000; i++) {
            // Sincronizador para iniciar al mismo tiempo
            CountDownLatch latch = new CountDownLatch(1);
            double[] chiResults = new double[3]; // Para almacenar los resultados de cada generador

            // Crear hilos para cada generador
            Thread randomThread = new Thread(() -> {
                try {
                    latch.await();
                    Map<Integer, Integer> distribution = generateRandomNumbers(n, 'R');
                    chiResults[0] = chiSquareTest(distribution, expectedFrequency);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

            Thread threadLocalThread = new Thread(() -> {
                try {
                    latch.await();
                    Map<Integer, Integer> distribution = generateRandomNumbers(n, 'T');
                    chiResults[1] = chiSquareTest(distribution, expectedFrequency);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

            Thread secureRandomThread = new Thread(() -> {
                try {
                    latch.await();
                    Map<Integer, Integer> distribution = generateRandomNumbers(n, 'S');
                    chiResults[2] = chiSquareTest(distribution, expectedFrequency);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

            // Iniciar hilos y liberar el latch
            randomThread.start();
            threadLocalThread.start();
            secureRandomThread.start();
            latch.countDown(); // Iniciar los tres hilos al mismo tiempo

            // Esperar a que todos los hilos terminen
            randomThread.join();
            threadLocalThread.join();
            secureRandomThread.join();

            // Encontrar el valor más bajo de chi-cuadrado (el más uniforme)
            if (chiResults[0] < chiResults[1] && chiResults[0] < chiResults[2]) {
                randomBestCount++;
            } else if (chiResults[1] < chiResults[0] && chiResults[1] < chiResults[2]) {
                threadLocalBestCount++;
            } else if (chiResults[2] < chiResults[0] && chiResults[2] < chiResults[1]) {
                secureRandomBestCount++;
            }
        }

        // Mostrar resultados finales
        System.out.println("\nConteo de la distribución más uniforme:");
        System.out.println("Random fue el mejor: " + randomBestCount + " veces");
        System.out.println("ThreadLocalRandom fue el mejor: " + threadLocalBestCount + " veces");
        System.out.println("SecureRandom fue el mejor: " + secureRandomBestCount + " veces");
    }
}
