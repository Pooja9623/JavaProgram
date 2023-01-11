package mySwing;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {
	private Label lblNum, lblSum;
	private TextField txtNum, txtSum;
	private int sum = 0;
	
	public AWTAccumulator() {
		 setTitle("AWT Accumulator");
		    setLocation(200,200);
		    setSize(400,100);
		    setVisible(true);
	   setLayout(new GridLayout(2, 2, 10, 10));
	    lblNum = new Label("Enter an Integer:");
	    add(lblNum);
	    
	    txtNum = new TextField();
	    add(txtNum);
	    
	    lblSum = new Label("The Accumulated sum is:");
	    add(lblSum);
	    
	    txtSum = new TextField();
	    txtSum.setEditable(false);
	    add(txtSum);
	    
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
	         txtSum.setText(Integer.toString(sum)); // Display sum on the output TextField
	                                     // convert int to String
	      }
	      
	      public void windowClosing(WindowEvent e) {
	    	  System.exit(0);
	      }
	 }

	public static void main(String[] args) {
		new AWTAccumulator();
	}

}
