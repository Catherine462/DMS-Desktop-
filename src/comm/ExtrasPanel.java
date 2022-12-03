package comm;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ExtrasPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public ExtrasPanel() {
		setBackground(new Color(239, 246, 255));
		setLayout(null);
		setBounds(0,0,518,489);
		
		textField = new JTextField();
		textField.setText("Extras_1");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(251, 97, 7));
		textField.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(24, 72, 113, 60);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Extras_2");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(251, 97, 7));
		textField_1.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(196, 72, 113, 60);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Extras_3");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(new Color(251, 97, 7));
		textField_2.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(366, 72, 113, 60);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Extras_4");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(new Color(251, 97, 7));
		textField_3.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(24, 198, 113, 60);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Extras_5");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(new Color(251, 97, 7));
		textField_4.setFont(new Font("Book Antiqua", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(196, 198, 113, 60);
		add(textField_4);
		
	}

}
