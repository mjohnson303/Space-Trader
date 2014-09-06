import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Goods.Heroin;

/**
 * This class contains methods each of which corresponds to an encounter type.
 * @author Team Love is Like Sand
 *@version 1.0
 */
public class Encounter {
	private Player player;
	private Inventory inventory;
	private JFrame frame;
	
	/**
	 * Constructor for Encounter class
	 * @param currentPlayer
	 * @param choice
	 */
	public Encounter(Player player, JFrame frame){
		this.player = player;
		this.inventory = player.getInventory();
		this.frame = frame;
		int randEncounter = (int)(Math.random()*6);
		if(randEncounter == 0)
			pirateAttack();
		else if(randEncounter == 1)
			policeEncounter();
		else if(randEncounter == 2)
			astroidBelt();
	}
	/**
	 * This method handles changes to the inventory caused by an encounter with space pirates.
	 */
	public void pirateAttack(){
		double percentLoss = (10-player.getFighting())/100;
		inventory.addMoney((int)(-(inventory.getMoney()*percentLoss)));
		JOptionPane pane = new JOptionPane();
		pane.showMessageDialog(frame, "You were attacked by pirates! You lost some money.");
		
	}
	/**
	 * This method handles changes to the inventory caused by a police inspection.
	 */
	
	public void policeEncounter(){
		int numLoss = -inventory.getInventory()[3].getNumber();
		inventory.addItem(Inventory.GOODLIST[3], numLoss);
		player.addCargo(numLoss*Inventory.GOODLIST[3].getSize());
		JOptionPane pane = new JOptionPane();
		pane.showMessageDialog(frame, "You were stopped by the police! They took all your heroin.");
	}
	/**
	 * This method handles the changes in fuel levels and cargo caused by having to fly through an asteroid field.
	 */
	public void astroidBelt(){
		double percentLoss = (10-player.getPiloting())/100;
		inventory.addMoney((int)(-(inventory.getMoney()*percentLoss)));
		JOptionPane pane = new JOptionPane();
		pane.showMessageDialog(frame, "You were hit an asteroid on the way in! You paid for repairs.");
	}
}
