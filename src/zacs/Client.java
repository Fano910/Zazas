package zacs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import zamain.Acciones;

/**
 *
 * @author leona
 */
public class Client {

    private static final int PORT = 1397;
    private static int ID = 1000;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private boolean running = false;
    private ExecutorService threadPool;

    public void startClient(String IP, String Identifier) {
        running = true;
        threadPool = Executors.newCachedThreadPool();
        threadPool.execute(() -> {
            String serverAddress = IP.isBlank() ? findServer() : IP;

            if (serverAddress != null) {
                try {
                    socket = new Socket(serverAddress, PORT);
                    Arquitecture.showInfo("Conectado al servidor en " + serverAddress);
                    out = new PrintWriter(socket.getOutputStream(), true);
                    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    // Enviar un primer mensaje al servidor
                    ID = Integer.parseInt(sendMessage("NEW" + Identifier));
                    // Mantiene la conexión abierta para enviar más mensajes si es necesario
                } catch (IOException e) {
                    Arquitecture.showInfo("Err: " + e);
                }
            } else {
                Arquitecture.showInfo("No se pudo encontrar el servidor en la red.");
            }
        });
    }

    public String sendMessage(String message) {
        try {
            if (out != null) {
                out.println(Acciones.encrypt(ID + message));
                // Leer la respuesta del servidor
                String response = in.readLine();
                return Acciones.decrypt(response);
            }
        } catch (IOException e) {
            Arquitecture.showInfo("Err: " + e);
        }
        return "ERR";
    }

    public void stopClient() {
        running = false;
        if (threadPool != null && !threadPool.isShutdown()) {
            threadPool.shutdownNow();
        }
        if (socket != null && !socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e) {
                Arquitecture.showInfo("Err: " + e);
            }
        }
    }

    private String findServer() {
        String serverIP = null;
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            byte[] ip = localAddress.getAddress();

            for (int i = 1; i < 255; i++) {
                ip[3] = (byte) i;
                InetAddress address = InetAddress.getByAddress(ip);

                if (address.isReachable(100)) {
                    try (Socket sckt = new Socket()) {
                        sckt.connect(new InetSocketAddress(address, PORT), 100);
                        serverIP = address.getHostAddress();
                        break;
                    } catch (IOException e) {
                        // Continúa con la siguiente IP
                    }
                }
            }
        } catch (IOException e) {
            Arquitecture.showInfo("Err: " + e);
        }
        return serverIP;
    }
}

//                    socket = new Socket(serverAddress, PORT);
//                    JOptionPane.showMessageDialog(null, "Conectado al servidor en " + serverAddress);
//
//                    try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
//
//                        out.println("Hola servidor, soy un cliente!");
//                        String response = in.readLine();
//                        JOptionPane.showMessageDialog(null, "Respuesta del servidor: " + response);
//                    }
