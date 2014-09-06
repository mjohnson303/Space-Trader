/**
 * The MarketController class has a buy and sell method along side methods to check the 
 * inventories of the Trader and Player. It also takes in a Player and a trader as a 
 * Constructor.
 * @author Team Love is Like Sand
 * @version 1.0
 * 
 */
import java.awt.Point;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MarketController {
	private Inventory traderInventory;
	private Inventory playerInventory;
	private Player player;
	private Trader trader;
	private int money;
	private String[][] data;
	private boolean trading;
	private JFrame map;
	
	public MarketController(Player p, Trader t,JFrame map){
		traderInventory = t.getInventory();
		playerInventory = p.getInventory();
		trader = t;
		player = p;
		this.map = map;
		trading = true;
	}
	public SolarSystem getSystem(){
		return player.getSystem();
	}
	
	/**public static void main(String args[])
	{
		Player p = new Player(new int[] {0,0,0,10}, "player", 1);
		StatusBar.setPlayer(p);
		SolarSystem s = new SolarSystem("Sol", 0, 7, 0, new Point(200, 200));
		Trader t = new Trader(9, s);
		MarketController mc = new MarketController(p, t, null);
		MarketWindow mw = new MarketWindow(mc);
	}
	
	/*public void initializeMarketTable(JTable table){
		data = new String[Inventory.GOODLIST.length][8];
		double delta = (.75*(player.getTrading() - (trader.getTrade()+player.getDifficulty())))/13.0 - .25;
		for(int i = 0; i < data.length; i++)
			
		{
			data[i] = new String[] {	Inventory.GOODLIST[i].getName(), 
									""+(int)(trader.getPriceList()[i].getNumber()*(1-delta)),
									""+(int)(trader.getPriceList()[i].getNumber()*(1+delta)),
									""+(int)(playerInventory.getInventory()[i].getNumber()),
									""+(int)(traderInventory.getInventory()[i].getNumber()),
									"0" , "0", ""+Inventory.GOODLIST[i].getSize()	};
			
		}
		
		table.setModel(new DefaultTableModel(
				data,
				new String[] {"Item", "Buy Price", "Sell Price", "In Ship", "For Sale", "To Buy", "To Sell", "Size"}) {
				Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEdidatas = new boolean[] {
					false, false, false, false, false, true, true, false
				};
				public boolean isCellEdidata(int row, int column) {
					return columnEdidatas[column];
				}
			});
		table.getColumnModel().getColumn(0).setMinWidth(125);
		table.setRowSelectionAllowed(false);
		table.setColumnSelectionAllowed(false);
		table.setCellSelectionEnabled(false);
	} */
	
	public String[][] buySell(String[][] data, JFrame frame)
	{
		int amt;
		for(int i = 0; i < Inventory.GOODLIST.length; i++){
			if(!data[i][6].equals("0"))
			{
				try
				{
					amt = Integer.parseInt((data[i][6]));
					if(amt > playerInventory.getInventory()[i].getNumber())
					{
						errorMessage(frame, "You dont have enough of those to sell!");
						return resetTable();
					}
					if(amt*Integer.parseInt(data[i][2]) > traderInventory.getMoney())
					{
						errorMessage(frame, "The Trader does not have enough money to pay you!");
						return resetTable();
					}
					playerInventory.addItem(Inventory.GOODLIST[i], -amt);
					player.addCargo(-amt*Inventory.GOODLIST[i].getSize());
					playerInventory.addMoney(amt*Integer.parseInt(data[i][2]));
					traderInventory.addMoney(-amt*Integer.parseInt(data[i][2]));
					traderInventory.addItem(Inventory.GOODLIST[i], amt);
				}
				catch(NumberFormatException e)
				{
					errorMessage(frame, "You must input numbers to the buy/sell columns");
					return resetTable();
				}
				
			}
			if(!data[i][5].equals("0"))
			{
				try
				{
					amt = Integer.parseInt(data[i][5]);
					if(amt*Inventory.GOODLIST[i].getSize() > player.getFreeCargoSpace())
					{
						errorMessage(frame, "You don't have enough space to buy all these items!");
						return resetTable();
					}
					if(amt*Integer.parseInt(data[i][1]) > playerInventory.getMoney())
					{
						errorMessage(frame, "You don't have enough money to pay for all these items!");
						return resetTable();
					}
					if(amt > traderInventory.getInventory()[i].getNumber())
					{
						errorMessage(frame, "The Trader does not have enough of those to sell to you!");
						return resetTable();
					}
					playerInventory.addItem(Inventory.GOODLIST[i], amt);
					player.addCargo(amt*Inventory.GOODLIST[i].getSize());
					playerInventory.addMoney(-amt*Integer.parseInt(data[i][1]));
					traderInventory.addMoney(amt*Integer.parseInt(data[i][1]));
					traderInventory.addItem(Inventory.GOODLIST[i], -amt);
				}
				catch(NumberFormatException e)
				{
					errorMessage(frame, "You must input numbers to the buy/sell columns");
					return resetTable();
				}
				
			}
		}
		return resetTable();
		
	}
	
	
	public String[][] resetTable()
	{
		data = new String[Inventory.GOODLIST.length][7];
		double delta = (.75*(player.getTrading() - (trader.getTrade()+player.getDifficulty())))/13.0 - .25;
		for(int i = 0; i < data.length; i++)
			
		{
			data[i] = new String[] {	Inventory.GOODLIST[i].getName(), 
									""+(int)(trader.getPriceList()[i].getNumber()*(1-delta)),
									""+(int)(trader.getPriceList()[i].getNumber()*(1+delta)),
									""+(int)(playerInventory.getInventory()[i].getNumber()),
									""+(int)(traderInventory.getInventory()[i].getNumber()),
									"0",
									"0",
									""+Inventory.GOODLIST[i].getSize()};
			
		}
		
		return data;
	}
	
	
	public String resetTraderBar()
	{
		return "Seller Cash: "+traderInventory.getMoney();
	}
	
	public boolean isTrading()
	{
		return trading;
	}
	
	public void endTrading(JFrame frame)
	{
		trading = false;
		frame.dispose();
		((UniverseMap)map).update();
		map.setVisible(true);
	}
	
	private void errorMessage(JFrame frame, String message)
	{
		JOptionPane pane = new JOptionPane();
		pane.showMessageDialog(frame, message);
	}
	
	
	
}
