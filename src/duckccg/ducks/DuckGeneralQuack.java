package duckccg.ducks;

import duckccg.core.RNGEngine;

public class DuckGeneralQuack extends Duck {
	protected String name = "General Quack";
	protected int atkMod = -1;
	protected int defMod = 5;
	protected int atkBon = 0;
	protected int defBon = 0;
	protected boolean hasAbility = false;
	public String flavortext = "Need a hand?";
	public String abilitytext = "At the end of your turn, give adjacent minions a bonus attack and defense modifier";
	public String imgpath = "";
	protected int isLegend = 1;
	
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
	//used for end turn effects, returns true if effect works
	public boolean turnEnd()
	{
		//uses the current position of the duck to change the atkMod and defMod on ducks with +1 and -1 postitions
		return true;
	}
	@Override
	public boolean turnStart() {
		return false;
	}
}
