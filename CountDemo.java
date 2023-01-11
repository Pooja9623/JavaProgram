package classObject;

import java.awt.*;
import java.awt.event.*;

public class CountDemo extends Frame {
	private Button btnAdd, btnSub, btnCancel;
	private TextField txtCounter;
	private Label lblCount;
	private int n=100;
	
	public CountDemo() {
		lblCount = new Label("Count");
		btnAdd = new Button("+");
		btnSub = new Button("-");
		btnCancel = new Button("C");
		txtCounter = new TextField(5);
		
		txtCounter.setText(Integer.toString(n));
		
		setTitle("Counter");
		setSize(400,400);
		setLocation(100,100);
		setLayout(new FlowLayout());
		add(lblCount);
		add(txtCounter);
		add(btnAdd);
		add(btnSub);
		add(btnCancel);
		
		setVisible(true);
		
		ButtonHandler bh = new ButtonHandler();
		btnAdd.addActionListener(bh);
		btnSub.addActionListener(bh);
		btnCancel.addActionListener(bh);
		addWindowListener(bh);
		
		txtCounter.addActionListener(bh);
		
		Font f = new Font("Arial",Font.BOLD,20);
		lblCount.setFont(f);
		txtCounter.setFont(f);
		btnAdd.setFont(f);
		btnSub.setFont(f);
		btnCancel.setFont(f);
		
		
	}
	
	class ButtonHandler extends WindowAdapter implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnAdd) {
				if(n<100) n++;
			}
			if(e.getSource()==btnSub) {
				if(n>0) n--;
			}
			if(e.getSource()==btnCancel) {
				n=100;
			}
			
			txtCounter.setText(Integer.toString(n));
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		
	}

	public static void main(String[] args) {
	new CountDemo();

	}

}
