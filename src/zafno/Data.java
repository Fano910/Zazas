package zafno;

import java.awt.Point;
import zamain.Acciones;

/**
 *
 * @author leona
 */
public enum Data {
    /**
     * Valor entero de la posición en donde se encuentra. Def=-1
     */
    PLACE,
    /**
     * Ubicación actual. Def=Point(x, y)
     */
    UBIETY,
    /**
     * FINAL:Jugador al que pertenece este elemento. Def=1
     */
    PLAYER,
    /**
     * FINAL:Posiciones extra para coincidir en el tablero. Def=0
     */
    POSITIONS,
    /**
     * FINAL:Ubicación original. Def=Point(x, y)
     */
    ORIGINAL;

    public enum MARBLE {
        /**
         * Mensaje para cuando no puedes moverte de la zona segura.
         *
         * @see "Aún no puedes moverte de la zona segura."
         */
        CANNOT_MOVE("Aún no puedes moverte de la zona segura."),
        /**
         * Mensaje para cuando no has movido el dado.
         *
         * @see "Aún no has movido el dado."
         */
        MOVE_DICE("Aún no has movido el dado."),
        /**
         * Mensaje para cuando una canica está en movimiento.
         *
         * @see "Ya hay una canica en movimiento"
         */
        MARBLE_IS_MOVING("Ya hay una canica en movimiento"),
        /**
         * Mensaje para cuando la canica no pertenece al jugador.
         *
         * @see "Esta canica no forma parte de tu colección."
         */
        NOT_OWNER_MARBLE("Esta canica no forma parte de tu colección."),
        /**
         * Mensaje para cuando no puedes salir del área segura con cierto valor.
         *
         * @see "No puedes salir del área segura con: "
         */
        CANNOT_LEAVE("No puedes salir del área segura con: ");

        private final String texto;

        MARBLE(String Texto) {
            this.texto = Texto;
        }

        /**
         * @return Texto asociado.
         * @see Para ver el texto dirigete a la constante y presiona
         * 'ctrl+space'.
         */
        @Override
        public String toString() {
            return texto;
        }
    }

    public enum SRC {
        /**
         * @see ".\\src\\data\\"
         */
        RAIZ(".\\src\\data\\"),
        /**
         * <strong>Returns: </strong><li>{@link RAIZ} + Images\\
         */
        IMAGES(RAIZ + "Images\\"),
        /**
         * <strong>Returns: </strong><li>{@link IMAGES} + Marble\\
         */
        MARBLES(IMAGES + "Marble\\"),
        /**
         * <strong>Returns: </strong><li>{@link IMAGES} + Dice\\
         */
        DICES(IMAGES + "Dice\\");
        private final String path;

        SRC(String Path) {
            this.path = Path;
        }

        @Override
        public String toString() {
            return this.path;
        }
    }

    public enum POINT {
        ;

