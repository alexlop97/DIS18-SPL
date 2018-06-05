package mine_sweeper;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
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
    private Board bo;
    
    public Mines() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Minesweeper");

        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);
        
        bo = new Board(statusbar);
        add(bo);
        
        menuBar = new JMenuBar();
        menuAbout = new JMenuItem("About");
        menuAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ab.setVisible(true);
				
			}
		});
        
        menuBar.add(menuAbout);
        add(menuBar, BorderLayout.NORTH);

        setResizable(false);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
            	initializeMines();
            }
        });
    }
    
    public static void initializeMines() {
    	JFrame ex = new Mines();
        ex.setVisible(true);
    }
    
    public Mines(String playerName) {
    	statusbar = new JLabel();
    	menuBar = new JMenuBar();
    	menuAbout = new JMenuItem("About");
    }
}