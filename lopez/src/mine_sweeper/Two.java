package mine_sweeper; 

import java.awt.BorderLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 

/**
 * TODO description
 */
public  class  Two  extends JFrame {
	

	private static final long serialVersionUID = 1L;

	
	private final int FRAME_WIDTH = 250;

	
	private final int FRAME_HEIGHT = 100;

	

	public Two() {
		
    	setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Select Players");

		JLabel lInfo = new JLabel("Select number of Players");
		add(lInfo, BorderLayout.NORTH );

		JButton oneB = new JButton("One Player");
		oneB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Mines.initializeMines();
				Two.this.setVisible(false);

			}
		});
		add(oneB, BorderLayout.EAST );

		JButton twoB = new JButton("Two Players");
		twoB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Mines.initializeMines();
				Mines.initializeMines();
				Two.this.setVisible(false);

			}
		});
		add(twoB, BorderLayout.WEST );

	}


}
