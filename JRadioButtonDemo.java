package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtonDemo extends JFrame {
	private JRadioButton RBRed,RBBlue,RBYellow,RBGreen, RBWhite;
	private ButtonGroup BG;
	private JPanel p1,p2;
	
	public JRadioButtonDemo() {
		RBRed = new JRadioButton("RED");
		RBBlue = new JRadioButton("BLUE");
		RBYellow = new JRadioButton("YELLOW");
		RBGreen = new JRadioButton("GREEN");
		RBWhite = new JRadioButton("WHITE");
		
		BG = new ButtonGroup();
		BG.add(RBRed);
		BG.add(RBBlue);
		BG.add(RBYellow);
		BG.add(RBGreen);
		BG.add(RBWhite);
		
		p1 = new JPanel();
		p1.setBackground(Color.gray);
		p1.add(RBRed);
		p1.add(RBBlue);
		p1.add(RBYellow);
		p1.add(RBGreen);
		p1.add(RBWhite);
		
		p2 = new JPanel();
		
		setTitle("JRadioButton");
		setLocation(100,100);
		setSize(400,400);
		add(p1,"North");
		add(p2,"Center");
		setVisible(true);
		
		RadioButtonHandler RH = new RadioButtonHandler();
		RBRed.addItemListener(RH);
		RBBlue.addItemListener(RH);
		RBYellow.addItemListener(RH);
		RBGreen.addItemListener(RH);
		RBWhite.addItemListener(RH);
	}
	
	class RadioButtonHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==RBRed)     p2.setBackground(Color.RED);
			if(e.getSource()==RBBlue)    p2.setBackground(Color.BLUE);
			if(e.getSource()==RBYellow)  p2.setBackground(Color.YELLOW);
			if(e.getSource()==RBGreen)   p2.setBackground(Color.GREEN);
			if(e.getSource()==RBWhite)   p2.setBackground(Color.WHITE);
		}
	}

	public static void main(String[] args) {
		new JRadioButtonDemo();
	}
}
