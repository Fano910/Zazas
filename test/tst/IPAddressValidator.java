package tst;

/**
 *
 * @author leona
 */
import java.util.regex.Pattern;

public class IPAddressValidator {
    // Expresión regular para validar direcciones IP
    private static final String IPADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
    private static final Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);

    // Método para validar si una cadena es una dirección IP válida
    public static boolean isValidIPAddress(String ip) {
        if (ip == null) {
            return false;
        }
        return pattern.matcher(ip).matches();
    }

    // Método principal para probar la validación de IPs
    public static void main(String[] args) {
        String[] testIPs = {
            "192.168.1.1",
            "255.255.255.255",
            "256.256.256.256",
            "192.168.1",
            "123.456.78.90",
            "192.168.1.01",
            "0.0.0."
        };

        for (String ip : testIPs) {
            System.out.println(ip + " is valid: " + isValidIPAddress(ip));
        }
    }
}
