import java.io.Serializable;

import Goods.*;

/**
 * Class represents an inventory (the player and other characters have their own inventory)
 * @author Team Love is Like Sand
 * @version 1.0
 *
 */
public class Inventory implements Serializable{
	private Pair[] inventory;
	private long money;
	public static final Good[] GOODLIST = {
		new Plutonium(),new Candy(), new DeathMachine(), new Heroin(), new MorphAderAdrilLenol(), new VideoGames(), new Water() };
	
	/**
	 * Constructor for Inventory Class
	 * @param money
	 */
	public Inventory(int money)
	{
		this.money = money;
		inventory = new Pair[GOODLIST.length];
		for(int i = 0; i < GOODLIST.length; i++)
		{
			inventory[i] = new Pair(GOODLIST[i], 0);
		}
		inventory[0].addNumber(10);
	}
	
	/**
	 * Adds item to the inventory
	 * @param item
	 * @param num
	 */
	public void addItem(Good item, int num)
	{
		for(int i = 0; i < inventory.length; i++)
		{
			if(inventory[i].equals(new Pair(item, 0)))
			{
				inventory[i].addNumber(num);
			}
		}
	}
	
	/**
	 * Returns the money of the inventory (Inventory also deals with character's or player's money)
	 * @return money
	 */
	public long getMoney(){
		return money;
	}
	
	/**
	 * Returns the inventory in the form of an array of Pairs
	 * @return inventory
	 */
	public Pair[] getInventory()
	{
		return inventory;
	}
	
	/**
	 * Sets the money of the inventory (Inventory also deals with character's or player's money)
	 * @param money
	 */
	public void setMoney(long money){
		this.money = money;
	}
	
	public void setFuel(int change){
		inventory[0].setNumber(inventory[0].getNumber()-(change/50));
	}
	/**
	 * Returns fuel
	 * @return fuel (first value of the Pair array inventory)
	 */
	public int getFuel(){
		return inventory[0].getNumber()*50;
	}
	
	/**
	 * Add money to the inventory's money (Inventory also deals with character's or player's money)
	 * @param change
	 */
	public void addMoney(int change)
	{
		money += change;
	}
}
