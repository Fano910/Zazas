package zamain;

//import com.google.zxing.BarcodeFormat; // Librerias de generacion de codigos.
//import com.google.zxing.WriterException;
//import com.google.zxing.client.j2se.MatrixToImageWriter;
//import com.google.zxing.common.BitMatrix;
//import com.google.zxing.qrcode.QRCodeWriter;
//import com.fazecast.jSerialComm.SerialPort;
import java.awt.AWTException;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import static zafno.Data.SRC.*;

/**
 *
 * @author Fano
 */
public class Acciones {

    private static final String SECRET_KEY = "mysecretkey16129";
    private static final String ALGORITHM = "AES";
//    private static SerialPort[] portList;

    public static String encrypt(String data) {
        try {
            SecretKey secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Creator.showInfo(e.getMessage());
            return null;
        }
    }

    public static String decrypt(String encryptedData) {
        try {
            SecretKey secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Creator.showInfo(e.getMessage());
            return ".....UNKNOWN DATA.....\tPLEASE GO WITH FNO";
        }
    }

    public static java.awt.Color azulNormal = new java.awt.Color(50, 102, 144);
    public static java.awt.Color azulClaro = new java.awt.Color(215, 230, 250);
    public static java.awt.Color gris = new java.awt.Color(180, 180, 180);
    public static java.awt.Color grisDisable = new java.awt.Color(150, 150, 150);
    public static java.awt.Color grisFuerte = new java.awt.Color(80, 80, 80);
    public static java.awt.Color blanco = java.awt.Color.white;
    public static java.awt.Color negro = java.awt.Color.black;
    public static java.awt.Color rojo = java.awt.Color.red;
    public static java.awt.Color grisClaro = java.awt.Color.lightGray;
    public static java.awt.Color transparente = new java.awt.Color(0, 0, 0, 10);
    public static java.awt.Color opaco = new java.awt.Color(255, 255, 255, 100);
    public static java.awt.Color verde = new java.awt.Color(70, 180, 0);

    public static java.awt.Font fontAgency18 = new java.awt.Font("Agency FB", java.awt.Font.ITALIC, 18);
    public static java.awt.Font fontField = new java.awt.Font("Garamond", java.awt.Font.BOLD, 18);
    public static java.awt.Font fontLucida18 = new java.awt.Font("Lucida Sans Unicode", 1, 18);
    public static java.awt.Font fontLucida14 = new java.awt.Font("Lucida Sans Unicode", 1, 14);
    public static java.awt.Font fontField2 = new java.awt.Font("Bookshelf Symbol 7", 0, 14);
    public static java.awt.Font regularFont = new java.awt.Font("Arial", java.awt.Font.ITALIC, 8); // Estas fuents son del ticket
    public static java.awt.Font boldFont = new java.awt.Font("Arial", java.awt.Font.BOLD, 8);
    public static java.awt.Font doubleBoldFont = new java.awt.Font("Arial", java.awt.Font.BOLD, 9);
    public static java.awt.Font title = new java.awt.Font("Gill Sans MT", java.awt.Font.BOLD, 24);
    public static java.awt.Font roboto14Bold = new java.awt.Font("Roboto", 1, 14);

    public static final Border bordeLineaAzul = BorderFactory.createLineBorder(Acciones.azulNormal, 2, true);
    public static final Border bordeLineaRoja = BorderFactory.createLineBorder(Acciones.rojo, 2, true);
    public static final Border bordeLineaVerde = BorderFactory.createLineBorder(Acciones.verde, 2, true);
    public static final Border bordeLineaNegra = BorderFactory.createLineBorder(Acciones.negro, 1, true);
    public static final Border bordeVacio = BorderFactory.createEmptyBorder();
    public static final Border bordeVacioS = BorderFactory.createEmptyBorder(1, 1, 1, 1);
    public static final Border bordeMate = BorderFactory.createMatteBorder(1, 5, 1, 1, Acciones.rojo);

    public static final java.awt.Cursor handCursor = new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR);

