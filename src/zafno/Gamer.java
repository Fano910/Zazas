package zafno;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import zamain.Acciones;

/**
 *
 * @author leona
 */
public class Gamer extends javax.swing.JPanel {

    private String nombre = "";
    private int numero = 0;
    //private Object seleccionAnterior = null;

    /**
     * Creates new form Gamer
     *
     * @param Numero
     * @param jugador
     * @param Name
     */
    public Gamer(int Numero, String jugador, String Name) {
        this.numero = Numero;
        this.nombre = jugador;
        initComponents();
        fieldGamer.setText(Name);
        fieldGamer.selectAll();
        fieldGamer.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxColor = new javax.swing.JComboBox<>();
        fieldGamer = new javax.swing.JTextField();
        lblCancel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setMaximumSize(new java.awt.Dimension(450, 100));
        setMinimumSize(new java.awt.Dimension(350, 80));
        setPreferredSize(new java.awt.Dimension(450, 80));
        setLayout(null);

        boxColor.setBackground(new java.awt.Color(255, 255, 255));
        boxColor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        boxColor.setForeground(new java.awt.Color(0, 0, 0));
        boxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        boxColor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Color:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(80, 80, 80))); // NOI18N
        boxColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxColorItemStateChanged(evt);
            }
        });
        boxColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                boxColorFocusGained(evt);
            }
        });
        add(boxColor);
        boxColor.setBounds(0, 0, 90, 80);
        boxColor.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                // Llamar al método original para obtener el componente por defecto
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (value instanceof JLabel item) {
                    label.setText(item.getText());
                    label.setIcon(item.getIcon());
                }

                return label;
            }
        });

        fieldGamer.setBackground(new java.awt.Color(255, 255, 255));
        fieldGamer.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        fieldGamer.setForeground(new java.awt.Color(0, 0, 0));
        fieldGamer.setAlignmentX(1.0F);
        fieldGamer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), nombre, javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Agency FB", 2, 18), new java.awt.Color(80, 80, 80))); // NOI18N
        fieldGamer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldGamerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldGamerFocusLost(evt);
            }
        });
        fieldGamer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fieldGamerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldGamerMouseExited(evt);
            }
        });
        fieldGamer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldGamerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldGamerKeyReleased(evt);
            }
        });
        add(fieldGamer);
        fieldGamer.setBounds(100, 10, 290, 60);

        lblCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancel.setIcon(Acciones.iconCancel);
        lblCancel.setLabelFor(fieldGamer);
        lblCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        add(lblCancel);
        lblCancel.setBounds(410, 30, 20, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldGamerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldGamerFocusGained
        fieldGamer.setBorder(Acciones.focusGained(nombre));
    }//GEN-LAST:event_fieldGamerFocusGained

    private void fieldGamerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldGamerFocusLost
        fieldGamer.setBorder(Acciones.focusLost(nombre));
    }//GEN-LAST:event_fieldGamerFocusLost

    private void fieldGamerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldGamerMouseEntered
        fieldGamer.setBorder(Acciones.mouseEntered(nombre));
    }//GEN-LAST:event_fieldGamerMouseEntered

    private void fieldGamerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldGamerMouseExited
        fieldGamer.setBorder(Acciones.mouseExited(fieldGamer.isFocusOwner(), nombre));
    }//GEN-LAST:event_fieldGamerMouseExited

    private void fieldGamerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldGamerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldGamerKeyPressed

    private void fieldGamerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldGamerKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldGamerKeyReleased

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked
        Acciones.mostrarTextoTemporal("Pronto esta opcion, eliminara este jugador", 3000, Acciones.verde);
    }//GEN-LAST:event_lblCancelMouseClicked

    private void boxColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_boxColorFocusGained
        JLabel[] items = Zazas.getDisponibles(boxColor.getSelectedIndex() > 0 ? (JLabel) boxColor.getSelectedItem() : null);
        boxColor.removeAllItems();
        boxColor.insertItemAt("Select", 0);
        for (JLabel item : items) {
            boxColor.addItem(item);
        }
        boxColor.setSelectedItem(boxColor.getClientProperty("seleccionAnterior"));
        Acciones.threeClicks();
    }//GEN-LAST:event_boxColorFocusGained

    private void boxColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxColorItemStateChanged
        if (evt.getStateChange() == 1 && (boxColor.getSelectedIndex() > 0)) { // Ya se selecciono un item
            Zazas.setItemEnabled((JLabel) boxColor.getClientProperty("seleccionAnterior"), true);
            boxColor.putClientProperty("seleccionAnterior", boxColor.getSelectedItem());
            Zazas.setItemEnabled(boxColor.getSelectedItem(), false);
            Zazas.setColorAt(numero, ((JLabel) boxColor.getSelectedItem()).getText().charAt(15));
            System.out.println("Error con la interfaz (Parpadeo)"); // Este error se muestra cuando la interfaz se minimiza y se quiere volver a mostrar y algun JComboBox esta con el foco.
        }
    }//GEN-LAST:event_boxColorItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> boxColor;
    private javax.swing.JTextField fieldGamer;
    private javax.swing.JLabel lblCancel;
    // End of variables declaration//GEN-END:variables
}