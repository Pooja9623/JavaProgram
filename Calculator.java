package classObject;

import java.awt.*;

import java.awt.event.*;
import prog.*;



public class Calculator extends Frame{
	private Button btnDiv,btnAdd,btnMult,btnSub,btnEqual, btnMod, btnDelete, btnCancel,btnPower, btnFactorial;
	private TextField txtCol1, txtCol2,txtColSign,txtAnswer;
	private Panel p1,p2;
	private Label lblEqual;
	
	public Calculator() {
		txtCol1 = new TextField(5);
		txtColSign = new TextField(1);
		txtCol2 = new TextField(5);
		txtAnswer = new TextField(10);
		
		lblEqual = new Label("=", Label.CENTER);
		
		btnAdd = new Button("+");
		btnSub = new Button("-");
		btnMult = new Button("*");
		btnDiv = new Button("/");
		btnMod = new Button("%");
		
		btnDelete = new Button("Delete");
		btnCancel = new Button("C");
		btnEqual = new Button("=");
		btnFactorial = new Button("!");
		btnPower = new Button("^");
		
		p1 = new Panel(new GridLayout(5,2));
		
		p1.add(btnCancel);
		p1.add(btnDelete);
		
		p1.add(btnFactorial);
		p1.add(btnPower);
		
		p1.add(btnMod);
		p1.add(btnDiv);
		
		p1.add(btnMult);
		
		p1.add(btnSub);
		
		p1.add(btnAdd);
	
		p1.add(btnEqual);
		
		p2 = new Panel(new FlowLayout(0, 5, 10));
		p2.add(txtCol1);
		p2.add(txtColSign);
		p2.add(txtCol2);
		p2.add(lblEqual);
		p2.add(txtAnswer);
		
		
		setTitle("Calculator");
		setSize(400,200);
		setLocation(100,100);
		
		add(p1, "South");
		add(p2, "North");
		
		setVisible(true);
		
		MouseHandler mh = new MouseHandler();
		addWindowListener(mh);
		addMouseMotionListener(mh);
		btnAdd.addActionListener(mh);
		btnSub.addActionListener(mh);
		btnMult.addActionListener(mh);
		btnDiv.addActionListener(mh);
		btnMod.addActionListener(mh);
		btnPower.addActionListener(mh);
		btnFactorial.addActionListener(mh);
		btnEqual.addActionListener(mh);
		btnCancel.addActionListener(mh);
		
		setVisible(true);
	}
	
	class MouseHandler extends WindowAdapter implements MouseMotionListener, ActionListener{
       float a,b,c;
       char ch;
		
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		a = Integer.parseInt(txtCol1.getText());
		b = Integer.parseInt(txtCol2.getText());
			
			
			if(e.getSource()==btnAdd) {c=a+b;	txtColSign.setText("+");}
			if(e.getSource()==btnSub) {c=a-b; 	txtColSign.setText("-");}
			if(e.getSource()==btnMult){c=a*b; 	txtColSign.setText("*");}
			if(e.getSource()==btnDiv) {c=a/b;	txtColSign.setText("/");}
			if(e.getSource()==btnMod) {c=a%b; 	txtColSign.setText("%");}
			if(e.getSource()==btnPower) {c=(float) Math.pow(a, b);	txtColSign.setText("^");}
			if(e.getSource()==btnFactorial) {c=Factorial.Factor((int) a);  txtColSign.setText("!");}
			if(e.getSource()==btnEqual) { txtAnswer.setText(Float.toString(c));}
			if(e.getSource()==btnCancel) { txtCol1.setText(""); txtColSign.setText(""); txtCol2.setText(""); txtAnswer.setText("");	}
			
		}
		
	}

	public static void main(String[] args) {
		new Calculator();

	}

}
