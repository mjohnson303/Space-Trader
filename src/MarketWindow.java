import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;


/**
 * MarketWindow is the window the user will see for the market
 * @author Team Love is Like Sand
 * @version 1.0
 *
 */
public class MarketWindow {

	private JFrame frmTradingBay;
	private JTable marketTable;
	private JTable ItemTable;
	private StatusBar StatusBar;
	private MarketController control;
	private JTextField traderMoney;

	/**
	 * Constructor for MarketWindow
	 * Create the application.
	 * @param control
	 */
	public MarketWindow(MarketController control) {
		this.control = control;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTradingBay = new JFrame();
		frmTradingBay.setTitle("Trading Bay");
		frmTradingBay.getContentPane().setBackground(new Color(0, 51, 51));
		frmTradingBay.getContentPane().setLayout(null);
		
		marketTable = new JTable();
		marketTable.setBounds(33, 132, 517, 113);
		Object[][] initData = new Object[Inventory.GOODLIST.length][8];
		for(int i = 0; i<Inventory.GOODLIST.length; i++)
		{
			initData[i] = new Object[] {null, null, null, null, null, null,null, null};
		}
		
		marketTable.setModel(new DefaultTableModel(
				initData,
				new String[] {"Item", "Buy Price", "Sell Price", "In Ship", "For Sale", "To Buy", "To Sell", "Size"}) {
				Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, true, true, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
		marketTable.getColumnModel().getColumn(0).setMinWidth(125);
		marketTable.setRowSelectionAllowed(false);
		marketTable.setColumnSelectionAllowed(false);
		marketTable.setCellSelectionEnabled(false);
		marketTable.setDefaultEditor(Integer.class,new DefaultCellEditor(new JTextField()));
		
		setData(control.resetTable());
		
		frmTradingBay.getContentPane().add(marketTable);
		
		ItemTable = new JTable();
		ItemTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Item", "Buy Price", "Sell Price", "In Ship", "For Sale", "To Buy", "To Sell", "Size"},
			},
			new String[] {
				"Item", "Buy Price", "Sell Price", "In Ship", "For Sale", "To Buy", "To Sell", "Size"
			}
		));
		ItemTable.getColumnModel().getColumn(0).setPreferredWidth(125);
		ItemTable.getColumnModel().getColumn(0).setMinWidth(125);
		ItemTable.setBounds(33, 115, 517, 16);
		frmTradingBay.getContentPane().add(ItemTable);
		
		JLabel lblTitle = new JLabel("Trading Bay of "+ control.getSystem());
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Arnprior", Font.PLAIN, 11));
		lblTitle.setBounds(162, 43, 270, 17);
		frmTradingBay.getContentPane().add(lblTitle);
		
		StatusBar = new StatusBar(frmTradingBay);
		
		JButton btnBuySell = new JButton("Apply Buy/Sell Orders");
		btnBuySell.setBounds(220, 295, 147, 23);
		frmTradingBay.getContentPane().add(btnBuySell);
		btnBuySell.addActionListener(new BuySellListener(frmTradingBay, marketTable, StatusBar));
		
		JButton btnExit = new JButton("Exit Trading Bay");
		btnExit.addActionListener(new FinishListener());
		btnExit.setBounds(220, 322, 147, 23);
		frmTradingBay.getContentPane().add(btnExit);
		
		traderMoney = new JTextField();
		traderMoney.setEditable(false);
		traderMoney.setBounds(220, 264, 147, 20);
		frmTradingBay.getContentPane().add(traderMoney);
		traderMoney.setColumns(10);
		frmTradingBay.setBounds(100, 100, 600, 425);
		frmTradingBay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StatusBar.updateStatusBar();
		traderMoney.setText(control.resetTraderBar());
		frmTradingBay.setVisible(true);
	}
	
	public String[][] getData()
	{
		String[][] data = new String[marketTable.getRowCount()][marketTable.getColumnCount()];
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[0].length; j++)
			{
					data[i][j] = (String)marketTable.getValueAt(i, j);
			}
		}	
		
		return data;
	}
	
	public void setData(String[][] data)
	{
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[0].length; j++)
			{
					marketTable.setValueAt(data[i][j], i, j);
			}
		}
	}
	
	/**
	 * FinishListener class performs actions to end trading
	 * @author Team Love is Like Sand
	 * @version 1.0
	 *
	 */
	private class FinishListener implements ActionListener{
		
		/**
		 * Ends trading for listner
		 * @param e
		 */
		public void actionPerformed(ActionEvent e){
			control.endTrading(frmTradingBay);
		}
	}
	
	/**
	 * BuySellListner performs actions for for filling up buy and sell columns of the market table
	 * @author Team Love is Like Sand
	 * @version 1.0
	 *
	 */
	private class BuySellListener implements ActionListener{
		JFrame frame;
		JTable table;
		JTextField field;
		
		/**
		 * Constructor for BuySellListener
		 * @param frame
		 * @param table
		 * @param field
		 */
		public BuySellListener(JFrame frame, JTable table, JTextField field){
			this.frame = frame;
			this.table = table;
			this.field = field;
		}
		
		/**
		 * Performs actions to fill up the table
		 * @param e
		 */
		public void actionPerformed(ActionEvent e){
			String[][] data = getData();
			
			data = control.buySell(data, frame);
			StatusBar.updateStatusBar();
			traderMoney.setText(control.resetTraderBar());
			setData(data);
		}
	}
	
	
	
}