package classObject;

import java.awt.*;
import java.awt.event.*;

public class MouseListenerDemo extends Frame {
	private TextField txtMsg;
	
	public MouseListenerDemo() {
		txtMsg = new TextField(15);
		
		
		setTitle("Mouse Demo");
		setSize(200,200);
		setLocation(100,100);
		setLayout(new FlowLayout());
		add(txtMsg);
		setVisible(true);
		
		
		MouseHandler mh = new MouseHandler();
		addMouseListener(mh);  		//source.add<type>Listener(h)
		addMouseMotionListener(mh);
		addWindowListener(mh);
	}
	
	
	class MouseHandler extends WindowAdapter implements MouseListener, MouseMotionListener{

		public void mouseClicked(MouseEvent e) {
			txtMsg.setText("Mouse Clicked");
		}

		public void mousePressed(MouseEvent e) {
			txtMsg.setText("Mouse Pressed");	
		}

		public void mouseReleased(MouseEvent e) {
			txtMsg.setText("Mouse Released");
		}

		public void mouseEntered(MouseEvent e) {
			txtMsg.setText("Mouse Entered");
			setBackground(Color.lightGray);
		}

		public void mouseExited(MouseEvent e) {
			txtMsg.setText("Mouse Exited");
			setBackground(Color.green);
		}

		public void mouseDragged(MouseEvent e) {
			txtMsg.setText("("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
		txtMsg.setText("("+e.getX()+","+e.getY()+")");
			
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		new MouseListenerDemo();
	}

}