        public static Point at(int n) {
            return points[n];
        }
        public static void set() {
            points[4].y = 3;
        }
        private static final Point[] points = new Point[]{
            new Point(242, 19), // 0. INICIA NEGRO
            new Point(242, 68),
            new Point(242, 109),
            new Point(242, 153),
            new Point(242, 192),
            new Point(242, 241),
            new Point(195, 241),
            new Point(149, 241),
            new Point(104, 241),
            new Point(63, 241),
            new Point(21, 241),
            new Point(21, 287),
            new Point(21, 329), // 12. TERMINA NEGRO
            new Point(21, 374), // 13. INICIA AMARILLO
            new Point(21, 418),
            new Point(61, 418),
            new Point(105, 418),
            new Point(149, 418),
            new Point(195, 418),
            new Point(242, 418),
            new Point(242, 468),
            new Point(242, 514),
            new Point(242, 555),
            new Point(242, 605),
            new Point(242, 652),
            new Point(290, 652),
            new Point(335, 652), // 26. TERMINA AMARILLO
            new Point(385, 652), // 27. INICIA ROJO
            new Point(427, 652),
            new Point(427, 606),
            new Point(427, 556),
            new Point(427, 514),
            new Point(427, 469),
            new Point(427, 419),
            new Point(470, 419),
            new Point(514, 419),
            new Point(558, 419),
            new Point(601, 419),
            new Point(643, 419),
            new Point(643, 366),
            new Point(643, 330), // 40. TERMINA ROJO
            new Point(643, 286), // 41. INICIA AZUL
            new Point(643, 241),
            new Point(501, 241),
            new Point(558, 241),
            new Point(514, 241),
            new Point(470, 241),
            new Point(427, 241),
            new Point(427, 194),
            new Point(427, 150),
            new Point(427, 109),
            new Point(427, 68),
            new Point(427, 19),
            new Point(385, 19),
            new Point(335, 19),
            new Point(293, 19), // 55. TERMINA AZUL
            new Point(335, 68), // 56. FINALIZA NEGRO
            new Point(335, 109),
            new Point(335, 152),
            new Point(335, 194),
            new Point(335, 241),
            new Point(61, 330), // 61. FINALIZA AMARILLO
            new Point(105, 330),
            new Point(149, 330),
            new Point(195, 330),
            new Point(242, 330),
            new Point(335, 605), // 66. FINALIZA ROJO
            new Point(335, 556),
            new Point(335, 514),
            new Point(335, 468),
            new Point(335, 418),
            new Point(601, 330), // 71. FINALIZA AZUL
            new Point(558, 330),
            new Point(514, 330),
            new Point(470, 330),
            new Point(427, 330),
            new Point(335, 330), // 76. CENTRO
            new Point(80, 0), // GUARDA Jugador 1 (Posición 77).
            new Point(40, 0),
            new Point(0, 0),
            new Point(0, 40),
            new Point(40, 40),
            new Point(0, 578), // GUARDA Jugador 2 (Posición 82).
            new Point(0, 618),
            new Point(0, 658),
            new Point(40, 658),
            new Point(40, 618),
            new Point(578, 658), // GUARDA Jugador 3 (Posición 87).
            new Point(618, 658),
            new Point(658, 658),
            new Point(658, 618),
            new Point(618, 618),
            new Point(658, 80), // GUARDA Jugador 4 (Pocisión 92).
            new Point(658, 40),
            new Point(658, 0),
            new Point(618, 0),
            new Point(618, 40)
        };
    }

