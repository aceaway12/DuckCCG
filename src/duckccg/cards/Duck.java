package duckccg.cards;

public abstract class Duck extends Card {
	/**Duck's attack modifier*/
	public int atkMod;
	/**Duck's defense modifier*/
	public int defMod;
	/**Duck's board location, -1 if dead*/
	public int pos;
	/**Whether or not the duck has acted this turn*/
	public boolean hasActed;
	/**Whether or not this duck has an active ability*/
	public boolean hasAbility;
	/**Method called when the active ability button is clicked (and the duck HAS an active)
	 * @return true if the ability worked, false if the ability can't be used due to lack of valid target
	 */
	public abstract boolean activateAbility();
	/**Prays to our god RNGesus to grant damage to this measly duck
	 * @param targetPos the board location of the defending duck
	 * @return final attack value
	 */
	public abstract int attack(int targetPos);
	/**Prays to our god RNGesus to grant defense to this measly duck
	 * @param attackerPos the board location of the attacking duck
	 * @return final defense value
	 */
	public abstract int defend(int attackerPos);
	/**Modifies the modifiers of the duck
	 * @param atkVal value to be added to the attack modifier
	 * @param defVal value to be added to the defense modifier
	 */
	public abstract void modStats(int atkVal, int defVal);
	/**Triggers on-death events
	 * @param attackerPos the board location of the killing duck
	 * @return true if the duck died, false if the duck somehow didn't die
	 */
	public abstract boolean die(int attackerPos);
}
