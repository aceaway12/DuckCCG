
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

}
