package comm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JTextField txtBeverages;
	private JTextField txtSides;
	private JTextField txtEntrees;
	private JTextField txtPayment;
	private JTextField txtOrder;
	private JTextField textField;
	private JTextField txtCenterpint;
	private JPanel panel_2;
	private FoodPanel foodPanel;
	private BeveragesPanel beveragePanel;
	private ExtrasPanel extraPanel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		foodPanel =new FoodPanel();
		beveragePanel =new BeveragesPanel();
		extraPanel =new ExtrasPanel();
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 936, 488);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(14,23,122));
		panel_1.setBounds(0, 0, 198, 519);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtBeverages = new JTextField();
		txtBeverages.setBounds(0, 191, 198, 65);
		panel_1.add(txtBeverages);
		txtBeverages.setText("Beverages");
		txtBeverages.setForeground(new Color(255, 255, 255));
		txtBeverages.setFont(new Font("Book Antiqua", Font.PLAIN, 25));
		txtBeverages.setColumns(10);
		txtBeverages.setBackground(new Color(14,23,122));
		
		txtSides = new JTextField();
		txtSides.setText("Extras");
		txtSides.setForeground(new Color(255, 255, 255));
		txtSides.setFont(new Font("Book Antiqua", Font.PLAIN, 25));
		txtSides.setColumns(10);
		txtSides.setBackground(new Color(14,23,122));
		txtSides.setBounds(0, 254, 198, 70);
		panel_1.add(txtSides);
		
		txtEntrees = new JTextField();
		txtEntrees.setText("Entrees");
		txtEntrees.setForeground(new Color(255, 255, 255));
		txtEntrees.setFont(new Font("Book Antiqua", Font.PLAIN, 25));
		txtEntrees.setColumns(10);
		txtEntrees.setBackground(new Color(14,23,122));
		txtEntrees.setBounds(0, 324, 198, 65);
		panel_1.add(txtEntrees);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Dashboard.class.getResource("/images/icon-198x47.png")));
		lblNewLabel.setBounds(0, 11, 198, 47);
		panel_1.add(lblNewLabel);
		
		txtCenterpint = new JTextField();
		txtCenterpint.setHorizontalAlignment(SwingConstants.CENTER);
		txtCenterpint.setText("Centerpoint");
		txtCenterpint.setForeground(Color.WHITE);
		txtCenterpint.setFont(new Font("Californian FB", Font.PLAIN, 25));
		txtCenterpint.setColumns(10);
		txtCenterpint.setBackground(new Color(14, 23, 122));
		txtCenterpint.setBounds(0, 65, 198, 32);
		panel_1.add(txtCenterpint);
		
		textField = new JTextField();
		textField.setBounds(0, 127, 198, 65);
		panel_1.add(textField);
		textField.setText("Food");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Book Antiqua", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBackground(new Color(14, 23, 122));
		
		Panel panel_1_1 = new Panel();
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setBounds(715, 0, 211, 502);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		txtPayment = new JTextField();
		txtPayment.setBounds(50, 412, 111, 30);
		txtPayment.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		txtPayment.setBackground(new Color(251, 97, 7));
		txtPayment.setForeground(new Color(255, 255, 255));
		txtPayment.setHorizontalAlignment(SwingConstants.CENTER);
		txtPayment.setText("Payment");
		panel_1_1.add(txtPayment);
		txtPayment.setColumns(10);
		
		txtOrder = new JTextField();
		txtOrder.setBounds(50, 37, 111, 30);
		txtOrder.setText("Order #");
		txtOrder.setHorizontalAlignment(SwingConstants.CENTER);
		txtOrder.setForeground(new Color(251, 97, 7));
		txtOrder.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		txtOrder.setColumns(10);
		txtOrder.setBackground(new Color(255, 255, 255));
		panel_1_1.add(txtOrder);
		
		panel_2 = new JPanel();
		panel_2.setBounds(198, 0, 518, 489);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		panel_2.add(foodPanel);
		panel_2.add(beveragePanel);
		panel_2.add(extraPanel);

		
		menuClicked(foodPanel);
		
	}
	
	public void menuClicked(JPanel panel)
	{
		foodPanel.setVisible(false);
		beveragePanel.setVisible(false);
		extraPanel.setVisible(false);
		panel.setVisible(true);
	}
}
