package prog;

import java.util.Scanner;

public class AverageWithInputValidation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		final int Num_Students = 3;
		
		
		int sum = 0;
		
		for(int i = 1; i <= Num_Students; i++) {
			int n = 0;
			boolean flag = false;
		do {
		System.out.printf("Enter the mark (0-100) for student %d:",i);
		n = s.nextInt();
		if(n>=0 && n<=100) {
		flag = true;
		} else {
			System.out.println("Invalid input, try again....");
		}
		} while(!flag);
		System.out.println("You have entered: "+n);
		sum += n;
		}
		
		float avg = sum/Num_Students;
		System.out.printf("The average is: %.2f",avg);
		
		s.close();
		

	}

}
