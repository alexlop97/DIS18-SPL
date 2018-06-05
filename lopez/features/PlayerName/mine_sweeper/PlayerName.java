package mine_sweeper;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

/**
 * TODO description
 */
public class PlayerName extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private final int FRAME_WIDTH = 350;
    private final int FRAME_HEIGHT = 115;
    
    private final JButton okButton;
    private final JLabel infoLabel;
    private final JTextField playerName;
    
    public PlayerName() {
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Enter your PlayerName");
        
        okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame ex;
				if(playerName.getText().equals("")) {
					ex = new Mines("Anonymous");
				}
				else {
					ex = new Mines(playerName.getText());
				}
				
				ex.setVisible(true);
				PlayerName.this.setVisible(false);
			}
		});
        add(okButton, BorderLayout.SOUTH);
        
        infoLabel = new JLabel("Enter your Player Name.");
        add(infoLabel, BorderLayout.NORTH);
        
        playerName = new JTextField();
        add(playerName, BorderLayout.CENTER);
    }
}