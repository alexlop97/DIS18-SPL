package mine_sweeper;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * TODO description
 */
public class Board {

	public void loadImages() {
		
		img = new Image[NUM_IMAGES];
        for (int i = 0; i < NUM_IMAGES; i++) {
        	img[i] = (new ImageIcon("./resources/classic/" + i + ".png")).getImage();
        }

	}

}