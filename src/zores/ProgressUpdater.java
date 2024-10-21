package zores;

import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author leona
 */

public class ProgressUpdater extends SwingWorker<Void, Integer> {
    private final JProgressBar progressBar;
    private final double resultado;
    
    public ProgressUpdater(JProgressBar progressBar, double resultado) {
        this.progressBar = progressBar;
        this.resultado = resultado;
    }
    
    @Override
    protected Void doInBackground() throws Exception {
        int current = progressBar.getValue();
        int target = (int) resultado;
        int step = 1; // Incremento por paso
        
        // Actualizar el progreso de manera gradual
        while (current < target) {
            current += step;
            if (current > target) {
                current = target;
            }
            publish(current);
            Thread.sleep(100); // Tiempo entre cada incremento
        }
        return null;
    }
    
    @Override
    protected void process(java.util.List<Integer> chunks) {
        int value = chunks.get(chunks.size() - 1);
        progressBar.setValue(value);
    }
}
