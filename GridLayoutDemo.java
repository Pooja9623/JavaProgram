package classObject;

import java.awt.*;

public class GridLayoutDemo extends Frame {

	public GridLayoutDemo() {
		setTitle("GridLayout Demo");
		setSize(300, 300);
		setLocation(100, 100);
		setLayout(new GridLayout(3,3,5,5));
		
		for(int i=1;i<=9;i++) {
			add(new Button("B"+i));
		}
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}
