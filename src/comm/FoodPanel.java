package comm;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FoodPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public FoodPanel() {
		setBackground(new Color(239, 246, 255));
		setLayout(null);
		setBounds(0,0,518,489);
		setVisible(true);
		
		textField = new JTextField();
		textField.setBounds(45, 96, 113, 60);
		textField.setText("Food_1");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(251, 97, 7));
		textField.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		add(textField);
		
		textField_2 = new JTextField();
		textField_2.setText("Food_2");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(new Color(251, 97, 7));
		textField_2.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(196, 96, 113, 60);
		add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Food_3");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(251, 97, 7));
		textField_1.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(354, 96, 113, 60);
		add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setText("Food_4");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(new Color(251, 97, 7));
		textField_3.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(45, 209, 113, 60);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Food_5");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(new Color(251, 97, 7));
		textField_4.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(196, 209, 113, 60);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("Food_6");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(new Color(251, 97, 7));
		textField_5.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(354, 209, 113, 60);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Food_7");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(new Color(251, 97, 7));
		textField_6.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(45, 310, 113, 60);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("Food_8");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(new Color(251, 97, 7));
		textField_7.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(196, 310, 113, 60);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("Food_9");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(new Color(251, 97, 7));
		textField_8.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(354, 310, 113, 60);
		add(textField_8);

	}
}
