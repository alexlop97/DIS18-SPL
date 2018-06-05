package mine_sweeper;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;


public class Mines extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int FRAME_WIDTH = 246;
    private final int FRAME_HEIGHT = 308;

    private final JLabel statusbar;
    private final JMenuBar menuBar;
    private final JMenuItem menuAbout;
    private final About ab = new About();
    
    public Mines() {

    }
}