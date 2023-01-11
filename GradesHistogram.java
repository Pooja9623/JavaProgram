package javaTutorial;

import java.util.Scanner;

public class GradesHistogram {

	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
		
      int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0,k=0;
		System.out.print("Enter number of students: ");
		int Num = in.nextInt();
		
		int Grades[] = new int[Num];
		for(int i=0; i<Num; i++) {
			System.out.print("Enter the grade for student "+(i+1)+": ");
			Grades[i]= in.nextInt();
			if(Grades[i]>=0 && Grades[i]<10) a++;
			else if(Grades[i]>=10 && Grades[i]<20) b++;
			else if(Grades[i]>=20 && Grades[i]<30) c++;
			else if(Grades[i]>=30 && Grades[i]<40) d++;
			else if(Grades[i]>=40 && Grades[i]<50) e++;
			else if(Grades[i]>=50 && Grades[i]<60) f++;
			else if(Grades[i]>=60 && Grades[i]<70) g++;
			else if(Grades[i]>=70 && Grades[i]<80) h++;
			else if(Grades[i]>=80 && Grades[i]<90) j++;
			else if(Grades[i]>=90 && Grades[i]<=100) k++;
			else ;
		}
		
		System.out.print("\n 0 -  9:");  for(int i=1;i<=a;i++) System.out.print("*");
		System.out.print("\n10 - 19:");  for(int i=1;i<=b;i++) System.out.print("*");
		System.out.print("\n20 - 29:");  for(int i=1;i<=c;i++) System.out.print("*");
		System.out.print("\n30 - 39:");  for(int i=1;i<=d;i++) System.out.print("*");
		System.out.print("\n40 - 49:");  for(int i=1;i<=e;i++) System.out.print("*");
		System.out.print("\n50 - 59:");  for(int i=1;i<=f;i++) System.out.print("*");
		System.out.print("\n60 - 69:");  for(int i=1;i<=g;i++) System.out.print("*");
		System.out.print("\n70 - 79:");  for(int i=1;i<=h;i++) System.out.print("*");
		System.out.print("\n80 - 89:");  for(int i=1;i<=j;i++) System.out.print("*");
		System.out.print("\n90 -100:");  for(int i=1;i<=k;i++) System.out.print("*");

	}

}
