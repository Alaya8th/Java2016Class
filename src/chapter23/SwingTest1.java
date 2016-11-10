package chapter23;

import java.awt.*;

import javax.swing.*;

public class SwingTest1 {
	static JFrame frm = new JFrame();
	static Container cp = frm.getContentPane();
	static JButton btn1 = new JButton("Botton1");
	static JButton btn2 = new JButton("Botton2");
	static JButton btn3 = new JButton("Botton3");
	static JButton btn4 = new JButton("Botton4");
	static JButton btn5 = new JButton("Botton5");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cp.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));		
		
		btn1.setBounds(10, 10, 80, 30);
		btn2.setBounds(10, 80, 80, 30);
		btn3.setBounds(10, 130, 80, 30);
		btn4.setBounds(10, 180, 80, 30);
		btn5.setBounds(10, 250, 80, 30);
		
		cp.add(btn1);
		cp.add(btn2);
		cp.add(btn3);
		cp.add(btn4);
		cp.add(btn5);

		frm.setSize(400, 350);
		frm.setVisible(true);
	}
}
