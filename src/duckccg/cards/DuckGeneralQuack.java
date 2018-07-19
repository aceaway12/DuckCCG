package duckccg.cards;

import java.util.Random;

public class DuckGeneralQuack extends Duck {
	Random rng = new Random();
	private String name = "General Quack";;
	private int atkMod = -1;
	private int defMod = 5;
	public int atkBon = 0;
	public int defBon = 0;
	private boolean hasAbility = false;
	public String flavortext = "Need a hand?";
	public String abilitytext = "At the end of your turn, give adjacent minions a bonus attack and defense modifier";
	public String imgpath = "";
	
	@Override
	public boolean activateAbility() {
		return true;
	}
	@Override
	public int attack(int targetPos) {
		return rng.nextInt(6)+1+atkMod+atkBon;
	}
	@Override
	public int defend(int attackerPos) {
		return rng.nextInt(6)+1+defMod+defBon;
	}
	@Override
	public void modStats(int atkVal, int defVal) {
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
	//used for end turn effects, returns true if effect works
	public boolean endTurn()
	{
		//uses the current position of the duck to change the atkMod and defMod on ducks with +1 and -1 postitions
		return true;
	}
}
