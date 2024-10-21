package tst;

import zamain.Acciones;
import java.awt.Color;
import javax.swing.DefaultListModel;
import zores.DiagnosticoColor;
import zores.ProgressUpdater;

/**
 *
 * @author Fano
 */
public class CreatorZores extends javax.swing.JFrame {

    private static boolean isInit = false;
    private int xMouse, yMouse, w, h, i = -1, maxX, maxY, r = 255, g = 255, b = 255, fR = 0, fG = 0, fB = 0;
    private boolean list1 = false, list2 = true, list3 = false;
    private javax.swing.Timer timer; // Timer que actualiza la hora cada minuto(50000 ms)
    DefaultListModel<String> listSettingsModel = new DefaultListModel<>();

    /**
     * Creates new form Principal
     */
    public CreatorZores() {
        initComponents();
        init();
        listSettings.setModel(listSettingsModel);
        listSettingsModel.addElement("Nuevo Color");
        listSettingsModel.addElement("Color en pantalla=No");
        listSettingsModel.addElement("Blanco en pantalla=Si");
        listSettingsModel.addElement("Color en sliders=No");
        setColorOnLBL();
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
        panelAll = new javax.swing.JPanel();
        panelJuego = new javax.swing.JPanel();
        txtSettings = new javax.swing.JLabel();
        scrollSettings = new javax.swing.JScrollPane();
        listSettings = new javax.swing.JList<>();
        lblColorGet = new javax.swing.JLabel();
        lblColorSet = new javax.swing.JLabel();
        sliderR = new javax.swing.JSlider();
        sliderG = new javax.swing.JSlider();
        sliderB = new javax.swing.JSlider();
        spinnerR = new javax.swing.JSpinner();
        spinnerG = new javax.swing.JSpinner();
        spinnerB = new javax.swing.JSpinner();
        btnEntrar = new javax.swing.JButton();
        paneResultados = new javax.swing.JTextPane();
        progressResultado = new javax.swing.JProgressBar();
        scrollComands = new javax.swing.JScrollPane();
        areaComands = new javax.swing.JTextArea();
        txtALERTA = new javax.swing.JTextArea();
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

        panelAll.setBackground(new java.awt.Color(247, 247, 247));
        panelAll.setLayout(null);

        panelJuego.setBackground(new java.awt.Color(247, 247, 247));
        panelJuego.setLayout(null);

        txtSettings.setForeground(new java.awt.Color(0, 102, 204));
        txtSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSettings.setText("Ajustes");
        txtSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSettingsMouseEntered(evt);
            }
        });
        panelJuego.add(txtSettings);
        txtSettings.setBounds(1100, 0, 100, 16);

        scrollSettings.setBorder(null);

        listSettings.setBackground(new Color(0,0,0,0));
        listSettings.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        listSettings.setForeground(new java.awt.Color(0, 0, 0));
        listSettings.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSettings.setToolTipText("Click para modificar");
        listSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listSettingsMouseExited(evt);
            }
        });
        listSettings.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSettingsValueChanged(evt);
            }
        });
        scrollSettings.setViewportView(listSettings);

        panelJuego.add(scrollSettings);
        scrollSettings.setBounds(1100, 20, 150, 128);
        scrollSettings.setVisible(false);

        lblColorGet.setBackground(new java.awt.Color(0, 0, 0));
        lblColorGet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColorGet.setText("lblColor");
        lblColorGet.setOpaque(true);
        panelJuego.add(lblColorGet);
        lblColorGet.setBounds(100, 100, 150, 150);

        lblColorSet.setBackground(new java.awt.Color(255, 255, 255));
        lblColorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColorSet.setText("lblColor");
        lblColorSet.setOpaque(true);
        panelJuego.add(lblColorSet);
        lblColorSet.setBounds(700, 100, 150, 150);

        sliderR.setMaximum(255);
        sliderR.setPaintLabels(true);
        sliderR.setToolTipText("Red");
        sliderR.setValue(255);
        sliderR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Color en R", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(80, 80, 80))); // NOI18N
        sliderR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRStateChanged(evt);
            }
        });
        panelJuego.add(sliderR);
        sliderR.setBounds(350, 300, 850, 43);

        sliderG.setMaximum(255);
        sliderG.setPaintLabels(true);
        sliderG.setToolTipText("Green");
        sliderG.setValue(255);
        sliderG.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Color en G", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(80, 80, 80))); // NOI18N
        sliderG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGStateChanged(evt);
            }
        });
        panelJuego.add(sliderG);
        sliderG.setBounds(350, 350, 850, 43);

        sliderB.setMaximum(255);
        sliderB.setPaintLabels(true);
        sliderB.setToolTipText("Blue");
        sliderB.setValue(255);
        sliderB.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Color en B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(80, 80, 80))); // NOI18N
        sliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBStateChanged(evt);
            }
        });
        panelJuego.add(sliderB);
        sliderB.setBounds(350, 400, 850, 43);

        spinnerR.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        spinnerR.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinnerR.setToolTipText("Descomposición en R");
        spinnerR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "R", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(80, 80, 80))); // NOI18N
        spinnerR.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        spinnerR.setOpaque(true);
        spinnerR.setValue(255);
        spinnerR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerRStateChanged(evt);
            }
        });
        spinnerR.setBackground(Acciones.blanco);
        spinnerR.setForeground(Acciones.negro);
        panelJuego.add(spinnerR);
        spinnerR.setBounds(1210, 300, 71, 50);

        spinnerG.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        spinnerG.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinnerG.setToolTipText("Descomposición en G");
        spinnerG.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "G", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(80, 80, 80))); // NOI18N
        spinnerG.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        spinnerG.setOpaque(true);
        spinnerG.setValue(255);
        spinnerG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerGStateChanged(evt);
            }
        });
        spinnerG.setBackground(Acciones.blanco);
        spinnerG.setForeground(Acciones.negro);
        panelJuego.add(spinnerG);
        spinnerG.setBounds(1210, 350, 71, 50);

        spinnerB.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        spinnerB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinnerB.setToolTipText("Descomposición en B");
        spinnerB.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "B", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(80, 80, 80))); // NOI18N
        spinnerB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        spinnerB.setOpaque(true);
        spinnerB.setValue(255);
        spinnerB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerBStateChanged(evt);
            }
        });
        spinnerB.setBackground(Acciones.blanco);
        spinnerB.setForeground(Acciones.negro);
        panelJuego.add(spinnerB);
        spinnerB.setBounds(1210, 400, 71, 50);

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 0, 0));
        btnEntrar.setText("CALCULAR");
        btnEntrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusable(false);
        btnEntrar.setOpaque(true);
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
        panelJuego.add(btnEntrar);
        btnEntrar.setBounds(20, 590, 200, 40);

        paneResultados.setEditable(false);
        paneResultados.setBackground(new java.awt.Color(247, 247, 247));
        paneResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 184, 16), 5, true), "Diagnóstico basado en la comparación de colores.", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(80, 80, 80))); // NOI18N
        paneResultados.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        paneResultados.setForeground(new java.awt.Color(0, 0, 0));
        paneResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paneResultadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paneResultadosMouseExited(evt);
            }
        });
        paneResultados.setVisible(false);
        panelJuego.add(paneResultados);
        paneResultados.setBounds(220, 470, 1050, 180);

        progressResultado.setForeground(new java.awt.Color(75, 135, 200));
        progressResultado.setBorderPainted(false);
        progressResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        progressResultado.setOpaque(true);
        panelJuego.add(progressResultado);
        progressResultado.setBounds(0, 654, 1280, 30);

        panelAll.add(panelJuego);
        panelJuego.setBounds(0, 0, 1280, 690);

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

        ALL.add(panelAll);
        panelAll.setBounds(0, 30, 1280, 690);

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
        txtALERTA.setBounds(30, 450, 1220, 100);
        txtALERTA.setVisible(false);

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
            panelAll.revalidate();
            panelAll.repaint();
        });
        timer.start();
        timer.setDelay(50000);
        isInit = true;
    }

    private void openConf() {
        txtMask.setVisible(true);
//        Changes changes = new Changes(CreatorZores.this);
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
//        server.stopServer();
//        client.stopClient();
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
                    //server.startServer();
                    fieldCodigo.setText(".scktServerEnd");
                }
                case ".scktServerEnd" -> {
                }
                //server.stopServer();
                case ".scktClient" -> {
                    //client.startClient(javax.swing.JOptionPane.showInputDialog(null, "En caso de tener la IP\nescribela a continuación:", "", 3), "Maquina de guerra");
                    fieldCodigo.setText(".scktClientEnd");
                }
                case ".scktClientEnd" -> {
                }
                //client.stopClient();
                case ".wrtURL" ->
                    txtURL.setText("");//server.getServerIP()+ ":" + Server.getPORT());
                case ".wrtDate" ->
                    txtDate.setText("Hola mundo.");
                default ->
                    zamain.Acciones.mostrarTextoTemporal("Comando no valido", 2500, Acciones.rojo);
            }
        }
    }//GEN-LAST:event_fieldCodigoKeyReleased

    private void fieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCodigoKeyTyped
        if (!zamain.Acciones.isCharacterPrivilegios(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldCodigoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//        server.stopServer();
//        client.stopClient();
    }//GEN-LAST:event_formWindowClosing

    private void sliderRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRStateChanged
        setColorComponent('R', sliderR.getValue(), true);
    }//GEN-LAST:event_sliderRStateChanged

    private void spinnerRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerRStateChanged
        setColorComponent('R', (int) spinnerR.getValue(), false);
    }//GEN-LAST:event_spinnerRStateChanged

    private void sliderGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGStateChanged
        setColorComponent('G', sliderG.getValue(), true);
    }//GEN-LAST:event_sliderGStateChanged

    private void spinnerGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerGStateChanged
        setColorComponent('G', (int) spinnerG.getValue(), false);
    }//GEN-LAST:event_spinnerGStateChanged

    private void sliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBStateChanged
        setColorComponent('B', sliderB.getValue(), true);
    }//GEN-LAST:event_sliderBStateChanged

    private void spinnerBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerBStateChanged
        setColorComponent('B', (int) spinnerB.getValue(), false);
    }//GEN-LAST:event_spinnerBStateChanged

    private void setColorComponent(char ColorComponent, int Value, boolean IsFromSlider) {
        if (ColorComponent == 'R' && Value != r) {
            r = Value;
            sliderR.setBackground(new Color(r, 0, 0));
        } else if (ColorComponent == 'G' && Value != g) {
            g = Value;
            sliderG.setBackground(new Color(0, g, 0));
        } else if (ColorComponent == 'B' && Value != b) {
            b = Value;
            sliderB.setBackground(new Color(0, 0, b));
        } else {
            return; // No cambia si el valor es el mismo
        }

        changeColor(r, g, b);

        if (IsFromSlider) {
            switch (ColorComponent) {
                case 'R' ->
                    spinnerR.setValue(r);
                case 'G' ->
                    spinnerG.setValue(g);
                case 'B' ->
                    spinnerB.setValue(b);
            }
        } else {
            switch (ColorComponent) {
                case 'R' ->
                    sliderR.setValue(r);
                case 'G' ->
                    sliderG.setValue(g);
                case 'B' ->
                    sliderB.setValue(b);
            }
        }
    }

    private void txtSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSettingsMouseEntered
        scrollSettings.setVisible(true);
    }//GEN-LAST:event_txtSettingsMouseEntered

    private void listSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSettingsMouseExited
        scrollSettings.setVisible(false);
    }//GEN-LAST:event_listSettingsMouseExited

    private void listSettingsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSettingsValueChanged
        int index = listSettings.getSelectedIndex();
        if (!evt.getValueIsAdjusting() && index > -1) {
            scrollSettings.setVisible(false);
            String setting = listSettingsModel.getElementAt(index);
            System.out.println(index + " -> " + setting);
            switch (index) {
                case 0 ->
                    setColorOnLBL();
                case 1 -> {
                    listSettingsModel.setElementAt(setting.substring(0, setting.length() - 2) + (list1 ? "No" : "Si"), index);
                    list1 = !list1;
                }
                case 2 -> {
                    listSettingsModel.setElementAt(setting.substring(0, setting.length() - 2) + (list2 ? "No" : "Si"), index);
                    list2 = !list2;
                }
                case 3 -> {
                    listSettingsModel.setElementAt(setting.substring(0, setting.length() - 2) + (list3 ? "No" : "Si"), index);
                    list3 = !list3;
                    sliderR.setOpaque(list3);
                    sliderG.setOpaque(list3);
                    sliderB.setOpaque(list3);
                }
                default ->
                    System.out.println("No se encuentra este index");
            }
            listSettings.clearSelection();
        }
    }//GEN-LAST:event_listSettingsValueChanged

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        btnEntrar.setBackground(Acciones.azulClaro);
        paneResultados.setVisible(true);
        paneResultados.setText(DiagnosticoColor.diagnosticar(fR, fG, fB, r, g, b));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        btnEntrar.setBackground(Acciones.blanco);
        paneResultados.setVisible(false);
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        calcularSimilitud();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void paneResultadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneResultadosMouseEntered
        paneResultados.setVisible(true);
    }//GEN-LAST:event_paneResultadosMouseEntered

    private void paneResultadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneResultadosMouseExited
        paneResultados.setVisible(false);
    }//GEN-LAST:event_paneResultadosMouseExited

    private void changeColor(int R, int G, int B) {
        lblColorSet.setBackground(new Color(R, G, B));
        if (list1) {
            panelJuego.setBackground(new Color(R, G, B));
        } else if (list2) {
            panelJuego.setBackground(new Color(255, 255, 255));
        }
    }

    private void setColorOnLBL() {
        fR = Acciones.getRand(0, 255);
        fG = Acciones.getRand(0, 255);
        fB = Acciones.getRand(0, 255);
        lblColorGet.setBackground(new Color(fR, fG, fB));
    }

    private void calcularSimilitud() {
        progressResultado.setValue(0);
        double distancia = Math.sqrt(Math.pow(fR - r, 2) + Math.pow(fG - g, 2) + Math.pow(fB - b, 2));
        double distanciaMaxima = Math.sqrt(Math.pow(255, 2) * 3);
        double resultado = 100 * (1 - (distancia / distanciaMaxima));
//        ColorSimilarityUpdater updater = new ColorSimilarityUpdater(progressResultado);
//        updater.calcularSimilitud(fR, fG, fB, r, g, b); // Manera 2 de actualizar ProgressBar (No funciona)
        ProgressUpdater updater = new ProgressUpdater(progressResultado, resultado);
        updater.execute(); // Manera 1 de actualizar ProgressBar
    }

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
            java.util.logging.Logger.getLogger(CreatorZores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreatorZores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALL;
    private javax.swing.JPanel Desliz;
    protected static javax.swing.JTextArea areaComands;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnEntrar;
    protected static javax.swing.JTextField fieldCodigo;
    private javax.swing.JLabel lblColorGet;
    private javax.swing.JLabel lblColorSet;
    private javax.swing.JLabel lbl_Version;
    private javax.swing.JList<String> listSettings;
    private javax.swing.JTextPane paneResultados;
    private javax.swing.JPanel panelAll;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JProgressBar progressResultado;
    public static javax.swing.JScrollPane scrollComands;
    private javax.swing.JScrollPane scrollSettings;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSlider sliderG;
    private javax.swing.JSlider sliderR;
    private javax.swing.JSpinner spinnerB;
    private javax.swing.JSpinner spinnerG;
    private javax.swing.JSpinner spinnerR;
    protected static javax.swing.JTextArea txtALERTA;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtHora;
    public static javax.swing.JTextArea txtMask;
    private javax.swing.JLabel txtMin;
    private javax.swing.JLabel txtSettings;
    private javax.swing.JLabel txtURL;
    // End of variables declaration//GEN-END:variables
}
