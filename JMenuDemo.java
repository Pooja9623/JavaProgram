package mySwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenuDemo extends JFrame {
	private JMenuBar mbMain;
	private JMenu mnFile, mnOpen, mnColor, mnStyle;
	private JMenuItem niNew, niAWT,niSwing,miExit;
	private JCheckBoxMenuItem cbBold, cbItalic;
	private JRadioButtonMenuItem rbRed,rbGreen, rbBlue;
	private JTextArea txtMain;
	private ButtonGroup bg;
	private JComboBox cmbSize;
	
	public JMenuDemo() {
		mbMain = new JMenuBar();
		mnFile = new JMenu("File");
		mnOpen = new JMenu("Open");
		mnColor = new JMenu("Color");
		mnStyle = new JMenu("Style");
		
		niNew  = new JMenuItem("New", KeyEvent.VK_F3);
		KeyStroke ns = KeyStroke.getKeyStroke("F3");
		niNew.setAccelerator(ns);
		
		niAWT  = new JMenuItem("AWT");
		niSwing = new JMenuItem("Swing");
		miExit = new JMenuItem("Exit",KeyEvent.VK_X);
		
		KeyStroke ks = KeyStroke.getKeyStroke("shift X");
		miExit.setAccelerator(ks);
		
		rbRed = new JRadioButtonMenuItem("Red");
		rbGreen = new JRadioButtonMenuItem("Red");
		rbBlue = new JRadioButtonMenuItem("Blue");
		
		cbBold = new JCheckBoxMenuItem("Bold");
		cbItalic = new JCheckBoxMenuItem("Italic");
		
		cmbSize = new JComboBox(new String[] {"Font Size", "8","10","12","18", "20","25"});
		mbMain.add(cmbSize);
		
		mnOpen.add(niAWT);
		mnOpen.add(niSwing);
		
		mnFile.add(niNew);
		mnFile.add(mnOpen);
		mnFile.addSeparator();
		mnFile.add(miExit);
		
		mnColor.add(rbRed);
		mnColor.add(rbGreen);
		mnColor.add(rbBlue);
		
		mnStyle.add(cbBold);
		mnStyle.add(cbItalic);
		
		mbMain.add(mnFile);
		mbMain.add(mnColor);
		mbMain.add(mnStyle);
		
		txtMain = new JTextArea();
		
		bg = new ButtonGroup();
		bg.add(rbRed);
		bg.add(rbGreen);
		bg.add(rbBlue);
		
		niNew.setIcon(new ImageIcon("c:/users/hp/pictures/1.gif"));
		miExit.setIcon(new ImageIcon("c:/users/hp/pictures/33.gif"));
		mnOpen.setIcon(new ImageIcon("c:/users/hp/pictures/53.gif"));
		
		setTitle("Menu Demo");
		setSize(400,400);
		setLocation(100,100);
		add(new JScrollPane(txtMain));
		add(txtMain);
		setJMenuBar(mbMain);
		
		setVisible(true);
	RadioButtonHandler rh = new RadioButtonHandler();
	rbRed.addItemListener(rh);
	rbGreen.addItemListener(rh);
	rbBlue.addItemListener(rh);
	
	CheckBoxhandler ch = new CheckBoxhandler();
	cbBold.addItemListener(ch);
	cbItalic.addItemListener(ch);
	
	cmbSize.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
		int size = Integer.parseInt(cmbSize.getSelectedItem().toString());
         int val_Bold = Font.PLAIN, Val_Italic = Font.PLAIN;
		
		if(cbBold.isSelected()) val_Bold = Font.BOLD;
		if(cbItalic.isSelected()) Val_Italic = Font.ITALIC;
			
		txtMain.setFont(new Font("Arial",val_Bold+Val_Italic,size));
		
		}
	});
	
	miExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
	
	
	niNew.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			txtMain.setText("");
			
		}
	});
	}
	
	
	class CheckBoxhandler implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
		int val_Bold = Font.PLAIN, Val_Italic = Font.PLAIN;
		
		if(cbBold.isSelected()) val_Bold = Font.BOLD;
		if(cbItalic.isSelected()) Val_Italic = Font.ITALIC;
			
		txtMain.setFont(new Font("Arial",val_Bold+Val_Italic,15));
		}
		
	}
	
	
	class RadioButtonHandler implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
	  if(e.getSource()==rbRed) {
		  txtMain.setForeground(Color.RED);
	  }
	  if(e.getSource()==rbGreen) {
		  txtMain.setForeground(Color.GREEN);
	  }
	  if(e.getSource()==rbBlue) {
		  txtMain.setForeground(Color.BLUE);
	  }
	  
			
		}
		
	}
	
	public static void main(String[] args) {

			new JMenuDemo();
	}
}
