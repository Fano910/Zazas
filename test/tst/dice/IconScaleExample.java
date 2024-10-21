package tst.dice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import zamain.Acciones;

/**
 *
 * @author leona
 */
public class IconScaleExample extends JLabel {
    private float scale = 1.0f;
    private Icon currentIcon;

    public IconScaleExample(Icon initialIcon) {
        this.currentIcon = initialIcon;
        this.setIcon(initialIcon);
    }

    // Método para iniciar el cambio de escala
    public void scaleIcon(Icon newIcon, int duration) {
        Timer timer = new Timer(30, new ActionListener() {
            private int step = 0;
            private final int totalSteps = duration / 30;  // Cuantos pasos tiene la animación

            @Override
            public void actionPerformed(ActionEvent e) {
                step++;
                scale = 1.0f - ((float) step / totalSteps);  // Reduce la escala

                if (step >= totalSteps) {
                    ((Timer) e.getSource()).stop();
                    currentIcon = newIcon;  // Cambia el ícono una vez que la animación ha terminado
                    scale = 1.0f;  // Reinicia la escala para el nuevo ícono
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentIcon != null && scale > 0) {
            Graphics2D g2d = (Graphics2D) g;
            int width = (int) (currentIcon.getIconWidth() * scale);
            int height = (int) (currentIcon.getIconHeight() * scale);
            currentIcon.paintIcon(this, g2d, (getWidth() - width) / 2, (getHeight() - height) / 2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Icon Scale Example");

        IconScaleExample scaleLabel = new IconScaleExample(Acciones.iconDices);
        frame.add(scaleLabel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Prueba el cambio de icono con escalado después de 3 segundos
        new Timer(3000, e -> scaleLabel.scaleIcon(Acciones.iconDices, 1000)).start();  // Cambia ícono después de 3s con zoom de 1s
    }
}