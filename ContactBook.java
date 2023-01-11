package classObject;

import java.awt.*;

public class ContactBook extends Frame {
	private TextField txtName, txtEmail, txtPhone;
	private Label lblName,lblPhone, lblEmail,lblTitle; 
	private Button btnAdd, btnDelete, btnSearch, btnUpdate, btnView, btnExit;
	private Panel p1, p2;
	
	public ContactBook() {
		lblTitle = new Label("My Contact Book");
		lblName = new Label("Name:");
		lblEmail = new Label("Email:");
		lblPhone = new Label("Phone:");
		
		txtName = new TextField();
		txtEmail = new TextField();
		txtPhone = new TextField();
		
		btnAdd = new Button("Add");
		btnDelete = new Button("Delete");
		btnSearch = new Button("Search");
		btnUpdate = new Button("Update");
		btnView = new Button("View");
		btnExit = new Button("Exit");
		
		p1 = new Panel(new GridLayout(3, 2));
		//p1.setLayout(new GridLayout(3,2));
		p1.add(lblName);
		p1.add(txtName);
		p1.add(lblPhone);
		p1.add(txtPhone);
		p1.add(lblEmail);
		p1.add(txtEmail);
		
		p2 = new Panel(new GridLayout(1,6));
		p2.add(btnAdd);
		p2.add(btnDelete);
		p2.add(btnSearch);
		p2.add(btnUpdate);
		p2.add(btnView);
		p2.add(btnExit);
		
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTitle.setAlignment(Label.CENTER);
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setBackground(Color.yellow);
		setTitle("Contact Book");
		setSize(400,200);
		setLocation(100,100);
		add(lblTitle, "North");
		add(p1, "Center");
		add(p2, "South");
		
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		new ContactBook();

	}

}
