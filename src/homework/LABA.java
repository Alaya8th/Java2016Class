package homework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LABA {
int a,b,c,mo,out,la,num;
String mon,laa;
	private JFrame frame;
	private JTextField txt;

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
		a1.setBounds(42, 10, 206, 230);
		frame.getContentPane().add(a1);
		
		JLabel a2 = new JLabel("New label");
		a2.setIcon(new ImageIcon(LABA.class.getResource("/homework/p2.jpg")));
		a2.setBounds(42, 49, 150, 150);
		frame.getContentPane().add(a2);
		
		JLabel a3 = new JLabel("New label");
		a3.setIcon(new ImageIcon(LABA.class.getResource("/homework/p3.jpg")));
		a3.setBounds(42, 49, 150, 150);
		frame.getContentPane().add(a3);
		
		JLabel b1 = new JLabel("New label");
		b1.setIcon(new ImageIcon(LABA.class.getResource("/homework/7.png")));
		b1.setBounds(258, 12, 205, 227);
		frame.getContentPane().add(b1);
		
		JLabel b2 = new JLabel("New label");
		b2.setIcon(new ImageIcon(LABA.class.getResource("/homework/p2.jpg")));
		b2.setBounds(258, 49, 150, 150);
		frame.getContentPane().add(b2);
		
		JLabel b3 = new JLabel("New label");
		b3.setIcon(new ImageIcon(LABA.class.getResource("/homework/p3.jpg")));
		b3.setBounds(258, 49, 150, 150);
		frame.getContentPane().add(b3);
		
		JLabel c1 = new JLabel("New label");
		c1.setIcon(new ImageIcon(LABA.class.getResource("/homework/7.png")));
		c1.setBounds(473, 10, 201, 230);
		frame.getContentPane().add(c1);
		
		JLabel c2 = new JLabel("New label");
		c2.setIcon(new ImageIcon(LABA.class.getResource("/homework/p2.jpg")));
		c2.setBounds(473, 49, 150, 150);
		frame.getContentPane().add(c2);
		
		JLabel c3 = new JLabel("New label");
		c3.setIcon(new ImageIcon(LABA.class.getResource("/homework/p3.jpg")));
		c3.setBounds(473, 49, 150, 150);
		frame.getContentPane().add(c3);
		
		JLabel lblMoney = new JLabel("您投注的總金額：");
		lblMoney.setBounds(42, 298, 108, 24);
		frame.getContentPane().add(lblMoney);
		
		JLabel lblTotal = new JLabel("100");
		lblTotal.setFont(new Font("新細明體", Font.BOLD, 14));
		lblTotal.setBounds(144, 300, 87, 21);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblNewLabel_1 = new JLabel("投注金額：");
		lblNewLabel_1.setBounds(42, 345, 77, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt = new JTextField();
		txt.setText("1");
		txt.setBounds(144, 332, 137, 24);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		JButton btn = new JButton("開始");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a1.setVisible(false);
				a2.setVisible(false);
				a3.setVisible(false);
				b1.setVisible(false);
				b2.setVisible(false);
				b3.setVisible(false);
				c1.setVisible(false);
				c2.setVisible(false);
				c3.setVisible(false);
				
				a=(int)(1+Math.random()*3);
				b=(int)(1+Math.random()*3);
				c=(int)(1+Math.random()*3);
				
				if (a==1) a1.setVisible(true);
				if (a==2) a2.setVisible(true);
				if (a==3) a3.setVisible(true);
				
				if (b==1) b1.setVisible(true);
				if (b==2) b2.setVisible(true);
				if (b==3) b3.setVisible(true);
				
				if (c==1) c1.setVisible(true);
				if (c==2) c2.setVisible(true);
				if (c==3) c3.setVisible(true);
				
				mon=txt.getText();
				mo=Integer.parseInt(mon);
				laa=lblTotal.getText();
				la=Integer.parseInt(laa);
				num=-1*mo;
				
				if (a==1 && b==1 && c==1) num+=(2*mo);
				if (a==2 && b==2 && c==2) num+=(2*mo);
				if (a==3 && b==3 && c==3) num+=(2*mo);
			
				out=la+num;
				lblTotal.setText(""+out);
				
				if(out<=0){
					btn.setEnabled(false);
					btn.setText("您已輸光啦~哈哈");
					txt.setText("如果有欠錢快去還吧");
					
				}
			}
		});
		
		btn.setBounds(373, 316, 190, 47);
		frame.getContentPane().add(btn);
		
		JLabel lblNewLabel_2 = new JLabel("目前累積獎金：");
		lblNewLabel_2.setBounds(42, 267, 92, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblPrice = new JLabel("1000000");
		lblPrice.setForeground(Color.RED);
		lblPrice.setFont(new Font("新細明體", Font.BOLD, 14));
		lblPrice.setBounds(144, 267, 87, 21);
		frame.getContentPane().add(lblPrice);
	}
}
