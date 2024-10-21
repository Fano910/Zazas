package tst.dice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import zamain.Acciones;

/**
 *
 * @author leona
 */
public class IconFadeExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fade Icon Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setIcon(Acciones.iconDices);  // Icono inicial

        frame.add(label);
        frame.setVisible(true);

        // Cambiar el ícono después de 2 segundos
        Timer startTimer = new Timer(2000, e -> fadeIcon(label, Acciones.iconDices, 1000));
        startTimer.setRepeats(false);
        startTimer.start();
    }

    public static void fadeIcon(JLabel label, Icon newIcon, int duration) {
        Timer timer = new Timer(15, null);  // Intervalo de 15 ms por frame
        final float[] opacity = {1.0f};  // Opacidad inicial
        final Icon currentIcon = label.getIcon();

        timer.addActionListener((ActionEvent e) -> {
            opacity[0] -= 0.05f;  // Decremento de opacidad

            if (opacity[0] <= 0.0f) {
                System.out.println("Cambio");
                label.setIcon(newIcon);  // Cambiar al nuevo icono cuando se desvanece el anterior
                opacity[0] = 0.0f;
                return;
            }

            // Crear el icono desvanecido (con opacidad modificada)
            label.setIcon(createTransparentIcon((ImageIcon) currentIcon, opacity[0]));

            // Incrementar opacidad para el nuevo icono
            if (opacity[0] == 0.0f && newIcon != null) {
                opacity[0] += 0.05f;  // Incremento de opacidad para el nuevo icono
                if (opacity[0] >= 1.0f) {
                    timer.stop();  // Termina la animación
                }
            }

            label.repaint();  // Redibujar el JLabel
        });

        timer.setRepeats(true);
        timer.start();
    }

    // Método para crear un icono con opacidad
    public static Icon createTransparentIcon(ImageIcon icon, float opacity) {
        Image img = icon.getImage();
        BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
        g2d.drawImage(img, 0, 0, null);
        g2d.dispose();
        return new ImageIcon(bufferedImage);
    }
}
//public class IconFadeExample extends JLabel {
//    private float alpha = 1.0f;
//    private Icon currentIcon;
//
//    public IconFadeExample(Icon initialIcon) {
//        this.currentIcon = initialIcon;
//        this.setIcon(initialIcon);
//    }
//
//    // Método para iniciar el fade
//    public void fadeIcon(Icon newIcon, int duration) {
//        Timer timer = new Timer(30, new ActionListener() {
//            private int step = 0;
//            private final int totalSteps = duration / 30;  // Cuantos pasos tiene la animación
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                step++;
//                alpha = 1.0f - ((float) step / totalSteps);  // Decrementa la opacidad
//
//                if (step >= totalSteps) {
//                    ((Timer) e.getSource()).stop();
//                    currentIcon = newIcon;  // Cambia el ícono una vez que la animación ha terminado
//                    alpha = 1.0f;  // Reinicia la opacidad para el nuevo ícono
//                }
//                repaint();
//            }
//        });
//        timer.start();
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        if (currentIcon != null && alpha > 0) {
//            Graphics2D g2d = (Graphics2D) g;
//            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));  // Ajusta la opacidad
//            currentIcon.paintIcon(this, g2d, 0, 0);
//        }
//    }
//    
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Icon Fade Example");
//
//        IconFadeExample fadeLabel = new IconFadeExample(Acciones.iconDices);
//        frame.add(fadeLabel);
//        frame.setSize(300, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//
//        // Prueba el cambio de icono después de 3 segundos
//         Timer h = new Timer(3000, e -> fadeLabel.fadeIcon(Acciones.iconDice3, 1000));  // Cambia ícono después de 3s con fade de 1s
//         h.setRepeats(false);
//         h.start();
//    }
//}
