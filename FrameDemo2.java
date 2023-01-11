package classObject;

import java.awt.*;

public class FrameDemo2 extends Frame {

	public FrameDemo2() {
		setTitle("My Second Frame");
		setSize(300, 300);
		setLocation(100, 100);
		setBackground(Color.yellow);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FrameDemo2();
		

	}

}
