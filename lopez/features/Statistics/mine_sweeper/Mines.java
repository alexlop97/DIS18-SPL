package mine_sweeper;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

/**
 * TODO description
 */
public class Mines {
	
	public Statistics st;
	
	public Mines() {
		
		JMenuItem menuStatistics = new JMenuItem("Statistics");
		menuStatistics.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				st = new Statistics(bo);
				st.setVisible(true);
				
			}
		});
		menuBar.add(menuStatistics);
	}
	
	public Mines(String s) {
		
		JMenuItem menuStatistics = new JMenuItem("Statistics");
		menuStatistics.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				st = new Statistics(bo);
				st.setVisible(true);
				
			}
		});
		menuBar.add(menuStatistics);
	}
}