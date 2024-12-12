package zacs;

import zamain.Acciones;

/**
 *
 * @author Fano
 */
public class Arquitecture extends javax.swing.JFrame {

    private static boolean isInit = false;
    private int xMouse, yMouse, w, h, i = -1, maxX, maxY;
    private final String[] nombres = {"GuardianOriginal", "HeroeLegal", "ProtectorCreativo", "CazadorAutentico", "DefensorDigital", "ArtGuardian", "OriginalHero", "ValorProtector", "JustoDigital", "LegadoLegal", "AntiPirata", "ArteDefensor", "GuardianDeArte", "HonestoJugador", "CazaPiratas", "LegalWarrior", "DigitalProtector", "ProtegeValor", "AntiPirateria", "ArteProtector", "GuardianDeCodigo", "ProtegeOriginal", "GuardianDigital", "CazaFalsos", "ProtectorDeArte", "LegalDefender", "GuardianDeLegado", "HeroeDeCodigo", "DefensaDigital", "CazadorLegal", "OriginalProtector", "ProtectorHonesto", "ValorOriginal", "GuardianContraPiratas", "CodigoProtegido", "HonestoDigital", "AntiPirateo", "ProtectorDeLegado", "DigitalDefensor", "DefensorDeArte", "CazaPirateria", "ProtectorDelCodigo", "LegalGuardian", "CazadorDeFalsos", "DefensorCreativo", "GuardianHonesto", "DigitalCazaFalsos", "ArteLegal", "ProtectorDelArte", "GuardianDelCodigo", "ProtectorDelValor", "HeroeDelArte", "CazaPirata", "GuardianDeProteccion", "DefensorOriginal", "ProtectorJusto", "LegalOriginal", "DigitalCazador", "ValorCreativo", "ProtectorContraPiratas", "GuardianDeHonestidad", "CodigoLegal", "DigitalHeroe", "ProtectorDelLegado", "CazaFalsificaciones", "OriginalDefender", "ProtectorDelOriginal", "LegalCazador", "DigitalGuardian", "ProtectorDeHonestidad", "CazaPiratasOriginal", "DefensorDeLegado", "GuardianLegal", "AntiPirateriaHeroe", "ProtectorContraFalsos", "CazadorDeOriginales", "ArteProtegido", "ProtectorDeCodigo", "GuardianDeValor", "LegalProtector", "DigitalValor", "OriginalCazador", "ProtectorDeFalsificaciones", "CazaOriginal", "HeroeCreativo", "GuardianContraFalsos", "ProtectorLegal", "DefensorHonesto", "ArteGuardian", "ProtectorDeHonesto", "CazadorDeCodigo", "ValorOriginalHeroe", "GuardianCreativo", "LegalHeroe", "ProtectorDeArteLegal", "DefensorDelOriginal", "CazaPirataOriginal", "ProtectorCreativoDigital", "GuardianDePirateria", "ProtectorDeAutenticidad"};
    private javax.swing.Timer timer; // Timer que actualiza la hora cada minuto(50000 ms)
    Server server = new Server();
    Client client = new Client();

    /**
     * Creates new form Principal
     */
    public Arquitecture() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALL = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        txtMin = new javax.swing.JLabel();
        Desliz = new javax.swing.JPanel();
        lbl_Version = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        txtURL = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtALERTA = new javax.swing.JTextArea();
        panelAll = new javax.swing.JPanel();
        txtMirar = new javax.swing.JLabel();
        scrollJugadores = new javax.swing.JScrollPane();
        panelJugadores = new javax.swing.JPanel();
        panelJuego = new javax.swing.JPanel();
        scrollComands = new javax.swing.JScrollPane();
        areaComands = new javax.swing.JTextArea();
        panelInicio = new javax.swing.JPanel();
        lblServer = new javax.swing.JLabel();
        lblClient = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        fieldIP = new javax.swing.JTextField();
        fieldUser = new javax.swing.JTextField();
        txtMask = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ALL.setPreferredSize(new java.awt.Dimension(1280, 720));
        ALL.setLayout(null);

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.setToolTipText("Minimiza QR");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setMaximumSize(new java.awt.Dimension(30, 30));
        btnClose.setOpaque(true);
        btnClose.setPreferredSize(new java.awt.Dimension(30, 30));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        ALL.add(btnClose);
        btnClose.setBounds(0, 0, 30, 30);

