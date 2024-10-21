package zores;

import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leona
 */
public class ColorSimilarityUpdater {

    private final JProgressBar progressResultado;
    private double resultado;

    public ColorSimilarityUpdater(JProgressBar progressResultado) {
        this.progressResultado = progressResultado;
    }

    public void calcularSimilitud(int FR, int FG, int FB, int R, int G, int B) {
        // Calcular la distancia euclidiana
        double distancia = Math.sqrt(Math.pow(FR - R, 2) + Math.pow(FG - G, 2) + Math.pow(FB - B, 2));
        double distanciaMaxima = Math.sqrt(Math.pow(255, 2) * 3);
        resultado = 100 * (1 - (distancia / distanciaMaxima));

        // Iniciar la actualización gradual
        actualizarProgresoGradualmente();
    }

    private void actualizarProgresoGradualmente() {
        // Obtener el valor actual del progreso
        int valorActual = progressResultado.getValue();

        // Crear un Timer para actualizar el progreso
        Timer timer = new Timer(10, new ActionListener() {
            private int valor = valorActual;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (valor < resultado) {
                    valor++;
                    progressResultado.setValue(valor);
                } else if (valor > resultado) {
                    valor--;
                    progressResultado.setValue(valor);
                } else {
                    ((Timer) e.getSource()).stop(); // Detener el Timer cuando se alcanza el valor objetivo
                }
            }
        });

        timer.start();
    }
}
