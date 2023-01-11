package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonDemo extends JFrame {
	private JButton b1,b2,b3;
	
	
	public JButtonDemo() {
		b1 = new JButton("Plain Button");
		b2 = new JButton(new ImageIcon("C:\\Users\\hp\\Pictures\\OI.jfif"));
		b3 = new JButton("Fancy Button", new ImageIcon("C:/Users/hp/Pictures/O.jfif"));
		
		b1.setToolTipText("I am Plain Button");
		b2.setToolTipText("I am Button with Icon");
		b3.setToolTipText("I am Fancy Button");
		
		b2.setRolloverIcon(new ImageIcon("C:/Users/hp/Pictures/OIP.jfif"));
		b2.setPressedIcon(new ImageIcon("C:/Users/hp/Pictures/As.jfif"));
		b2.setDisabledIcon(new ImageIcon("C:/Users/hp/Pictures/pp.jfif"));
		
		b1.setMnemonic('P');
		b1.setBackground(Color.lightGray);
		b1.setForeground(Color.BLACK);
		
		b3.setHorizontalTextPosition(JButton.CENTER);
		b3.setVerticalTextPosition(JButton.BOTTOM);
		
		setTitle("JButton Demo");
		setLocation(100,200);
		setSize(300,400);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2.setEnabled(false);				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2.setEnabled(!b2.isEnabled());
			}
		});
	}

	public static void main(String[] args) {
		new JButtonDemo();

	}

}
