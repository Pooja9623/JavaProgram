package mySwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class JComboBoxDemo extends JFrame {
	private JComboBox cmbCities;
	private JTextField txtCity;
	
	JComboBoxDemo(){
		Vector data = new Vector();
		data.add("Pune");
		data.add("Mumbai");
		data.add("Delhi");
		data.add("Nagpur");
		data.add("Indore");
		data.add("Jaipur");
		data.add("Ahemadnagar");
		data.add("Akola");
		
		cmbCities = new JComboBox(data);		//Drop Down Box
		
		txtCity = new JTextField(20);
		setTitle("JComboBox Demo");
		setSize(400,200);
		setLocation (100,100);
		setLayout(new FlowLayout());
		add(cmbCities);
		add(txtCity);
		setVisible(true);
		
	//passed as parameter to register source //object of anonymous class implementing ItemListener
		cmbCities.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
			String s = cmbCities.getSelectedItem().toString();
			txtCity.setText(s);	
			}
		});
	}
	
	public static void main(String[] args) {
		new JComboBoxDemo();
	}
}
