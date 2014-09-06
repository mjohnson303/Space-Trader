import java.io.Serializable;

import Goods.*;

/**
 * Represents a trader
 * @author Team Love is Like Sand
 * @version 1.0
 */
public class Trader implements Serializable{

	private Inventory inventory;
	private int skill;
	private SolarSystem solarSystem;
	private Pair[] priceList;
	private static final int economicConstant = 10000;
	
	/**
	 * Constructor for Trader
	 * @param skill
	 * @param solarSystem
	 */
	public Trader(int skill, SolarSystem solarSystem)
	{
		this.skill = skill;
		this.solarSystem = solarSystem;
		int g = solarSystem.getGovt();
		int t = solarSystem.getTech();
		int r = solarSystem.getResources();
		inventory = new Inventory((int)((Inventory.GOODLIST.length)*(economicConstant*(1.0 + g/4.0 + 7.0/t))));
		initializeItemList();
	}
	
	/**
	 * Returns the inventory of the Trader
	 * @return inventory
	 */
	public Inventory getInventory()
	{
		return inventory;
	}
	
	/**
	 * Returns the price list in an array of Pairs
	 * @return priceList
	 */
	public Pair[] getPriceList()
	{
		return priceList;
	}
	
	/**
	 * Returns skill level of Trader
	 * @return skill
	 */
	public int getTrade(){
		return skill;
	}
	
	/**
	 * Initialzies the list of items
	 */
	private void initializeItemList()
	{
		int price;
		int g = solarSystem.getGovt();
		int t = solarSystem.getTech();
		int r = solarSystem.getResources();
		Good[] goods = inventory.GOODLIST;
		priceList = new Pair[goods.length];
		for(int i = 0; i < goods.length; i++)
		{
			price =(int)((double)(goods[i].getBasePrice())*(1.0 + (g*(goods[i].isLegal()?1:2))/4.0 + (1.0-t/7.0)));
			switch(r)
			{
				case 1 : if(goods[i].getClass().isInstance(Candy.class)) {price /= 2;}
					break;
				case 2 : if(goods[i].getClass().isInstance(Candy.class)) {price *= 2;}
					break;
				case 3 : if(goods[i].getClass().isInstance(DeathMachine.class)) {price /= 2;}
					break;
				case 4 : if(goods[i].getClass().isInstance(DeathMachine.class)) {price *= 2;}
					break;
				case 5 : if(goods[i].getClass().isInstance(Heroin.class)) {price /= 2;}
					break;
				case 6 : if(goods[i].getClass().isInstance(Heroin.class)) {price *= 2;}
					break;
				case 7 : if(goods[i].getClass().isInstance(MorphAderAdrilLenol.class)) {price /= 2;}
					break;
				case 8 : if(goods[i].getClass().isInstance(MorphAderAdrilLenol.class)) {price *= 2;}
					break;
				case 9 : if(goods[i].getClass().isInstance(Plutonium.class)) {price /= 2;}
					break;
				case 10 : if(goods[i].getClass().isInstance(Plutonium.class)) {price *= 2;}
					break;
				case 11 : if(goods[i].getClass().isInstance(VideoGames.class)) {price /= 2;}
					break;
				case 12 : if(goods[i].getClass().isInstance(VideoGames.class)) {price *= 2;}
					break;
				case 13 : if(goods[i].getClass().isInstance(Water.class)) {price /= 2;}
					break;
				case 14 : if(goods[i].getClass().isInstance(Water.class)) {price *= 2;}
					break;
				
			}
			priceList[i] = new Pair(goods[i], price);
			inventory.addItem(goods[i], (int)(economicConstant/((double)price)));
		}
	}
	
	/**
	 * Returns the SolarSystem the Trader is in
	 * @return solarSystem
	 */
	public SolarSystem getSystem()
	{
		return solarSystem;
	}
}