        txtMin.setBackground(new java.awt.Color(255, 255, 255));
        txtMin.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        txtMin.setForeground(new java.awt.Color(0, 0, 0));
        txtMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMin.setText("-");
        txtMin.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMin.setMaximumSize(new java.awt.Dimension(30, 30));
        txtMin.setMinimumSize(new java.awt.Dimension(30, 30));
        txtMin.setOpaque(true);
        txtMin.setPreferredSize(new java.awt.Dimension(30, 30));
        txtMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMinMouseExited(evt);
            }
        });
        ALL.add(txtMin);
        txtMin.setBounds(30, 0, 30, 30);

        Desliz.setBackground(new java.awt.Color(255, 255, 255));
        Desliz.setToolTipText("Mueve la ventana a la posicion deseada");
        Desliz.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Desliz.setMaximumSize(new java.awt.Dimension(1220, 30));
        Desliz.setMinimumSize(new java.awt.Dimension(1220, 30));
        Desliz.setPreferredSize(new java.awt.Dimension(1220, 30));
        Desliz.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DeslizMouseDragged(evt);
            }
        });
        Desliz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeslizMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeslizMousePressed(evt);
            }
        });
        Desliz.setLayout(null);

        lbl_Version.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        lbl_Version.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Version.setText("v1.0403.0950");
        lbl_Version.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        lbl_Version.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VersionMouseClicked(evt);
            }
        });
        Desliz.add(lbl_Version);
        lbl_Version.setBounds(10, 5, 70, 20);

        fieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        fieldCodigo.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        fieldCodigo.setForeground(new java.awt.Color(180, 180, 180));
        fieldCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldCodigo.setText("codigo");
        fieldCodigo.setBorder(null);
        fieldCodigo.setMinimumSize(new java.awt.Dimension(450, 30));
        fieldCodigo.setPreferredSize(new java.awt.Dimension(450, 30));
        fieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCodigoFocusLost(evt);
            }
        });
        fieldCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fieldCodigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldCodigoMouseExited(evt);
            }
        });
        fieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldCodigoKeyTyped(evt);
            }
        });
        Desliz.add(fieldCodigo);
        fieldCodigo.setBounds(100, 5, 100, 20);
        fieldCodigo.setVisible(false);

        txtURL.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtURL.setForeground(new java.awt.Color(0, 0, 0));
        Desliz.add(txtURL);
        txtURL.setBounds(210, 5, 150, 20);

        txtHora.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHora.setText("00:00");
        txtHora.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Desliz.add(txtHora);
        txtHora.setBounds(530, 0, 100, 30);

        txtDate.setFont(new java.awt.Font("Roboto", 3, 24)); // NOI18N
        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        txtDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDate.setText("Buen dia, fano");
        txtDate.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Desliz.add(txtDate);
        txtDate.setBounds(870, 0, 350, 29);

        ALL.add(Desliz);
        Desliz.setBounds(60, 0, 1220, 30);
        Desliz.getAccessibleContext().setAccessibleParent(Desliz);

        txtALERTA.setEditable(false);
        txtALERTA.setBackground(Acciones.transparente);
        txtALERTA.setColumns(20);
        txtALERTA.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        txtALERTA.setForeground(new java.awt.Color(70, 180, 0));
        txtALERTA.setRows(5);
        txtALERTA.setBorder(null);
        txtALERTA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtALERTA.setFocusable(false);
        txtALERTA.setOpaque(false);
        txtALERTA.setRequestFocusEnabled(false);
        ALL.add(txtALERTA);
        txtALERTA.setBounds(30, 250, 1220, 100);
        txtALERTA.setVisible(false);

        panelAll.setBackground(new java.awt.Color(247, 247, 247));
        panelAll.setLayout(null);

        txtMirar.setForeground(new java.awt.Color(0, 102, 204));
        txtMirar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMirar.setText("Ver Jugadores");
        txtMirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMirarMouseEntered(evt);
            }
        });
        panelAll.add(txtMirar);
        txtMirar.setBounds(1130, 0, 150, 16);
        txtMirar.setVisible(false);

        scrollJugadores.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"), 2, true), "Jugadores:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(80, 80, 80))); // NOI18N

        panelJugadores.setBackground(new java.awt.Color(247, 247, 247));
        panelJugadores.setMaximumSize(new java.awt.Dimension(450, 450));
        panelJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelJugadoresMouseExited(evt);
            }
        });
        panelJugadores.setLayout(new java.awt.GridLayout(0, 6, 5, 5));
        scrollJugadores.setViewportView(panelJugadores);

        panelAll.add(scrollJugadores);
        scrollJugadores.setBounds(0, 0, 1280, 90);
        scrollJugadores.setVisible(false);

        panelJuego.setBackground(new java.awt.Color(247, 247, 247));
        panelJuego.setLayout(null);
        panelAll.add(panelJuego);
        panelJuego.setBounds(0, 0, 1280, 690);
        panelJuego.setVisible(false);

        areaComands.setEditable(false);
        areaComands.setBackground(new java.awt.Color(18, 30, 49));
        areaComands.setColumns(20);
        areaComands.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        areaComands.setForeground(new java.awt.Color(255, 255, 255));
        areaComands.setRows(5);
        areaComands.setText("AQUI APARECERAN LOS ERRORES DEL SISTEMA.");
        scrollComands.setViewportView(areaComands);

        panelAll.add(scrollComands);
        scrollComands.setBounds(0, 0, 1280, 690);
        scrollComands.setVisible(false);

        panelInicio.setBackground(new java.awt.Color(247, 247, 247));
        panelInicio.setLayout(null);

        lblServer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServer.setText("lblServer");
        lblServer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblServerMouseClicked(evt);
            }
        });
        panelInicio.add(lblServer);
        lblServer.setBounds(250, 200, 256, 256);
        lblServer.setIcon(Acciones.iconServer);

        lblClient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClient.setText("lblClient");
        lblClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblClientFocusGained(evt);
            }
        });
        lblClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClientMouseExited(evt);
            }
        });
        lblClient.setIcon(Acciones.iconClient);
        panelInicio.add(lblClient);
        lblClient.setBounds(750, 200, 265, 256);

        lblInicio.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(0, 0, 0));
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setText("¿Como deseas Iniciar?");
        lblInicio.setFocusable(false);
        panelInicio.add(lblInicio);
        lblInicio.setBounds(440, 50, 400, 80);

        fieldIP.setBackground(new java.awt.Color(255, 255, 255));
        fieldIP.setFont(new java.awt.Font("Proxy 1", 1, 18)); // NOI18N
        fieldIP.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        fieldIP.setAlignmentX(1.0F);
        fieldIP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "IP del servidor:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(80, 80, 80))); // NOI18N
        fieldIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldIPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldIPFocusLost(evt);
            }
        });
        fieldIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fieldIPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldIPMouseExited(evt);
            }
        });
        fieldIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldIPKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldIPKeyReleased(evt);
            }
        });
        panelInicio.add(fieldIP);
        fieldIP.setBounds(740, 460, 290, 60);
        fieldIP.setVisible(false);

        fieldUser.setBackground(new java.awt.Color(255, 255, 255));
        fieldUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        fieldUser.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        fieldUser.setText("Fano");
        fieldUser.setAlignmentX(1.0F);
        fieldUser.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Tu identificador:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(80, 80, 80))); // NOI18N
        fieldUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldUserFocusLost(evt);
            }
        });
        fieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fieldUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldUserMouseExited(evt);
            }
        });
        fieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldUserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldUserKeyReleased(evt);
            }
        });
        panelInicio.add(fieldUser);
        fieldUser.setBounds(500, 130, 290, 60);

        panelAll.add(panelInicio);
        panelInicio.setBounds(0, 0, 1280, 690);

        ALL.add(panelAll);
        panelAll.setBounds(0, 30, 1280, 690);

        txtMask.setEditable(false);
        txtMask.setBackground(Acciones.opaco);
        txtMask.setColumns(20);
        txtMask.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        txtMask.setForeground(new java.awt.Color(70, 180, 0));
        txtMask.setRows(5);
        txtMask.setBorder(null);
        txtMask.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMask.setFocusable(false);
        txtMask.setOpaque(false);
        txtMask.setRequestFocusEnabled(false);
        ALL.add(txtMask);
        txtMask.setBounds(0, 30, 1280, 690);
        txtMask.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ALL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ALL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ALL.setFocusable(true);
        ALL.requestFocusInWindow();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        maxX = panelAll.getWidth();
        maxY = panelAll.getHeight();
        fieldUser.setText(nombres[Acciones.getRand(0, 100)]);
