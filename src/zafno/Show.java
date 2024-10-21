package zafno;

import javax.swing.ToolTipManager;
import zamain.Acciones;
import zamain.Creator;

/**
 *
 * @author Fanos
 */
public class Show extends javax.swing.JDialog {

    private final Creator padre;
    private int xMouse, yMouse;
    private final int ID_Turn;
//    private final double CantIni, CantVend;
//    private final ArrayList<Object> lista;

    /**
     * Creates new form Principal
     *
     * @param Padre
     * @param ID_TurnoPend
     */
    public Show(Creator Padre, int ID_TurnoPend) {
        super(Padre, "Elección", true);
        this.padre = Padre;
        this.ID_Turn = ID_TurnoPend;
        initComponents();
        ToolTipManager.sharedInstance().setInitialDelay(0);
//        lista = CConexion.findTurnoPendiente(ID_Turn);
//        Ingreso.showInfo(lista.toString());
//        CantIni = (double) lista.get(0);
//        CantVend = (double) lista.get(1);
//        txt_$_Ini.setText("Iniciaste con $" + Acciones.formatAsPrice(CantIni));
//        txt_$_Gan.setText("Vendiste $" + Acciones.formatAsPrice(CantVend));
//        txt_$_Tot.setText("Entregas $" + Acciones.formatAsPrice((CantIni + CantVend)));
//        txt_Initial.setText("Hay un turno del " + (String) lista.get(4) + " a las " + (String) lista.get(3) + ", ¿Como deseas proceder?");
//        areaDescrip.setText((String) lista.get(2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALL = new javax.swing.JPanel();
        Desliz = new javax.swing.JPanel();
        txt_Initial = new javax.swing.JLabel();
        scrollDescrip = new javax.swing.JScrollPane();
        areaDescrip = new javax.swing.JTextArea();
        lbl_TurnOff = new javax.swing.JLabel();
        txt_$_Ini = new javax.swing.JLabel();
        txt_$_Gan = new javax.swing.JLabel();
        txt_$_Tot = new javax.swing.JLabel();
        btnCont = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        ALL.setBackground(new java.awt.Color(247, 247, 247));
        ALL.setMinimumSize(new java.awt.Dimension(610, 377));
        ALL.setPreferredSize(new java.awt.Dimension(800, 600));
        ALL.setLayout(null);

        Desliz.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout DeslizLayout = new javax.swing.GroupLayout(Desliz);
        Desliz.setLayout(DeslizLayout);
        DeslizLayout.setHorizontalGroup(
            DeslizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        DeslizLayout.setVerticalGroup(
            DeslizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        ALL.add(Desliz);
        Desliz.setBounds(0, 0, 610, 30);

        txt_Initial.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txt_Initial.setForeground(new java.awt.Color(0, 0, 0));
        txt_Initial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Initial.setText("Hay un turno pendiente, ¿Como deseas proceder?");
        ALL.add(txt_Initial);
        txt_Initial.setBounds(0, 30, 610, 30);

        scrollDescrip.setBackground(new java.awt.Color(255, 255, 255));
        scrollDescrip.setForeground(new java.awt.Color(0, 0, 0));

        areaDescrip.setColumns(20);
        areaDescrip.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        areaDescrip.setRows(5);
        areaDescrip.setText("Cerrar Turno :: Finalizas el dia y entregas cuentas.\n\nGuardar Turno :: Cierras sesión para\n\tcontinuar en otro momento.");
        areaDescrip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaDescripKeyPressed(evt);
            }
        });
        scrollDescrip.setViewportView(areaDescrip);

        ALL.add(scrollDescrip);
        scrollDescrip.setBounds(30, 70, 350, 110);

        lbl_TurnOff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TurnOff.setIcon(null/**Acciones.iconTurnOff**/);
        lbl_TurnOff.setText("lbl_TurnOff");
        ALL.add(lbl_TurnOff);
        lbl_TurnOff.setBounds(430, 70, 130, 130);

