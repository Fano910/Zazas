package zamain;

/**
 * Este programa graba puntos especificos de la pantalla y el tiempo de retrazo
 * al siguiente punto, posteriormente se ejecutan los puntos. Esto es parecido a
 * una macro pero en ves de acciones son puntos de la pantalla. (No terminado)
 *
 * @author leona
 */
public class Macro extends javax.swing.JFrame {

    //
    private static int xMouse, yMouse, xFocus, yFocus, codigo = 990250;
    private static java.util.ArrayList<String> macroData;
    private static long startTime;
    private static final java.awt.Cursor hand = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);
    private static final java.awt.Cursor crossCursor = new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR);
    private static final java.awt.Cursor handMove = new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR);

    public static void main(String[] args) {
        javax.swing.ToolTipManager.sharedInstance().setInitialDelay(1);
        frame = new javax.swing.JFrame("Grabación. by FNO");
        frame.setAlwaysOnTop(true);
        frame.setUndecorated(true);
        frame.setBackground(Acciones.transparente);
        frame.setSize(203, 43);
        frame.setLocation(0, 0);
        frame.setCursor(crossCursor);
        frame.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frameMouseClicked(evt);
            }
        });
        frame.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                System.out.println(evt.getKeyCode());
                if (evt.getKeyCode() == 27) {
                    playInstructions.interrupt();
                    frame.dispose();
                }
            }

            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                if (!Acciones.isNumberPositive(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        });

        add = new javax.swing.JLabel();
        add.setBorder(Acciones.bordeVacio);
        add.setBackground(Acciones.blanco);
        add.setFocusable(false);
        add.setCursor(hand);
        add.setOpaque(true);
        add.setToolTipText("Agrega 1 paso a la grabación");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add.setBackground(Acciones.grisClaro);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add.setBackground(Acciones.blanco);
            }
        });

        play = new javax.swing.JLabel();
        play.setBorder(Acciones.bordeVacio);
        play.setBackground(Acciones.blanco);
        play.setFocusable(false);
        play.setCursor(hand);
        play.setOpaque(true);
        play.setToolTipText("Reproduce la grabación");
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                play.setBackground(Acciones.grisClaro);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                play.setBackground(Acciones.blanco);
            }
        });

        delete = new javax.swing.JLabel();
        delete.setBorder(Acciones.bordeVacio);
        delete.setBackground(Acciones.blanco);
        delete.setFocusable(false);
        delete.setCursor(hand);
        delete.setOpaque(true);
        delete.setToolTipText("Elimina la grabación actual");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete.setBackground(Acciones.grisClaro);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete.setBackground(Acciones.blanco);
            }
        });
        javax.swing.JLabel end = new javax.swing.JLabel();
        end.setBorder(Acciones.bordeVacio);
        end.setBackground(Acciones.blanco);
        end.setFocusable(false);
        end.setCursor(hand);
        end.setOpaque(true);
        end.setToolTipText("Termina la ejecucion del programa (>_<)");
        end.setHorizontalAlignment(0); // Centro en eje x
        end.setVerticalAlignment(0); // Centro en eje y
        end.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame.dispose();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                end.setBackground(Acciones.rojo);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                end.setBackground(Acciones.blanco);
            }
        });

        stop = new javax.swing.JLabel();
        stop.setBorder(Acciones.bordeVacio);
        stop.setBackground(Acciones.blanco);
        stop.setFocusable(false);
        stop.setCursor(handMove);
        stop.setOpaque(true);
        stop.setToolTipText("Pausa/Continua la grabación");
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stop.setBackground(Acciones.azulNormal);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stop.setBackground(Acciones.blanco);
            }
//
//            @Override
//            public void mousePressed(java.awt.event.MouseEvent evt) {
//                xMouse = evt.getX();
//                yMouse = evt.getY();
//            }
        });
