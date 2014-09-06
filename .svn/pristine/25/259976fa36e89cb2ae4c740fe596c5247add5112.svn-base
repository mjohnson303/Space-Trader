import javax.swing.*;

public class StatusBar extends JTextField {
	private static Player player;
	
	public StatusBar(JFrame frame){
		setEditable(false);
		setColumns(10);
		setBounds(10, 356, 564, 20);
		frame.getContentPane().add(this);
	}
	
	public void updateStatusBar(){
		setText( ""+player.getFuel() + " range\t" + player.getSystem() + "\t" +player.getInventory().getMoney() + " STARBUCKS\t" + player.getFreeCargoSpace()+" ft^3");
	}
	
	public static void setPlayer(Player p){
		player = p;
	}
}
