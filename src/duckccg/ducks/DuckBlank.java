package duckccg.ducks;

import duckccg.core.RNGEngine;
/*	Insert any notes about a duck here
 */
public class DuckBlank extends Duck {
	protected String name = "InsertNameHere";
	protected int atkMod = 0;
	protected int defMod = 0;
	protected int atkBon = 0;
	protected int defBon = 0;
	protected boolean hasAbility = false;
	public String flavortext = "InsertFlavorTextHere";
	public String abilitytext = "InsertAbilityTextHere";
	public String imgpath = "InsertImgPathHere";
	protected int isLegend = 0;
	
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
