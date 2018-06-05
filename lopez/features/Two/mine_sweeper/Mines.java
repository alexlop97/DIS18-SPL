package mine_sweeper;

import javax.swing.SwingUtilities;

/**
 * TODO description
 */
public class Mines {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
            	Two tw = new Two();
            	tw.setVisible(true);
            }
        });
    }
}