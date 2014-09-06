import javax.swing.*;
/**
 * CharacterCreationController class is the controller for the CharacterCreationWindow 
 * @author Team Love is like Sand
 * @version 1.0
 */


public class CharacterCreationController {
	private String name;
	private int difficulty,pointsRemaining = 16;
	private Player player;
	
	/**
	 * Constructor of CharacterCreationController class
	 */
	public CharacterCreationController(){
	}
	
	/**
	 * dificultControl deals with the difficulty toggle buttons 
	 * @param difficulty
	 * @param other
	 * @param other2
	 */
	public void difficultControl(int difficulty,JToggleButton other, JToggleButton other2){
		this.difficulty = difficulty;
		other.setSelected(false);
		other2.setSelected(false);
	}
	
	/**
	 * skillContol deals with dealing out different points to different skills while
	 * keeping it under the limit.
	 * @param val
	 * @param text
	 * @param total
	 */
	public void skillControl(int val,JTextField text,JLabel total){
		if(pointsRemaining - val >= 0){
			String currValue = text.getText();
			Integer currVal = Integer.parseInt(currValue);
			if(currVal + val >= 0 && currVal + val <= 10){
				pointsRemaining -= val;
				currVal += val;
				text.setText(currVal.toString());
				total.setText("Points: "  + ((Integer)pointsRemaining).toString());
			}
		}	
	}
	
	/**
	 * nextControl transitions from the Character Creation Window to the next screen
	 * @param frame
	 * @param nameField
	 * @param textPilot
	 * @param textEng
	 * @param textFight
	 * @param textTrade
	 */
	public void nextControl(JFrame frame,JTextField nameField,JTextField textPilot,JTextField textEng,JTextField textFight,JTextField textTrade){
		JOptionPane pane = new JOptionPane();
		if(pointsRemaining==0){
			pane.showMessageDialog(frame,"Welcome! You start with 10000 credits and a Gnat.");
			int[] skills= {Integer.parseInt(textPilot.getText()),Integer.parseInt(textEng.getText()),Integer.parseInt(textFight.getText()),Integer.parseInt(textTrade.getText())};
			name = nameField.getText();
			player = new Player(skills,name,difficulty);
			frame.dispose();
		}
		else{
			pane.showMessageDialog(frame, "Please assign all your points first!");
		}
	}
	
	/**
	 * getPlayer returns player
	 * @return player
	 */
	public Player getPlayer()
	{	
		return player;
	}
}
