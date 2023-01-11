package mySwing;

import java.awt.*;
import java.awt.event.*;

public class AWTFactorial extends Frame {
	private Label lblN, lblFact;
	private TextField txtN, txtFact;
	private Button btnNext;
	private int N=1,F=1;
	
	public AWTFactorial() {
		lblN = new Label("n");
		lblFact = new Label("f");
		txtN = new TextField(5);
		txtFact = new TextField(5);
		btnNext = new Button("Next");
		
		setTitle("AWT Factorial");
		setLocation(200,200);
		setSize(400,100);
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		add(lblN);
		add(txtN);
		add(lblFact);
		add(txtFact);
		add(btnNext);
		setVisible(true);
		
		txtN.setEditable(false);
		txtFact.setEditable(false);
		
		txtN.setText(Integer.toString(N));
		txtFact.setText(Integer.toString(F));
		
		ButtonHandler bh = new ButtonHandler(); 
		btnNext.addActionListener(bh);
		addWindowListener(bh);
	}
	
	class ButtonHandler extends WindowAdapter implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			N++;
			F*=N;
			txtN.setText(Integer.toString(N));
			txtFact.setText(Integer.toString(F));
			
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}
	
	

	public static void main(String[] args) {
		new AWTFactorial();
	}

}
