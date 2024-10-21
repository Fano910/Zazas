package zacs;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.catalina.Context;

/**
 *
 * @author leona
 */
public class MyServlet {

    public static void main(String[] args) throws LifecycleException {
        // Crear una instancia de Tomcat embebido
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // Configurar la carpeta base para la aplicación
        tomcat.getHost().setAppBase(".");

        // Crear el contexto de la aplicación
        Context ctx = tomcat.addContext("", null);

        // Registrar los servlets
        Tomcat.addServlet(ctx, "LoginServlet", new LoginServlet());
        Tomcat.addServlet(ctx, "MoveServlet", new MoveServlet());

        // Mapear servlets a las rutas
        ctx.addServletMappingDecoded("/login", "LoginServlet");
        ctx.addServletMappingDecoded("/move", "MoveServlet");

        // Iniciar Tomcat
        tomcat.start();
        System.out.println("Servidor Tomcat embebido corriendo en el puerto 8080...");

        // Mantener el servidor en ejecución
        tomcat.getServer().await();
    }

    // Servlet para manejar el login
    public static class LoginServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            // Procesar login
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            // Aquí puedes agregar la lógica para validar los datos
            resp.getWriter().println("Login exitoso: " + username);
        }
    }

    // Servlet para manejar movimientos desde la web
    public static class MoveServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            // Procesar la acción en la aplicación de escritorio
            String action = req.getParameter("action");
            System.out.println("Recibida acción: " + action);

            // Ejecutar lógica en la app de escritorio
            resp.getWriter().println("Movimiento ejecutado: " + action);
        }
    }
}
