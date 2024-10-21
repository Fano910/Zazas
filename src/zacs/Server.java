package zacs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import zamain.Acciones;

/**
 *
 * @author leona
 */
public class Server {

    private static final int PORT = 1397; // Puerto en el que el servidor escucha
    private ServerSocket serverSocket;
    private boolean running;
    private ExecutorService threadPool;
    private static ArrayList<String> jugadores;
    private static ArrayList<Integer> ids;

    public static int getPORT() {
        return PORT;
    }

    public String getServerIP() {
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            return localAddress.getHostAddress();
        } catch (UnknownHostException e) {
            Arquitecture.showInfo("Err: " + e);
            return "IP desconocida";
        }
    }

    public void startServer() {
        running = true;
        threadPool = Executors.newCachedThreadPool();
        Thread serverThread = new Thread(() -> {
            try {
                serverSocket = new ServerSocket(PORT);

                while (running) {
                    try {
                        Socket clientSocket = serverSocket.accept();
                        javax.swing.JOptionPane.showMessageDialog(null, "Cliente conectado: " + clientSocket.getInetAddress());
                        threadPool.execute(new ClientHandler(clientSocket));
                    } catch (IOException e) {
                        if (running) {
                            Arquitecture.showInfo("Err: " + e);
                        }
                    }
                }
            } catch (IOException e) {
                Arquitecture.showInfo("Err: " + e);
            } finally {
                stopServer();
            }
        });
        serverThread.start();
    }

    public void stopServer() {
        running = false;
        if (threadPool != null && !threadPool.isShutdown()) {
            threadPool.shutdownNow();
        }
        if (serverSocket != null && !serverSocket.isClosed()) {
            try {
                serverSocket.close();
                javax.swing.JOptionPane.showMessageDialog(null, "Servidor apagado correctamente");
            } catch (IOException e) {
                Arquitecture.showInfo("Err: " + e);
            }
        }
    }

    private static class ClientHandler implements Runnable {

        private final Socket clientSocket;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                String request;
                while ((request = in.readLine()) != null) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Recibido del cliente: " + request);
                    String response = "NAN";
                    String req = Acciones.decrypt(request);
                    switch (req.substring(4, 7)) {
                        case "NEW" -> {
                            int id;
                            do {
                                id = Acciones.getRand(1000, 9999);
                            } while (ids.contains(id));
                            ids.add(id);
                            jugadores.add(req.substring(7));
                            // Agregar mas datos de identificacion y control.
                        }
                        case "TIM" ->
                            Arquitecture.showInfo(request);
                    }
                    out.println(Acciones.encrypt(response));
                }
            } catch (IOException e) {
                Arquitecture.showInfo("Err: " + e);
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    Arquitecture.showInfo("Err: " + e);
                }
            }
        }
    }
}