//        Acciones.addIcon(Acciones.rutaImg0, 100, 100, txtUSER);
        timer = new javax.swing.Timer(500, (java.awt.event.ActionEvent e) -> {
            String now = Acciones.timeDateString(true, null);
            txtHora.setText(now.substring(0, 5));
            int hora = Integer.parseInt(now.substring(0, 2));
            if (hora > 7 && hora < 12) {
                txtDate.setText("Buenos dias");
            } else if (hora >= 12 && hora <= 18) {
                txtDate.setText("Buenas tardes");
            } else if (hora > 18) {
                txtDate.setText("Buenas noches");
            } else {
                txtDate.setText("Duerme un ratito");
            }
//            txtUSER.setLocation(Acciones.getRand(0, maxX - 100), Acciones.getRand(0, maxY - 100));
            panelAll.revalidate();
            panelAll.repaint();
        });
        timer.start();
        timer.setDelay(50000);
//        java.util.ArrayList<String> data = Acciones.readFile(null);
//        if (data.isEmpty()) {
//            openConf();
//        } else {
//            if (!Acciones.isPort(data.get(0))) {
//                openConf();
//            }
//        }
//        serialReader.start();
        isInit = true;
    }

    private void openConf() {
        txtMask.setVisible(true);
//        Changes changes = new Changes(Arquitecture.this);
//        changes.setVisible(true);
        txtMask.setVisible(false);
    }

    private void DeslizMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_DeslizMousePressed

    private void DeslizMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse - 60, y - yMouse);
    }//GEN-LAST:event_DeslizMouseDragged

    private void DeslizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizMouseClicked
        switch (i) {
            case -1 -> { // Tamaño MAXIMO
                setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                h = getHeight();
                w = getWidth();
                setSize(w, h - 40);
                Desliz.setSize(w - 60, 30);
                panelAll.setSize(w, h - 70);
                txtMask.setSize(w, h - 70);
                i = 1;
            }
            case 0 -> { // Tamaño MAXIMO
                setSize(w, h - 40);
                Desliz.setSize(w - 60, 30);
                panelAll.setSize(w, h - 70);
                txtMask.setSize(w, h - 70);
                i++;
            }
            case 1 -> { // ANCHO pero bajo
                setSize(w, 720);
                panelAll.setSize(w, 690);
                txtMask.setSize(w, 690);
                i++;
            }
            case 2 -> { // ALTO pero angosto
                setSize(1280, h - 40);
                Desliz.setSize(1220, 30);
                panelAll.setSize(1280, h - 70);
                txtMask.setSize(1280, h - 70);
                i++;
            }
            case 3 -> { // Tamaño MINIMO
                setSize(1280, 720);
                panelAll.setSize(1280, 690);
                txtMask.setSize(1280, 690);
                i = 0;
            }
        }
        maxX = panelAll.getWidth();
        maxY = panelAll.getHeight();
