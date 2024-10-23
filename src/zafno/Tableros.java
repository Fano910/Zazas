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
import zamain.Acciones;

/**
 *
 * @author leona
 */
public class Tableros extends javax.swing.JPanel {

    private int h = 690, turno = 1, tiroDado = 0;
    private final int numMaxJugadores = 4, numJugadores;
    private final JLabel[] labelArray = new JLabel[20];
    private final Point[] points = new Point[]{
        new Point(643, 286), // 41. INICIA AZUL
        new Point(643, 241),
        new Point(501, 241),
        new Point(558, 241),
        new Point(514, 241),
        new Point(470, 241),
        new Point(427, 241),
        new Point(427, 194),
        new Point(427, 150),
        new Point(427, 109),
        new Point(427, 68),
        new Point(427, 19),
        new Point(385, 19),
        new Point(335, 19),
        new Point(293, 19), // 55. TERMINA AZUL
        new Point(242, 19), // 0. INICIA NEGRO
        new Point(242, 68),
        new Point(242, 109),
        new Point(242, 153),
        new Point(242, 192),
        new Point(242, 241),
        new Point(195, 241),
        new Point(149, 241),
        new Point(104, 241),
        new Point(63, 241),
        new Point(21, 241),
        new Point(21, 287),
        new Point(21, 329), // 12. TERMINA NEGRO
        new Point(21, 374), // 13. INICIA AMARILLO
        new Point(21, 418),
        new Point(61, 418),
        new Point(105, 418),
        new Point(149, 418),
        new Point(195, 418),
        new Point(242, 418),
        new Point(242, 468),
        new Point(242, 514),
        new Point(242, 555),
        new Point(242, 605),
        new Point(242, 652),
        new Point(290, 652),
        new Point(335, 652), // 26. TERMINA AMARILLO
        new Point(385, 652), // 27. INICIA ROJO
        new Point(427, 652),
        new Point(427, 606),
        new Point(427, 556),
        new Point(427, 514),
        new Point(427, 469),
        new Point(427, 419),
        new Point(470, 419),
        new Point(514, 419),
        new Point(558, 419),
        new Point(601, 419),
        new Point(643, 419),
        new Point(643, 366),
        new Point(643, 330), // 40. TERMINA ROJO
        new Point(335, 68), // 56. FINALIZA NEGRO
        new Point(335, 109),
        new Point(335, 152),
        new Point(335, 194),
        new Point(335, 241),
        new Point(61, 330), // 61. FINALIZA AMARILLO
        new Point(105, 330),
        new Point(149, 330),
        new Point(195, 330),
        new Point(242, 330),
        new Point(335, 605), // 66. FINALIZA ROJO
        new Point(335, 556),
        new Point(335, 514),
        new Point(335, 468),
        new Point(335, 418),
        new Point(601, 330), // 71. FINALIZA AZUL
        new Point(558, 330),
        new Point(514, 330),
        new Point(470, 330),
        new Point(427, 330),
        new Point(335, 330), // 76. CENTRO
        new Point(80, 0), // GUARDA Jugador 1 (Posición 77).
        new Point(40, 0),
        new Point(0, 0),
        new Point(0, 40),
        new Point(40, 40),
        new Point(0, 578), // GUARDA Jugador 2 (Posición 82).
        new Point(0, 618),
        new Point(0, 658),
        new Point(40, 658),
        new Point(40, 618),
        new Point(578, 658), // GUARDA Jugador 3 (Posición 87).
        new Point(618, 658),
        new Point(658, 658),
        new Point(658, 618),
        new Point(618, 618),
        new Point(658, 80), // GUARDA Jugador 4 (Pocisión 92).
        new Point(658, 40),
        new Point(658, 0),
        new Point(618, 0),
        new Point(618, 40)
    };
    private Timer timer;
    private final Semaphore semaphore = new Semaphore(0); // Inicializa el Semaphore sin permisos disponibles
    private boolean isMoving = false;

