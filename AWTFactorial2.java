package mySwing;

import java.awt.*;
import java.awt.event.*;

import mySwing.AWTAccumulator2.TextHandler;

public class AWTFactorial2 extends Frame{
	private Label lblNum, lblFac;
	private TextField txtNum, txtFact;
	
	private int num, fact;
	
	public AWTFactorial2() {
		setTitle("AWT Factorial");
		setLocation(200,200);
		setSize(400,100);
		setLayout(new GridLayout(2, 2, 10, 10));
		setVisible(true);
		
		lblNum = new Label("Enter a positive integer:");
		lblFac = new Label("Factorial is: ");
		txtFact = new TextField(10);
		txtNum = new TextField(10);
		add(lblNum);
		add(txtNum);
		add(lblFac);
		add(txtFact);
		
		txtNum.addActionListener(new TextHandler());
	    addWindowListener(new TextHandler());
		
	}
	
	class TextHandler extends WindowAdapter implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			int no = Integer.parseInt(txtNum.getText());
			for(num=1,fact=1;num<=no;num++) {
				fact *= num;
			}
			txtFact.setText(Integer.toString(fact));
			
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new AWTFactorial2();
	}

}
