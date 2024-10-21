package zigma;

/**
 *
 * @author leona
 */
import zigma.TableroCanicas;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tablero con Canicas");
        TableroCanicas tablero = new TableroCanicas(8, 8, 80); // 8 filas, 8 columnas, celdas de 80px
        frame.add(tablero);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}