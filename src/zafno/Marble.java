package zafno;

import java.awt.Point;

/**
 *
 * @author leona
 */
public class Marble {
    private int posicion = -1;
    private Point ubicacion;
    private int player;

    public int getPlace() {
        return posicion;
    }

    public void setPlace(int Posicion) {
        this.posicion = Posicion;
    }

    public Point getUbiety() {
        return ubicacion;
    }

    public void setUbiety(Point Ubicacion) {
        this.ubicacion = Ubicacion;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int Player) {
        this.player = Player;
    }
    
}
