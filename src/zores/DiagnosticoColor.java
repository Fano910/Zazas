package zores;

/**
 *
 * @author leona
 */
public class DiagnosticoColor {

    // Valores umbral de diferencia para detectar problemas en cada canal
    private static final int UMBRAL_ROJO = 30;
    private static final int UMBRAL_VERDE = 30;
    private static final int UMBRAL_AZUL = 30;

    // Valores para diagnosticar problemas generales
    private static final int UMBRAL_INTENSIDAD = 100;
    private static final int UMBRAL_SATURACION = 50;

    /**
     * Método para calcular la intensidad de un color
     *
     * @param r Valor del canal rojo
     * @param g Valor del canal verde
     * @param b Valor del canal azul
     * @return La intensidad del color
     */
    private static double calcularIntensidad(int r, int g, int b) {
        return (r + g + b) / 3.0;
    }

    /**
     * Método para calcular la saturación de un color
     *
     * @param r Valor del canal rojo
     * @param g Valor del canal verde
     * @param b Valor del canal azul
     * @return La saturación del color
     */
    private static double calcularSaturacion(int r, int g, int b) {
        int min = Math.min(Math.min(r, g), b);
        int max = Math.max(Math.max(r, g), b);
        return max == 0 ? 0 : ((max - min) / (double) max) * 100;
    }

    /**
     * Método para generar el diagnóstico basado en la comparación de colores
     *
     * @param fR Valor real del canal rojo
     * @param fG Valor real del canal verde
     * @param fB Valor real del canal azul
     * @param r Valor replicado del canal rojo
     * @param g Valor replicado del canal verde
     * @param b Valor replicado del canal azul
     * @return String con el diagnóstico detallado
     */
    public static String diagnosticar(int fR, int fG, int fB, int r, int g, int b) {
        // Calcular la diferencia en cada canal de color
        int diferenciaR = Math.abs(fR - r);
        int diferenciaG = Math.abs(fG - g);
        int diferenciaB = Math.abs(fB - b);

        // Calcular intensidad y saturación
        double intensidadReal = calcularIntensidad(fR, fG, fB);
        double intensidadReplicado = calcularIntensidad(r, g, b);
        double saturacionReal = calcularSaturacion(fR, fG, fB);
        double saturacionReplicado = calcularSaturacion(r, g, b);

        // Diagnóstico inicial
        StringBuilder diagnostico = new StringBuilder("Color ORIGINAL, en descomposición RGB: R=" + fR + " G=" + fG + " B=" + fB + "\n");

        // Analizar el canal rojo
        if (diferenciaR > UMBRAL_ROJO) {
            diagnostico.append("Problema detectado en la percepción del rojo. ");
            diagnostico.append("Posible protanomalía (dificultad para distinguir tonos rojos).\n");
        } else {
            diagnostico.append("Percepción del rojo dentro de los valores normales.\n");
        }

        // Analizar el canal verde
        if (diferenciaG > UMBRAL_VERDE) {
            diagnostico.append("Problema detectado en la percepción del verde. ");
            diagnostico.append("Posible deuteranomalía (dificultad para distinguir tonos verdes).\n");
        } else {
            diagnostico.append("Percepción del verde dentro de los valores normales.\n");
        }

        // Analizar el canal azul
        if (diferenciaB > UMBRAL_AZUL) {
            diagnostico.append("Problema detectado en la percepción del azul. ");
            diagnostico.append("Posible tritanomalía (dificultad para distinguir tonos azules).\n");
        } else {
            diagnostico.append("Percepción del azul dentro de los valores normales.\n");
        }

        // Análisis de intensidad
        if (Math.abs(intensidadReal - intensidadReplicado) > UMBRAL_INTENSIDAD) {
            diagnostico.append("Diferencia significativa en la intensidad del color. ");
            diagnostico.append("Esto podría indicar problemas para juzgar la luminosidad general del color.\n");
        }

        // Análisis de saturación
        if (Math.abs(saturacionReal - saturacionReplicado) > UMBRAL_SATURACION) {
            diagnostico.append("Diferencia significativa en la saturación del color. ");
            diagnostico.append("Esto podría sugerir dificultades para percibir la intensidad del color o diferencias en el contraste.\n");
        }

        // Conclusión general
        if (diferenciaR <= UMBRAL_ROJO && diferenciaG <= UMBRAL_VERDE && diferenciaB <= UMBRAL_AZUL
                && Math.abs(intensidadReal - intensidadReplicado) <= UMBRAL_INTENSIDAD
                && Math.abs(saturacionReal - saturacionReplicado) <= UMBRAL_SATURACION) {
            diagnostico.append("No se detectaron problemas significativos en la percepción del color.");
        } else {
            diagnostico.append("Se recomienda realizar una evaluación más detallada con un especialista en visión del color.");
        }

        return diagnostico.toString();
    }
//    public static void main(String[] args) {
//        // Ejemplo de uso con valores almacenados
//        int fR = 255, fG = 100, fB = 50; // Color real
//        int r = 200, g = 150, b = 50;    // Color replicado por la persona
//
//        // Generar diagnóstico
//        String resultado = diagnosticar(fR, fG, fB, r, g, b);
//        System.out.println(resultado);
//    }
}