//        textBienvenida.setLocation((maxX / 2 - 230), (maxY / 2 - 130));
    }//GEN-LAST:event_DeslizMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        server.stopServer();
        client.stopClient();
        this.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setBackground(Acciones.rojo);
        btnClose.setForeground(Acciones.blanco);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setBackground(Acciones.blanco);
        btnClose.setForeground(Acciones.negro);
    }//GEN-LAST:event_btnCloseMouseExited

    private void txtMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseClicked
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_txtMinMouseClicked

    private void txtMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseEntered
        txtMin.setBackground(Acciones.grisClaro);
        txtMin.setForeground(Acciones.negro);
    }//GEN-LAST:event_txtMinMouseEntered

    private void txtMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseExited
        txtMin.setBackground(Acciones.blanco);
        txtMin.setForeground(Acciones.negro);
    }//GEN-LAST:event_txtMinMouseExited

    private void lbl_VersionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VersionMouseClicked
        if (fieldCodigo.isVisible()) {
            fieldCodigo.setVisible(false);
        } else {
            fieldCodigo.setVisible(true);
        }
    }//GEN-LAST:event_lbl_VersionMouseClicked

    private void fieldCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCodigoFocusGained
//        fieldClave_Codigo.setBorder(Acciones.bordeLineaAzul);
    }//GEN-LAST:event_fieldCodigoFocusGained

    private void fieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCodigoFocusLost
        fieldCodigo.setText("codigo");
        fieldCodigo.setForeground(Acciones.grisDisable);
    }//GEN-LAST:event_fieldCodigoFocusLost

    private void fieldCodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldCodigoMouseEntered
