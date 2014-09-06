import java.awt.Point;
import java.io.Serializable;
import java.util.*;

/**
 * Class will represent a single Solar System
 * @author LoveIsLikeSand
 *
 */
public class SolarSystem implements Serializable{
	private String name;
	private int govt,resources,tech;
	private Point coord;
	private Trader trader;
	
	/**
	 * Constructor for SolarSystem
	 * @param name
	 * @param govt
	 * @param tech
	 * @param resources
	 * @param coord
	 */
	public SolarSystem(String name,int govt, int tech,int resources,Point coord){
		this.name = name;
		this.govt = govt;
		this.resources = resources;
		this.coord = coord;
		this.tech = tech;
		Random rand = new Random();
		trader = new Trader(rand.nextInt(10),this);
	}
	
	/**
	 * Returns trader in this SolarSystem
	 * @return trader
	 */
	public Trader getTrader(){
		return trader;
	}
	
	/**
	 * Returns the name of this SolarSystem
	 * @return name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Returns the coordinates of this solar system
	 * @return coord
	 */
	public Point getPoint(){
		return coord;
	}
	
	/**
	 * Returns the government of this SolarSystem
	 * @return govt
	 */
	public int getGovt(){
		return this.govt;
	}
	
	/**
	 * Returns the resources of this SolarSystem
	 * @return resources
	 */
	public int getResources(){
		return this.resources;
	}
	
	/**
	 * Returns the tech level of this SolarSystem
	 * @return tech
	 */
	public int getTech(){
		return this.tech;
	}
	
	public String toString(){
		return name;
	}
}
