package zores;

import java.awt.Color;
import zamain.Acciones;
import javax.swing.DefaultListModel;

/**
 *
 * @author Leonardo_Stefano_Tapia_Diaz
 */
public class Comparador extends javax.swing.JPanel {

    private int r = 255, g = 255, b = 255, fR = 0, fG = 0, fB = 0;
    private boolean list1 = false, list2 = true, list3 = false;
    DefaultListModel<String> listSettingsModel = new DefaultListModel<>();

    /**
     * Creates new form Comparador
     */
    public Comparador() {
        initComponents();
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

        setBackground(new java.awt.Color(247, 247, 247));
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });
        setLayout(null);

        txtSettings.setForeground(new java.awt.Color(0, 102, 204));
        txtSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSettings.setText("Ajustes");
        txtSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSettingsMouseEntered(evt);
            }
        });
        add(txtSettings);
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

        add(scrollSettings);
        scrollSettings.setBounds(1100, 20, 150, 128);
        scrollSettings.setVisible(false);

        lblColorGet.setBackground(new java.awt.Color(0, 0, 0));
        lblColorGet.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblColorGet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColorGet.setText("Color a encontrar");
        lblColorGet.setOpaque(true);
        add(lblColorGet);
        lblColorGet.setBounds(100, 100, 150, 150);

        lblColorSet.setBackground(new java.awt.Color(255, 255, 255));
        lblColorSet.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblColorSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColorSet.setText("Color calculado");
        lblColorSet.setOpaque(true);
        add(lblColorSet);
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
        add(sliderR);
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
        add(sliderG);
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
        add(sliderB);
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
        add(spinnerR);
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
        add(spinnerG);
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
        add(spinnerB);
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
        add(btnEntrar);
        btnEntrar.setBounds(20, 590, 200, 40);

        paneResultados.setEditable(false);
        paneResultados.setBackground(new java.awt.Color(247, 247, 247));
        paneResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 184, 16), 5, true), "Diagnóstico basado en la comparación de colores.", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(80, 80, 80))); // NOI18N
        paneResultados.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        paneResultados.setForeground(new java.awt.Color(0, 0, 0));
        paneResultados.setFocusable(false);
        paneResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paneResultadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paneResultadosMouseExited(evt);
            }
        });
        paneResultados.setVisible(false);
        add(paneResultados);
        paneResultados.setBounds(220, 470, 1050, 180);

        progressResultado.setForeground(new java.awt.Color(75, 135, 200));
        progressResultado.setBorderPainted(false);
        progressResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        progressResultado.setOpaque(true);
        add(progressResultado);
        progressResultado.setBounds(0, 654, 1280, 30);
    }// </editor-fold>//GEN-END:initComponents

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

    private void sliderRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRStateChanged
        setColorComponent('R', sliderR.getValue(), true);
    }//GEN-LAST:event_sliderRStateChanged

    private void sliderGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGStateChanged
        setColorComponent('G', sliderG.getValue(), true);
    }//GEN-LAST:event_sliderGStateChanged

    private void sliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBStateChanged
        setColorComponent('B', sliderB.getValue(), true);
    }//GEN-LAST:event_sliderBStateChanged

    private void spinnerRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerRStateChanged
        setColorComponent('R', (int) spinnerR.getValue(), false);
    }//GEN-LAST:event_spinnerRStateChanged

    private void spinnerGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerGStateChanged
        setColorComponent('G', (int) spinnerG.getValue(), false);
    }//GEN-LAST:event_spinnerGStateChanged

    private void spinnerBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerBStateChanged
        setColorComponent('B', (int) spinnerB.getValue(), false);
    }//GEN-LAST:event_spinnerBStateChanged

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

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        System.out.println(evt.toString());
    }//GEN-LAST:event_formAncestorResized

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

    private void changeColor(int R, int G, int B) {
        lblColorSet.setBackground(new Color(R, G, B));
        if (list1) {
            this.setBackground(new Color(R, G, B));
        } else if (list2) {
            this.setBackground(new Color(255, 255, 255));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblColorGet;
    private javax.swing.JLabel lblColorSet;
    private javax.swing.JList<String> listSettings;
    private javax.swing.JTextPane paneResultados;
    private javax.swing.JProgressBar progressResultado;
    private javax.swing.JScrollPane scrollSettings;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSlider sliderG;
    private javax.swing.JSlider sliderR;
    private javax.swing.JSpinner spinnerB;
    private javax.swing.JSpinner spinnerG;
    private javax.swing.JSpinner spinnerR;
    private javax.swing.JLabel txtSettings;
    // End of variables declaration//GEN-END:variables
}
