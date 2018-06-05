package mine_sweeper;

import javax.swing.JOptionPane;

/**
 * TODO description
 */
public class Board {

	private void newGame() {
		
		if (playerName == null) {
			playerName = "Anonymous";
		}

		if (gameStatus != null) {

			if (gameStatus == "WON") {
				JOptionPane.showMessageDialog(null, playerName + " won the game.");
			} else if (gameStatus == "LOST") {
				JOptionPane.showMessageDialog(null, playerName + " lost the game.");
			}
		}
		original();
	}

}