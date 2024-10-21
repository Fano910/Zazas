package tst;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import zafno.Zazas;

/**
 *
 * @author leona
 */

public class ComboBoxWithIcons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox con JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear el JComboBox
        JComboBox<Object> comboBox = new JComboBox<>();
        comboBox.insertItemAt("Selecciona", 0);
        comboBox.setSelectedIndex(0);
        for (JLabel item : Zazas.getDisponibles()) {
            comboBox.addItem(item);
        }
        // Personalizar el renderizador del JComboBox
        comboBox.setRenderer(new DefaultListCellRenderer() {
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
        //comboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Color:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(80, 80, 80))); // NOI18N

        // Agregar el JComboBox al frame
        frame.setLayout(new FlowLayout());
        frame.add(comboBox);

        frame.setVisible(true);
    }
}