package mySwing;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame {
	private Label lblCounter;
	private Button btnCount;
	private TextField txtCounter;
	
	private int count=1;
	
	public AWTCounter(){
		lblCounter = new Label("Counter");
		txtCounter = new TextField(10);
		btnCount = new Button("Count");
		
		setLocation(100,100);
		setLayout(new FlowLayout());
		setTitle("AWT Counter"); 
	      setSize(300, 100);
	      add(lblCounter);
	 
	      txtCounter.setEditable(false);      
	      add(txtCounter);                    

	      btnCount = new Button("Count");  
	      add(btnCount);                   

		setVisible(true);
		
		txtCounter.setText(Integer.toString(count));
		
		ButtonHandler Bh = new ButtonHandler();
		btnCount.addActionListener(Bh);
	}
	
	class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
				count++;
		txtCounter.setText(Integer.toString(count));
			
		}
		
	}

	public static void main(String[] args) {
		new AWTCounter();

	}

}
