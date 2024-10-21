package tst.dice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import zamain.Acciones;

/**
 * Ete Clase ya funciona.
 *
 * @author leona
 */
public class IconOpacityExample {

    // Variables para controlar la opacidad y la dirección de la transición
    private float opacity = 1.0f;  // Comienza con opacidad completa
    private boolean decreasing = true;  // Controla si la opacidad está disminuyendo
    private Timer timer;
    
    // Métodos que configuran el icono con la opacidad correspondiente
    public Icon getIconOpacity(Icon icon, float opacity) {
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        BufferedImage transparentImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2dTransparent = transparentImage.createGraphics();
        g2dTransparent.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
        g2dTransparent.drawImage(bufferedImage, 0, 0, null);
        g2dTransparent.dispose();
        return new ImageIcon(transparentImage);
    }

    // Método que inicia la transición de opacidad y cambio de ícono
    public void startIconTransition(JLabel label, Icon[] icons, int delay) {
        timer = new Timer(delay, new ActionListener() {
            private int iconIndex = 0;  // Índice del ícono actual

            @Override
            public void actionPerformed(ActionEvent e) {
                // Cambia la opacidad
                if (decreasing) {
                    opacity -= 0.05f;  // Disminuye la opacidad
                    if (opacity <= 0.0f) {
                        opacity = 0.0f;
                        decreasing = false;  // Cuando llega a opacidad mínima, empieza a aumentar
                        iconIndex = (iconIndex + 1) % icons.length;  // Cambia al siguiente ícono
                    }
                } else {
                    opacity += 0.05f;  // Aumenta la opacidad
                    if (opacity >= 1.0f) {
                        opacity = 1.0f;
                        decreasing = true;  // Cuando llega a opacidad máxima, empieza a disminuir
//                        timer.stop();
                    }
                }

                // Asigna el ícono con la opacidad actual
                label.setIcon(getIconOpacity(icons[iconIndex], opacity));
            }
        });
        timer.start();
    }

    public void stopIconTransition() {
        if (timer != null) {
            timer.stop();
        }
    }

    public static void main(String[] args) {
        // Crear el frame y los componentes
        JFrame frame = new JFrame("Transición de Opacidad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Crear un JLabel para mostrar el ícono
        JLabel label = new JLabel();

        // Cargar los íconos (cambiar las rutas de los íconos por las correspondientes en tu proyecto)
        Icon[] icons = {Acciones.iconDices};  // Íconos a alternar

        // Crear una instancia de IconTransition y comenzar la animación
        IconOpacityExample transition = new IconOpacityExample();
        transition.startIconTransition(label, icons, 50);  // Transición con un retraso de 100 ms

        // Añadir el JLabel al frame
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}