package mine_sweeper;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 * TODO description
 */
public class Mines extends JFrame {
	
	public Mines(String playerName) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocationRelativeTo(null);
		setTitle("Minesweeper");

		//statusbar = new JLabel();
		add(statusbar, BorderLayout.SOUTH);
		
        bo = new Board(statusbar, playerName);
        add(bo);

		//menuBar = new JMenuBar();
		//menuAbout = new JMenuItem("About");
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

	
	
	public static void initializeMines() {
		JFrame pn = new PlayerName();
		pn.setVisible(true);
    }
}