    /**
     * Creates new form Tableros
     *
     * @param NumJugadores
     * @param Colores
     * @param Padre
     */
    public Tableros(int NumJugadores, String Colores, Zazas Padre) {
        this.numJugadores = NumJugadores;
        initComponents();
        setIcons(Colores);
        Padre.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                setBounds((Padre.getWidth() / 2) - (Padre.getHeight() / 2), 0, Padre.getHeight(), Padre.getHeight());
            }
        });
        Zazas.btnDado.addActionListener((java.awt.event.ActionEvent evt) -> {
            startMarble();
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
                    if (tiroDado <= 0) {
                        Acciones.mostrarTextoTemporal("Aún no has movido el dado.", 3500, Acciones.rojo);
                        return;
                    }
                    if (turno != gamer) {
                        Acciones.mostrarTextoTemporal("Esta canica no forma parte de tu colección.", 3500, Acciones.rojo);
                        return;
                    }
                    if ((int) labelArray[index].getClientProperty("Place") > -1 || tiroDado == 1 || tiroDado == 6) {
                        marbleMouseClicked(index); // Mover todos los if's al metodo marbleMouseClicked
                    } else {
                        Acciones.mostrarTextoTemporal("No puedes salir del área segura con: " + tiroDado, 3000, Acciones.rojo);
                    }
                }
            });
            add(labelArray[j], j);
            labelArray[j].setBounds(points[j + 77].x, points[j + 77].y, 35, 35);
//            Marble data = new Marble(); // Mayor velodidad si se accede al mismo tiempo.
//            data.setPlace(-1);
//            data.setUbiety(points[j + 77]);
//            data.setPlayer(jugador);
//            labelArray[j].putClientProperty("data", data);
            labelArray[j].putClientProperty("Place", -1); // Menor uso de memoria y acceso simplificado
            labelArray[j].putClientProperty("Ubiety", points[j + 77]);
            labelArray[j].putClientProperty("Player", jugador);
            labelArray[j].putClientProperty("Positions", jugador * 14);
        }
    }

    /**
     * Este es el metodo principal, se activa al presionar el boton: 'btnDado'.
     */
    private void startMarble() {
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
                Acciones.mostrarTextoTemporal("Aún no puedes moverte de la zona segura.", 3500, Acciones.azulNormal);
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
        });
        moveThread.start();
    }

    private void marbleMouseClicked(int Index) {
        if (isMoving) { // Condicion: Si una canica se esta moviendo, no puede iniciar.
            return;
        }
        CountDownLatch latch = new CountDownLatch(1);
        Thread movementThread = new Thread(() -> {
            isMoving = true;
            System.out.println("La canica se movera " + tiroDado + " posiciones.\nA la posicion " + obtenerNumero(0, 0, -1, tiroDado));
            // DEBES CONTINUAL AQUI, BUSCANDO LA FORMA DE MOVER LA CANICA SELECCIONADA, LAS POSICIONES QUE MARCA 'tiroDado'
            //int randomValue = Acciones.getRand(0, 97);
            int value = 1 + (int) labelArray[Index].getClientProperty("Place") + tiroDado + (int) labelArray[Index].getClientProperty("Positions");
            System.out.println("1 + Place=" + (int) labelArray[Index].getClientProperty("Place") + ", tiroDado=" + tiroDado + ", Positions=" + (int) labelArray[Index].getClientProperty("Positions"));
            Acciones.setNewLocation(labelArray[Index], labelArray[Index].getX(), labelArray[Index].getY(), points[value].x, points[value].y, 5, latch);
            try {
                latch.await();
            } catch (InterruptedException ex) {
                System.out.println("ERR=marbleMouseClicked");
            }
            isMoving = false;
            semaphore.release();
            //System.out.println("posicion[" + i + "]=" + posiciones[i]);
        });
        movementThread.start();
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
        int dev = Acciones.getRand(1, 7);  // Último ícono fijo
        Icon[] icons = new Icon[]{
            Label.getIcon(), Acciones.getIconAt(Acciones.getRand(1, 7, dev)),
            Acciones.getIconAt(Acciones.getRand(1, 7, dev)), Acciones.getIconAt(dev)
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
     * @return
     */
    private boolean canContinue(boolean IsIA) {
        boolean can = false;
        //btnDado.setEnabled(false);
        if (tiroDado == 1 || tiroDado == 6) {
            can = true;
        }
        for (int i = (5 * turno) - 5; i < (5 * turno); i++) {
            if ((int) labelArray[i].getClientProperty("Place") > -1 || can) {
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
