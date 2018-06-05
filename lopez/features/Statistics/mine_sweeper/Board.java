package mine_sweeper;

import java.awt.Graphics;

/**
 * TODO description
 */
public class Board {
	
	public int gamesPlayed = 0;
	public int gamesWon = 0;
	public int currentWins = 0;
	public int currentLoss = 0;
	public int longestWinningStreak = 0;
	public int longestLosingStreak = 0;
	
	private void newGame() {
		
		if (gameStatus != null) {
			System.out.println(gameStatus);
			gamesPlayed++;
			System.out.println("Partidas jugadas: " + gamesPlayed);
			
			if(gameStatus == "WON") {
				gamesWon++;
				currentWins++;
				if (currentWins > longestWinningStreak) {
					longestWinningStreak = currentWins;
				}
				
				currentLoss = 0;

			} else if(gameStatus == "LOST"){
				currentLoss++;
				if (currentLoss > longestLosingStreak) {
					longestLosingStreak = currentLoss;
				}
				currentWins = 0;
			}
			System.out.println("Partidas ganadas: " + gamesWon);
		}
		original();
	}
}