//        stop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
//            @Override
//            public void mouseDragged(java.awt.event.MouseEvent evt) {
//                int x = evt.getXOnScreen();
//                int y = evt.getYOnScreen();
//                frame.setLocation(x - xMouse - 123, y - yMouse);
//            }
//        });

        /*
        javax.swing.JLabel another = new javax.swing.JLabel(Acciones.iconQR);
        another.setBorder(Acciones.bordeVacio);
        another.setBackground(Acciones.blanco);
        another.setFocusable(false);
        another.setCursor(hand);
        another.setOpaque(true);
        another.setToolTipText("Usa solo la interfaz QR");
        another.setHorizontalAlignment(0); // Centro en eje x
        another.setVerticalAlignment(0); // Centro en eje y
        another.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame.setBackground(Acciones.transparente);
                frame.setSize(243, 43);
                stop.setVisible(true);
                creatorMaster.setLocation(0, 43);
                creatorMaster.setVisible(true);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                another.setBackground(Acciones.verde);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                another.setBackground(Acciones.blanco);
            }
        });

        boxItems = new javax.swing.JComboBox<>();
        boxItems.setBackground(Acciones.blanco);
        boxItems.setFont(Acciones.fontLucida14);
        boxItems.setForeground(Acciones.negro);
        boxItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Selecciona"}));
        boxItems.setBorder(Acciones.borderBox("Puerto", false));
        boxItems.setFocusable(false);
        boxItems.addItemListener((java.awt.event.ItemEvent evt) -> {
            boxItemsItemStateChanged(evt);
        });

        fieldBaudRate = new javax.swing.JFormattedTextField();
        fieldBaudRate.setBackground(Acciones.blanco);
        fieldBaudRate.setBorder(Acciones.borderBox("Baud Rate 115200 recom (Vel.)", false));
        fieldBaudRate.setForeground(new java.awt.Color(0, 0, 0));
        fieldBaudRate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        fieldBaudRate.setValue(115200);
        fieldBaudRate.setFont(Acciones.fontLucida18);
        fieldBaudRate.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldBaudRate.setBorder(Acciones.focusGained("Baud Rate 115200 recom (Vel.)"));
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldBaudRate.setBorder(Acciones.focusLost("Baud Rate 115200 recom (Vel.)"));
            }
        });
        fieldBaudRate.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fieldBaudRate.setBorder(Acciones.mouseEntered("Baud Rate 115200 recom (Vel.)"));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldBaudRate.setBorder(Acciones.ratonSale(fieldBaudRate.isFocusOwner(), "Baud Rate 115200 recom (Vel.)"));
            }
        });
        fieldBaudRate.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
//                if (fieldBaudRate.getText().isBlank()) {
//                    fieldBaudRate.setValue(115200);
//                }
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (!Acciones.isAllDecimals(fieldBaudRate.getText())) {
                    fieldBaudRate.setValue(115200);
                }
            }

            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                if (!Acciones.isNumberPositive(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        });
         */
        javax.swing.JPanel opciones = new javax.swing.JPanel();
        opciones.setSize(180, 40);
        opciones.setBackground(Acciones.transparente);
        opciones.setFocusable(false);
        opciones.setLayout(null);
        opciones.add(add);
        add.setBounds(3, 3, 37, 37);
        opciones.add(play);
        play.setBounds(43, 3, 37, 37);
        opciones.add(delete);
        delete.setBounds(83, 3, 37, 37);
        opciones.add(end);
        end.setBounds(123, 3, 37, 37);
        opciones.add(stop);
        stop.setBounds(163, 3, 37, 37);
//        opciones.add(another);
//        another.setBounds(203, 3, 37, 37);
//        another.setVisible(false);
//        opciones.add(boxItems);
//        boxItems.setBounds(3, 43, 157, 50);
//        opciones.add(fieldBaudRate);
//        fieldBaudRate.setBounds(3, 3, 157, 60);
//        fieldBaudRate.setVisible(false);

        frame.add(opciones);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        macroData = Acciones.readMacroFile();
//        Creator.showInfo(macroData.toString());
//        if (macroData.size() == 3) {
//            xFocus = (int) macroData.get(0);
//            yFocus = (int) macroData.get(1);
//            puerto = (String) macroData.get(2);
//            if (!isPort(puerto)) {
//                settingMouseClicked();
//                another.setVisible(true);
//            }
//        } else {
//            settingMouseClicked();
//        }
    }

