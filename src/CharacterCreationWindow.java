import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 * This class contains all the components required to create a character creation JPanel. 
 * The methods and action listeners together help the player divide 16 skill points amongst various skills at the start of the game.
 * @author Team Love is like Sand
 * @version 1.0
 */
public class CharacterCreationWindow {
	
	private CharacterCreationController control;
	private JFrame frmCreateYourCharacter;
	private JTextField nameField;
	private JLabel lblSkills;
	private JLabel lblPiloting;
	private JLabel lblEngineering;
	private JLabel lblFighting;
	private JLabel lblTrading;
	private JLabel lblPilotingScore;
	private JLabel lblEngineeringScore;
	private JLabel lblFightingScore;
	private JLabel lblTradingScore;
	private JLabel lblDifficulty;
	private JPanel panel;
	private JToggleButton Easy;
	private JToggleButton Medium;
	private JToggleButton Hard;
	private JButton minusPilot;
	private JTextField textPilot;
	private JButton plusPilot;
	private JButton minusEng;
	private JButton plusEng;
	private JButton minusFight;
	private JTextField textEng;
	private JTextField textFight;
	private JTextField textTrade;
	private JButton plusFight;
	private JButton minusTrade;
	private JButton plusTrade;
	private JButton btnBack;
	private JButton btnNext;
	private Component verticalStrut;
	private JLabel lblPoints;
	private JLabel lblMouseOverFor;
	private Component verticalStrut_1;
	private Component horizontalStrut;
	private Component verticalStrut_2;//hello


	/**
	 * This method creates the application.
	 * @param control
	 */
	public CharacterCreationWindow(CharacterCreationController control) {
		this.control = control;
		initialize();
	}
	
