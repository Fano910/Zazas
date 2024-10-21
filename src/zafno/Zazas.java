package zafno;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import zamain.Acciones;

/**
 *
 * @author leona
 */
public class Zazas extends javax.swing.JPanel {

    private int w = 1280, h = 690, numJugadores = 0;
    protected static String colores = ".BYRA.";
    private final String[] nombres = {"GuardianOriginal", "HeroeLegal", "ProtectorCreativo", "CazadorAutentico", "DefensorDigital", "ArtGuardian", "OriginalHero", "ValorProtector", "JustoDigital", "LegadoLegal", "AntiPirata", "ArteDefensor", "GuardianDeArte", "HonestoJugador", "CazaPiratas", "LegalWarrior", "DigitalProtector", "ProtegeValor", "AntiPirateria", "ArteProtector", "GuardianDeCodigo", "ProtegeOriginal", "GuardianDigital", "CazaFalsos", "ProtectorDeArte", "LegalDefender", "GuardianDeLegado", "HeroeDeCodigo", "DefensaDigital", "CazadorLegal", "OriginalProtector", "ProtectorHonesto", "ValorOriginal", "GuardianContraPiratas", "CodigoProtegido", "HonestoDigital", "AntiPirateo", "ProtectorDeLegado", "DigitalDefensor", "DefensorDeArte", "CazaPirateria", "ProtectorDelCodigo", "LegalGuardian", "CazadorDeFalsos", "DefensorCreativo", "GuardianHonesto", "DigitalCazaFalsos", "ArteLegal", "ProtectorDelArte", "GuardianDelCodigo", "ProtectorDelValor", "HeroeDelArte", "CazaPirata", "GuardianDeProteccion", "DefensorOriginal", "ProtectorJusto", "LegalOriginal", "DigitalCazador", "ValorCreativo", "ProtectorContraPiratas", "GuardianDeHonestidad", "CodigoLegal", "DigitalHeroe", "ProtectorDelLegado", "CazaFalsificaciones", "OriginalDefender", "ProtectorDelOriginal", "LegalCazador", "DigitalGuardian", "ProtectorDeHonestidad", "CazaPiratasOriginal", "DefensorDeLegado", "GuardianLegal", "AntiPirateriaHeroe", "ProtectorContraFalsos", "CazadorDeOriginales", "ArteProtegido", "ProtectorDeCodigo", "GuardianDeValor", "LegalProtector", "DigitalValor", "OriginalCazador", "ProtectorDeFalsificaciones", "CazaOriginal", "HeroeCreativo", "GuardianContraFalsos", "ProtectorLegal", "DefensorHonesto", "ArteGuardian", "ProtectorDeHonesto", "CazadorDeCodigo", "ValorOriginalHeroe", "GuardianCreativo", "LegalHeroe", "ProtectorDeArteLegal", "DefensorDelOriginal", "CazaPirataOriginal", "ProtectorCreativoDigital", "GuardianDePirateria", "ProtectorDeAutenticidad"};
    private final static char[] allColores = {'Y', 'W', 'T', 'S', 'R', 'm', 'P', 'O', 'M', 'V', 'D', 'G', 'C', 'A', 'B'};
    private final static boolean[] isDisponible = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    private final static JLabel[] allItems = {
        new JLabel("Negro          B", Acciones.iconCanicaNegra, JLabel.CENTER),
        new JLabel("Azul           A", Acciones.iconCanicaAzul, JLabel.CENTER),
        new JLabel("Cafe           C", Acciones.iconCanicaCafe, JLabel.CENTER),
        new JLabel("Guinda         G", Acciones.iconCanicaGuinda, JLabel.CENTER),
        new JLabel("Dorado         D", Acciones.iconCanicaDorada, JLabel.CENTER),
        new JLabel("Verde          V", Acciones.iconCanicaVerde, JLabel.CENTER),
        new JLabel("Mexico         M", Acciones.iconCanicaMexico, JLabel.CENTER),
        new JLabel("Naranja        O", Acciones.iconCanicaNaranja, JLabel.CENTER),
        new JLabel("Rosa           P", Acciones.iconCanicaRosa, JLabel.CENTER),
        new JLabel("Morado         m", Acciones.iconCanicaMorada, JLabel.CENTER),
        new JLabel("Rojo           R", Acciones.iconCanicaRoja, JLabel.CENTER),
        new JLabel("Plata          S", Acciones.iconCanicaPlateada, JLabel.CENTER),
        new JLabel("Turquesa       T", Acciones.iconCanicaTurquesa, JLabel.CENTER),
        new JLabel("Vino           W", Acciones.iconCanicaVino, JLabel.CENTER),
        new JLabel("Amarillo       Y", Acciones.iconCanicaAmarilla, JLabel.CENTER)
    };

