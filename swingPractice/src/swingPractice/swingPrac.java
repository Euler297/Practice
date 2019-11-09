package swingPractice;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class swingPrac extends JFrame {
	JLabel jl;
	Container c1 = getContentPane();
	public swingPrac () {
		c1.setLayout(new FlowLayout()); // â ���� ����
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ���� �� ����
		setVisible(true); // â�� ���� ����
		setSize(1920, 1080); // â�� ũ��
		setTitle("Change color"); // â�� �̸�
		
		jl = new JLabel ("Press ENTER to change background color."); // �ؽ�Ʈ ���
		c1.add(jl);
		
		JButton button = new JButton("Button"); // ��ư ����, container�� �߰�
		c1.add(button);
		
		
		c1.addKeyListener(new KeyAdapter()  {
			@Override
			public void keyPressed (KeyEvent e)  {
				int a = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				int c = (int) (Math.random() * 256);
				if (e.getKeyChar() == '\n') {
					jl.setText("R: " + a + "G: " + b + "B: " + c);
					c1.setBackground(new Color(a,b,c));
				} 
			}
			
		});
		setVisible(true);
		c1.requestFocus();
	}
	
	
	public static void main (String args[]) {
		new swingPrac();
	}
}
