package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JScrollBarDemo extends JFrame {
	private JScrollBar JSR, JSB, JSG;
	private JPanel p1;
	private JLabel LR,LG,LB;
	
	public JScrollBarDemo() {
		p1 = new JPanel();
		JSR = new JScrollBar(JScrollBar.VERTICAL,20,10,0,260);
		JSG = new JScrollBar(JScrollBar.VERTICAL,20,10,0,260);
		JSB = new JScrollBar(JScrollBar.VERTICAL,20,10,0,260);
		
		JSR.setBounds(10, 40, 20, 300);
		JSG.setBounds(40, 40, 20, 300);
		JSB.setBounds(70, 40, 20, 300);
		p1.setBounds(100,50,250,250);
		
		add(JSR);
		add(JSB);
		add(JSG);
		add(p1);
		
		setTitle("JScrollBarDemo");
		setLocation(100,100);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		JScrollBarHandler SH = new JScrollBarHandler();
		JSR.addAdjustmentListener(SH);
		JSG.addAdjustmentListener(SH);
		JSB.addAdjustmentListener(SH);
		
	}
	
	class JScrollBarHandler implements AdjustmentListener{
		public void adjustmentValueChanged(AdjustmentEvent e) {
			int r = JSR.getValue();
			int g = JSG.getValue();
			int b = JSB.getValue();
		p1.setBackground(new Color(r, g, b));
		}
		
	}

	public static void main(String[] args) {
		new JScrollBarDemo();

	}

}
