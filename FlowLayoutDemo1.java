package classObject;

import java.awt.*;

public class FlowLayoutDemo1 extends Frame {
	
	public FlowLayoutDemo1() {
		setTitle("FlowLayout Demo");
		setSize(300, 300);
		setLocation(100, 100);
		setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
		setBackground(Color.pink);
		add(new Label("Enter name:"));
		add(new TextField(10));
		add(new TextField(5));
		add(new Button("OK"));
		add(new Button("CANCEL"));
		add(new Label("ANSWER = 0"));
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new FlowLayoutDemo1();

	}

}
