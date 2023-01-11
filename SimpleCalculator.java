package mySwing;

import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField TxtNo1;
	private JTextField TxtNo2;
	private JLabel lblAnswer;
	private JTextField textField;
	private JPanel p1;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnClear;
	private JButton btnMod;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator frame = new SimpleCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		JLabel lblLabel1 = new JLabel("Number 1");
		lblLabel1.setFont(new Font("Tahoma", Font.BOLD, 19));
		contentPane.add(lblLabel1);
		
		TxtNo1 = new JTextField();
		TxtNo1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(TxtNo1);
		TxtNo1.setColumns(15);
		
		JLabel lblLabel2 = new JLabel("Number 2");
		lblLabel2.setFont(new Font("Tahoma", Font.BOLD, 19));
		contentPane.add(lblLabel2);
		
		TxtNo2 = new JTextField();
		TxtNo2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(TxtNo2);
		TxtNo2.setColumns(15);
		
		lblAnswer = new JLabel("    Answer ");
		lblAnswer.setHorizontalAlignment(SwingConstants.LEFT);
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 19));
		contentPane.add(lblAnswer);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setColumns(15);
		contentPane.add(textField);
		
		p1 = new JPanel();
		contentPane.add(p1);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		p1.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(TxtNo1.getText());
				int b = Integer.parseInt(TxtNo2.getText());
				 textField.setText(Integer.toString(a+b));
					
			}
		});
		
		btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		p1.add(btnSub);
		 btnSub.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					int a = Integer.parseInt(TxtNo1.getText());
					int b = Integer.parseInt(TxtNo2.getText());
					 textField.setText(Integer.toString(a-b));
						
				}
			});
		
		btnMult = new JButton("*");
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		p1.add(btnMult);
		 btnMult.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					int a = Integer.parseInt(TxtNo1.getText());
					int b = Integer.parseInt(TxtNo2.getText());
					 textField.setText(Integer.toString(a*b));
						
				}
			});
		
		btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		p1.add(btnDiv);
	    btnDiv.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					int a = Integer.parseInt(TxtNo1.getText());
					int b = Integer.parseInt(TxtNo2.getText());
					 textField.setText(Integer.toString(a/b));
						
				}
			});
	    
	    btnMod = new JButton("%");
	    btnMod.setFont(new Font("Tahoma", Font.BOLD, 18));
	    p1.add(btnMod);
	    btnMod.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(TxtNo1.getText());
				int b = Integer.parseInt(TxtNo2.getText());
				 textField.setText(Integer.toString(a%b));
				
			}
		});
		
	    btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		p1.add(btnClear);
		btnClear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				
			}
		});
		
	}

}
