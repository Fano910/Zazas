package zigma;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class TableroCanicas extends JPanel {
    private final int filas;
    private final int columnas;
    private int tileSize;  // Definimos el tamaño de las celdas del tablero
    private ArrayList<Canica> canicas;
    private Canica selectedCanica = null;

    public TableroCanicas(int filas, int columnas, int tileSize) {
        this.filas = filas;
        this.columnas = columnas;
        this.tileSize = tileSize;  // Asignamos el tamaño de las celdas

        canicas = new ArrayList<>();
        inicializarCanicas();

        // Listener de mouse para mover canicas
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                seleccionarCanica(e.getX(), e.getY());
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (selectedCanica != null) {
                    moverCanica(e.getX(), e.getY());
                    repaint();
                }
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (selectedCanica != null) {
                    soltarCanica(e.getX(), e.getY());
                    selectedCanica = null;
                    repaint();
                }
            }
        });
    }

    // Inicializar canicas en el tablero
    private void inicializarCanicas() {
        // Aquí puedes agregar canicas iniciales
        canicas.add(new Canica(1, 1, Color.RED));
        canicas.add(new Canica(2, 2, Color.BLUE));
        canicas.add(new Canica(3, 3, Color.GREEN));
    }

    // Dibujar el tablero y las canicas
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujarTablero(g);
        dibujarCanicas(g);
    }

    // Dibujar las líneas del tablero
    private void dibujarTablero(Graphics g) {
        g.setColor(Color.BLACK);
        for (int row = 0; row <= filas; row++) {
            g.drawLine(0, row * tileSize, columnas * tileSize, row * tileSize);
        }
        for (int col = 0; col <= columnas; col++) {
            g.drawLine(col * tileSize, 0, col * tileSize, filas * tileSize);
        }
    }

    // Dibujar las canicas
    private void dibujarCanicas(Graphics g) {
        for (Canica canica : canicas) {
            canica.dibujar(g, tileSize);
        }
    }

    // Seleccionar una canica en el tablero
    private void seleccionarCanica(int mouseX, int mouseY) {
        for (Canica canica : canicas) {
            if (canica.contiene(mouseX, mouseY, tileSize)) {
                selectedCanica = canica;
                break;
            }
        }
    }

    // Mover la canica seleccionada
    private void moverCanica(int mouseX, int mouseY) {
        if (selectedCanica != null) {
            int nuevaFila = mouseY / tileSize;
            int nuevaColumna = mouseX / tileSize;
            selectedCanica.setPosicion(nuevaFila, nuevaColumna);
        }
    }

    // Soltar la canica en su nueva posición
    private void soltarCanica(int mouseX, int mouseY) {
        if (selectedCanica != null) {
            int nuevaFila = mouseY / tileSize;
            int nuevaColumna = mouseX / tileSize;
            selectedCanica.setPosicion(nuevaFila, nuevaColumna);
        }
    }
}