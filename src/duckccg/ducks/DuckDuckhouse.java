package duckccg.ducks;

import duckccg.core.RNGEngine;
/*	This is a test duck, subject to change
 *  review this duck and see what you think, any errors? any changes that need to be made? anything you specifically like? 
 * 
 * 
 */
public class DuckDuckhouse extends Duck {
	protected String name = "Duckhouse Manaquack";
	protected int atkMod = 4;
	protected int defMod = 4;
	protected int atkBon = 0;
	//atkBon and defBon are for if another duck buffs other ducks
	protected int defBon = 0;
	protected boolean hasAbility = false;
	public String flavortext = "Prepare to face the MIGHTY DUCKHOUSE MANAQAUCK!";
	public String abilitytext = "Entrance:Opponent plays an free duck, which is clearly inferior";
	//abilitytext is the ability explanation, whether it be an on play thing, or an available ability
	//Entrance is placeholder name for battlecry
	public String imgpath = "duckccg/resources/DuckMillhouse";
	
	@Override
	public boolean activateAbility() {
		return true;
	}
	@Override
	public int attack(int targetPos) {
		return RNGEngine.rollD6()+atkMod+atkBon;
	}
	@Override
	public int defend(int attackerPos) {
		return RNGEngine.rollD6()+defMod+defBon;
	}
	@Override
	public void modStats(int atkVal, int defVal) {
		atkBon += atkVal;
		defBon += defVal;
	}
	@Override
	public boolean die(int attackerPos) {
		return true;
	}
	@Override
	public boolean onPlayed() {
		//forces opponent to play a duck from their hand
		return true;
	}
	public int getatkMod()
	{
		return atkMod;
	}
	public int getdefMod()
	{
		return defMod;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public boolean turnEnd() {
		return false;
	}
	@Override
	public boolean turnStart() {
		return false;
	}
}
