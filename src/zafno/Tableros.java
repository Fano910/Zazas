package zafno;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.Timer;
import static zafno.Zazas.btnDado;
import static zafno.Data.*;
import static zafno.Data.ALERTS.*;
import static zafno.Data.MARBLE.*;
import zamain.Acciones;
import zamain.Creator;

/**
 *
 * @author leona
 */
public class Tableros extends javax.swing.JPanel {

    private int h = 690, turno = 1, tiroDado = 0;
    private final int numMaxJugadores = 4;
    private final JLabel[] labelArray = new JLabel[20];
    private Timer timer;
    private final Semaphore semaphore = new Semaphore(0); // Inicializa el Semaphore sin permisos disponibles
    protected static boolean isMoving = false;
    private static final short[][] puntos = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    /**
     * Creates new form Tableros
     *
     * @param NumJugadores
     * @param Colores
     * @param Padre
     * @param Modal
     */
    public Tableros(int NumJugadores, String Colores, Zazas Padre, Creator Modal) {
        initComponents();
        setIcons(Colores);
        Padre.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                setBounds((Padre.getWidth() / 2) - (Padre.getHeight() / 2), 0, Padre.getHeight(), Padre.getHeight());
            }
        });
        Zazas.btnDado.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (puntos[1][turno - 1] != 0 && puntos[1][turno - 1] == Acciones.getRand(0, puntos[1][turno - 1] + 1)) {
                Padre.showAlerts(turno - 1, APOYO);
            }
            if (Acciones.getRand(0, Padre.dificultad) == 1) {
                Acciones.playSound(SRC.TRACKS + "Carta.wav", false);
                Creator.txtMask.setVisible(true);
                Show smsS = new Show(Modal, this);
                smsS.setVisible(true);
                Creator.txtMask.setVisible(false);
            }
            if (puntos[2][turno - 1] != 0 && puntos[2][turno - 1] == Acciones.getRand(0, puntos[2][turno - 1] + 1)) {
                Padre.showAlerts(turno - 1, CONSECUENCIA);
            }
            if (puntos[3][turno - 1] != 0 && puntos[3][turno - 1] == Acciones.getRand(0, puntos[3][turno - 1] + 1)) {
                Padre.showAlerts(turno, FALLA);
            }
            startMarble(NumJugadores);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTablero = new javax.swing.JLabel();

        setBackground(Acciones.transparente);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        setLayout(null);

        lblTablero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTablero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblTablero.setIconTextGap(0);
        lblTablero.setOpaque(true);
        lblTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTableroMouseClicked(evt);
            }
        });
        add(lblTablero);
        lblTablero.setBounds(0, 0, 690, 690);
    }// </editor-fold>//GEN-END:initComponents

    private void lblTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTableroMouseClicked
        System.out.println("Tableros.newPoint=(" + evt.getX() + ", " + evt.getY() + ")");
    }//GEN-LAST:event_lblTableroMouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        int height = getHeight();
        Acciones.setScaledIcon("Tablero_1.png", height, height, lblTablero);
        for (JLabel jLabel : labelArray) {
            jLabel.setLocation(setProportionalPoint(jLabel.getX(), jLabel.getY(), height, h));
        }
        lblTablero.setSize(height, height);
        h = height;
    }//GEN-LAST:event_formComponentResized

    /**
     * Este coloca los iconos en su pocision inicial y agrega el Listener del
     * mouse para actuar cuando se hace click en el. Al final del metodo se
     * pueden agregar mas propiedades al JLabel.
     *
     * @param Colores
     */
    private void setIcons(String Colores) {
        javax.swing.Icon icon = null;
        int jugador = 0;
        for (int j = 0; j < 20; j++) {
            if (j % 5 == 0) {
                icon = Acciones.getIconOfTurno(Colores.charAt((j / 5) + 1));
                jugador++;
            }
            labelArray[j] = new JLabel(icon);
            labelArray[j].setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            labelArray[j].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            final int index = j;
            final int gamer = jugador;
            labelArray[j].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    marbleMouseClicked(index, gamer);
                }
            });
            add(labelArray[j], j);
            labelArray[j].setBounds(POINT.at(j + 77).x, POINT.at(j + 77).y, 35, 35);
            labelArray[j].setName(jugador + "");
            labelArray[j].putClientProperty(PLACE, -1); // Menor uso de memoria y acceso simplificado
            labelArray[j].putClientProperty(UBIETY, POINT.at(j + 77));
            labelArray[j].putClientProperty(PLAYER, jugador);
            labelArray[j].putClientProperty(POSITIONS, (jugador - 1) * 14);
            labelArray[j].putClientProperty(ORIGINAL, POINT.at(j + 77));
        }
    }

    /**
     * Este es el metodo principal, se activa al presionar el boton: 'btnDado'.
     *
     * @param numJugadores
     */
    private void startMarble(int numJugadores) {
        btnDado.setEnabled(false);
        CountDownLatch latch = new CountDownLatch(1); // Crea un "latch" que permite sincronizar
        Thread moveThread = new Thread(() -> {
            tiroDado = startIconTransition(Zazas.lblDice, 20, latch); // Pasa el "latch" al método de transición de iconos
            try {
                latch.await(); // Espera a que startIconTransition() termine
            } catch (InterruptedException ex) {
                System.out.println("ERR=startMarble");
            }
            if (!canContinue(false)) {
                tiroDado = 0;
                Acciones.mostrarTextoTemporal(CANNOT_MOVE.toString(), 3500, Acciones.azulNormal);
            }
            //System.out.print("El turno es de: " + turno + " of: " + numJugadores + " is: " + tiroDado);
//            if ((turno + 1) > numJugadores) { // Si el siguiente jugador no existe, toma el control el sistema.
//                for (int i = (turno + 1); i <= numMaxJugadores; i++) {
////                    placeBorderMarbles(Acciones.bordeLineaRoja);
//                    turno = (turno < numMaxJugadores) ? turno + 1 : 1;
//                    btnDado.setIcon(Acciones.getTurno(Zazas.colores.charAt(turno)));
//                    try {
//                        Thread.sleep(2500);
//                    } catch (InterruptedException ex) {
//                        System.out.println("ERR=startMarble");
//                    }
//                    //System.out.println("IA jugo con " + turno);
//                }
//                btnDado.setEnabled(true);
//            }
            turno = (turno < numMaxJugadores) ? turno + 1 : 1;
            btnDado.setIcon(Acciones.getIconOfTurno(Zazas.colores.charAt(turno)));
            Zazas.lblPuntos.setIcon(Acciones.getIconOfTurno(Zazas.colores.charAt(turno)));
            setPoints(0);
        });
        moveThread.start();
    }

    protected void setPoints(int Suma) {
        puntos[0][turno - 1] += Suma;
        Acciones.animateTransition(Zazas.lblPuntos, "" + puntos[0][turno - 1]);
        System.out.println("puntosDeepToS" + java.util.Arrays.deepToString(puntos));
    }

    protected void plus(int Deep, int Suma) {
        puntos[Deep][turno - 1] += Suma;
    }

    private void marbleMouseClicked(int Index, int Gamer) {
        if (tiroDado <= 0) {
            Acciones.mostrarTextoTemporal(MOVE_DICE.toString(), 3500, Acciones.rojo);
            return;
        }
        if (turno != Gamer) {
            Acciones.mostrarTextoTemporal(NOT_OWNER_MARBLE.toString(), 3500, Acciones.rojo);
            return;
        }
        if ((int) labelArray[Index].getClientProperty(PLACE) > -1 || tiroDado == 1 || tiroDado == 6) {
            if (isMoving) { // Condicion: Si una canica se esta moviendo, no puede iniciar.
                Acciones.mostrarTextoTemporal(MARBLE_IS_MOVING.toString(), 2500, Acciones.rojo);
                return;
            }
            CountDownLatch latch = new CountDownLatch(1);
            Thread movementThread = new Thread(() -> {
                isMoving = true;
                // DEBES CONTINUAL AQUI, BUSCANDO LA FORMA DE MOVER LA CANICA SELECCIONADA, LAS POSICIONES QUE MARCA 'tiroDado'
                int place = (int) labelArray[Index].getClientProperty(PLACE);
                int value = place + tiroDado + (int) labelArray[Index].getClientProperty(POSITIONS);
                labelArray[Index].putClientProperty(PLACE, place + tiroDado);
                labelArray[Index].putClientProperty(UBIETY, POINT.at(value));
                javax.swing.JLabel have = (javax.swing.JLabel) getComponentAt(POINT.at(value));
                if (have.getName() != null) {
                    Point old = (Point) have.getClientProperty(ORIGINAL);
                    Acciones.setNewLocation(have, have.getX(), have.getY(), old.x, old.y, 5, null);
                    have.putClientProperty(PLACE, -1);
                    have.putClientProperty(UBIETY, have.getClientProperty(ORIGINAL));
                }
//                System.out.println("La canica se movera " + tiroDado + " posicion" + (tiroDado > 1 ? "es" : "") + ".\t\tA la posicion " + obtenerNumero(0, 0, -1, tiroDado));
//                System.out.println("Place=" + labelArray[Index].getClientProperty(PLACE) + ", tiroDado=" + tiroDado + ", Positions=" + (int) labelArray[Index].getClientProperty(POSITIONS) + ", Value=" + value);
                Acciones.setNewLocation(labelArray[Index], labelArray[Index].getX(), labelArray[Index].getY(), POINT.at(value).x, POINT.at(value).y, 5, latch);
                try {
                    latch.await();
                } catch (InterruptedException ex) {
                    System.out.println("ERR=marbleMouseClicked");
                }
                tiroDado = 0;
                isMoving = false;
                semaphore.release();
                //System.out.println("posicion[" + i + "]=" + posiciones[i]);
            });
            movementThread.start();
            Acciones.playSound(SRC.TRACKS + "Marble.wav", false);
        } else {
            Acciones.mostrarTextoTemporal(CANNOT_LEAVE.toString() + tiroDado, 3000, Acciones.rojo);
        }
    }

    /**
     * Este inicia la transición de opacidad y cambio de ícono, normalmente sera
     * del icono dado.
     *
     * @param Label
     * @param Delay
     * @param latch
     * @return Numero de posiciones que podra avanzar.
     */
    private int startIconTransition(JLabel Label, int Delay, CountDownLatch latch) {
        int dev = Acciones.getRand(1, 7); // Último ícono fijo
        int one = Acciones.getRand(1, 7, 'R', dev);
        int two = Acciones.getRand(1, 7, 'T', new int[]{dev, one});
        Icon[] icons = new Icon[]{
            Label.getIcon(), Acciones.getIconAt(one),
            Acciones.getIconAt(two), Acciones.getIconAt(dev)
        };

        timer = new Timer(Delay, new ActionListener() { // Este timer se ejecuta en paralelo, 120 veces
            private int iconIndex = 0;  // Índice del ícono actual
            private boolean decreasing = true;  // Controla si la opacidad está disminuyendo
            private float opacity = 1.0f;  // Empieza con opacidad máxima

            @Override
            public void actionPerformed(ActionEvent e) {
                if (decreasing) { // Cambia la opacidad
                    opacity -= 0.05f;  // Disminuye la opacidad
                    if (opacity <= 0.0f) {
                        opacity = 0.0f;
                        decreasing = false;  // Cuando llega a opacidad mínima, empieza a aumentar
                        iconIndex = (iconIndex + 1);  // Cambia al siguiente ícono
                        if (iconIndex == icons.length - 1) {  // Si es el último ícono, no sigue
                            decreasing = false;
                        }
                    }
                } else {
                    opacity += 0.05f;  // Aumenta la opacidad
                    if (opacity >= 1.0f) {
                        opacity = 1.0f;
                        if (iconIndex == icons.length - 1) {  // Si está en el último ícono, detener
                            timer.stop();  // Detiene el ciclo al llegar al último ícono
                            latch.countDown();
                        } else {
                            decreasing = true;  // Si no es el último, ciclo continúa
                        }
                    }
                }
                Label.setIcon(Acciones.getIconOpacity(icons[iconIndex], opacity)); // Asigna el ícono con la opacidad actual
            }
        });
        timer.start();
        return dev;
    }

    /**
     * Verifica que Canicas pueden moverse y les coloca el Border, en caso de
     * que halla canicas que se puedan mover, la interfaz espera al movimiento
     * del usuario, al mismo tiempo el boton 'btnDado' se bloquea hasta que
     * termine toda la ejecución del metodo.
     *
     * @return Booleano que representa si hubo canicas que se pudieron mover.
     */
    private boolean canContinue(boolean IsIA) {
        boolean can = false;
        //btnDado.setEnabled(false);
        if (tiroDado == 1 || tiroDado == 6) {
            can = true;
        }
        for (int i = (5 * turno) - 5; i < (5 * turno); i++) {
            if (can || (int) labelArray[i].getClientProperty(PLACE) > -1) {
                can = true;
                labelArray[i].setBorder(IsIA ? Acciones.bordeLineaRoja : Acciones.bordeLineaAzul);
            }
        }
        if (can) {
            try {
                semaphore.acquire();
            } catch (InterruptedException ex) {
                System.out.println("ERR=canContinue");
            }
        }
        for (int i = (5 * turno) - 5; i < (5 * turno); i++) {
            labelArray[i].setBorder(Acciones.bordeVacio);
        }
        btnDado.setEnabled(true);
        return can;
    }

    /**
     * Calcula el tamaño del rango, la posición final en bucle y si el resultado
     * es negativo, lo ajusta para que sea un índice válido.
     *
     * @param Inicial
     * @param Final
     * @param Posicion
     * @param Avance
     * @return Número en la posición final dentro del rango
     */
    private int obtenerNumero(int Inicial, int Final, int Posicion, int Avance) {
        int rango = Final - Inicial + 1;
        int posicionFinal = (Posicion + Avance) % rango;
        if (posicionFinal < 0) {
            posicionFinal += rango;
        }
        return Inicial + posicionFinal;
    }

    /**
     * Este calcula una posicion relativa del componente.
     *
     * @param X
     * @param Y
     * @param NewHeight
     * @param OldHeight
     * @return Nueva localización del componente en cuestion.
     */
    private Point setProportionalPoint(int X, int Y, int NewHeight, int OldHeight) {
        int newX = Math.round((X * NewHeight) / OldHeight);
        int newY = Math.round((Y * NewHeight) / OldHeight);
        return new Point(newX, newY);
    }

    /**
     * Coloca el borde a las canicas del turno en cuestion y pausa la ejecucion
     * del codigo hasta que el usuario haga click en una canica.
     *
     * @param Border
     */
    private void placeBorderMarbles(javax.swing.border.Border Border) {
        for (int i = (5 * turno) - 5; i < (5 * turno); i++) {
            labelArray[i].setBorder(Border);
        }
        try {
            semaphore.acquire();
        } catch (InterruptedException ex) {
            System.out.println("ERR=placeBorderMarbles");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTablero;
    // End of variables declaration//GEN-END:variables
}
