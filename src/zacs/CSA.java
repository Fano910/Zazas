package zacs;

import zamain.Acciones;

/**
 *
 * @author leona
 */
public class CSA extends javax.swing.JPanel {

    private int w = 1280, h = 690;
    private final String[] nombres = {"GuardianOriginal", "HeroeLegal", "ProtectorCreativo", "CazadorAutentico", "DefensorDigital", "ArtGuardian", "OriginalHero", "ValorProtector", "JustoDigital", "LegadoLegal", "AntiPirata", "ArteDefensor", "GuardianDeArte", "HonestoJugador", "CazaPiratas", "LegalWarrior", "DigitalProtector", "ProtegeValor", "AntiPirateria", "ArteProtector", "GuardianDeCodigo", "ProtegeOriginal", "GuardianDigital", "CazaFalsos", "ProtectorDeArte", "LegalDefender", "GuardianDeLegado", "HeroeDeCodigo", "DefensaDigital", "CazadorLegal", "OriginalProtector", "ProtectorHonesto", "ValorOriginal", "GuardianContraPiratas", "CodigoProtegido", "HonestoDigital", "AntiPirateo", "ProtectorDeLegado", "DigitalDefensor", "DefensorDeArte", "CazaPirateria", "ProtectorDelCodigo", "LegalGuardian", "CazadorDeFalsos", "DefensorCreativo", "GuardianHonesto", "DigitalCazaFalsos", "ArteLegal", "ProtectorDelArte", "GuardianDelCodigo", "ProtectorDelValor", "HeroeDelArte", "CazaPirata", "GuardianDeProteccion", "DefensorOriginal", "ProtectorJusto", "LegalOriginal", "DigitalCazador", "ValorCreativo", "ProtectorContraPiratas", "GuardianDeHonestidad", "CodigoLegal", "DigitalHeroe", "ProtectorDelLegado", "CazaFalsificaciones", "OriginalDefender", "ProtectorDelOriginal", "LegalCazador", "DigitalGuardian", "ProtectorDeHonestidad", "CazaPiratasOriginal", "DefensorDeLegado", "GuardianLegal", "AntiPirateriaHeroe", "ProtectorContraFalsos", "CazadorDeOriginales", "ArteProtegido", "ProtectorDeCodigo", "GuardianDeValor", "LegalProtector", "DigitalValor", "OriginalCazador", "ProtectorDeFalsificaciones", "CazaOriginal", "HeroeCreativo", "GuardianContraFalsos", "ProtectorLegal", "DefensorHonesto", "ArteGuardian", "ProtectorDeHonesto", "CazadorDeCodigo", "ValorOriginalHeroe", "GuardianCreativo", "LegalHeroe", "ProtectorDeArteLegal", "DefensorDelOriginal", "CazaPirataOriginal", "ProtectorCreativoDigital", "GuardianDePirateria", "ProtectorDeAutenticidad"};
    public static Server server = new Server();
    public static Client client = new Client();

    /**
     * Creates new form CSA
     */
    public CSA() {
        initComponents();
        fieldUser.setText(nombres[Acciones.getRand(0, 100)]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldUser = new javax.swing.JTextField();
        lblServer = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblClient = new javax.swing.JLabel();
        fieldIP = new javax.swing.JTextField();

        setBackground(new java.awt.Color(247, 247, 247));
        setMinimumSize(new java.awt.Dimension(1280, 690));
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                formAncestorResized(evt);
            }
        });
        setLayout(null);

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
        add(fieldUser);
        fieldUser.setBounds(490, 130, 290, 60);

        lblServer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblServer.setText("lblServer");
        lblServer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblServerMouseClicked(evt);
            }
        });
        add(lblServer);
        lblServer.setBounds(250, 200, 256, 256);
        lblServer.setIcon(Acciones.iconServer);

        lblInicio.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(0, 0, 0));
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setText("¿Como deseas Iniciar?");
        lblInicio.setFocusable(false);
        add(lblInicio);
        lblInicio.setBounds(440, 50, 400, 80);

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
        add(lblClient);
        lblClient.setBounds(750, 200, 265, 256);
        lblClient.setIcon(Acciones.iconClient);

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
        add(fieldIP);
        fieldIP.setBounds(740, 460, 290, 60);
        fieldIP.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    public void closeAll() {
        client.stopClient();
        server.stopServer();
    }
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

    private void lblServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblServerMouseClicked
        server.startServer();
        //panelInicio.setVisible(false);
        zamain.Creator.txtURL.setText(server.getServerIP() + ":" + Server.getPORT());
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

    private void formAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorResized
        if (evt.getChanged().isValid() && isVisible()) {
            int width = evt.getChanged().getSize().width;
            int height = evt.getChanged().getSize().height;
            height = height - 30;
            setSize(width, height);
            setProportionalPoint(lblInicio, lblInicio.getX(), lblInicio.getY(), width, height);
            setProportionalPoint(fieldUser, fieldUser.getX(), fieldUser.getY(), width, height);
            setProportionalPoint(lblServer, lblServer.getX(), lblServer.getY(), width, height);
            setProportionalPoint(lblClient, lblClient.getX(), lblClient.getY(), width, height);
            setProportionalPoint(fieldIP, fieldIP.getX(), fieldIP.getY(), width, height);
            w = width;
            h = height;
        }
    }//GEN-LAST:event_formAncestorResized

    private void setProportionalPoint(java.awt.Component Componete, int X, int Y, int NewWidth, int NewHeight) {
        int newX = Math.round((X * NewWidth) / w);
        int newY = Math.round((Y * NewHeight) / h);
        Componete.setLocation(newX, newY);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldIP;
    private javax.swing.JTextField fieldUser;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblServer;
    // End of variables declaration//GEN-END:variables
}