	/**
	 * This method initializes the contents of the frame.
	 */
	private void initialize() {
		frmCreateYourCharacter = new JFrame();
		frmCreateYourCharacter.setTitle("Create Your Character");
		frmCreateYourCharacter.getContentPane().setBackground(new Color(0, 51, 51));
		frmCreateYourCharacter.setResizable(false);
		frmCreateYourCharacter.setBounds(100, 100, 600, 425);
		frmCreateYourCharacter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 53, 35, 65, 1, 20, 103, 41, 55, 0};
		gridBagLayout.rowHeights = new int[]{34, 17, 23, 31, 20, 23, 23, 23, 23, 0, 23, 20, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmCreateYourCharacter.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblEnterYourName = new JLabel("Enter your name here:");
		lblEnterYourName.setFont(new Font("Arnprior", Font.PLAIN, 11));
		lblEnterYourName.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblEnterYourName = new GridBagConstraints();
		gbc_lblEnterYourName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterYourName.gridwidth = 3;
		gbc_lblEnterYourName.gridx = 5;
		gbc_lblEnterYourName.gridy = 1;
		frmCreateYourCharacter.getContentPane().add(lblEnterYourName, gbc_lblEnterYourName);
		
		nameField = new JTextField("Dr.Space-Time");
		nameField.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridwidth = 4;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 2;
		frmCreateYourCharacter.getContentPane().add(nameField, gbc_textField);
		nameField.setColumns(10);
		
		horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 0;
		gbc_horizontalStrut.gridy = 4;
		frmCreateYourCharacter.getContentPane().add(horizontalStrut, gbc_horizontalStrut);
		
		lblSkills = new JLabel("Skills");
		lblSkills.setToolTipText("No, the individual skills dummy...");
		lblSkills.setForeground(Color.WHITE);
		lblSkills.setFont(new Font("Arnprior", Font.PLAIN, 14));
		GridBagConstraints gbc_lblSkills = new GridBagConstraints();
		gbc_lblSkills.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkills.gridx = 1;
		gbc_lblSkills.gridy = 4;
		frmCreateYourCharacter.getContentPane().add(lblSkills, gbc_lblSkills);
		
		lblMouseOverFor = new JLabel("  (Mouse over for help)");
		lblMouseOverFor.setToolTipText("No, the individual skills dummy...");
		lblMouseOverFor.setFont(new Font("Trebuchet MS", Font.ITALIC, 11));
		lblMouseOverFor.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblMouseOverFor = new GridBagConstraints();
		gbc_lblMouseOverFor.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMouseOverFor.insets = new Insets(0, 0, 5, 5);
		gbc_lblMouseOverFor.gridwidth = 2;
		gbc_lblMouseOverFor.gridx = 2;
		gbc_lblMouseOverFor.gridy = 4;
		frmCreateYourCharacter.getContentPane().add(lblMouseOverFor, gbc_lblMouseOverFor);
		
		lblPoints = new JLabel("Points : 16");
		lblPoints.setForeground(Color.WHITE);
		lblPoints.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblPoints = new GridBagConstraints();
		gbc_lblPoints.anchor = GridBagConstraints.SOUTH;
		gbc_lblPoints.insets = new Insets(0, 0, 5, 5);
		gbc_lblPoints.gridx = 6;
		gbc_lblPoints.gridy = 4;
		frmCreateYourCharacter.getContentPane().add(lblPoints, gbc_lblPoints);
		
		lblPiloting = new JLabel("Piloting :");
		lblPiloting.setToolTipText("A better pilot can avoid pirates and police");
		lblPiloting.setForeground(Color.WHITE);
		lblPiloting.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblPiloting = new GridBagConstraints();
		gbc_lblPiloting.anchor = GridBagConstraints.EAST;
		gbc_lblPiloting.insets = new Insets(0, 0, 5, 5);
		gbc_lblPiloting.gridx = 3;
		gbc_lblPiloting.gridy = 5;
		frmCreateYourCharacter.getContentPane().add(lblPiloting, gbc_lblPiloting);
		
		minusPilot = new JButton("-");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTHWEST;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridwidth = 2;
		gbc_button.gridx = 4;
		gbc_button.gridy = 5;
		frmCreateYourCharacter.getContentPane().add(minusPilot, gbc_button);
		
		textPilot = new JTextField();
		textPilot.setEditable(false);
		textPilot.setText("0");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 6;
		gbc_textField_1.gridy = 5;
		frmCreateYourCharacter.getContentPane().add(textPilot, gbc_textField_1);
		textPilot.setColumns(10);
		
		plusPilot = new JButton("+");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 7;
		gbc_button_1.gridy = 5;
		frmCreateYourCharacter.getContentPane().add(plusPilot, gbc_button_1);
		
		lblPilotingScore = new JLabel(" ");
		lblPilotingScore.setForeground(Color.WHITE);
		lblPilotingScore.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblPilotingScore = new GridBagConstraints();
		gbc_lblPilotingScore.anchor = GridBagConstraints.WEST;
		gbc_lblPilotingScore.insets = new Insets(0, 0, 5, 0);
		gbc_lblPilotingScore.gridx = 8;
		gbc_lblPilotingScore.gridy = 5;
		frmCreateYourCharacter.getContentPane().add(lblPilotingScore, gbc_lblPilotingScore);
		
		lblEngineering = new JLabel("Engineering :");
		lblEngineering.setToolTipText("A skilled engineer can repair ships");
		lblEngineering.setForeground(Color.WHITE);
		lblEngineering.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblEngineering = new GridBagConstraints();
		gbc_lblEngineering.anchor = GridBagConstraints.EAST;
		gbc_lblEngineering.insets = new Insets(0, 0, 5, 5);
		gbc_lblEngineering.gridwidth = 2;
		gbc_lblEngineering.gridx = 2;
		gbc_lblEngineering.gridy = 6;
		frmCreateYourCharacter.getContentPane().add(lblEngineering, gbc_lblEngineering);
		
		minusEng = new JButton("-");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridwidth = 2;
		gbc_button_2.gridx = 4;
		gbc_button_2.gridy = 6;
		frmCreateYourCharacter.getContentPane().add(minusEng, gbc_button_2);
		
		textEng = new JTextField();
		textEng.setEditable(false);
		textEng.setText("0");
		textEng.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 6;
		gbc_textField_2.gridy = 6;
		frmCreateYourCharacter.getContentPane().add(textEng, gbc_textField_2);
		
		plusEng = new JButton("+");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 7;
		gbc_button_5.gridy = 6;
		frmCreateYourCharacter.getContentPane().add(plusEng, gbc_button_5);
		
		lblEngineeringScore = new JLabel(" ");
		lblEngineeringScore.setForeground(Color.WHITE);
		lblEngineeringScore.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblEngineeringScore = new GridBagConstraints();
		gbc_lblEngineeringScore.anchor = GridBagConstraints.WEST;
		gbc_lblEngineeringScore.insets = new Insets(0, 0, 5, 0);
		gbc_lblEngineeringScore.gridx = 8;
		gbc_lblEngineeringScore.gridy = 6;
		frmCreateYourCharacter.getContentPane().add(lblEngineeringScore, gbc_lblEngineeringScore);
		
		lblFighting = new JLabel("Fighting :");
		lblFighting.setToolTipText("A good fighter knows how to use advanced weaponry");
		lblFighting.setForeground(Color.WHITE);
		lblFighting.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblFighting = new GridBagConstraints();
		gbc_lblFighting.anchor = GridBagConstraints.EAST;
		gbc_lblFighting.insets = new Insets(0, 0, 5, 5);
		gbc_lblFighting.gridx = 3;
		gbc_lblFighting.gridy = 7;
		frmCreateYourCharacter.getContentPane().add(lblFighting, gbc_lblFighting);
		
		minusFight = new JButton("-");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridwidth = 2;
		gbc_button_3.gridx = 4;
		gbc_button_3.gridy = 7;
		frmCreateYourCharacter.getContentPane().add(minusFight, gbc_button_3);
		
		textFight = new JTextField();
		textFight.setEditable(false);
		textFight.setText("0");
		textFight.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 6;
		gbc_textField_3.gridy = 7;
		frmCreateYourCharacter.getContentPane().add(textFight, gbc_textField_3);
		
		plusFight = new JButton("+");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 7;
		gbc_button_6.gridy = 7;
		frmCreateYourCharacter.getContentPane().add(plusFight, gbc_button_6);
		
		lblFightingScore = new JLabel(" ");
		lblFightingScore.setForeground(Color.WHITE);
		lblFightingScore.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblFightingScore = new GridBagConstraints();
		gbc_lblFightingScore.anchor = GridBagConstraints.WEST;
		gbc_lblFightingScore.insets = new Insets(0, 0, 5, 0);
		gbc_lblFightingScore.gridx = 8;
		gbc_lblFightingScore.gridy = 7;
		frmCreateYourCharacter.getContentPane().add(lblFightingScore, gbc_lblFightingScore);
		
		lblTrading = new JLabel("Trading :");
		lblTrading.setToolTipText("An astute trader can get better prices when bartering");
		lblTrading.setForeground(Color.WHITE);
		lblTrading.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblTrading = new GridBagConstraints();
		gbc_lblTrading.anchor = GridBagConstraints.EAST;
		gbc_lblTrading.insets = new Insets(0, 0, 5, 5);
		gbc_lblTrading.gridx = 3;
		gbc_lblTrading.gridy = 8;
		frmCreateYourCharacter.getContentPane().add(lblTrading, gbc_lblTrading);
		
		minusTrade = new JButton("-");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridwidth = 2;
		gbc_button_4.gridx = 4;
		gbc_button_4.gridy = 8;
		frmCreateYourCharacter.getContentPane().add(minusTrade, gbc_button_4);
		
		textTrade = new JTextField();
		textTrade.setEditable(false);
		textTrade.setText("0");
		textTrade.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 6;
		gbc_textField_4.gridy = 8;
		frmCreateYourCharacter.getContentPane().add(textTrade, gbc_textField_4);
		
		plusTrade = new JButton("+");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 7;
		gbc_button_7.gridy = 8;
		frmCreateYourCharacter.getContentPane().add(plusTrade, gbc_button_7);
		
		lblTradingScore = new JLabel(" ");
		lblTradingScore.setForeground(Color.WHITE);
		lblTradingScore.setFont(new Font("Arnprior", Font.PLAIN, 11));
		GridBagConstraints gbc_lblTradingScore = new GridBagConstraints();
		gbc_lblTradingScore.anchor = GridBagConstraints.WEST;
		gbc_lblTradingScore.insets = new Insets(0, 0, 5, 0);
		gbc_lblTradingScore.gridx = 8;
		gbc_lblTradingScore.gridy = 8;
		frmCreateYourCharacter.getContentPane().add(lblTradingScore, gbc_lblTradingScore);
		
		verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 5;
		gbc_verticalStrut_2.gridy = 9;
		frmCreateYourCharacter.getContentPane().add(verticalStrut_2, gbc_verticalStrut_2);
		
		lblDifficulty = new JLabel("Difficulty");
		lblDifficulty.setForeground(Color.WHITE);
		lblDifficulty.setFont(new Font("Arnprior", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDifficulty = new GridBagConstraints();
		gbc_lblDifficulty.anchor = GridBagConstraints.WEST;
		gbc_lblDifficulty.insets = new Insets(0, 0, 5, 5);
		gbc_lblDifficulty.gridwidth = 2;
		gbc_lblDifficulty.gridx = 1;
		gbc_lblDifficulty.gridy = 10;
		frmCreateYourCharacter.getContentPane().add(lblDifficulty, gbc_lblDifficulty);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 51, 51));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridwidth = 4;
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 10;
		frmCreateYourCharacter.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		Easy = new JToggleButton("Easy");
		GridBagConstraints gbc_tglbtnEasy = new GridBagConstraints();
		gbc_tglbtnEasy.insets = new Insets(0, 0, 0, 5);
		gbc_tglbtnEasy.gridx = 0;
		gbc_tglbtnEasy.gridy = 0;
		
		panel.add(Easy, gbc_tglbtnEasy);
		
		Medium = new JToggleButton("Medium");
		GridBagConstraints gbc_tglbtnMedium = new GridBagConstraints();
		gbc_tglbtnMedium.insets = new Insets(0, 0, 0, 5);
		gbc_tglbtnMedium.gridx = 1;
		gbc_tglbtnMedium.gridy = 0;
		
		panel.add(Medium, gbc_tglbtnMedium);
		
		Hard = new JToggleButton("Hard");
		GridBagConstraints gbc_tglbtnHard = new GridBagConstraints();
		gbc_tglbtnHard.gridx = 2;
		gbc_tglbtnHard.gridy = 0;
		panel.add(Hard, gbc_tglbtnHard);
		
		Easy.addActionListener(new DifficultyListener(1,Medium,Hard));
		Medium.addActionListener(new DifficultyListener(2,Easy,Hard));
		Hard.addActionListener(new DifficultyListener(3,Easy,Medium));
		Easy.doClick();
		
		minusEng.addActionListener(new skillButtonListener(-1, textEng));
		plusEng.addActionListener(new skillButtonListener(1, textEng));
		minusPilot.addActionListener(new skillButtonListener(-1, textPilot));
		plusPilot.addActionListener(new skillButtonListener(1, textPilot));
		minusFight.addActionListener(new skillButtonListener(-1, textFight));
		plusFight.addActionListener(new skillButtonListener(1, textFight));
		minusTrade.addActionListener(new skillButtonListener(-1, textTrade));
		plusTrade.addActionListener(new skillButtonListener(1, textTrade));
		
		verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.anchor = GridBagConstraints.NORTH;
		gbc_verticalStrut.fill = GridBagConstraints.HORIZONTAL;
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 4;
		gbc_verticalStrut.gridy = 11;
		frmCreateYourCharacter.getContentPane().add(verticalStrut, gbc_verticalStrut);
		
		verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 5;
		gbc_verticalStrut_1.gridy = 11;
		frmCreateYourCharacter.getContentPane().add(verticalStrut_1, gbc_verticalStrut_1);
		
		btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack.gridx = 3;
		gbc_btnBack.gridy = 12;
		frmCreateYourCharacter.getContentPane().add(btnBack, gbc_btnBack);
		
		btnNext = new JButton("Next");
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNext.gridx = 8;
		gbc_btnNext.gridy = 12;
		btnNext.addActionListener(new NextListener());
		frmCreateYourCharacter.getContentPane().add(btnNext, gbc_btnNext);
		
		frmCreateYourCharacter.setVisible(true);
		
		}
	
	
	/**
	 * This private inner class is also an action listener. 
	 * It listens to the action performed when the player toggles the difficulty setting.
	 */
	private class DifficultyListener implements ActionListener{
		int difficulty;
		JToggleButton other,other2;
		
