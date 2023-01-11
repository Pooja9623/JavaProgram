package javaTutorial;

import java.util.Scanner;

public class GradesStatistics {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int Num = in.nextInt();
		int max=0,min=100;
		double avg=0,grad=0,standev;
		int Grades[] = new int[Num];
		for(int i=0; i<Num; i++) {
			System.out.print("Enter the grade for student "+(i+1)+": ");
			Grades[i]= in.nextInt();
			avg += Grades[i];
			if(Grades[i]<min) min=Grades[i];
			if(Grades[i]>max) max=Grades[i];
			grad += Math.pow(Grades[i],2);
		}
		
		for(int i=0;i<Num;i++) {
			if(i==0) System.out.print("The grades are: [ "+Grades[i]);
			else System.out.print(" , "+Grades[i]);
			
			if(i<Num-1) continue;
			System.out.print(" ]\n");
		}
			grad /=Num;
			avg /= Num;
			
			grad -= Math.pow(avg,2);
			standev=Math.sqrt(grad);
		
		
		System.out.printf("The average is: %.2f",avg);
		System.out.println("\nThe minimum grade is: "+min+"\nThe maximum grade is: "+max+"\nStandard Deviation is:"+standev);
		in.close();
	}

}
