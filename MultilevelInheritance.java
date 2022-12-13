package prog;

class Person{
	int id,num;
	String name;
	
	
	public void setPerson(int i,int n,String m) {
		id = i;
		num = n;
		name = m;
	}
	
	public void putPerson(){
		System.out.println("id:"+id+"\nNumber:"+num+"\nName:"+name);
	}
}

class Employee extends Person{
	int salary;
	String role;
	
	public void setEmployee(int sal, String rol) {
		salary = sal;
		role = rol;
	}
	
	public void putEmployee() {
		System.out.println("Salary:"+salary+"\nDesignation:"+role);
	}
}

class Manager extends Employee{
	String degree;
	int exp;
	
	public void setManager(String deg, int ex) {
		degree = deg;
		exp = ex;
	}
	
	public void putManager() {
		System.out.println("Degree:"+degree+"\nExperience:"+exp);
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
	
		Manager m = new Manager();
		
		m.setPerson(23, 25356563, "Mahesh");
		m.setEmployee(35000, "developer");
		m.setManager("MCA", 5);
		
		m.putPerson();
		m.putEmployee();
		m.putManager();

	}

}
