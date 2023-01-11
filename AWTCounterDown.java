package mySwing;

import java.awt.*;
import java.awt.event.*;

import mySwing.AWTCounter.ButtonHandler;

public class AWTCounterDown extends Frame {
	private Label lblCounter;
	private Button btnCountDown;
	private TextField txtCounter;
	
	private int count=88;
	
	public AWTCounterDown(){
		lblCounter = new Label("Counter");
		txtCounter = new TextField(10);
		btnCountDown = new Button("Count Down");
		
		setLocation(100,100);
		setLayout(new FlowLayout());
		setTitle("AWT Counter Down"); 
	      setSize(300, 100);
	      add(lblCounter);
	 
	      txtCounter.setEditable(false);      
	      add(txtCounter);                    

	     add(btnCountDown);                    // "super" Frame container adds Button component

		setVisible(true);
		
		txtCounter.setText(Integer.toString(count));
		
		ButtonHandler Bh = new ButtonHandler();
		btnCountDown.addActionListener(Bh);
	}
	
	class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				count--;
		txtCounter.setText(Integer.toString(count));
			
		}
		
	}

	
	

	public static void main(String[] args) {
		new AWTCounterDown();

	}

}
