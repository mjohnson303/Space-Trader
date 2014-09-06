import Goods.*;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * This Player class contains a constructor that helps set values for instance variables in the class.
 * @author Team Love is like Sand
 * @version 1.0
 *
 */
public class Player implements Serializable{
	/**
	 * 0 - Piloting
	 * 1 - Engineering
	 * 2 - Fighting
	 * 3 - Trading
	 */
	private int[] skills;
	private String name;
	private Inventory inventory;
	private int currentCargo,maxCargoSpace;
	private SolarSystem currentSystem;
	/**
	 * Ships
	 * 0 - Gnat
	 * 
	 * 
	 * Difficulty
	 * 1 - Easy
	 * 2 - Medium
	 * 3 - Hard
	 */
	private int ship,difficulty;
	
	/**
	 * Constructor for Player
	 * @param skills
	 * @param name
	 * @param difficulty
	 */
	public Player(int[] skills,String name,int difficulty){
		this.skills=skills;
		this.name=name;
		this.difficulty=difficulty;
		ship=0;
		inventory = new Inventory(10000);
		maxCargoSpace = 100;
		currentCargo = 0;
	}
	
	/**
	 * Returns Player's inventory
	 * @return inventory
	 */
	public Inventory getInventory()
	{
		return inventory;
	}
	
	/**
	 * Returns difficulty of the game for this Player
	 * @return difficulty
	 */
	public int getDifficulty(){
		return difficulty;
	}
	
	/**
	 * Returns fuel
	 * @return inventory.getFuel();
	 */
	public int getFuel()
	{
		return inventory.getFuel();
	}
	
	public void setFuel(int change){
		inventory.setFuel(change);
	}
	
	/**
	 * Returns cargo space
	 * @return currentCargo
	 */
	public int getCargoSpace(){
		return currentCargo;
	}
	
	/**
	 * Add's space to cargo
	 * @param change
	 */
	public void addCargo(int change)
	{
		currentCargo += change;
	}
	
	/**
	 * Returns the free space available in the cargo
	 * @return maxCargoSpace - currentCargo
	 */
	public int getFreeCargoSpace()
	{
		return maxCargoSpace - currentCargo;
	}
	
	/**
	 * Returns the SolarSystem the player is in
	 * @return currentSystem
	 */
	public SolarSystem getSystem(){
		return currentSystem;
	}
	
	/**
	 * Sets the SolarSystem the Player is in
	 * @param system
	 */
	public void setSystem(SolarSystem system){
		currentSystem = system;
	}
	
	/**
	 * Returns Trading skill level
	 * @return skills[3]
	 */
	public int getTrading(){
		return skills[3];
	}
	
	public int getFighting(){
		return skills[2];
	}
	
	public int getPiloting(){
		return skills[0];
	}
	
	public int getEngineering(){
		return skills[1];
	}
}
