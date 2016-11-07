package chapter17;

import java.awt.*;
import java.awt.event.*;

public class app17_1 {

	static Frame frm = new Frame("My First AWT program :");
	static Label lab = new Label("Hello Java !!");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frm.setSize(220, 150);
		frm.setBackground(Color.yellow);
		frm.setLocation(250, 250);
		frm.add(lab);
		frm.setVisible(true);

		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
