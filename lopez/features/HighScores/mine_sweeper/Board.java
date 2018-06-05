package mine_sweeper;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

/**
 * TODO description
 */
public class Board {

	public Game[] bestGames = new Game[5];
	public int currentClicks = 0;
	boolean firstGame = true;
	int currentScore = 0;

	private void newGame() {

		if (firstGame) {
			firstGame = false;

			for (int i = 0; i < bestGames.length; i++) {
				bestGames[i] = new Game();
				bestGames[i].clickNumber = 0;
			}

		} else {
			Game g = new Game();
			g.clickNumber = currentClicks - 1;

			if (playerName == null) {
				g.playerName = "Anonymous";
			} else {
				g.playerName = playerName;
			}

			g.locatedMines = /*N_MINES - mines_left;*/ currentScore;

			System.out.println(g.playerName + " ha completado la partida en " + g.clickNumber
					+ " clicks. Minas localizadas: " + g.locatedMines);

			for (int i = 0; i < bestGames.length; i++) {
				if (bestGames[i].clickNumber == 0) {
					bestGames[i] = g;
					System.out.println("Partida guardada en highscores en el puesto número: " + (i + 1));
					JOptionPane.showMessageDialog(null, "Game stored on HighScores, Top " + (i + 1));

					break;
				}
				if ((g.locatedMines > bestGames[i].locatedMines)
						|| (g.locatedMines == bestGames[i].locatedMines && g.clickNumber < bestGames[i].clickNumber)) {
					Game aux1 = bestGames[i];
					bestGames[i] = g;
					System.out.println("Partida guardada en highscores en el puesto número: " + (i + 1));
					JOptionPane.showMessageDialog(null, "Game stored on HighScores, Top " + (i + 1));

					if (i == 0) {
						Game aux2 = bestGames[1];
						bestGames[1] = aux1;
						aux1 = bestGames[2];
						bestGames[2] = aux2;
						aux2 = bestGames[3];
						bestGames[3] = aux1;
						bestGames[4] = aux2;
					} else if (i == 1) {
						Game aux2 = bestGames[2];
						bestGames[2] = aux1;
						aux1 = bestGames[3];
						bestGames[3] = aux2;
						bestGames[4] = aux1;
					} else if (i == 2) {
						Game aux2 = bestGames[3];
						bestGames[3] = aux1;
						bestGames[4] = aux2;
					} else if (i == 3) {
						bestGames[4] = aux1;
					}
					break;

					/*
					 * for (int j = i; j < bestGames.length; j++) { if (j < bestGames.length) { Game
					 * aux2 = bestGames[j + 1]; bestGames[j] = } }
					 */
				}
			}

			currentClicks = 1;
			currentScore = 0;
		}

		original();
	}

	class MinesAdapter extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			currentClicks++;

			int x = e.getX();
			int y = e.getY();

			int cCol = x / CELL_SIZE;
			int cRow = y / CELL_SIZE;
			if(inGame) {
	             if ((x < N_COLS * CELL_SIZE) && (y < N_ROWS * CELL_SIZE)) {
	            	 currentClicks++;
	                 if (e.getButton() == MouseEvent.BUTTON3) {
	                	 if (field[(cRow * N_COLS) + cCol] == COVERED_MINE_CELL) {
	                        	 currentScore++;
	                	 } 
	                	 else {
	                		 if (field[(cRow * N_COLS) + cCol] == MARKED_MINE_CELL)
	                			 currentScore--;
	                	 }
	                 }	             
	             }
            }

			original(e);
		}
	}
}