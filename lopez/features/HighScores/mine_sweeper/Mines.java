package mine_sweeper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

/**
 * TODO description
 */
public class Mines {
	
	public HighScores hs;

	public Mines() {

		JMenuItem menuHighScores = new JMenuItem("High Scores");
		menuHighScores.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				hs = new HighScores(bo);
				hs.setVisible(true);

			}
		});
		menuBar.add(menuHighScores);
	}

	public Mines(String s) {

		JMenuItem menuHighScores = new JMenuItem("High Scores");
		menuHighScores.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				hs = new HighScores(bo);
				hs.setVisible(true);

			}
		});
		menuBar.add(menuHighScores);
	}

}