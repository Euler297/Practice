package NEWPACKAGE;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test extends JFrame {
	
	public test () {
		
		this.setSize(1000,1000);
		
		ImageIcon kimduhan = new ImageIcon("kimduhan.jpg");
		ImageIcon b = new ImageIcon("maxresdefault.jpg");
		ImageIcon c = new ImageIcon("hqdefault.jpg");
		
		JLabel label1 = new JLabel(kimduhan);
		JLabel label2 = new JLabel(b);
		JLabel label3 = new JLabel(c);
		
		this.add(label2, BorderLayout.LINE_START);
		this.add(label1);
		this.add(label3, BorderLayout.LINE_END);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test();
	}

}
