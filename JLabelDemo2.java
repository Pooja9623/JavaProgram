package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLabelDemo2 extends JFrame {
	private JLabel lblI1, lblI2, lblI3, lblI4,lblI5;
	private Button btnSmile, btnLovely, btnGood, btnWink;
	private JPanel p1;
	
	public JLabelDemo2() {
		lblI1 = new JLabel(new ImageIcon("C:/Users/hp/Pictures/O.jfif"));
		lblI2 = new JLabel(new ImageIcon("C:/Users/hp/Pictures/pp.jfif"));
		lblI3 = new JLabel(new ImageIcon("C:/Users/hp/Pictures/OI.jfif"));
		lblI4 = new JLabel(new ImageIcon("C:/Users/hp/Pictures/OIP.jfif"));
		lblI5 = new JLabel();
		
		btnSmile = new Button("Smile");
		btnLovely = new Button("Lovely");
		btnGood = new Button("Good");
		btnWink = new Button("Wink");
		
		p1 = new JPanel(new GridLayout(2,4,10,10));
		
		
		setTitle("JLabel Demo 2");
		setLocation(100,100);
		setSize(400,400);
		setVisible(true);
		setContentPane(p1);
		
		p1.add(btnSmile);
		p1.add(btnLovely);
		p1.add(btnGood);
		p1.add(btnWink);
	
	   btnSmile.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			p1.add(lblI1);
			
		}
	});
	   
	   btnLovely.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.add(lblI2);
				
		}
	});
	   
	   btnGood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.add(lblI3);
				
		}
	});
	   
	   btnWink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.add(lblI4);
				
			}
		});
	
	
	}

	public static void main(String[] args) {
		new JLabelDemo2();

	}

}