//        fieldClave_Codigo.setBorder(Acciones.bordeLineaNegra);
    }//GEN-LAST:event_fieldCodigoMouseEntered

    private void fieldCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldCodigoMouseExited
//        Acciones.ratonSale(fieldClave_Codigo);
    }//GEN-LAST:event_fieldCodigoMouseExited

    private void fieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCodigoKeyPressed
        if (fieldCodigo.getText().equals("codigo")) {
            fieldCodigo.setForeground(Acciones.negro);
            fieldCodigo.setText("");
        }
    }//GEN-LAST:event_fieldCodigoKeyPressed

    private void fieldCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCodigoKeyReleased
        String code = fieldCodigo.getText();
        if (code.isEmpty()) {
            fieldCodigo.setText("codigo");
            fieldCodigo.setForeground(Acciones.grisDisable);
        } else if (evt.getKeyCode() == 32) {
            fieldCodigo.setText("codigo");
            fieldCodigo.setForeground(Acciones.grisDisable);
            switch (code) {
                case ".conf" ->
                    openConf();
                case ".code" ->
                    scrollComands.setVisible(true);
                case ".exit" ->
                    scrollComands.setVisible(false);
                case ".scktServer" -> {
                    server.startServer();
                    fieldCodigo.setText(".scktServerEnd");
                }
                case ".scktServerEnd" ->
                    server.stopServer();
                case ".scktClient" -> {
                    client.startClient(javax.swing.JOptionPane.showInputDialog(null, "En caso de tener la IP\nescribela a continuación:", "", 3), "Maquina de guerra");
                    fieldCodigo.setText(".scktClientEnd");
                }
                case ".scktClientEnd" ->
                    client.stopClient();
                case ".wrtURL" ->
                    txtURL.setText(server.getServerIP() + ":" + Server.getPORT());
                case ".wrtDate" ->
                    txtDate.setText("Hola mundo.");
                default ->
                    Acciones.mostrarTextoTemporal("Comando no valido", 2500, Acciones.rojo);
            }
        }
    }//GEN-LAST:event_fieldCodigoKeyReleased

    private void fieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCodigoKeyTyped
        if (!Acciones.isCharacterPrivilegios(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldCodigoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        server.stopServer();
        client.stopClient();
    }//GEN-LAST:event_formWindowClosing

    private void lblServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblServerMouseClicked
        server.startServer();
        panelInicio.setVisible(false);
        txtURL.setText(server.getServerIP() + ":" + Server.getPORT());
        txtMirar.setVisible(true);
    }//GEN-LAST:event_lblServerMouseClicked

    private void lblClientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblClientFocusGained
        fieldIP.setVisible(true);
        fieldIP.requestFocus();
    }//GEN-LAST:event_lblClientFocusGained

    private void lblClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientMouseClicked
        String direccion = fieldIP.getText();
        client.startClient(Acciones.isValidIPAddress(direccion) ? direccion : "", fieldUser.getText());
    }//GEN-LAST:event_lblClientMouseClicked

    private void lblClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientMouseEntered
        fieldIP.setVisible(true);
        fieldIP.requestFocus();
    }//GEN-LAST:event_lblClientMouseEntered

    private void lblClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientMouseExited
        fieldIP.setVisible(false);
    }//GEN-LAST:event_lblClientMouseExited

    private void fieldIPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldIPFocusGained
        fieldIP.setBorder(Acciones.focusGained("IP del servidor:"));
    }//GEN-LAST:event_fieldIPFocusGained

    private void fieldIPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldIPFocusLost
        fieldIP.setBorder(Acciones.focusLost("IP del servidor:"));
    }//GEN-LAST:event_fieldIPFocusLost

    private void fieldIPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldIPMouseEntered
        fieldIP.setBorder(Acciones.mouseEntered("IP del servidor:"));
    }//GEN-LAST:event_fieldIPMouseEntered

    private void fieldIPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldIPMouseExited
        fieldIP.setBorder(Acciones.mouseExited(fieldIP.isFocusOwner(), "IP del servidor:"));
    }//GEN-LAST:event_fieldIPMouseExited

    private void fieldIPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIPKeyPressed
