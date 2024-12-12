package zafno;

import javax.swing.ToolTipManager;
import zamain.Acciones;
import zamain.Creator;

/**
 *
 * @author Fanos
 */
public class Show extends javax.swing.JDialog {

    private int xMouse, yMouse, suma = 0;
    private final short[] points = {8, 4, 5, 2, 10, 7, 1, 10, 8, 6, 9, 5, 3, 10, 2, 6, 8, 5, 9, 3, 5, 4, 9, 4, 3, 6, 2, 3, 7, 1};
    private final Tableros Padre;

    /**
     * Creates new form Principal
     *
     * @param Modal
     * @param Padre
     */
    public Show(Creator Modal, Tableros Padre) {
        super(Modal, "Elección", true);
        this.Padre = Padre;
        initComponents();
        ToolTipManager.sharedInstance().setInitialDelay(0);
        txtSMS.setText(Data.ALERTS.SMS.getRandomOf());
        suma = points[Acciones.getRand(0, 30)];
        btnSimon.setText("Si, +" + suma + " puntos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALL = new javax.swing.JPanel();
        Desliz = new javax.swing.JPanel();
        btnSimon = new javax.swing.JButton();
        btnNel = new javax.swing.JButton();
        txtSMS = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

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

        btnSimon.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnSimon.setIcon(Acciones.iconF1);
        btnSimon.setText("Si");
        btnSimon.setBorder(null);
        btnSimon.setContentAreaFilled(false);
        btnSimon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimon.setFocusable(false);
        btnSimon.setOpaque(true);
        btnSimon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSimonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSimonMouseExited(evt);
            }
        });
        btnSimon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimonActionPerformed(evt);
            }
        });
        ALL.add(btnSimon);
        btnSimon.setBounds(30, 330, 250, 30);

        btnNel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnNel.setIcon(Acciones.iconF2);
        btnNel.setText("No");
        btnNel.setBorder(null);
        btnNel.setContentAreaFilled(false);
        btnNel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNel.setFocusable(false);
        btnNel.setOpaque(true);
        btnNel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNelMouseExited(evt);
            }
        });
        btnNel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNelActionPerformed(evt);
            }
        });
        ALL.add(btnNel);
        btnNel.setBounds(330, 330, 250, 30);

        txtSMS.setEditable(false);
        txtSMS.setColumns(20);
        txtSMS.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        txtSMS.setForeground(new java.awt.Color(70, 180, 0));
        txtSMS.setRows(5);
        txtSMS.setBorder(null);
        txtSMS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtSMS.setFocusable(false);
        txtSMS.setOpaque(false);
        txtSMS.setRequestFocusEnabled(false);
        ALL.add(txtSMS);
        txtSMS.setBounds(10, 40, 590, 270);

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

    private void btnNelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNelMouseEntered
        btnNel.setBackground(Acciones.azulClaro);
    }//GEN-LAST:event_btnNelMouseEntered

    private void btnNelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNelMouseExited
        btnNel.setBackground(Acciones.blanco);
    }//GEN-LAST:event_btnNelMouseExited

    private void btnNelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNelActionPerformed
        f2();
    }//GEN-LAST:event_btnNelActionPerformed

    private void btnSimonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimonMouseEntered
        btnSimon.setBackground(Acciones.azulClaro);
    }//GEN-LAST:event_btnSimonMouseEntered

    private void btnSimonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimonMouseExited
        btnSimon.setBackground(Acciones.blanco);
    }//GEN-LAST:event_btnSimonMouseExited

    private void btnSimonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimonActionPerformed
        f1();
    }//GEN-LAST:event_btnSimonActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == 112) { // 27 -> scape
            f1();
        } else if (evt.getKeyCode() == 113) {
            f2();
        }
    }//GEN-LAST:event_formKeyReleased

    private void f1() { // Simon
        Padre.setPoints(suma);
        int deep = switch (suma) {
            case 1, 2, 3, 4, 5 ->
                2;
            case 6, 7, 8 ->
                3;
            case 9, 10 ->
                4;
            default ->
                0;
        };
        Padre.plus(deep, 1);
        this.dispose();
    }

    private void f2() { // Nel
        Padre.plus(1, suma);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALL;
    private javax.swing.JPanel Desliz;
    private javax.swing.JButton btnNel;
    private javax.swing.JButton btnSimon;
    private javax.swing.JTextArea txtSMS;
    // End of variables declaration//GEN-END:variables
}
