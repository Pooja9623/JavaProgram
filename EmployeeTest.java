package tutorialOOP;

class Employee{
	private int id,salary;
	private String firstName, lastName;
	
	public Employee(int i, String Fname, String Lname, int sal) {
		id = i;
		firstName =Fname;
		lastName = Lname;
		salary = sal;
	}
	
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName+" "+lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int s) {
		salary = s;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent) {
		int per = salary*percent/100;
		return (salary+=per);
	}
	
	public String toString() {
		return "Employee [ID = "+id+", Name = "+getName()+", Salary = "+salary+"]";
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee E = new Employee(234, "Radha", "Patil", 20000);
		System.out.println(E);
		
		E.setSalary(999);
		System.out.println("First name: "+E.getFirstName()+"\tAnnual Salary: "+E.getAnnualSalary()+
				"\tRaised Salary: "+E.raiseSalary(20));

	}

}