    /**
     * Categoría de alertas para concientizar sobre la piratería en el juego. Se
     * presentan en diferentes tipos de alertas: textos suaves, ventanas
     * emergentes molestas, y mensajes inspiradores, dependiendo de la elección
     * del jugador.
     */
    public enum ALERTS {
        /**
         * <h2>0. Acción mediante perifericos</h2>
         * <strong>Descripción: </strong>DESCRIPCIÓN AQUI
         * <p>
         * <strong>Apariencia: </strong>APARIENCIA AQUI</p>
         * <p>
         * <strong>Ejemplo: </strong>EJEMPLO AQUI</p>
         * <p>
         * <strong>Frecuencia de aparición: </strong>FRECUENCIA DE APARICIÓN
         * AQUI</p>
         */
        INTERRUPCIÓN(0),
        /**
         * <h2>1. Mensaje de <cite>Apoyo al Contenido Original</cite>
         * (Inspirador)</h2><hr>
         * <strong>Descripción:</strong> Una alerta de concientización que
         * motiva al jugador a apoyar el trabajo original. Reforzando la
         * gratificación al elegir original, recuerda al jugador que están
         * ayudando a los creadores.
         * <p>
         * <strong>Apariencia:</strong> Un <cite>texto suave y sutil</cite> en
         * la parte inferior de la pantalla, con un efecto de entrada gradual
         * (tipo “subtítulo”).
         * <p>
         * <strong>Ejemplo en el juego:</strong> “Gracias por apoyar el
         * contenido original. ¡Cada elección hace la diferencia!”
         * <p>
         * <strong>Frecuencia de aparición:</strong> Surge tras <cite>rechazar
         * una opción pirata</cite> o después de completar niveles comprando
         * original.
         * <li>test0
         * <sup>test1</sup>
         * <pre>test2</pre>
         */
        APOYO(1),
        /**
         * <h2>2. Falla de Sistema (Conexión Perdida)</h2><hr>
         * <strong>Descripción:</strong> Simula una falla o interrupción del
         * juego. Refuerza la idea de que la piratería no es confiable y puede
         * afectar la experiencia del jugador.
         * <p>
         * <strong>Apariencia:</strong> Aparece en una ventana molesta y de gran
         * tamaño que oscurece el juego, y el mensaje alterna entre rojo y gris
         * para representar “caída del sistema”.</p>
         * <p>
         * <strong>Ejemplo:</strong> Cuando el jugador intenta acceder a
         * contenido pirata, aparece un mensaje grande: "Conexión perdida por
         * contenido no original. Reconectando…"</p>
         * <p>
         * <strong>Frecuencia de aparición:</strong> Esto puede ocurrir
         * aleatoriamente en el juego después de elegir opciones piratas,
         * afectando el progreso temporalmente.</p>
         */
        FALLA(2),
        /**
         * <h2>3. Alerta de Consecuencia Inmediata</h2><hr>
         * <strong>Descripción:</strong> Esta alerta aparece tras elegir una
         * opción pirata y muestra una desventaja inesperada como consecuencia
         * directa de esa decisión.
         * <p>
         * <strong>Apariencia:</strong> Un mensaje en color rojo o amarillo
         * vibrante aparece en pantalla con un breve parpadeo para captar
         * atención, seguido de una transición rápida para comunicar
         * urgencia.</p>
         * <p>
         * <strong>Ejemplo:</strong> Si el jugador elige una versión pirata,
         * puede aparecer un mensaje que diga: "¡Virus detectado! Tu progreso se
         * ha perdido."</p>
         * <p>
         * <strong>Frecuencia de aparición:</strong> Aparece en el momento en
         * que el jugador elige una opción de piratería.</p>
         */
        CONSECUENCIA(3),
        /**
         * <h2>4. Mensajes de</h2><hr>
         * <strong>Descripción: </strong>DESCRIPCIÓN AQUI
         * <p>
         * <strong>Apariencia: </strong>APARIENCIA AQUI</p>
         * <p>
         * <strong>Ejemplo: </strong>EJEMPLO AQUI</p>
         * <p>
         * <strong>Frecuencia de aparición: </strong>FRECUENCIA DE APARICIÓN
         * AQUI</p>
         */
        SMS(4);

        private final int n;

        ALERTS(int Type) {
            this.n = Type;
        }

        /**
         * @return Mensaje aleatorio de la constante.
         */
        public String getRandomOf() {
            return deepAlertsArray[n][Acciones.getRand(0, (n > 0 ? 30 : 5))];
        }

