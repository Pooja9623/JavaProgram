package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLabelDemo extends JFrame {
	private JLabel l1,l2,l3;
	private Button b,b2,b3;
	private JTextField tf1;
	
	public JLabelDemo() {
		l1 = new JLabel("Plain Text");
		l2 = new JLabel(new ImageIcon("C:\\Users\\hp\\Pictures/OI.jfif"),JLabel.LEFT);
		l3 = new JLabel("Label with Image", new ImageIcon("C:\\Users\\hp\\Pictures/OIP.jfif"), JLabel.RIGHT);
		l3.setHorizontalTextPosition(JLabel.CENTER);
		l3.setVerticalTextPosition(JLabel.TOP);
		
		tf1 = new JTextField(10);
		l1.setDisplayedMnemonic('T');
		l1.setLabelFor(tf1);
		
		setTitle("JLabel Demo");
		setSize(400,400);
		setLocation(100,100);
		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(l3);
		setVisible(true);
		
		b = new Button("Text");
		b2 = new Button("Test1");
		b3 = new Button("Test3");
		add(b);
		add(b2);
		add(b3);
		
		l1.setLabelFor(b2);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(l1.getText().equals("Call"))
					l1.setText("Hang");
				else l1.setText("Call");
				
				l2.setIcon(new ImageIcon("C:\\Users\\hp\\Pictures/OIP.jfif"));
				
			}
			
		});
	}

	public static void main(String[] args) {
		new JLabelDemo();

	}

}
