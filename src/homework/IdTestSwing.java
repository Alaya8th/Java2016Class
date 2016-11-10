package homework;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

public class IdTestSwing {
	static JFrame frm = new JFrame("身份證號碼檢查 Swing");
	static Container cp = frm.getContentPane();
	static JLabel lblName = new JLabel("請輸入身份證號碼：");
	static JLabel lblName2 = new JLabel("");
	static JButton btn = new JButton("開始檢查");
	static JTextField txt = new JTextField();
	static String id = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cp.setLayout(new FlowLayout());
		cp.setLayout(null);
		lblName.setLocation(100, 50);
		lblName.setSize(150, 50);
		txt.setLocation(100, 100);
		lblName2.setLocation(100, 150);
		lblName2.setSize(250, 50);
		lblName2.setForeground(Color.blue);		
		txt.setSize(100, 50);
		// txt.setText("a123456789");
		txt.setText("");
		btn.setBounds(100, 200, 90, 50);

		cp.add(lblName);
		cp.add(txt);
		cp.add(lblName2);
		cp.add(btn);

		btn.addActionListener(new ActLis());

		frm.setSize(400, 350);
		frm.setVisible(true);
	}

	static class ActLis implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			id = txt.getText();
			IdCheck idchk = new IdCheck();
			idchk.CheckId(id);
			lblName2.setText(idchk.msg);
			if (idchk.msg.indexOf("有效") > 0) {
				lblName2.setForeground(Color.blue);
			} else {
				lblName2.setForeground(Color.red);
			}
		}
	}
}

class IdCheck {
	static String msg = "NA";

	public boolean CheckId(String id) {
		boolean result = false;
		int diff = 55;
		Integer first = 0;
		int sum1 = 0, sum2 = 0;
		msg = "此身份證號碼為 無效 號碼 !!";
		// System.out.println("id.length() = " + id.length());
		if (id.length() == 10) {
			char chr = id.toUpperCase().charAt(0);
			// System.out.println("id.toUpperCase().charAt(0) = " + chr);
			// 英文字母代表的數字：
			// A=10 B=11 C=12 D=13 E=14 F=15 G=16 H=17 I=34
			// J=18 K=19 L=20 M=21 N=22 O=35 P=23 Q=24 R=25
			// S=26 T=27 U=28 V=29 W=32 X=30 Y=31 Z=33
			if (chr > 64 && chr < 91) {
				if (chr != 'I' && chr != 'O') {
					if (chr > 79) {
						diff = 57;
					} else if (chr > 73) {
						diff = 56;
					}
					
					first = chr - diff;
					
					switch (chr) {
					case 'W':
						first = 32;
						break;
					case 'X':
						first = 30;
						break;
					case 'Y':
						first = 31;
						break;
					case 'Z':
						first = 33;
						break;
					}

					if (chr == 'W')
						first = 32;
					if (chr == 'Z')
						first = 33;
					
					sum1 = Integer.parseInt(first.toString().substring(0, 1))
							+ Integer.parseInt(first.toString().substring(1, 2)) * 9;
					// System.out.println("sum1 = " + sum1);
					sum2 = Integer.parseInt(id.substring(1, 2)) * 8 + Integer.parseInt(id.substring(2, 3)) * 7
							+ Integer.parseInt(id.substring(3, 4)) * 6 + Integer.parseInt(id.substring(4, 5)) * 5
							+ Integer.parseInt(id.substring(5, 6)) * 4 + Integer.parseInt(id.substring(6, 7)) * 3
							+ Integer.parseInt(id.substring(7, 8)) * 2 + Integer.parseInt(id.substring(8, 9))
							+ Integer.parseInt(id.substring(9, 10));
					// System.out.println("sum2 = " + sum2);
					// System.out.println("sum1 + sum2 = " + (sum1 + sum2));
					if ((sum1 + sum2) % 10 == 0) {
						result = true;
						msg = "此身份證號碼為 有效 號碼 !!";
					}
				} else {
					msg = "身份證號碼第一碼不可為 'I' 或 'O' !!";
				}
			} else {
				msg = "身份證號碼第一碼必須為 26 個英文字母中的其中一個 !!";
			}
		} else {
			msg = "身份證號碼總長度需為 10 個號碼 !!";
		}
		return result;
	}
}