//    private static boolean isPort(String Port) {
//        try {
//            portList = SerialPort.getCommPorts();
//            for (SerialPort port : portList) {
//                if (port.getSystemPortName().equals(Port)) {
//                    serialPort = port;
//                    return true;
//                }
//            }
////            serialPort.setBaudRate(9600);
////            serialPort.setNumDataBits(8);
////            serialPort.setNumStopBits(1);
////            serialPort.setParity(0);
////            serialPort.openPort();
//        } catch (Exception e) {
//            Creator.showInfo(e.toString());
//        }
//        return false;
//    }
//
//    private static String getPortS(javax.swing.JComboBox Box) {
//        String ret = "Puertos no disponibles";
//        try {
//            portList = SerialPort.getCommPorts();
//            Box.removeAllItems();
//            if (portList.length > 0) {
//                Box.addItem("Selecciona");
//            } else {
//                Box.addItem(ret);
//            }
//            for (SerialPort port : portList) {
//                String name = port.getSystemPortName();
//                Box.addItem(name);
//                ret = name;
//            }
//        } catch (Exception e) {
//            Creator.showInfo(e.toString());
//        }
//        return ret;
//    }
//
//    private static ArrayList<Integer> getData() {
//        ArrayList<Integer> data = new ArrayList<>();
//        // Abre el puerto serial
//        if (serialPort.openPort()) {
//            // Envía datos al puerto serial
//            serialPort.writeBytes("P".getBytes(), 1);
//            try {
//                for (int i = 0; i < 1000; i++) {
//                    Thread.sleep(1);
//                    if (serialPort.bytesAvailable() > 0) {
//                        byte[] buffer = new byte[20];
//                        int numBytes = serialPort.readBytes(buffer, buffer.length);
//                        // Imprime la respuesta
//                        if (numBytes >= 5) {
//                            for (byte b : buffer) {
//                                if (data.size() < 8) {
//                                    data.add((int) b);
//                                }
//                            }
//                            serialPort.closePort();
//                            Creator.showInfo("Respuesta del puerto serial: " + new String(buffer, 0, numBytes));
//                            return data;
//                        }
//                    }
//                }
//            } catch (InterruptedException e) {
//                Creator.showInfo(e.toString());
//            }
//        } else {
//            Creator.showInfo("No se pudo abrir el puerto serial.");
//        }
//        data.clear();
//        data.add(48);
//        data.add(46);
//        data.add(48);
//        return data;
//    }
    private static void frameMouseClicked(java.awt.event.MouseEvent evt) {
        switch (evt.getButton()) {
            case 1 -> {
                if (startTime <= 0) {
                    System.out.println("Primero presiona clickDerecho para iniciar contador");
                    return;
                }
                xFocus = evt.getXOnScreen();
                yFocus = evt.getYOnScreen();
                Acciones.writeMacroFile(xFocus, yFocus, tiempoActualEnMilis());
                frame.setBackground(Acciones.transparente);
                frame.setSize(203, 43);
                add.setVisible(true);
                play.setVisible(true);
                delete.setVisible(true);
                stop.setVisible(true);
                startTime = 0;
            }
            case 2 -> {
                Acciones.writeMacroFile(-1, -1, 0);
                frame.setBackground(Acciones.transparente);
                frame.setSize(203, 43);
                add.setVisible(true);
                play.setVisible(true);
                delete.setVisible(true);
                stop.setVisible(true);
                startTime = 0;
            }
            case 3 -> {
                startTime = System.currentTimeMillis();
            }
        }
    }
//
//    // Detiene el cronómetro y devuelve el tiempo transcurrido en milisegundos
//    public static long detenerCronometroEnMilis() {
//        return System.currentTimeMillis() - startTime;
//    }

    // Devuelve el tiempo actual transcurrido sin detener el cronómetro, en milisegundos
    public static long tiempoActualEnMilis() {
        return System.currentTimeMillis() - startTime;
    }
//
//    // Devuelve el tiempo transcurrido en formato HH:MM:SS (para mostrar al usuario)
//    public static String tiempoActualFormateado() {
//        return formatearTiempo(tiempoActualEnMilis());
//    }
//
//    // Método auxiliar para formatear el tiempo en HH:MM:SS
//    private static String formatearTiempo(long elapsedTime) {
//        long segundos = (elapsedTime / 1000) % 60;
//        long minutos = (elapsedTime / (1000 * 60)) % 60;
//        long horas = (elapsedTime / (1000 * 60 * 60)) % 24;
//        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
//    }

    private static void addMouseClicked() {
        frame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        frame.setBackground(Acciones.opaco);
        add.setVisible(false);
        play.setVisible(false);
        delete.setVisible(false);
        stop.setVisible(false);
    }

    private static Thread playInstructions;

    private static void playMouseClicked() {
        macroData = Acciones.readMacroFile();
        playInstructions = new Thread(() -> {
            play.setVisible(false);
            for (String instruction : macroData) {
                int indY = instruction.indexOf("y=");
                int indT = instruction.indexOf("t=");
                int pX = Integer.parseInt(instruction.substring(2, indY));
                int pY = Integer.parseInt(instruction.substring(indY + 2, indT));
                long T = Long.parseLong(instruction.substring(indT + 2));
                if (pX == -1) {
                    Acciones.writeNumbers(codigo + "");
                    codigo++;
                } else {
                    Acciones.clickOnScreenWait(pX, pY, T);
                }
            }
            play.setVisible(true);
        });
        playInstructions.start();
    }

    private static void deleteMouseClicked() {

    }

    private static void stopMouseClicked() {

    }

    private static javax.swing.JFrame frame;
    private static javax.swing.JLabel add; // Era JButton
    private static javax.swing.JLabel play;
    private static javax.swing.JLabel delete;
    private static javax.swing.JLabel stop;
}
