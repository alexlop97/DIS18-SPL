package mine_sweeper;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 * TODO description
 */
public class Statistics extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private final int FRAME_WIDTH = 310;
    private final int FRAME_HEIGHT = 300;
    
    public Statistics(Board bo) {
    	
    	String winPercentage;
    	if(bo.gamesPlayed != 0) {
    		winPercentage = ((float) bo.gamesWon/bo.gamesPlayed)*100 + "%"; 
    	} else {
    		winPercentage = "Sin partidas jugadas";
    	}
    	
    	setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Statistics");
        
        JTextPane statistics = new JTextPane();
        statistics.setContentType("text/html");
        statistics.setText(""
        		+ "<p>"
        		+ "<b>Games played: </b>" + bo.gamesPlayed
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Games won: </b>" + bo.gamesWon
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Win percentage: </b>" + winPercentage
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Current wins: </b>" + bo.currentWins
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Longest winning streak: </b>" + bo.longestWinningStreak
        		+ "</p>"
        		+ "<p>"
        		+ "<b>Longest losing streak: </b>" + bo.longestLosingStreak
        		+ "</p>"
        );
        statistics.setEditable(false);
        statistics.setBackground(Color.lightGray);
        add(statistics);
        
        setResizable(false);
    }
}