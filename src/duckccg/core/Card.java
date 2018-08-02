package duckccg.core;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public abstract class Card {
	/**Location of card's sprite*/
	public String imgpath;
	/**The card's name*/
	public String name;
	/**The card's description*/
	public String flavortext;
	/**Method called when the card is played
	 * @return true if the ability worked, false if the card can't be PLAYED because of the ability not being triggerable
	 */
	public abstract boolean onPlayed();
	public ImageIcon getIcon(int sideLength) {
		try {
			return new ImageIcon(ImageIO.read(new File(imgpath)).getScaledInstance(sideLength, sideLength, Image.SCALE_SMOOTH));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