//public class DiagnosticoColor { // Carmelo o Karla pueden utilizar esta clase
//
//    // Valores umbral de diferencia para detectar problemas en cada canal
//    private static final int UMBRAL_ROJO = 50;
//    private static final int UMBRAL_VERDE = 50;
//    private static final int UMBRAL_AZUL = 50;
//
//    /**
//     * Método para generar el diagnóstico basado en la comparación de colores
//     * 
//     * @param replyR Valor real del canal rojo
//     * @param replyG Valor real del canal verde
//     * @param replyB Valor real del canal azul
//     * @param r  Valor replicado del canal rojo
//     * @param g  Valor replicado del canal verde
//     * @param b  Valor replicado del canal azul
//     * @return String con el diagnóstico basado en las diferencias de colores
//     */
//    public static String diagnosticar(int replyR, int replyG, int replyB, int r, int g, int b) {
//        // Calcular la diferencia en cada canal de color
//        int diferenciaR = Math.abs(replyR - r);
//        int diferenciaG = Math.abs(replyG - g);
//        int diferenciaB = Math.abs(replyB - b);
//
//        // Diagnóstico inicial
//        StringBuilder diagnostico = new StringBuilder("Diagnóstico basado en la prueba de colores:\n");
//
//        // Analizar el canal rojo
//        if (diferenciaR > UMBRAL_ROJO) {
//            diagnostico.append("Problema detectado en la percepción del rojo. ");
//            diagnostico.append("Posible protanomalía o protanopía (deficiencia en la visión del rojo).\n");
//        } else {
//            diagnostico.append("Percepción del rojo dentro de los valores normales.\n");
//        }
//
//        // Analizar el canal verde
//        if (diferenciaG > UMBRAL_VERDE) {
//            diagnostico.append("Problema detectado en la percepción del verde. ");
//            diagnostico.append("Posible deuteranomalía o deuteranopía (deficiencia en la visión del verde).\n");
//        } else {
//            diagnostico.append("Percepción del verde dentro de los valores normales.\n");
//        }
//
//        // Analizar el canal azul
//        if (diferenciaB > UMBRAL_AZUL) {
//            diagnostico.append("Problema detectado en la percepción del azul. ");
//            diagnostico.append("Posible tritanomalía o tritanopía (deficiencia en la visión del azul).\n");
//        } else {
//            diagnostico.append("Percepción del azul dentro de los valores normales.\n");
//        }
//
//        // Conclusión general
//        if (diferenciaR <= UMBRAL_ROJO && diferenciaG <= UMBRAL_VERDE && diferenciaB <= UMBRAL_AZUL) {
//            diagnostico.append("No se detectaron problemas significativos en la percepción del color.");
//        } else {
//            diagnostico.append("Se recomienda realizar una evaluación más detallada.");
//        }
//
//        return diagnostico.toString();
//    }