//    public static final ImageIcon iconCCRF = new ImageIcon(RAIZ.get() + "");
//    public static final ImageIcon iconF1 = new ImageIcon(RAIZ.get() + "");
//    public static final ImageIcon iconF2 = new ImageIcon(RAIZ.get() + "");
    public static final ImageIcon iconServer = new ImageIcon(IMAGES + "Server.png"); // Icono servidor
    public static final ImageIcon iconClient = new ImageIcon(IMAGES + "Client.png"); // Icono cliente
    public static final ImageIcon iconTab_1 = new ImageIcon(IMAGES + "Tablero_1.png"); // Icono Tablero 1
    public static final ImageIcon iconFondo = new ImageIcon(IMAGES + "Fondo1.jpg"); // Icono Tablero 1
    public static final ImageIcon iconCancel = new ImageIcon(IMAGES + "cancel.png");
    public static final ImageIcon iconF1 = new ImageIcon(IMAGES + "F1.png");
    public static final ImageIcon iconF2 = new ImageIcon(IMAGES + "F2.png");
    public static final ImageIcon iconCtrl = new ImageIcon(IMAGES + "ctrl.png");
    public static final ImageIcon iconCtrl_1 = new ImageIcon(IMAGES + "ctrl1.png");
    public static final ImageIcon iconSetting = new ImageIcon(IMAGES + "setting.png");
    public static final ImageIcon iconSee = new ImageIcon(IMAGES + "eyeSee.png");
    public static final ImageIcon iconCanicaNegra = new ImageIcon(MARBLES + "Black.png");
    public static final ImageIcon iconCanicaAzul = new ImageIcon(MARBLES + "Blue.png");
    public static final ImageIcon iconCanicaCafe = new ImageIcon(MARBLES + "Brown.png");
    public static final ImageIcon iconCanicaGuinda = new ImageIcon(MARBLES + "Cherry.png");
    public static final ImageIcon iconCanicaDorada = new ImageIcon(MARBLES + "Gold.png");
    public static final ImageIcon iconCanicaVerde = new ImageIcon(MARBLES + "Green.png");
    public static final ImageIcon iconCanicaMexico = new ImageIcon(MARBLES + "Mexico.png");
    public static final ImageIcon iconCanicaNaranja = new ImageIcon(MARBLES + "Orange.png");
    public static final ImageIcon iconCanicaRosa = new ImageIcon(MARBLES + "Pink.png");
    public static final ImageIcon iconCanicaMorada = new ImageIcon(MARBLES + "Purple.png");
    public static final ImageIcon iconCanicaRoja = new ImageIcon(MARBLES + "Red.png");
    public static final ImageIcon iconCanicaPlateada = new ImageIcon(MARBLES + "Silver.png");
    public static final ImageIcon iconCanicaTurquesa = new ImageIcon(MARBLES + "Turquoise.png");
    public static final ImageIcon iconCanicaVino = new ImageIcon(MARBLES + "Wine.png");
    public static final ImageIcon iconCanicaAmarilla = new ImageIcon(MARBLES + "Yellow.png");
    public static final ImageIcon iconDices = new ImageIcon(DICES + "Dices.png");
    private static final ImageIcon iconDice1 = new ImageIcon(DICES + "1_1.png");
    private static final ImageIcon iconDice2 = new ImageIcon(DICES + "1_2.png");
    private static final ImageIcon iconDice3 = new ImageIcon(DICES + "1_3.png");
    private static final ImageIcon iconDice4 = new ImageIcon(DICES + "1_4.png");
    private static final ImageIcon iconDice5 = new ImageIcon(DICES + "1_5.png");
    private static final ImageIcon iconDice6 = new ImageIcon(DICES + "1_6.png");

    public static int dayOfTurn;
    public static String horaInicio;

    public static Border borderBox(String Titulo, boolean IsError) {
        if (IsError) {
            return javax.swing.BorderFactory.createTitledBorder(bordeLineaRoja, Titulo, javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, fontAgency18, rojo);
        } else {
            return javax.swing.BorderFactory.createTitledBorder(bordeVacioS, Titulo, javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, fontAgency18, grisFuerte);
        }
    }

    public static Border focusGained(String titulo) {
        return BorderFactory.createTitledBorder(bordeLineaAzul, titulo, TitledBorder.LEFT, TitledBorder.ABOVE_TOP, fontAgency18, azulNormal);
    }

    public static Border bordError(String titulo) {
        return BorderFactory.createTitledBorder(bordeLineaRoja, titulo, TitledBorder.LEFT, TitledBorder.ABOVE_TOP, fontAgency18, rojo);
    }

    public static Border bordOka(String titulo) {
        return BorderFactory.createTitledBorder(bordeLineaVerde, titulo, TitledBorder.LEFT, TitledBorder.ABOVE_TOP, fontAgency18, verde);
    }

    public static Border focusLost(String titulo) {
        return BorderFactory.createTitledBorder(bordeVacio, titulo, TitledBorder.LEFT, TitledBorder.ABOVE_TOP, fontAgency18, grisFuerte);
    }

    public static Border mouseEntered(String titulo) {
        return BorderFactory.createTitledBorder(bordeLineaNegra, titulo, TitledBorder.LEFT, TitledBorder.ABOVE_TOP, fontAgency18, negro);
    }

    public static Border mouseExited(boolean IsFocusOwner) {
        return IsFocusOwner ? bordeLineaAzul : bordeVacio;
    }

    public static Border mouseExited(boolean IsFocusOwner, String titulo) {
        return IsFocusOwner ? focusGained(titulo) : focusLost(titulo);
    }

    // Expresión regular para validar direcciones IP
    private static final String IPADDRESS_PATTERN
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static final Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);

    // Método para validar si una cadena es una dirección IP válida
    public static boolean isValidIPAddress(String ip) {
        return ip == null ? false : pattern.matcher(ip).matches();
    }

    public static String formatAsPrice(double Entrada) {
        // Crea un objeto DecimalFormat para limitar a dos decimales
        DecimalFormat df = new DecimalFormat("###,###.##");
        // Formatea el resultado de la resta para mostrar solo dos decimales
        String resultadoFormateado = df.format(Entrada);
        return resultadoFormateado;
    }

    public static double formatAsDouble(double Entrada) {
        DecimalFormat df = new DecimalFormat("######.##");
        String resultadoFormateado = df.format(Entrada);
        return Double.parseDouble(resultadoFormateado);
    }

    /**
     * Verifica que el puerto este funcionando y ajusta el puerto en la variable
     * Creator.serialPort
     *
     * @param Port
     * @return
     */
