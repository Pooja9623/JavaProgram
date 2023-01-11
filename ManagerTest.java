package prog;
import java.util.*;

class Employe{
	private int id;
	private String name,department;
	private float salary;
	
	public Employe() {}
	
	public Employe(int i, String n, String d, float s) {
		id = i;
		name = n;
		department = d;
		salary = s;
	}

	public void accept() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter id");
		id = in.nextInt();
		in.nextLine();
		System.out.println("Enter name");
		name = in.nextLine();
		System.out.println("Enter department");
		department = in.nextLine();
		System.out.println("Enter Salary");
		salary = in.nextFloat();
		
	}

	public void display(){
		System.out.println("ID:"+id+"\nName:"+name+"\nDepartment:"+department+"\nSalary:"+salary);
	}
	
	public float getSalary() {
		return salary;
	}
}	

class Manager1 extends Employe{
	private float bonus;
	
	public Manager1() {}
	
	public Manager1(int i, String n, String d, float s, float b) {
		super(i,n,d,s);
		bonus=b;
	}
	
	public void accept() {
		Scanner in = new Scanner(System.in);
		
		super.accept();          //super. can be in any line except in constructor, where it must be first line only 
		System.out.println("Enter Bonus:");
		bonus = in.nextFloat();
		System.out.println();
	}
	
	public void display() {
		super.display();
		System.out.println("Bonus:"+bonus);
	}
	
	public float getBonus() {
		return bonus;
	}
	
	
}
	
public class ManagerTest {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter no. of managers");
	int n = s.nextInt();
	
	//m[i].accept();			null point references
	Manager1 m[] = new Manager1[n];		//m is array of Manager object with n references
	
	for(int i=0; i<n; i++) {
		m[i] = new Manager1();
		m[i].accept();
		
	}
	
	float max = -9;
	
	for(int i=0; i<n; i++) {
		float t = m[i].getSalary() + m[i].getBonus();
		
		if(t>max) max = t;
	}
	
	for(int i=0; i<n ;i++) {
		float t = m[i].getSalary() + m[i].getBonus();
		if(t==max) m[i].display();
	}

	}

}
