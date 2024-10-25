package zafno;

import java.awt.Point;

/**
 *
 * @author leona
 */
public enum data {
    /**
     * Valor entero de la posicion en donde se encuentra. Def=-1
     */
    PLACE,
    /**
     * Ubicación actual. Def=Point(x, y)
     */
    UBIETY,
    /**
     * FINAL:Jugador al que pertenece este elemento. Def=1
     */
    PLAYER,
    /**
     * FINAL:Posiciones extra para coincidir en el tablero. Def=0
     */
    POSITIONS,
    /**
     * FINAL:Ubicación original. Def=Point(x, y)
     */
    ORIGINAL,
    CANOT_MOVE {
        @Override
        public String get() {
            return "Aún no puedes moverte de la zona segura.";
        }
    },
    MOVE_DICE {
        @Override
        public String get() {
            return "Aún no has movido el dado.";
        }
    },
    MARBLE_IS_MOVING {
        @Override
        public String get() {
            return "Ya hay una canica en movimiento";
        }
    },
    NOT_OWNER_MARBLE {
        @Override
        public String get() {
            return "Esta canica no forma parte de tu colección.";
        }
    },
    CANNOT_LEAVE {
        @Override
        public String get() {
            return "No puedes salir del área segura con: ";
        }
    };

    public String get() {
        return "NaN";
    }
}
