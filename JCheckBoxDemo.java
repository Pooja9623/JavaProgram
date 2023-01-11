package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCheckBoxDemo extends JFrame {
	private JTextField txtMsg;
	private JCheckBox cbBold, cbItalic;
	
	public JCheckBoxDemo() {
		txtMsg = new JTextField(15);
		cbBold = new JCheckBox("Bold");
		cbItalic = new JCheckBox("Italic");
		
		setTitle("JCheckBox Demo");
		setLocation(100,200);
		setSize(400,100);
		setLayout(new FlowLayout());
		add(txtMsg);
		add(cbBold);
		add(cbItalic);
		setVisible(true);
		
		txtMsg.setFont(new Font("Arial",Font.PLAIN,15));
		
		CheckBoxHandler CH = new CheckBoxHandler();
		cbBold.addItemListener(CH);
		cbItalic.addItemListener(CH);
		
		
		
	}
	
	class CheckBoxHandler implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			int ValBold = Font.PLAIN,
			 ValItal = Font.PLAIN;
			
			if(cbBold.isSelected()) ValBold = Font.BOLD;
			if(cbItalic.isSelected()) ValItal = Font.ITALIC;
			
			txtMsg.setFont(new Font("Arial",ValBold+ValItal,15));
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new JCheckBoxDemo();

	}

}
