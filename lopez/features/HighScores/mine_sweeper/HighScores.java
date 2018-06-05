package mine_sweeper;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 * TODO description
 */
public class HighScores extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private final int FRAME_WIDTH = 310;
    private final int FRAME_HEIGHT = 320;
    public Game bg1;
    public Game bg2;
    public Game bg3;
    public Game bg4;
    public Game bg5;
    public JTextPane highScores;
    
public HighScores(Board bo) {
    	
    	setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Statistics");

        bg1 = new Game();
        if (bo.bestGames[0].clickNumber == 0) {
        	bg1.playerName = "Empty";
        	bg1.locatedMines = 0;
        	bg1.clickNumber = 0;
        } else {
        	bg1 = bo.bestGames[0];
        }
        
        bg2 = new Game();
        if (bo.bestGames[1].clickNumber == 0) {
        	bg2.playerName = "Empty";
        	bg2.locatedMines = 0;
        	bg2.clickNumber = 0;
        } else {
        	bg2 = bo.bestGames[1];
        }
        
        bg3 = new Game();
        if (bo.bestGames[2].clickNumber == 0) {
        	bg3.playerName = "Empty";
        	bg3.locatedMines = 0;
        	bg3.clickNumber = 0;
        } else {
        	bg3 = bo.bestGames[2];
        }
        
        bg4 = new Game();
        if (bo.bestGames[3].clickNumber == 0) {
        	bg4.playerName = "Empty";
        	bg4.locatedMines = 0;
        	bg4.clickNumber = 0;
        } else {
        	bg4 = bo.bestGames[3];
        }
        
        bg5 = new Game();
        if (bo.bestGames[4].clickNumber == 0) {
        	bg5.playerName = "Empty";
        	bg5.locatedMines = 0;
        	bg5.clickNumber = 0;
        } else {
        	bg5 = bo.bestGames[4];
        }
        
        highScores = new JTextPane();
        highScores.setContentType("text/html");
        highScores.setText(""
        		+ "<p>"
        		+ "<b>HIGHSCORES! </b>"
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Top 1: </b>" + bg1.playerName + ", " + bg1.clickNumber + " clicks and " + bg1.locatedMines + " mines found."
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Top 2: </b>" + bg2.playerName + ", " + bg2.clickNumber + " clicks and " + bg2.locatedMines + " mines found."
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Top 3: </b>" + bg3.playerName + ", " + bg3.clickNumber + " clicks and " + bg3.locatedMines + " mines found."
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Top 4: </b>" + bg4.playerName + ", " + bg4.clickNumber + " clicks and " + bg4.locatedMines + " mines found."
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Top 5: </b>" + bg5.playerName + ", " + bg5.clickNumber + " clicks and " + bg5.locatedMines + " mines found."
        		+ "</p>"
        );
        highScores.setEditable(false);
        highScores.setBackground(Color.lightGray);
        add(highScores);
        
        JButton resetButton = new JButton("Reset HighScores");
        resetButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bg1.playerName = "Empty";
	        	bg1.locatedMines = 0;
	        	bg1.clickNumber = 0;
	        	bg2.playerName = "Empty";
	        	bg2.locatedMines = 0;
	        	bg2.clickNumber = 0;
	        	bg3.playerName = "Empty";
	        	bg3.locatedMines = 0;
	        	bg3.clickNumber = 0;
	        	bg4.playerName = "Empty";
	        	bg4.locatedMines = 0;
	        	bg4.clickNumber = 0;
	        	bg5.playerName = "Empty";
	        	bg5.locatedMines = 0;
	        	bg5.clickNumber = 0;
				
	        	highScores.setText(""
	            		+ "<p>"
	            		+ "<b>HIGHSCORES! </b>"
	            		+ "</p>"
	            		+ "<p>"
	            		+ "<b>Top 1: </b>" + bg1.playerName + ", " + bg1.clickNumber + " clicks and " + bg1.locatedMines + " mines found."
	            		+ "</p>"
	            		+ "<p>"
	            		+ "<b>Top 2: </b>" + bg2.playerName + ", " + bg2.clickNumber + " clicks and " + bg2.locatedMines + " mines found."
	            		+ "</p>"
	            		+ "<p>"
	            		+ "<b>Top 3: </b>" + bg3.playerName + ", " + bg3.clickNumber + " clicks and " + bg3.locatedMines + " mines found."
	            		+ "</p>"
	            		+ "<p>"
	            		+ "<b>Top 4: </b>" + bg4.playerName + ", " + bg4.clickNumber + " clicks and " + bg4.locatedMines + " mines found."
	            		+ "</p>"
	            		+ "<p>"
	            		+ "<b>Top 5: </b>" + bg5.playerName + ", " + bg5.clickNumber + " clicks and " + bg5.locatedMines + " mines found."
	            		+ "</p>"
	            		+ "<p>"
	            		+ "<img src='https://www.24k.com.sg/images/seo2.png' />"
	            		+ "</p>"
	            );
			}
		});
        add(resetButton, BorderLayout.SOUTH);
        
        setResizable(false);
    }
}