        private final String[][] deepAlertsArray = {{ // Inicia 0
            "INT1", "INT2", "INT3", "INT4", "INT5"}, { // Inicia 1
            "Apoya la creación original. Cada compra genuina hace la diferencia.",
            "Gracias por valorar el esfuerzo de quienes crean contenido de calidad.",
            "Cada versión original impulsa la innovación y la calidad. ¡Gracias!",
            "Tu apoyo fortalece a los creadores. ¡Sigue eligiendo contenido auténtico!",
            "¡Compra original y contribuye a más y mejor contenido!",
            "Cada adquisición legal hace posible un mundo de nuevas ideas.",
            "Gracias por elegir calidad y autenticidad. ¡Eres parte del cambio!",
            "Adquirir original asegura la evolución del contenido que amas.",
            "Tu decisión de apoyar lo genuino inspira a todos los creadores.",
            "Elige original y ayuda a crear un ecosistema justo para todos.",
            "Gracias por apoyar la dedicación que hay detrás del contenido auténtico.",
            "Con cada compra original, creces junto a tus creadores favoritos.",
            "Sigue valorando el esfuerzo y dedicación: elige contenido legal.",
            "Tu elección impulsa la creatividad. Gracias por apoyar lo auténtico.",
            "Gracias por contribuir a un futuro lleno de innovación y calidad.",
            "Cada copia original es un voto por la calidad. ¡Gracias por votar!",
            "El valor de lo genuino está en cada decisión. ¡Apoya lo real!",
            "Gracias por apoyar contenido de calidad y respeto al trabajo creativo.",
            "Lo original tiene el poder de cambiar vidas. ¡Gracias por tu apoyo!",
            "Al elegir original, apoyas la estabilidad de todos los creadores.",
            "Tu decisión ayuda a mantener la calidad en cada experiencia.",
            "Eres parte de una comunidad que elige lo real. ¡Gracias por tu apoyo!",
            "Comprar original asegura que todos puedan beneficiarse.",
            "Gracias por apoyar un contenido que cambia el mundo.",
            "Cada decisión de elegir lo auténtico crea un impacto positivo.",
            "Lo genuino hace la diferencia. Gracias por apoyarlo.",
            "Tus elecciones reflejan tu aprecio por la creatividad y el esfuerzo.",
            "Eres parte del cambio. Gracias por elegir el contenido auténtico.",
            "Gracias por valorar la calidad y el esfuerzo de cada creador.",
            "Cada compra legal permite seguir innovando. ¡Gracias por apoyar!"}, { // Inicia 2
            "Conexión perdida por acceso no autorizado. Intentando reconectar...",
            "Error: Servidor inestable. Reintentar más tarde.",
            "Tu progreso podría estar en riesgo. Reestableciendo conexión...",
            "Interrupción inesperada. Reconectando en 5 segundos...",
            "Reintentando conexión debido a contenido no original...",
            "Conexión bloqueada: red sin autorización.",
            "Error de red: contenido pirata detectado. Cerrando sesión...",
            "Servidor caído temporalmente. Reintento automático activado.",
            "Sin acceso a funciones en línea debido a software ilegal.",
            "Conexión limitada. No se puede acceder al contenido adicional.",
            "Error de red: solo el software original permite reconexión segura.",
            "Sin permiso de acceso. Reestablece la conexión.",
            "Fallo de red: contenido no permitido. Reconectando...",
            "Conexión perdida por archivos no certificados. Reiniciando...",
            "Error crítico de red. Pérdida de acceso temporal.",
            "Interrupción del juego por actividad no segura detectada.",
            "Sin acceso al servidor oficial. Reinstala versión autorizada.",
            "Acceso bloqueado a contenido en línea.",
            "Incompatibilidad de red: reconexión forzada.",
            "Reconectando… archivo inseguro en el sistema.",
            "Error de conexión: contenido pirata inhabilitado.",
            "Reintento en curso. Sistema de conexión bloqueado.",
            "Acceso negado: actualización requerida para conectividad segura.",
            "Red comprometida: reconexión no autorizada.",
            "Desconexión automática. Reestableciendo en 10 segundos...",
            "Reconectando… error en el archivo de conexión.",
            "Conexión inestable: software no verificado.",
            "Error de red: contenido no verificado bloqueado.",
            "Red comprometida: restaurando versión original.",
            "Pérdida de conexión. Sistema inestable."}, { // Inicia 3
            "Tu equipo se está calentando debido a archivos maliciosos...",
            "¡Fallo de sistema detectado! La instalación no pudo completarse.",
            "Error de archivo crítico: versión pirata detectada, posible pérdida de datos.",
            "Aplicación corrupta: se ha dañado el progreso guardado.",
            "¡Cuidado! Algunos datos se han perdido al instalar este archivo no autorizado.",
            //"Incompatibilidad del sistema: el juego se cerrará inesperadamente.",
            "Archivo peligroso detectado: tu puntuación se ha reducido por errores.",
            "Instalación fallida: la versión es demasiado antigua y no funciona correctamente.",
            "Acceso denegado. Funciones clave bloqueadas por uso de software ilegal.",
            "Mal funcionamiento crítico: ¡Se ha dañado tu puntuación!",
            "Virus activo: el rendimiento del juego se reducirá un 50%.",
            "Se detectó una amenaza de seguridad, borrando progreso...",
            "Advertencia: archivos defectuosos pueden afectar el dispositivo.",
            "Problema de red: descarga no autorizada afectando la conexión.",
            "Sistema inestable: pérdida de funciones avanzadas en el juego.",
            "Error de instalación: tus opciones están limitadas en esta versión pirata.",
            "Progreso eliminado: el archivo no se pudo verificar correctamente.",
            "Riesgo de spyware: ¡Pérdida de puntos hasta reiniciar el juego!",
            "Versión obsoleta: no se puede acceder a niveles avanzados.",
            "Fallos de audio: ¡el juego está silenciado debido a una falla!",
            "Error de seguridad: tu cuenta podría ser vulnerable.",
            "Interrupción repentina: reinicio requerido por fallos no autorizados.",
            "Inestabilidad en el sistema: esta versión no tiene soporte oficial.",
            "Acceso bloqueado: niveles y bonificaciones limitadas.",
            "¡Fallo al guardar! El archivo no coincide con el sistema.",
            "Pérdida de archivos: no se pudo guardar el progreso en el sistema.",
            "Infección activa: el juego se cerrará en breve.",
            "Error crítico de gráficos: interfaz dañada por software no original.",
            "Descarga dañada: la calidad del juego se ha reducido.",
            "Tu seguridad está comprometida: ¡Actualiza a la versión original para protegerte!",
            "Pérdida de control del juego por instalación incorrecta."}, { // Inicia 4
            "¿Estás buscando versiones\npremium sin costo?\n¡Encuentra aquí!",
            "¿Quieres toda la música de\ntus artistas favoritos sin\npagar?",
            "¿Te interesa descargar el\nnuevo lanzamiento de\nvideojuegos gratis?",
            "¿Buscas juegos completos\ncon todos los niveles\ndesbloqueados sin pagar?",
            "¿Quieres libros digitales\nde pago gratis en un solo\nclick?",
            "¿Necesitas las últimas\npelículas en alta calidad\nsin costos adicionales?",
            "¿Prefieres la versión\ngratuita de este software\npremium con crack?",
            "¿Te gustaría descargar\naplicaciones exclusivas\nsin pagar ni un centavo?",
            "¿Quieres toda la colección\nde software premium\ncompletamente gratis?",
            "¿Te interesa desbloquear\ntodas las funciones sin\npagar nada extra?",
            "¿Prefieres una alternativa\npirata en lugar de pagar el precio completo?",
            "¿Quieres descargar series\ncompletas gratis y en un \nolo enlace?",
            "¿Te interesa tener todo el\ncontenido sin costo alguno?",
            "¿Buscas juegos sin\nrestricciones sin pagar un\ncentavo?",
            "¿Quieres el paquete\ncompleto de esta app\npremium sin pagar?",
            "¿Prefieres la opción\ngratis en lugar de comprar\noriginal?",
            "¿Te gustaría acceder a la\n funciones avanzadas de\neste programa gratis?",
            "¿Estás buscando licencias\npremium sin costo?",
            "¿Te interesa todo el\nsoftware exclusivo a\nprecio de ganga?",
            "¿Prefieres la versión\ncompleta por un precio\nmenor?",
            "¿Buscas herramientas de\ndiseño premium sin pagar\nun solo peso?",
            "¿Quieres obtener este\nsoftware sin costo de\nmanera rápida?",
            "¿Buscas una alternativa\npirata para no gastar?",
            "¿Prefieres contenido\npremium sin tener que\npagar por él?",
            "¿Quieres disfrutar de este\nsoftware sin ningún gasto?",
            "¿Buscas versiones full sin\npagar?",
            "¿Te gustaría obtener todos\nlos beneficios sin costo?",
            "¿Prefieres la opción\nbarata del mercado?",
            "¿Quieres tener acceso\nilimitado sin pagar extra?",
            "¿Buscas descuentos\nincreíbles o versiones\npirata sin costo?"}};
    }
}