//    protected static boolean isPort(Object Port) {
//        try {
//            portList = SerialPort.getCommPorts();
//            for (SerialPort port : portList) {
//                if (port.getSystemPortName().equals(Port)) {
//                    Creator.serialPort = port;
//                    return true;
//                }
//            }
//        } catch (Exception e) {
//            Creator.showInfo(e.toString());
//        }
//        return false;
//    }
    /**
     * Por el momento este metodo no esta fincionando, debido a que no se
     * encuentra la libreria necesaria para la generacion del recurso solicitado
     *
     * @param data
     * @param size
     * @return
     */
    public static ImageIcon getQRCode(String data, int size) {
//        try {
//            QRCodeWriter writer = new QRCodeWriter();
//            BitMatrix bitMatrix = writer.encode(Data, BarcodeFormat.QR_CODE, size, size);
//
//            return new ImageIcon(MatrixToImageWriter.toBufferedImage(bitMatrix));
//        } catch (WriterException e) {
//            Creator.showInfo(e.getMessage());
        return null;
//        }
    }

    public static void setScaledIcon(String Nombre, int W, int H, javax.swing.JLabel Label) {
        ImageIcon imgICON = new ImageIcon(IMAGES + Nombre);
        java.awt.Image imageICON = imgICON.getImage();
        java.awt.Image scaledImageICON = imageICON.getScaledInstance(W, H, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scaledIconICON = new ImageIcon(scaledImageICON);
        Label.setIcon(scaledIconICON);
    }

    /**
     * Método que configura el icono con la opacidad correspondiente
     *
     * @param icon
     * @param opacity
     * @return
     */
    public static Icon getIconOpacity(Icon icon, float opacity) {
        BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        BufferedImage transparentImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2dTransparent = transparentImage.createGraphics();
        g2dTransparent.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
        g2dTransparent.drawImage(bufferedImage, 0, 0, null);
        g2dTransparent.dispose();
        return new ImageIcon(transparentImage);
    }

    /**
     * Devuelve el icono de la cara proporcianoda.
     *
     * @param Index
     * @return
     */
    public static Icon getIconAt(int Index) {
        return switch (Index) {
            case 1 ->
                iconDice1;
            case 2 ->
                iconDice2;
            case 3 ->
                iconDice3;
            case 4 ->
                iconDice4;
            case 5 ->
                iconDice5;
            case 6 ->
                iconDice6;
            default ->
                iconDices;
        };
    }

    /**
     * Devuelve el icono representante del caracter proporcionado.
     *
     * @param Color
     * @return
     */
    public static javax.swing.Icon getIconOfTurno(char Color) {
        return switch (Color) {
            case 'B' ->
                iconCanicaNegra;
            case 'A' ->
                iconCanicaAzul;
            case 'C' ->
                iconCanicaCafe;
            case 'G' ->
                iconCanicaGuinda;
            case 'D' ->
                iconCanicaDorada;
            case 'V' ->
                iconCanicaVerde;
            case 'M' ->
                iconCanicaMexico;
            case 'O' ->
                iconCanicaNaranja;
            case 'P' ->
                iconCanicaRosa;
            case 'm' ->
                iconCanicaMorada;
            case 'R' ->
                iconCanicaRoja;
            case 'S' ->
                iconCanicaPlateada;
            case 'T' ->
                iconCanicaTurquesa;
            case 'W' ->
                iconCanicaVino;
            case 'Y' ->
                iconCanicaAmarilla;
            default ->
                null;
        };
    }

    public static void setNewLocation(javax.swing.JLabel Canica, int OldX, int OldY, int NewX, int NewY, int Velocidad, java.util.concurrent.CountDownLatch Latch) {
        // Diferencias entre las coordenadas
        int dx = Math.abs(NewX - OldX);
        int dy = Math.abs(NewY - OldY);

        // Direcciones de incremento
        int sx = OldX < NewX ? 1 : -1;
        int sy = OldY < NewY ? 1 : -1;

        int err = dx - dy;

        int currentX = OldX;
        int currentY = OldY;

        while (currentX != NewX || currentY != NewY) {
            Canica.setLocation(currentX, currentY);
            //System.out.println("Location=(" + currentX + ", " + currentY + ");");
            try {
                Thread.sleep(Velocidad);
            } catch (InterruptedException e) {
                StringBuilder errorMessage = new StringBuilder("Error:\n");
                for (StackTraceElement element : e.getStackTrace()) {
                    errorMessage.append(element.toString()).append("\n");
                }
                zamain.Creator.showInfo(errorMessage.toString());
            }
            // Algoritmo de Bresenham
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                currentX += sx;
            }
            if (e2 < dx) {
                err += dx;
                currentY += sy;
            }
        }
        // Establecer la posición final
        Canica.setLocation(NewX, NewY);
        if (Latch != null) {
            Latch.countDown();
        }
    }

    /**
     *
     * @param Path
     * @return Array of words on the File
     */
    public static java.util.ArrayList<String> readFile(String Path) {
        String fichero = ".\\Data\\" + Path == null ? "data.fno" : ("Fno\\" + Path + ".fno");
        java.util.ArrayList<String> palabras = new java.util.ArrayList<>();
        File archivo = new File(fichero);
        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo));) {
            String lectura = entrada.readLine();
            while (lectura != null) {
                if (lectura.startsWith("%")) {
                    palabras.add(decrypt(lectura.substring(1, lectura.length())));
                }
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            mostrarTextoTemporal("Alguien movio el archivo antes de tiempo", 3000, rojo);
            Creator.showInfo(ex.toString());
        } catch (IOException ex) {
            mostrarTextoTemporal("Ocurrio un error", 2500, rojo);
            Creator.showInfo(ex.toString());
        }
        return palabras;
    }

    public static String writeFile(boolean IsNew, String Puerto) {
        String fichero = ".\\Data\\";
        String text = "Este es un documento de datos necesarios para el\rfuncionamiento del programa. Cualquier modificación\rse vera reflejada en el mal funcionamiento del mismo.\r%";
        if (IsNew) {
            fichero += "Productos\\" + Puerto + ".fno";
            text += encrypt(Puerto) + "\r%" + encrypt(Puerto);
        } else {
            fichero += "data.fno";
            text += encrypt(Puerto);
        }
        File archivo = new File(fichero);
        PrintWriter salida;
        try {
            salida = new PrintWriter(archivo);
            salida.println(text);
            salida.close();
            Creator.showInfo("Se ha escrito dentro del archivo: " + fichero);
        } catch (FileNotFoundException ex) {
            mostrarTextoTemporal("Se movio el archivo de destino: " + fichero, 3500, rojo);
            Creator.showInfo("Archivo no encontrado" + fichero);
        }
        return fichero;
    }

    /*        public static String saveComponentAsImag(int Tipo, java.awt.Component component, int Copias, String Codigo, String Producto, double Peso, String Caducidad, String Lote, int SizeQr) {
        java.awt.image.BufferedImage image = new java.awt.image.BufferedImage(component.getWidth(), component.getHeight(), java.awt.image.BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics g = image.getGraphics();
        // Pinta el componente en la imagen
        component.paint(g);
        try {
            String dir = ".\\Data\\QR\\D_T_QR{[" + timeDateInt(false) + "],[" + timeDateInt(true) + "],[" + Codigo + "]}.png";
            // Guarda la imagen en el archivo
            ImageIO.write(image, "png", new File(dir));
            Creator.showInfo("Image saved to: " + dir);
            String datos = "Codigo: "  + Codigo + "\nProducto: " + Producto + "\nPeso: " + Peso + " " + Creator.jComboBox1.getSelectedItem() + "\nCaducidad: " + Caducidad + "\nLote: " + Lote;
            TicketPrinter tick = new TicketPrinter(Tipo, dir, new Object[] {Copias, datos}, SizeQr, null);
//            tick.show();
            tick.printTicket();
            return dir;
        } catch (IOException e) {
            Creator.showInfo(e.getMessage());
        }
        return null;
    }*/
    protected static void clickOnScreen(int X, int Y, java.util.ArrayList<Integer> Response) {
        Creator.showInfo(Response.toString());
        try {
            // Crea una instancia de Robot
            Robot robot = new Robot();
            // Mueve el puntero del mouse a la posición deseada
            robot.mouseMove(X, Y);
            // Simula un clic izquierdo del mouse
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            for (Integer key : Response) {
                if (key > 0) {
                    //int keyCode = KeyEvent.getExtendedKeyCodeForChar(b);
                    if (key != KeyEvent.VK_UNDEFINED) { // Verifica si el keyCode es válido
                        robot.keyPress(key);
                        robot.keyRelease(key);
                    } else {
                        // Manejar el caso en el que no haya un keyCode válido para el carácter
                        Creator.showInfo("No se encontró un keyCode válido para el carácter: " + key.toString());
                    }
                }
            }
        } catch (AWTException e) {
            Creator.showInfo(e.toString());
        }
    }

    public static final Robot robots;

    static {
        Robot tempRobot = null;
        try {
            tempRobot = new Robot(); // Se lanza AWTException si no se puede crear
        } catch (AWTException e) {
            System.out.println("Error al inicializar el Robot: " + e.getMessage());
        }
        robots = tempRobot; // Asignación segura
    }

    protected static void clickOnScreenWait(int X, int Y, long TimeToWait) {
        try {
            robots.mouseMove(X, Y);
            Thread.sleep(TimeToWait);
            robots.mouseMove(X, Y);
            robots.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robots.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (InterruptedException ex) {
            System.out.println("ERR=clickOnScreeWait=" + ex);
        }
    }

    // Método para escribir una cadena de números
    protected static void writeNumbers(String CadenaNumeros) {
        try {
            for (int i = 0; i < CadenaNumeros.length(); i++) {
                char caracter = CadenaNumeros.charAt(i);

                // Verificar si el carácter es un dígito
                if (Character.isDigit(caracter)) {
                    int numero = caracter - '0'; // Convertir el carácter a su valor numérico

                    // Simular la pulsación de la tecla correspondiente al número
                    robots.keyPress(KeyEvent.VK_0 + numero); // Presionar la tecla
                    robots.keyRelease(KeyEvent.VK_0 + numero); // Liberar la tecla

                    // Retardo opcional entre cada pulsación de tecla
                    Thread.sleep(50); // Puedes ajustar este tiempo
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Error al escribir la cadena de números: " + e.getMessage());
            Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
        }
    }

    public static void threeClicks() {
        try {
            Robot robot = new Robot();
            for (int i = 0; i < 3; i++) {
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
        } catch (AWTException e) {
            Creator.showInfo(e.toString());
        }
    }

    public static boolean mostrarTextoTemporal(String texto, int tiempoMS, java.awt.Color NULL_equals_verde) {
        Creator.txtALERTA.setForeground(NULL_equals_verde == null ? verde : NULL_equals_verde);
        Creator.txtALERTA.setVisible(true);
        Creator.txtALERTA.setText(texto);
        javax.swing.Timer tim = new javax.swing.Timer(tiempoMS, (java.awt.event.ActionEvent e) -> {
            Creator.txtALERTA.setVisible(false); // Vaciar el texto después de cierto tiempo
        });
        tim.setRepeats(false); // Evitar que el temporizador se repita
        tim.start();
        return true;
    }

    public static boolean isCharacterPrivilegios(char c) {
        String specialCharacters = "!#$%&()-+={}|?<>.*,abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
        return specialCharacters.contains(Character.toString(c));
    }

    public static boolean isClave(char c) {
        String specialCharacters = ".-/ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
        return specialCharacters.contains(Character.toString(c));
    }

    public static boolean isDescription(char c) {
        String specialCharacters = "°/()* ,áéíóúabcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
        return specialCharacters.contains(Character.toString(c));
    }

    public static boolean isPriceFLOAT(char c) {
        String specialCharacters = ".0123456789";
        return specialCharacters.contains(Character.toString(c));
    }

    public static boolean isNegativeDouble(char c) {
        String specialCharacters = ".0123456789-";
        return specialCharacters.contains(Character.toString(c));
    }

    protected static boolean isDate(char c) {
        String specislCharacters = "0123456789/";
        return specislCharacters.contains(Character.toString(c));
    }

    public static boolean isNumberPositive(char c) {
        String specislCharacters = "0123456789";
        return specislCharacters.contains(Character.toString(c));
    }

    public static boolean isAllDecimals(String str) {
        return str.matches("[0-9]*");
    }

    public static boolean isAllDoble(String str) {
        return str.matches("-?[0-9.]*");
    }

    public static boolean isAllDoblePositive(String str) {
        return str.matches("[0-9.]*");
    }

    public static boolean isAllDescription(String str) {
        return str.matches("[0-9°/()* ,áéíóúabcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ]*");
    }

    public static boolean isAllMayus(String str) {
        return str.matches("[0-9/.ABCDEFGHIJKLMNÑOPQRSTUVWXYZ]*");
    }

    protected static int timeDateInt(boolean timeTdateF) {
        LocalDateTime dateTimeActual = LocalDateTime.now();
        DateTimeFormatter isoHora = DateTimeFormatter.ofPattern("HHmmss");
        DateTimeFormatter isoFecha = DateTimeFormatter.ofPattern("yyyyMMdd");
        int date = Integer.parseInt(dateTimeActual.format(isoFecha));
        int time = Integer.parseInt(dateTimeActual.format(isoHora));
        return timeTdateF ? time : date;
    }

    public static String timeDateString(boolean timeTdateF, String yyyyMMdd) {
        LocalDateTime dateTimeActual = LocalDateTime.now();
        if (timeTdateF) {
            DateTimeFormatter isoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
            return dateTimeActual.format(isoHora);
        } else {
            DateTimeFormatter isoFecha = DateTimeFormatter.ofPattern(yyyyMMdd);
            return dateTimeActual.format(isoFecha);
        }
    }

    public static String getDatePlus(int Years, Date Cal, String Format) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(Format);
        if (Cal != null) {
            calendar.setTime(Cal);
        }
        calendar.add(Calendar.YEAR, Years);
        return sdf.format(calendar.getTime());
    }

    public static Date getDate(String Dat) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date calendar = new Date();
        try {
            calendar = sdf.parse(Dat); // Parsear la cadena de texto a un objeto Date
        } catch (ParseException e) {
            Creator.showInfo(e.toString());
        }
        return calendar;
    }

    public static void animateTransition(javax.swing.JLabel Componente, String Datos) {
        javax.swing.Timer animationTimer = new javax.swing.Timer(50, new java.awt.event.ActionListener() {
            private float alpha = 1.0f;

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                alpha -= 0.1f;
                if (alpha <= 0) {
                    alpha = 0;
                    Componente.setText(Datos);
                }
                Componente.setForeground(new java.awt.Color(0, 0, 0, alpha));
                if (alpha <= 0) {
                    ((javax.swing.Timer) e.getSource()).stop();
                    fadeInNewNumber(Componente);
                }
            }
        });
        animationTimer.start();
    }

    private static void fadeInNewNumber(javax.swing.JLabel Componente) {
        javax.swing.Timer fadeInTimer = new javax.swing.Timer(50, new java.awt.event.ActionListener() {
            float alpha = 0.0f;

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                alpha += 0.1f;
                if (alpha >= 1) {
                    alpha = 1;
                }
                Componente.setForeground(new java.awt.Color(0, 0, 0, alpha));
                if (alpha >= 1) {
                    ((javax.swing.Timer) e.getSource()).stop();
                }
            }
        });
        fadeInTimer.start();
    }

    private static final java.util.Random random = new java.util.Random();
    private static final java.util.concurrent.ThreadLocalRandom threadLocR = java.util.concurrent.ThreadLocalRandom.current();
    private static final java.security.SecureRandom secureR = new java.security.SecureRandom();

    /**
     * Por ejemplo: {valIni = 0, valFin = 4}. El valor sera entre 0 y 3
     *
     * @param Inicio
     * @param Final
     * @return Random simple en un intervalo (by default=SecureRandom).
     */
    public static int getRand(int Inicio, int Final) {
        return secureR.nextInt(Inicio, Final);
    }

    /**
     * Por ejemplo: {valIni = 0, valFin = 4}. El valor sera entre 0 y 3 per no
     * devolvera el parametro final
     *
     * @param Inicio
     * @param Final
     * @param Exclude
     * @return Random simple en un intervalo, excluyendo un numero.
     */
    public static int getRand(int Inicio, int Final, int Exclude) {
        int rand;
        do {
            rand = getRand(Inicio, Final);
        } while (rand == Exclude);
        return rand;
    }

    /**
     * Por ejemplo: {valIni = 0, valFin = 4}. El valor sera entre 0 y 3 Los
     * valores posibles son: 'R'=Random, 'T'=ThreadLocalRandom,
     * 'S'=SecureRandom.
     *
     * @param Inicio
     * @param Final
     * @param Type
     * @return Random multiple en un intervalo.
     */
    public static int getRand(int Inicio, int Final, char Type) {
        return switch (Type) {
            case 'R' ->
                random.nextInt(Inicio, Final);
            case 'T' ->
                threadLocR.nextInt(Inicio, Final);
            default ->
                getRand(Inicio, Final);
        };
    }

    /**
     * Por ejemplo: {valIni = 0, valFin = 4}. El valor sera entre 0 y 3 Los
     * valores posibles son: 'R'=Random, 'T'=ThreadLocalRandom,
     * 'S'=SecureRandom.
     *
     * @param Inicio
     * @param Final
     * @param Type
     * @param Exclude
     * @return Random multiple en un intervalo, excluyendo un numero.
     */
    public static int getRand(int Inicio, int Final, char Type, int Exclude) {
        int rand;
        do {
            rand = getRand(Inicio, Final, Type);
        } while (rand == Exclude);
        return rand;
    }

    /**
     * Por ejemplo: {valIni = 0, valFin = 4}. El valor sera entre 0 y 3 Los
     * valores posibles son: 'R'=Random, 'T'=ThreadLocalRandom,
     * 'S'=SecureRandom.
     *
     * @param Inicio
     * @param Final
     * @param Type
     * @param Exclude
     * @return Random multiple en un intervalo, excluyendo un Arreglo de numeros
     * numero.
     */
    public static int getRand(int Inicio, int Final, char Type, int[] Exclude) {
        int rand;
        do {
            rand = getRand(Inicio, Final, Type);
        } while (contains(Exclude, rand));
        return rand;
    }

    private static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void writeMacroFile(int XFocus, int YFocus, long Tiempo) {
        File archivo = new File(MACRO_DATA.toString());
        try {
            String data = (archivo.exists() ? "" : INFO) + "%" + encrypt("x=" + XFocus + "y=" + YFocus + "t=" + Tiempo);
            try (PrintWriter salida = new PrintWriter(new java.io.FileWriter(archivo, archivo.exists()))) {
                salida.println(data);
            }
//            Creator.showInfo("Se ha escrito dentro del archivo: " + MACRO_DATA);
        } catch (IOException ex) {
//            Creator.showInfo("ERR=writeFocusFile:" + ex.toString());
        }
    }

    public static java.util.ArrayList<String> readMacroFile() { // Leer
        java.util.ArrayList<String> data = new java.util.ArrayList<>();
        File archivo = new File(MACRO_DATA.toString());
        String text = "";
        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo));) {
            String lectura = entrada.readLine();
            while (lectura != null) {
                text += "\n" + lectura;
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERR=readMacroFile:" + ex);
        } catch (IOException ex) {
            System.out.println("ERR=readMacroFile:" + ex);
        }
        String[] words = text.trim().split("\n");
        if (words.length > 3) {
            for (String word : words) {
                if (word.startsWith("%")) {
                    data.add(decrypt(word.substring(1)));
                }
            }
//            Creator.showInfo("Se modificaron los archivos de configuración de manera no autorizada.");
        } else {
//            Creator.showInfo("Se eliminaron los archivos de configuración de manera no autorizada.");
        }
        return data;
    }

    private static final Queue<String> trackQueue = new LinkedList<>(); // Cola de pistas
    private static Clip currentClip = null; // Clip en reproducción

    /**
     * Reproduce una pista de audio.
     *
     * @param path Ruta del archivo de audio.
     * @param inLoop Indica si el audio debe reproducirse en bucle.
     */
    public static void playSound(String path, boolean inLoop) {
        try {
            File soundFile = new File(path);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(inLoop ? -1 : 0);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error al reproducir el sonido: " + e.getMessage());
        }
    }

    /**
     * Agrega una pista a la cola para su reproducción secuencial.
     *
     * @param path Ruta del archivo de audio.
     */
    public static synchronized void addTrackToQueue(String path) {
        trackQueue.offer(path); // Agrega la pista a la cola
//        System.out.println("Se agrego a la cola=" + path + ", currentClip==null=" + (currentClip == null) + ", currentClip.isntRunning=" + !currentClip.isRunning());
        if (currentClip == null || !currentClip.isRunning()) { // Verifica si no hay reproducción activa
            if (currentClip != null) {
                currentClip.close(); // Asegura que cualquier clip previo se cierre
            }
            playNextTrack(); // Inicia la reproducción de la siguiente pista
        }
    }

    /**
     * Reproduce la siguiente pista en la cola.
     */
    private static void playNextTrack() {
        System.out.println("Se iniciara la reproducción=" + trackQueue.toString());
        String nextTrack = trackQueue.poll(); // Obtiene la siguiente pista
        if (nextTrack != null) {
            System.out.println("Inicio");
            try {
                File soundFile = new File(nextTrack);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
                currentClip = AudioSystem.getClip();
                currentClip.open(audioStream);
                currentClip.loop(0);
                currentClip.start();

                // Listener para cuando termine la pista
                currentClip.addLineListener(event -> {
                    if (event.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                        currentClip.close();
                        playNextTrack(); // Reproduce la siguiente pista
                    }
                });
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                System.err.println("Error al reproducir el sonido: " + e.getMessage());
            }
        } else {
            System.out.println("NoInicio");
            currentClip = null; // Si no hay más pistas, libera el clip actual
        }
    }
}
