package classObject;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
	
	public BorderLayoutDemo() {
	setTitle("Border Layout Demo");
	setSize(300, 300);
	setLocation(100, 100);
	setLayout(new BorderLayout(10,20));
	setBackground(Color.MAGENTA);
	add(new Button("North"), "North");
	add(new Button("South"), "South");
	add(new Button("East"), "East");
	add(new Button("West"), BorderLayout.WEST);
	add(new Button("Center"), "Center");
	setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new BorderLayoutDemo();

	}

}