    /**
     * Creates new form Zazas
     */
    public Zazas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollAllGamers = new javax.swing.JScrollPane();
        panelAllGamers = new javax.swing.JPanel();
        txtMirar = new javax.swing.JLabel();
        panelGamers = new javax.swing.JPanel();
        panelGamer = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        txtAniadir = new javax.swing.JLabel();
        btnDado = new javax.swing.JButton();
        lblDice = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });
        setLayout(null);

        scrollAllGamers.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"), 2, true), "Jugadores:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(80, 80, 80))); // NOI18N

        panelAllGamers.setBackground(new java.awt.Color(247, 247, 247));
        panelAllGamers.setMaximumSize(new java.awt.Dimension(450, 450));
        panelAllGamers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAllGamersMouseExited(evt);
            }
        });
        panelAllGamers.setLayout(new java.awt.GridLayout(0, 6, 5, 5));
        scrollAllGamers.setViewportView(panelAllGamers);

        add(scrollAllGamers);
        scrollAllGamers.setBounds(0, 0, 1280, 90);
        scrollAllGamers.setVisible(false);

        txtMirar.setForeground(new java.awt.Color(0, 102, 204));
        txtMirar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMirar.setText("Ver Jugadores");
        txtMirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMirarMouseEntered(evt);
            }
        });
        add(txtMirar);
        txtMirar.setBounds(0, 0, 150, 16);
        txtMirar.setVisible(false);

        panelGamers.setBackground(new java.awt.Color(255, 255, 255));
        panelGamers.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(187, 187, 187), 2, true), "Puedes añadir hasta 4 jugadores", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(80, 80, 80))); // NOI18N
        panelGamers.setLayout(null);

        panelGamer.setBackground(new java.awt.Color(247, 247, 247));
        panelGamer.setLayout(null);
        panelGamers.add(panelGamer);
        panelGamer.setBounds(10, 30, 450, 500);
        panelGamer.setLayout(new BoxLayout(panelGamer, BoxLayout.Y_AXIS));
        addGamer();

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 0, 0));
        btnEntrar.setText("JUGAR");
        btnEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusable(false);
        btnEntrar.setOpaque(true);
        btnEntrar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        panelGamers.add(btnEntrar);
        btnEntrar.setBounds(25, 550, 420, 60);

        txtAniadir.setForeground(new java.awt.Color(0, 102, 204));
        txtAniadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAniadir.setText("¿Añadir jugador?");
        txtAniadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAniadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAniadirMouseClicked(evt);
            }
        });
        panelGamers.add(txtAniadir);
        txtAniadir.setBounds(175, 610, 120, 16);
        txtMirar.setVisible(false);

        add(panelGamers);
        panelGamers.setBounds(20, 30, 470, 640);

        btnDado.setBackground(new java.awt.Color(255, 255, 255));
        btnDado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnDado.setForeground(new java.awt.Color(0, 0, 0));
        btnDado.setIcon(Acciones.iconDices);
        btnDado.setText("Turno");
        btnDado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDado.setContentAreaFilled(false);
        btnDado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDado.setFocusable(false);
        btnDado.setOpaque(true);
        btnDado.setPreferredSize(new java.awt.Dimension(120, 30));
        btnDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDadoMouseExited(evt);
            }
        });
        add(btnDado);
        btnDado.setBounds(20, 40, 100, 35);

        lblDice.setIcon(Acciones.iconDices);
        add(lblDice);
        lblDice.setBounds(40, 110, 70, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMirarMouseEntered
        scrollAllGamers.setVisible(true);
    }//GEN-LAST:event_txtMirarMouseEntered

    private void panelAllGamersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAllGamersMouseExited
        scrollAllGamers.setVisible(false);
    }//GEN-LAST:event_panelAllGamersMouseExited

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        if (evt.getChanged().isValid() && isVisible()) {
            int width = evt.getChanged().getSize().width;
            int height = evt.getChanged().getSize().height - 30;
            setSize(width, height);
            w = width;
            h = height;
        }
    }//GEN-LAST:event_formAncestorResized

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnEntrar.setBackground(Acciones.azulClaro);
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnEntrar.setBackground(Acciones.blanco);
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (numJugadores > 0) { // En esta seccion se puede elegir, a futuro, cual tablero usar.
            Tableros tab = new Tableros(numJugadores, colores, this);
            add(tab);
            tab.setBounds((w / 2) - (h / 2), 0, h, h);
            // FALTA: Colocar los jugadores en panelAllGamers
            panelGamers.setLocation(-470, 0);
            requestFocus();
            txtMirar.setVisible(true);
            btnDado.setIcon(Acciones.getIconOfTurno(colores.charAt(1)));
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtAniadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAniadirMouseClicked
        addGamer();
    }//GEN-LAST:event_txtAniadirMouseClicked

    private void btnDadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDadoMouseEntered
        btnDado.setBackground(Acciones.azulClaro);
    }//GEN-LAST:event_btnDadoMouseEntered

    private void btnDadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDadoMouseExited
        btnDado.setBackground(Acciones.blanco);
    }//GEN-LAST:event_btnDadoMouseExited

    /**
     * Agrega una instancia de Gamer a panelGamer.
     */
    private void addGamer() {
        if (numJugadores < 4) {
            Gamer gamer = new Gamer(numJugadores++, "Jugador " + numJugadores, nombres[Acciones.getRand(0, 100)]);
            gamer.setSize(gamer.getPreferredSize());
            panelGamer.add(gamer);
        } else {
            Acciones.mostrarTextoTemporal("Pronto se podran agregar mas de 4 jugadores\nGRACIAS POR ESPERAR", 4000, Acciones.rojo);
        }
    }

    /**
     * Coloca el color (ColorChar) en la posición especificada con el ID del
     * jugador, en caso de que ya este ocupado ese color, sustituye el color
     * existente a el primer disponible.
     *
     * @param Jugador
     * @param ColorChar
     */
    protected static void setColorAt(int Jugador, char ColorChar) {
        int index = colores.indexOf(ColorChar);
        if (index != -1) {
            for (char disponible : allColores) {
                if (colores.indexOf(disponible) == -1) {
                    colores = colores.substring(0, index) + disponible + colores.substring(index + 1);
                    break;
                }
            }
        }
        colores = colores.substring(0, Jugador + 1) + ColorChar + colores.substring(Jugador + 2);
        System.out.println(colores);
    }

    /**
     * Devuelve un arreglo con las etiquetas aún disponibles. Si agregas un
     * JLabel como parametro esta se agregara al arreglo devuelto.
     *
     * @return
     */
    public static JLabel[] getDisponibles() {
        return getDisponibles(null);
    }

    protected static JLabel[] getDisponibles(JLabel ID) {
        java.util.List<JLabel> disponibles = new java.util.ArrayList<>();
        for (int i = 0; i < allItems.length; i++) {
            if ((ID != null) && (ID == allItems[i])) {
                disponibles.add(allItems[i]);
            } else if (isDisponible[i]) {
                disponibles.add(allItems[i]);
            }
        }
        return disponibles.toArray(JLabel[]::new);
    }

    /**
     * Coloca la disponibilidad de la etiqueta para que pueda ser devuelto en
     * getDisponibles() o getDisponibles(ID)
     *
     * @param Item
     * @param SetDisponible
     */
    public static void setItemEnabled(Object Item, boolean SetDisponible) {
        for (int i = 0; i < allItems.length; i++) {
            if (allItems[i] == Item) {
                //System.out.println("ItemAt=" + i + " is " + (SetDisponible ? "Enabled" : "Disabled"));
                isDisponible[i] = SetDisponible;
                break;
            }
        }
    }

    /**
     * Metodo inservible, resguardado para futuras mejoras.
     *
     * @param inicial
     * @param fin
     * @param posicion
     * @return
     */
    public static int obtenerPosicionRelativa(int inicial, int fin, int posicion) {
        if (posicion < inicial || posicion > fin) {
            throw new IllegalArgumentException("Posición fuera de rango.");
        }
        return inicial + (posicion - inicial);
    }
    /*int inicial = 0;
    int fin = 14;
    int posicion = 15;
    int avance = 3;

    int resultado = obtenerNumero(inicial, fin, posicion, avance);
    System.out.println("El número en la nueva posición es: " + resultado);*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btnDado;
    private javax.swing.JButton btnEntrar;
    protected static javax.swing.JLabel lblDice;
    private javax.swing.JPanel panelAllGamers;
    private javax.swing.JPanel panelGamer;
    private javax.swing.JPanel panelGamers;
    private javax.swing.JScrollPane scrollAllGamers;
    private javax.swing.JLabel txtAniadir;
    private javax.swing.JLabel txtMirar;
    // End of variables declaration//GEN-END:variables
}
