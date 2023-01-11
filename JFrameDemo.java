package mySwing;

import java.awt.*;
import javax.swing.*;

public class JFrameDemo extends JFrame {
	
	public JFrameDemo() {
		setTitle("My First JFrame");
		setSize(300,300);
		setLocation(100,100);
		getContentPane().setBackground(Color.BLUE);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		//already extended from JFrame------JFrame.DISPOSE_ON_CLOSE
		setVisible(true);

	}
	//Container c = getContentPane();

	public static void main(String[] args) {
		new JFrameDemo();

	}

}
