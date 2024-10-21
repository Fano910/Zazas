package tst.dice;


import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author leona
 */
public class SmoothIconTransition extends JPanel {

    private ImageIcon currentIcon;
    private ImageIcon nextIcon;
    private float alpha = 1.0f;  // Transparencia inicial
    private final Timer timer;

    public SmoothIconTransition() {
        currentIcon = new ImageIcon(".\\Data\\Images\\Dice\\1_1.png");
        nextIcon = new ImageIcon(".\\Data\\Images\\Dice\\1_2.png");

        timer = new Timer(50, (ActionEvent e) -> {
            // Reducir la opacidad (transición)
            alpha -= 0.1f;
            if (alpha <= 0) {
                // Cambiar al siguiente icono y reiniciar la transparencia
                currentIcon = nextIcon;
                nextIcon = new ImageIcon(".\\Data\\Images\\Dice\\1_3.png");  // Siguiente icono en la secuencia
                alpha = 1.0f;
            }
            repaint();  // Repintar el panel con el nuevo estado
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Dibujar el icono actual
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2d.drawImage(currentIcon.getImage(), 0, 0, this);

        // Dibujar el siguiente icono en transición
        if (alpha < 1.0f) {
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f - alpha));
            g2d.drawImage(nextIcon.getImage(), 0, 0, this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Transición suave de iconos");
        SmoothIconTransition panel = new SmoothIconTransition();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}