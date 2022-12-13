package prog;

import java.util.Scanner;

class Student{
	private static int count;
	private int rollNo;
	private String name;
	private float per;
	
	public Student() {}
	
	public Student(int no, String n, float p) {
		rollNo = no;
		name = n;
		per = p;
		count++;
	}
	
	public String toString() {
		return "Roll No:"+rollNo+"\nName:"+name+"\nPercentage:"+per;
	}
	
	public static void dispCount() {
		System.out.println("NO. of objects created:"+count);
	}
}


public class TestStudent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String ch = "";
		
		do {			
			System.out.print("Enter roll no.");
			int rno = s.nextInt();
			
			System.out.print("Enter name:");
			s.nextLine();
			String name = s.nextLine();
			
			System.out.print("Enter percentage:");
			float per = s.nextFloat();
			
			 Student stud = new Student(rno, name, per);
			 
			 System.out.println(stud);
			 Student.dispCount();
			 //static dispCount hence called using "."
			 
			 System.out.print("Continue Y/N?");
			 s.nextLine();
			 ch = s.nextLine();
			 
		}while(ch.equals("Y"));
		s.close();
	}

}