		/**
		 * Constructor for Difficulty Listener
		 * @param a
		 * @param other
		 * @param other2
		 */
		public DifficultyListener(int a, JToggleButton other, JToggleButton other2){
			difficulty = a;
			this.other = other;
			this.other2 = other2;
			
		}
		
		/**
		 * Performs actions for choosing difficulty 
		 * @param e
		 */
		public void actionPerformed(ActionEvent e){
			control.difficultControl(difficulty,other,other2);
		}
	}
	/**
	 * This action listener class is implemented on the skill point buttons. 
	 * According to the key presses, it adjusts the value of total points and skill points. 
	 */
	private class skillButtonListener implements ActionListener{
		int value;
		JTextField textField;
		
		/**
		 * Constructor for skillButtonListener
		 * @param value
		 * @param textField
		 */
		public skillButtonListener(int value, JTextField textField){
			this.value = value;
			this.textField = textField;
		}
		
		/**
		 * Performs actions for assigning skills
		 * @param e
		 */
		public void actionPerformed(ActionEvent e){
			control.skillControl(value,textField,lblPoints);
		}
	}
	
	/**
	 * This action listener class listens to the next button on the JPanel. 
	 * It checks the total points the player has assigned and accordingly displays a Text Box.
	 */
	private class NextListener implements ActionListener{
		
		/**
		 * Performs actions for checking total points the player has assigned and displays it accordingly
		 * @param e
		 */
		public void actionPerformed(ActionEvent e){
			control.nextControl(frmCreateYourCharacter,nameField, textPilot, textEng, textFight, textTrade);
		}
	}
	
}


