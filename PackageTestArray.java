package prog;
import java.util.Scanner;

import prog.SY.*;
import prog.TY.*;

class Students{
	private int rollNo;
	private String Name;
	private SYMarks sy;
	private TYMarks ty;
	
	public Students(int r,String n,int ct, int et,int mt,int tt, int pt) {
		rollNo = r;
		Name = n;
		sy = new SYMarks(ct,mt,et);
		ty = new TYMarks(tt,pt);
	}
	
	public String toString() {
		float per = (sy.getCompTotal()+ ty.getTheory()+ ty.getPractical())/12.0f;
		String grade ="";
		if(per>=70) grade = "A";
		else if(per>=60) grade = "B";
		else if(per>=50) grade = "C";
		else if(per>=40) grade = "PASS";
		else grade = "FAIL";
		
		return "Roll No:"+rollNo+"\nName:"+Name+
				"\nSy Marks:"+sy+"\nTY Marks:"+ty+
				"\nPercentage:"+per+"\nGrade:"+grade+"\n";
	}
}

public class PackageTestArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter no of Students:");
		int n = in.nextInt();
		
		Students s[] = new Students[n];
		
		for(int i=0; i<s.length; i++) {                                     //s.length=n
			System.out.print("Enter roll No.:");
			int rno = in.nextInt();
			in.nextLine();
			System.out.print("Enter Name:");
			String name = in.nextLine();
			System.out.print("Enter computer total:");
			int ct = in.nextInt();
			System.out.print("Enter electronics total:");
			int et = in.nextInt();
			System.out.print("Enter maths total:");
			int mt = in.nextInt();
			System.out.print("Enter theory total:");
			int tt = in.nextInt();
			System.out.print("Enter practical total:");
			int pt = in.nextInt();
			
			System.out.println();
			
			s[i]= new Students(rno, name, ct, et, mt, tt, pt);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(s[i]);
		}
		in.close();
	}

}
