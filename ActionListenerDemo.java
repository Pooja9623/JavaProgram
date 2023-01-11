package classObject;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerDemo extends Frame{
	
	private Button btnRed, btnGreen , btnBlue;
	private Label lblColor;
	
	public ActionListenerDemo() {
		btnRed = new Button("RED");					//button are event source
		btnGreen = new Button("GREEN");
		btnBlue = new Button("BLUE");
		
		lblColor = new Label();
		
		setTitle("ActionListener demo");
		setSize(300, 300);
		setLocation(100,100);
		setLayout(new GridLayout(4,1));
		
		add(btnRed);
		add(btnGreen);
		add(btnBlue);
		add(lblColor);
		setVisible(true);
		
		ButtonHandler bh = new ButtonHandler();			//creating object of handler class
		btnRed.addActionListener(bh);					//Registering event handler to source
		btnGreen.addActionListener(bh);
		btnBlue.addActionListener(bh);
		
	}
	
	class ButtonHandler implements ActionListener{		//event handler implementing interface listener
		public void actionPerformed(ActionEvent ae) {    //overrided method to which object of event is passed as parameter
			if(ae.getSource()==btnRed) {				//check to which source signal is generated
				lblColor.setBackground(Color.red);
			}
			
			if(ae.getSource()==btnGreen) {
				lblColor.setBackground(Color.green);
			}
			
			if(ae.getSource()==btnBlue) {
				lblColor.setBackground(Color.blue);
			}
			
		}
			
	}
	
	public static void main(String[] args) {
		
		new ActionListenerDemo();

	}

}
