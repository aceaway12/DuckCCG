package duckccg.cards;
import java.util.Random;
/*	This is a test duck, subject to change
 *  review this duck and see what you think, any errors? any changes that need to be made? anything you specifically like? 
 * 
 * 
 */
public class DuckMillhouse extends Duck {
	Random rng = new Random();
	private String name = "Duckhouse Manaquack";;
	private int atkMod = 4;
	private int defMod = 4;
	private int atkBon = 0;
	//atkBon and defBon are for if another duck buffs other ducks
	private int defBon = 0;
	private boolean hasAbility = false;
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
		return rng.nextInt(6)+1+atkMod;
	}
	@Override
	public int defend(int attackerPos) {
		return rng.nextInt(6)+1+defMod;
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
}
