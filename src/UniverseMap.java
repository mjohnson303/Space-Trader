import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

/**
 * Class will show the map of the universe
 * @author LoveIsLikeSand
 * @version 1.0
 */
public class UniverseMap extends JFrame {

	private Universe uni;
	private StatusBar status;
	private JButton[] buttons;
	private UniverseMapController control;
	
	/**
	 * Constructor for UniverseMap
	 * @param uni
	 * @param control
	 */
	public UniverseMap(Universe uni,UniverseMapController control){
		this.uni = uni;
		buttons = new JButton[uni.getSystems().length];
		setTitle("Universe Map");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JButton saveButton = new JButton("Save");
		saveButton.setBounds(485, 11, 99, 23);
		getContentPane().add(saveButton);
		saveButton.addActionListener(new SaveListener());
		status = new StatusBar(this);
		status.updateStatusBar();
		
		this.control = control;
		
		setBounds(100, 100, 600, 425);
		int i=0;
		for(SolarSystem item: uni.getSystems()){
			ImageIcon icon = new ImageIcon("Images/solarIcon.jpg",item.getName());
			JButton button = new JButton(icon);
			button.setBounds(item.getPoint().x,item.getPoint().y,40,40);
			button.setToolTipText(item.getName());
			button.addActionListener(new SystemListener(item,this));
			buttons[i] = button;
			button.setContentAreaFilled(false);
			getContentPane().add(button);
			control.isReachable(button,item);
			i++;
		}
		
		//Sets cursor
		ImageIcon cursor = new ImageIcon("Images/cursor.gif"); 
		Image	shipCursor = cursor.getImage();

		Cursor newCursor = Toolkit.getDefaultToolkit().createCustomCursor(shipCursor, new Point(10,10), "Ship Cursor");
		this.setCursor(newCursor);	
		
		update(getGraphics());
	}
	
	public void update(){
		for(int i=0; i<buttons.length; i++){
			control.isReachable(buttons[i],uni.getSystems()[i]);
			status.updateStatusBar();
			
		}
	}
	
	/**
	 * Listener for buttons in this class
	 * @author Team Love is Like Sand
	 * @version 1.0
	 *
	 */
	private class SystemListener implements ActionListener{
		SolarSystem system;
		JFrame frame;
		
		/**
		 * Constructor for SystemListener
		 * @param system
		 */
		public SystemListener(SolarSystem system,JFrame frame){
			this.system = system;
			this.frame = frame;
		}
		
		/**
		 * Performs actions for this class
		 */
		public void actionPerformed(ActionEvent e){
			control.systemAction(system,frame);
		}
	}
	
	private class SaveListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			control.save(uni);
		}
	}
	
}
