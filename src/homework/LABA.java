package homework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.management.timer.Timer;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LABA {
	int a, b, c, mo, out, la, num;
	String mon, laa;
	private JFrame frame;
	private JTextField txt;
	private JLabel lblPrice;
	private JLabel lblTotal;
	private JButton btn;
	String strPic1 = "";
	String strPic2 = "";
	String strPic3 = "";
	int rand = 1;
	int j = 10;
	private JTextField textTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LABA window = new LABA();
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
	public LABA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel a1 = new JLabel("");
		a1.setIcon(new ImageIcon(LABA.class.getResource("/homework/7.png")));
		a1.setBounds(58, 12, 190, 227);
		frame.getContentPane().add(a1);

		JLabel b1 = new JLabel("");
		b1.setIcon(new ImageIcon(LABA.class.getResource("/homework/7.png")));
		b1.setBounds(258, 12, 205, 227);
		frame.getContentPane().add(b1);

		JLabel c1 = new JLabel("");
		c1.setIcon(new ImageIcon(LABA.class.getResource("/homework/7.png")));
		c1.setBounds(473, 10, 201, 230);
		frame.getContentPane().add(c1);

		JLabel lblMoney = new JLabel("您已投注的總金額：");
		lblMoney.setBounds(42, 298, 131, 24);
		frame.getContentPane().add(lblMoney);

		lblTotal = new JLabel("100");
		lblTotal.setFont(new Font("新細明體", Font.BOLD, 14));
		lblTotal.setBounds(183, 300, 87, 21);
		frame.getContentPane().add(lblTotal);

		JLabel lblNewLabel_1 = new JLabel("投注金額：");
		lblNewLabel_1.setBounds(43, 380, 77, 18);
		frame.getContentPane().add(lblNewLabel_1);

		txt = new JTextField();
		txt.setText("100");
		txt.setBounds(183, 378, 77, 24);
		frame.getContentPane().add(txt);
		txt.setColumns(10);

		btn = new JButton("開始");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// for (int i = 1; i <= 500; i++) {
				// if (i % 100 == 0) {
				// rand = (int) (Math.random() * 9) + 1;
				// strPic = "/homework/" + rand + ".png";
				// System.out.println("strPic = " + strPic);
				// a1.setIcon(new ImageIcon(LABA.class.getResource(strPic)));
				// rand = (int) (Math.random() * 9) + 1;
				// strPic = "/homework/" + rand + ".png";
				// System.out.println("strPic = " + strPic);
				// b1.setIcon(new ImageIcon(LABA.class.getResource(strPic)));
				// rand = (int) (Math.random() * 9) + 1;
				// strPic = "/homework/" + rand + ".png";
				// System.out.println("strPic = " + strPic);
				// c1.setIcon(new ImageIcon(LABA.class.getResource(strPic)));
				// }else if(i % 101 == 0){
				// try {
				// Thread.sleep(500);
				// } catch (InterruptedException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
				// }
				// }

				j = 10;
				new java.util.Timer().schedule(new TimerTask() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						rand = (int) (Math.random() * 9) + 1;
						strPic1 = "/homework/" + rand + ".png";
						// System.out.println("strPic = " + strPic);
						a1.setIcon(new ImageIcon(LABA.class.getResource(strPic1)));
						rand = (int) (Math.random() * 9) + 1;
						strPic2 = "/homework/" + rand + ".png";
						// System.out.println("strPic = " + strPic);
						b1.setIcon(new ImageIcon(LABA.class.getResource(strPic2)));
						rand = (int) (Math.random() * 9) + 1;
						strPic3 = "/homework/" + rand + ".png";
						// System.out.println("strPic = " + strPic);
						c1.setIcon(new ImageIcon(LABA.class.getResource(strPic3)));
						if (j-- == 0) {
							if (strPic1.equals(strPic2) && strPic1.equals(strPic3)) {
								System.out.println("Congratulations! You win the game!!");
								btn.setEnabled(false);
								btn.setText("You win the game!!");
							} else if (Integer.parseInt(textTotal.getText()) == Integer.parseInt(lblTotal.getText())) {
								System.out.println("Sorry! You have no money to play!!");
								btn.setEnabled(false);
								btn.setText("很抱歉!您的籌碼已輸完，無法再玩!!");
							}
							else {
								System.out.println("Sorry! You lost the game!!");
								int intTotal;
								intTotal = Integer.parseInt(lblPrice.getText()) + Integer.parseInt(txt.getText());
								lblPrice.setText(Integer.toString(intTotal));
								intTotal = Integer.parseInt(lblTotal.getText()) + Integer.parseInt(txt.getText());
								lblTotal.setText(Integer.toString(intTotal));

							}

							this.cancel();
						}

					}
				}, 0, 50);

				// System.out.println("show");
				//
				// while (1 == 1) {
				// break;
				// }

				// a1.setVisible(false);
				// b1.setVisible(false);
				// c1.setVisible(false);

				// a=(int)(1+Math.random()*3);
				// (int) (Math.random() * 9) + 1
				// b=(int)(1+Math.random()*3);
				// c=(int)(1+Math.random()*3);

				// a = (int) (Math.random() * 9) + 1;
				// b = (int) (Math.random() * 9) + 1;
				// c = (int) (Math.random() * 9) + 1;
				//
				// if (a == 1)
				// a1.setVisible(true);
				//
				// if (b == 1)
				// b1.setVisible(true);
				//
				// if (c == 1)
				// c1.setVisible(true);
				//
				// mon = txt.getText();
				// mo = Integer.parseInt(mon);
				// laa = lblTotal.getText();
				// la = Integer.parseInt(laa);
				// num = -1 * mo;
				//
				// if (a == 1 && b == 1 && c == 1)
				// num += (2 * mo);
				// if (a == 2 && b == 2 && c == 2)
				// num += (2 * mo);
				// if (a == 3 && b == 3 && c == 3)
				// num += (2 * mo);
				//
				// out = la + num;
				// lblTotal.setText("" + out);
				//
				// if (out <= 0) {
				// btn.setEnabled(false);
				// btn.setText("您已輸光啦~哈哈");
				// txt.setText("如果有欠錢快去還吧");
				//
				// }

			}
		});

		btn.setBounds(373, 316, 270, 47);
		frame.getContentPane().add(btn);

		JLabel lblNewLabel_2 = new JLabel("目前累積獎金：");
		lblNewLabel_2.setBounds(42, 267, 92, 21);
		frame.getContentPane().add(lblNewLabel_2);

		lblPrice = new JLabel("1000");
		lblPrice.setForeground(Color.RED);
		lblPrice.setFont(new Font("新細明體", Font.BOLD, 14));
		lblPrice.setBounds(183, 267, 87, 21);
		frame.getContentPane().add(lblPrice);

		JLabel lblNewLabel = new JLabel("欲下注的總金額：");
		lblNewLabel.setBounds(42, 343, 115, 15);
		frame.getContentPane().add(lblNewLabel);

		textTotal = new JTextField();
		textTotal.setBounds(183, 340, 77, 21);
		frame.getContentPane().add(textTotal);
		textTotal.setColumns(10);
	}
}
