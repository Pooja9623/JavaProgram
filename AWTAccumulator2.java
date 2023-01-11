package mySwing;

import java.awt.*;
import java.awt.event.*;

import mySwing.AWTAccumulator.TextHandler;

public class AWTAccumulator2 extends Frame {
	
	private Label lblNum, lblSum;
	private TextField txtNum ;
	private int sum = 0;
	
	public AWTAccumulator2() {
		 setTitle("AWT Accumulator");
		    setLocation(200,200);
		    setSize(410,200);
		    setVisible(true);
	   setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    lblNum = new Label("Enter an Integer:");
	    add(lblNum);
	    
	    txtNum = new TextField(20);
	    add(txtNum);
	    
	    lblSum = new Label("The Accumulated sum is 0");
	    add(lblSum);
	    
	    
	    txtNum.addActionListener(new TextHandler());
	    addWindowListener(new TextHandler());
	   	      
	}
	
	 class TextHandler extends WindowAdapter implements ActionListener {
	      // ActionEvent handler - Called back upon hitting "enter" key on TextField
		 
	      public void actionPerformed(ActionEvent evt) {
	         // Get the String entered into the TextField tfInput, convert to int
	         int number = Integer.parseInt(txtNum.getText());
	         sum += number;      // Accumulate numbers entered into sum
	         txtNum.setText("");  // Clear input TextField
	         lblSum.setText("The Accumulated sum is "+sum);
	        
	      }
	      
	      public void windowClosing(WindowEvent e) {
	    	  System.exit(0);
	      }
	 }


	public static void main(String[] args) {
	new AWTAccumulator2();

	}

}
