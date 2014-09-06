import java.io.Serializable;

import Goods.*;

/**
 * Represents a good and a number for the good
 * @author Team Love is Like Sand
 * @version 1.0
 *
 */
public class Pair implements Serializable {
	private Good good;
	private int number;
	
	/**
	 * Constructor for Pair
	 * @param good
	 * @param number
	 */
	public Pair(Good good,int number){
		this.good = good;
		this.number = number;
	}
	
	/**
	 * Return good
	 * @return good
	 */
	public Good getGood(){
		return good;
	}
	
	/**
	 * Return the number for the good
	 * @return number
	 */
	public int getNumber(){
		return number;
	}
	
	/**
	 * Sets a number for the good
	 * @param number
	 */
	public void setNumber(int number){
		this.number = number;
	}
	
	/**
	 * Add to the number for the good
	 * @param change
	 */
	public void addNumber(int change)
	{
		number += change;
	}
	
	/**
	 * Checks if two Pair's goods are equal to each other
	 * @param o
	 * @return equal
	 */
	@Override
	public boolean equals(Object o)
	{
		return good.equals(((Pair)o).getGood());
	}
}