        txt_$_Ini.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txt_$_Ini.setForeground(new java.awt.Color(0, 0, 0));
        txt_$_Ini.setText("--------------------------------");
        ALL.add(txt_$_Ini);
        txt_$_Ini.setBounds(30, 200, 260, 30);

        txt_$_Gan.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txt_$_Gan.setForeground(new java.awt.Color(0, 0, 0));
        txt_$_Gan.setText("--------------------------------");
        ALL.add(txt_$_Gan);
        txt_$_Gan.setBounds(30, 230, 260, 30);

        txt_$_Tot.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txt_$_Tot.setForeground(new java.awt.Color(0, 0, 0));
        txt_$_Tot.setText("--------------------------------");
        ALL.add(txt_$_Tot);
        txt_$_Tot.setBounds(30, 260, 260, 30);

        btnCont.setBackground(new java.awt.Color(255, 255, 255));
        btnCont.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnCont.setForeground(new java.awt.Color(0, 0, 0));
        btnCont.setIcon(Acciones.iconF1);
        btnCont.setText("Continuar Turno");
        btnCont.setBorder(null);
        btnCont.setContentAreaFilled(false);
        btnCont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCont.setFocusable(false);
        btnCont.setOpaque(true);
        btnCont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContMouseExited(evt);
            }
        });
        btnCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContActionPerformed(evt);
            }
        });
        ALL.add(btnCont);
        btnCont.setBounds(30, 320, 250, 30);

        btnNew.setBackground(new java.awt.Color(255, 255, 255));
        btnNew.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 0, 0));
        btnNew.setIcon(Acciones.iconF2);
        btnNew.setText("Nuevo Turno");
        btnNew.setBorder(null);
        btnNew.setContentAreaFilled(false);
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.setFocusable(false);
        btnNew.setOpaque(true);
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        ALL.add(btnNew);
        btnNew.setBounds(330, 320, 250, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ALL, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ALL, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeslizMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_DeslizMousePressed

    private void DeslizMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_DeslizMouseDragged

    private void DeslizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeslizMouseClicked

    }//GEN-LAST:event_DeslizMouseClicked

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        btnNew.setBackground(Acciones.azulClaro);
    }//GEN-LAST:event_btnNewMouseEntered

    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
        btnNew.setBackground(Acciones.blanco);
    }//GEN-LAST:event_btnNewMouseExited

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        f2();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnContMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContMouseEntered
        btnCont.setBackground(Acciones.azulClaro);
    }//GEN-LAST:event_btnContMouseEntered

    private void btnContMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContMouseExited
        btnCont.setBackground(Acciones.blanco);
    }//GEN-LAST:event_btnContMouseExited

    private void btnContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContActionPerformed
        f1();
    }//GEN-LAST:event_btnContActionPerformed

    private void f1() {
//        Acciones.dayOfTurn = Integer.parseInt((lista.get(4) + "").substring(8, 10));
//        Acciones.setVentasInicio(CantIni);
//        Acciones.setVentasTotales(CantVend);
        this.dispose();
    }

    private void f2() {
//        Acciones.dayOfTurn = Integer.parseInt(Acciones.timeDateString(false).substring(8, 10));
//        CConexion.forzeCloseTurn(ID_Turn);
//        CConexion.newTurn(Acciones.id_EMPLEADO, Acciones.getVentasInicio());
        this.dispose();
    }

    private void areaDescripKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaDescripKeyPressed
        switch (evt.getKeyCode()) {
            case 112 ->
                f1();
            case 113 ->
                f2();
        }
    }//GEN-LAST:event_areaDescripKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALL;
    private javax.swing.JPanel Desliz;
    private javax.swing.JTextArea areaDescrip;
    private javax.swing.JButton btnCont;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel lbl_TurnOff;
    private javax.swing.JScrollPane scrollDescrip;
    private javax.swing.JLabel txt_$_Gan;
    private javax.swing.JLabel txt_$_Ini;
    private javax.swing.JLabel txt_$_Tot;
    private javax.swing.JLabel txt_Initial;
    // End of variables declaration//GEN-END:variables
}