//        if (fieldUser.getText().equals("username")) {
//            fieldUser.setForeground(Acciones.negro);
//            fieldUser.setText("");
//        }
    }//GEN-LAST:event_fieldIPKeyPressed

    private void fieldIPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldIPKeyReleased
        String direccion = fieldIP.getText();
        fieldIP.setForeground(Acciones.isValidIPAddress(direccion) ? Acciones.verde : Acciones.rojo);
    }//GEN-LAST:event_fieldIPKeyReleased

    private void fieldUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldUserFocusGained
        fieldUser.setBorder(Acciones.focusGained("Tu identificador:"));
    }//GEN-LAST:event_fieldUserFocusGained

    private void fieldUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldUserFocusLost
        fieldUser.setBorder(Acciones.focusLost("Tu identificador:"));
    }//GEN-LAST:event_fieldUserFocusLost

    private void fieldUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldUserMouseEntered
        fieldUser.setBorder(Acciones.mouseEntered("Tu identificador:"));
    }//GEN-LAST:event_fieldUserMouseEntered

    private void fieldUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldUserMouseExited
        fieldUser.setBorder(Acciones.mouseExited(fieldUser.isFocusOwner(), "Tu identificador:"));
    }//GEN-LAST:event_fieldUserMouseExited

    private void fieldUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUserKeyPressed

    private void fieldUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUserKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUserKeyReleased

    private void txtMirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMirarMouseEntered
        scrollJugadores.setVisible(true);
    }//GEN-LAST:event_txtMirarMouseEntered

    private void panelJugadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJugadoresMouseExited
        scrollJugadores.setVisible(false);
    }//GEN-LAST:event_panelJugadoresMouseExited

    public static void showInfo(String text) {
        String time = Acciones.timeDateString(true, null);
        String delimitador = "-> " + time + "|-------------------------------------------------->-------------------------------------------------->\n";
        if (isInit) {
            String txt = areaComands.getText() + "\n" + delimitador + text;
            areaComands.setText(txt);
        } else {
//            isInit = true;
            areaComands.setText(delimitador + text);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arquitecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Arquitecture().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALL;
    private javax.swing.JPanel Desliz;
    protected static javax.swing.JTextArea areaComands;
    private javax.swing.JLabel btnClose;
    protected static javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldIP;
    private javax.swing.JTextField fieldUser;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblServer;
    private javax.swing.JLabel lbl_Version;
    private javax.swing.JPanel panelAll;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JPanel panelJugadores;
    public static javax.swing.JScrollPane scrollComands;
    private javax.swing.JScrollPane scrollJugadores;
    protected static javax.swing.JTextArea txtALERTA;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtHora;
    public static javax.swing.JTextArea txtMask;
    private javax.swing.JLabel txtMin;
    private javax.swing.JLabel txtMirar;
    private javax.swing.JLabel txtURL;
    // End of variables declaration//GEN-END:variables
}
