import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;





public class IntroWindow {

	private JFrame frmSpaceTrader;
	private IntroController control;
	private boolean loaded;
	private int state;

	
	/**
	 * Create the application.
	 */
	public IntroWindow() {
		loaded = false;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSpaceTrader = new JFrame();
		frmSpaceTrader.setTitle("Space Trader");
		control = new IntroController(frmSpaceTrader);
		frmSpaceTrader.setVisible(true);
		
		frmSpaceTrader.setBounds(100, 100, 600, 425);
		frmSpaceTrader.setResizable(false);
		frmSpaceTrader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSpaceTrader.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToSpacetrader = new JLabel("WELCOME TO SPACETRADER");
		lblWelcomeToSpacetrader.setForeground(Color.WHITE);
		lblWelcomeToSpacetrader.setFont(new Font("Arnprior", Font.PLAIN, 24));
		lblWelcomeToSpacetrader.setBounds(115, 46, 366, 34);
		frmSpaceTrader.getContentPane().add(lblWelcomeToSpacetrader);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new NewGameListener());
		btnNewGame.setBounds(93, 317, 109, 23);
		frmSpaceTrader.getContentPane().add(btnNewGame);
		
		JButton btnLoadSave = new JButton("Load Game");
		btnLoadSave.addActionListener(new LoadListener(this));
		btnLoadSave.setBounds(378, 317, 103, 23);
		frmSpaceTrader.getContentPane().add(btnLoadSave);
		
		ImageIcon icon = new ImageIcon("Images/Galaxy.jpg");
		JLabel picture = new JLabel(icon);
		picture.setBounds(0, 0, 600, 450);
		frmSpaceTrader.getContentPane().add(picture);
	}
	
	public boolean loaded(){
		return loaded;
	}
	
	public void setLoaded(boolean b){
		loaded = b;
	}
	
	public int getState(){
		return state;
	}
	
	private class NewGameListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			loaded = true;
			state =0;
			frmSpaceTrader.dispose();
		}
	}
	
	private class LoadListener implements ActionListener{
		IntroWindow window;
		
		public LoadListener(IntroWindow window){
			this.window = window;
		}
		public void actionPerformed(ActionEvent event){
			if(control.LoadAction(window)){
				frmSpaceTrader.dispose();
				state = 1;
			}
		}
	}
}

