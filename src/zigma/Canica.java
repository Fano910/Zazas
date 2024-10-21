package zigma;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author leona
 */
public class Canica {
    private int row;   // Fila donde está la canica
    private int col;   // Columna donde está la canica
    private Color color;

    public Canica(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    // Cambiar la posición de la canica
    public void setPosicion(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // Dibujar la canica
    public void dibujar(Graphics g, int tileSize) {
        g.setColor(color);
        int x = col * tileSize + tileSize / 4;
        int y = row * tileSize + tileSize / 4;
        g.fillOval(x, y, tileSize / 2, tileSize / 2);
    }

    // Comprobar si el mouse está sobre la canica
    public boolean contiene(int mouseX, int mouseY, int tileSize) {
        int x = col * tileSize + tileSize / 4;
        int y = row * tileSize + tileSize / 4;
        int size = tileSize / 2;
        return new Rectangle(x, y, size, size).contains(mouseX, mouseY);
    }
}