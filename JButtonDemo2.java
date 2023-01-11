package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonDemo2 extends JFrame {
	private JButton b[][],btnUp,btnDown,btnLeft,btnRight,btnUR,btnUL,btnDR,btnDL;
	private int x=0,y=0;
	
	public JButtonDemo2() {
		b = new JButton[8][8];
		
		setTitle("JButton Grid");
		setLocation(100,100);
		setSize(800,800);
		setLayout(new GridLayout(9,8));
		setVisible(true);
		
	for(int i=0; i<8;i++) {
		for(int j=0;j<8;j++){
			b[i][j] = new JButton();
			add(b[i][j]);	
		}
	}
	
	btnUp = new JButton(new ImageIcon("C:/Users/hp/Pictures/55.gif"));
	btnDown = new JButton(new ImageIcon("C:/Users/hp/Pictures/54.gif"));
	btnRight = new JButton(new ImageIcon("C:/Users/hp/Pictures/57.gif"));
	btnLeft = new JButton(new ImageIcon("C:/Users/hp/Pictures/56.gif"));
	btnUR = new JButton(new ImageIcon("C:/Users/hp/Pictures/34.gif"));
	btnUL = new JButton(new ImageIcon("C:/Users/hp/Pictures/35.gif"));
	btnDR = new JButton(new ImageIcon("C:/Users/hp/Pictures/37.gif"));
	btnDL = new JButton(new ImageIcon("C:/Users/hp/Pictures/36.gif"));
	
	add(btnUp);
	add(btnDown);
	add(btnRight);
	add(btnLeft);
	add(btnUR);
	add(btnUL);
	add(btnDR);
	add(btnDL);
		
	b[0][0].setBackground(Color.BLACK);
	
	btnDown.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e) {
			b[x][y].setBackground(Color.WHITE);
			if(x<7) {x++;}
			b[x][y].setBackground(Color.black);
		}
	});
	
	btnUp.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b[x][y].setBackground(Color.WHITE);
			if(x>0) {x--;}
			b[x][y].setBackground(Color.black);
		}
	});
	
	btnLeft.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b[x][y].setBackground(Color.WHITE);
			if(y>0) {y--;}
			b[x][y].setBackground(Color.black);
		}
	});
	
	btnRight.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b[x][y].setBackground(Color.WHITE);
			if(y<7) {y++;}
			b[x][y].setBackground(Color.black);
		}
	});
	
	btnUR.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b[x][y].setBackground(Color.WHITE);
			if(x>0 && y<7) {x--; y++;}
			b[x][y].setBackground(Color.black);
		}
	});
	
	btnUL.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b[x][y].setBackground(Color.WHITE);
			if(x>0 && y>0) {x--; y--;}
			b[x][y].setBackground(Color.black);
		}
	});
	
	btnDR.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b[x][y].setBackground(Color.WHITE);
			if(x<7 && y<7) {x++; y++;}
			b[x][y].setBackground(Color.black);
		}
	});
	
	btnDL.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			b[x][y].setBackground(Color.WHITE);
			if(x<7 && y>0) {x++; y--;}
			b[x][y].setBackground(Color.black);
		}
	});
		
		
	}

	public static void main(String[] args) {
		new JButtonDemo2();

	}

}
