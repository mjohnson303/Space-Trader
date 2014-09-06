import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

import javax.swing.*;


/**
 * Controller for UniverseMap
 * @author Team Love is Like Sand
 * @version 1.0
 *
 */
public class UniverseMapController {
	Player player;
	
	/**
	 * Constructor for UniverseMapController
	 * @param player
	 */
	public UniverseMapController(Player player){
		this.player = player;
	}
	
	/**
	 * Sets the system and deals with MarketController and Window
	 * @param system
	 * @param frame
	 */
	public void systemAction(SolarSystem system,JFrame frame){
		frame.setVisible(false);
		int distance = (int)system.getPoint().distance(player.getSystem().getPoint());
		player.setFuel(distance);
		player.setSystem(system);
		MarketController controller = new MarketController(player,system.getTrader(),frame);
		Encounter encounter = new Encounter(player, frame);
		MarketWindow window = new MarketWindow(controller);
	}
	
	/**
	 * Lets the systems that are reachable to be clicked on and the others to not be clicked on
	 * @param button
	 * @param system
	 */
	public void isReachable(JButton button,SolarSystem system){
		if(player.getSystem().equals(system)){
			button.setIcon(new ImageIcon("Images/ufo.png"));
		}
		else{
			button.setIcon(new ImageIcon("Images/solarIcon.jpg"));
		}
		if(player.getSystem().getPoint().distance(system.getPoint())<player.getFuel()){
			button.setEnabled(true);
		}
		else{
			button.setEnabled(false);
		}
	}
	
	public void save(Universe uni){
		try{
			File f = new File("save.ser");
			FileOutputStream fileOut = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(player);
			out.writeObject(uni);
			JOptionPane pane = new JOptionPane();
			pane.showMessageDialog(new JFrame(),"Game Saved");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
