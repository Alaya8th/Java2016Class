package homework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MySwingCalculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwingCalculator window = new MySwingCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MySwingCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(27, 21, 445, 66);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 113, 305, 410);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(btn7);
		
		JButton button = new JButton("8");
		button.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button);
		
		JButton button_3 = new JButton("9");
		button_3.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_3);
		
		JButton button_7 = new JButton("4");
		button_7.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_7);
		
		JButton button_6 = new JButton("5");
		button_6.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_6);
		
		JButton button_8 = new JButton("6");
		button_8.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_8);
		
		JButton button_4 = new JButton("1");
		button_4.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_4);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_1);
		
		JButton button_9 = new JButton("3");
		button_9.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_9);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(Color.BLUE);
		btnC.setFont(new Font("微軟正黑體", Font.BOLD, 52));
		panel.add(btnC);
		
		JButton button_2 = new JButton("0");
		button_2.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_2);
		
		JButton button_10 = new JButton(".");
		button_10.setVerticalAlignment(SwingConstants.TOP);
		button_10.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel.add(button_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(342, 113, 133, 410);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_5 = new JButton("+");
		button_5.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel_1.add(button_5);
		
		JButton button_11 = new JButton("-");
		button_11.setFont(new Font("微軟正黑體", Font.BOLD, 80));
		panel_1.add(button_11);
		
		JButton btnAdd = new JButton("*");
		btnAdd.setVerticalAlignment(SwingConstants.TOP);
		btnAdd.setFont(new Font("微軟正黑體", Font.BOLD, 68));
		panel_1.add(btnAdd);
		
		JButton button_12 = new JButton("/");
		button_12.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		panel_1.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.setFont(new Font("微軟正黑體", Font.BOLD, 62));
		panel_1.add(button_13);
	}
}
