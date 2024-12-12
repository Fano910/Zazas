package tst;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author leona
 */
public class AudioPlayer {

    //public static vois ain[String args]
    /**
     * Reproduce un archivo de audio.
     *
     * @param path Ruta del archivo de audio a reproducir.
     * @param InLoop
     */
    public static void playSound(String path, boolean InLoop) {
        try {
            // Cargar el archivo de audio
            File soundFile = new File("");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);

            // Obtener un clip para reproducir el audio
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(InLoop ? -1 : 1);
            // Reproducir el audio
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error al reproducir el sonido: " + e.getMessage());
        }
    }
}
