//Accept using command line arguments and create student object using argument

package prog;

class Date{
	private int dd, mm, yy;
	
	public Date(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}
	
	public String toString() {
		return dd+"/"+mm+"/"+yy ;
	}
}

class Student1{
	private int id;
	private String name;
	private Date dob;
	private int m1, m2, m3;
	
	public Student1(int i, String n, int d, int m, int y, int a, int b, int c) {
		id = i;
		name = n;
		dob = new Date(d, m, y);
		m1 = a;
		m2 = b;
		m3 = c;
	}
	
	public String toString() {
		return "ID:"+id+"\nName:"+name+
				"\nDOB:"+dob+"\nMarks 1:"+m1+
				"\nMarks 2:"+m2+"\nMarks 3:"+m3;
	}
	
}
public class StudentDetails {

	public static void main(String[] args) {
	 Student1 s = new Student1(
			 Integer.parseInt(args[0]),
			 (args[1]),
			 Integer.parseInt(args[2]),
			 Integer.parseInt(args[3]),
			 Integer.parseInt(args[4]),
			 Integer.parseInt(args[5]),
			 Integer.parseInt(args[6]),
			 Integer.parseInt(args[7])
           );
	     System.out.println(s);
	}

}
