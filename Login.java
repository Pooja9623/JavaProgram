package mySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {
	private final String UID = "itupgrade001";
	private final String Pass = "itupgrade@akurdi";
	private int attempts=0;
	
	
	private JLabel lblUser, lblPassword;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private Button btnOk, btnCancel;
	
	public Login() {
		lblUser = new JLabel("Usesr ID:");
		lblPassword = new JLabel("Password:");
		
		txtUser = new JTextField();
		txtPass = new JPasswordField();
		
		btnOk = new Button("OK");
		btnCancel = new Button("Cancel");
		
		lblUser.setDisplayedMnemonic('U');
		lblUser.setLabelFor(txtUser);
		lblPassword.setDisplayedMnemonic('P');
		lblPassword.setLabelFor(txtPass);
		setTitle("Login");
		setSize(300,150);
		setLocation(100,100);
		setLayout(new GridLayout(3,2));
		add(lblUser);
		add(txtUser);
		add(lblPassword);
		add(txtPass);
		add(btnOk);
		add(btnCancel);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		
		btnCancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnOk.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			String u = txtUser.getText();
			String p = txtPass.getText();
			//char[] p = txtPass.getPassword();
			
			if(u.equals(UID) && p.equals(Pass)) {
				
				JOptionPane.showMessageDialog(null, "Login Successfull!!!");
				new AWTAccumulator();
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "Login Failed!!");
				txtUser.setText("");
				txtPass.setText("");
				txtUser.requestFocus();
				attempts++;
				
				if(attempts==3) {
					JOptionPane.showMessageDialog(null, "Your Attempts are over!!");
					System.exit(0);
				}
			}	
			
			
			}		
		});
		
	}

	public static void main(String[] args) {
		new Login();

	}

}
