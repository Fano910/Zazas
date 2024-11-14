package zafno;

import java.awt.Component;
import javax.swing.table.DefaultTableCellRenderer;
import zamain.Acciones;

/**
 *
 * @author Fanos
 */
public class Comodines extends javax.swing.JDialog {

    private int xMouse, yMouse;
    private final Tableros padre;
//    private java.util.ArrayList<Object[]> resultados = null;
    private final javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hacer que todas las celdas sean de solo lectura
        }
    };

    /**
     * Creates new form Principal
     *
     * @param Modal
     * @param Padre
     */
    public Comodines(javax.swing.JFrame Modal, Tableros Padre) {
        super(Modal, "Buscar comodin", true);
        this.padre = Padre;
        initComponents();
        createModel();
        javax.swing.ToolTipManager.sharedInstance().setInitialDelay(0);
//        lblCantidad.setText(Cantidad + " pts");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ALL = new javax.swing.JPanel();
        Desliz = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        fieldBusqueda = new javax.swing.JTextField();
        scrollComodines = new javax.swing.JScrollPane();
        tableComodines = new javax.swing.JTable();
        lblClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        Desliz.setBounds(30, 0, 580, 30);

        lblCantidad.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALL.add(lblCantidad);
        lblCantidad.setBounds(15, 40, 50, 30);

        fieldBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        fieldBusqueda.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        fieldBusqueda.setForeground(new java.awt.Color(180, 180, 180));
        fieldBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldBusqueda.setText("INGRESA DESCRIPCIÓN");
        fieldBusqueda.setBorder(null);
        fieldBusqueda.setMinimumSize(new java.awt.Dimension(450, 30));
        fieldBusqueda.setPreferredSize(new java.awt.Dimension(450, 30));
        fieldBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldBusquedaFocusLost(evt);
            }
        });
        fieldBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fieldBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldBusquedaMouseExited(evt);
            }
        });
        fieldBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldBusquedaKeyTyped(evt);
            }
        });
        ALL.add(fieldBusqueda);
        fieldBusqueda.setBounds(10, 40, 590, 30);

        tableComodines.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        tableComodines.setForeground(new java.awt.Color(0, 0, 0));
        tableComodines.setToolTipText("<espacio> para agregar");
        tableComodines.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableComodines.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        tableComodines.setRowHeight(30);
        tableComodines.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableComodines.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableComodines.setShowGrid(false);
        tableComodines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableComodinesMouseClicked(evt);
            }
        });
        tableComodines.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableComodinesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableComodinesKeyReleased(evt);
            }
        });
        scrollComodines.setViewportView(tableComodines);

        ALL.add(scrollComodines);
        scrollComodines.setBounds(10, 70, 590, 300);

        lblClose.setBackground(new java.awt.Color(255, 255, 255));
        lblClose.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(0, 0, 0));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setOpaque(true);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        ALL.add(lblClose);
        lblClose.setBounds(0, 0, 30, 30);

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

    private void createModel() {
        modelo.addColumn("Producto");
        modelo.addColumn("Puntos $");

        tableComodines.setModel(modelo);
        tableComodines.getColumnModel().getColumn(0).setMinWidth(480);
        tableComodines.getColumnModel().getColumn(0).setPreferredWidth(490);
        tableComodines.getColumnModel().getColumn(0).setMaxWidth(500);

        tableComodines.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setForeground(Acciones.rojo);
                return c;
            }
        });
        modelo.addRow(new Object[]{"Avanza 1 posición", 5});
        modelo.addRow(new Object[]{"Avanza 3 posiciónes", 13});
        modelo.addRow(new Object[]{"Avanza 5 posiciónes", 20});
        modelo.addRow(new Object[]{"Avanza 10 posiciónes", 35});
        modelo.addRow(new Object[]{"Regresa 1 canica de tus enemigos al inicio", 25});
    }

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
        this.dispose();
    }//GEN-LAST:event_DeslizMouseClicked

    private void fieldBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldBusquedaFocusGained
        fieldBusqueda.selectAll(); // opcional
        fieldBusqueda.setBorder(Acciones.bordeLineaAzul);
    }//GEN-LAST:event_fieldBusquedaFocusGained

    private void fieldBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldBusquedaFocusLost
        fieldBusqueda.setBorder(Acciones.bordeVacio);
    }//GEN-LAST:event_fieldBusquedaFocusLost

    private void fieldBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldBusquedaMouseEntered
        fieldBusqueda.setBorder(Acciones.bordeLineaNegra);
    }//GEN-LAST:event_fieldBusquedaMouseEntered

    private void fieldBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldBusquedaMouseExited
        fieldBusqueda.setBorder(Acciones.mouseExited(fieldBusqueda.isFocusOwner()));
    }//GEN-LAST:event_fieldBusquedaMouseExited

    private void fieldBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBusquedaKeyPressed
        if (fieldBusqueda.getText().equals("INGRESA DESCRIPCIÓN") || fieldBusqueda.getText().isEmpty()) {
            fieldBusqueda.setForeground(Acciones.negro);
            fieldBusqueda.setText("");
        }
        switch (evt.getKeyCode()) {
            case 40 -> { // Baja
                tableComodines.setRowSelectionInterval(0, 0);
                tableComodines.requestFocus();
            }
            case 38 -> { // Sube
                int selected = modelo.getRowCount() - 1;
                tableComodines.setRowSelectionInterval(selected, selected);
                tableComodines.requestFocus();
                java.awt.Rectangle rect = tableComodines.getCellRect(selected, 0, true);
                tableComodines.scrollRectToVisible(rect);
            }
        }
    }//GEN-LAST:event_fieldBusquedaKeyPressed

    private void fieldBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBusquedaKeyReleased
        if (evt.getKeyCode() == 8) { // KEY RETURN
            removeList();
            if (fieldBusqueda.getText().isEmpty()) {
                fieldBusqueda.setText("INGRESA DESCRIPCIÓN");
                fieldBusqueda.setForeground(Acciones.gris);
            }
        } else {
            String text = fieldBusqueda.getText().trim();
            String[] words = text.split("\\s+");
            if (words.length >= 1 && evt.getKeyChar() == 32) {
                modelo.setRowCount(0);
//                resultados = CConexion.buscaCoincidencias(words, modelo);
//                for (Object[] resultado : resultados) {
//                    modelo.addRow(new Object[]{resultado[3], resultado[tipoPrecio - 1]});
//                }
            }
        }
    }//GEN-LAST:event_fieldBusquedaKeyReleased

    private void fieldBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldBusquedaKeyTyped
        if (!Acciones.isDescription(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_fieldBusquedaKeyTyped

    private void tableComodinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableComodinesMouseClicked
        fieldBusqueda.setText((String) tableComodines.getValueAt(tableComodines.getSelectedRow(), 0));
    }//GEN-LAST:event_tableComodinesMouseClicked

    private void tableComodinesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableComodinesKeyPressed
        if (evt.getKeyCode() == 8 && (fieldBusqueda.getText().length() > 0)) {
            removeList();
        }
    }//GEN-LAST:event_tableComodinesKeyPressed

    private void tableComodinesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableComodinesKeyReleased
        int key = evt.getKeyCode();
        switch (key) {
            case 9 ->
                fieldBusqueda.requestFocus();
            case 32 -> {
                int index = tableComodines.getSelectedRow();
//                Object[] datos = resultados.get(fila);
//                String codigo = (String) datos[0], nombre = (String) datos[3];
//                double precioVenta = (double) datos[tipoPrecio - 1], precioPublico = (double) datos[8];
//                int stock = (int) datos[5];
////                System.out.println("bool: " + datos[4] + " >>codigo: " + codigo + " >>nombre: " + nombre + " >>precioVenta: " + precioVenta + " >>precioPublico: " + precioPublico + " >>stock: " + stock);
//                if ((boolean) datos[4]) {
//                    padre.agregarProducto(codigo, piezas, nombre, precioVenta, stock, precioPublico, tipoPrecio);
////                    agregarProducto(rs.getString(3), (double) spinnerCantidad.getValue(), rs.getString(4), rs.getDouble(tipoPrecio), rs.getInt(6), rs.getDouble(9), tipoPrecio);
//                } else {
//                    setEnabled(false);
//                    VentaGramos ingGramos = new VentaGramos(padre, modal, codigo, piezas, nombre, stock, precioVenta, precioPublico, tipoPrecio);
//                    ingGramos.setVisible(true);
//                }
                this.dispose();
            }
            case 38, 40 ->
                fieldBusqueda.setText((String) tableComodines.getValueAt(tableComodines.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_tableComodinesKeyReleased

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setBackground(Acciones.rojo);
        lblClose.setForeground(Acciones.blanco);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setBackground(Acciones.blanco);
        lblClose.setForeground(Acciones.negro);
    }//GEN-LAST:event_lblCloseMouseExited

    private void removeList() {
        modelo.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ALL;
    private javax.swing.JPanel Desliz;
    private javax.swing.JTextField fieldBusqueda;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblClose;
    protected static javax.swing.JScrollPane scrollComodines;
    private javax.swing.JTable tableComodines;
    // End of variables declaration//GEN-END:variables
}
