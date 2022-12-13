package prog;

import java.util.Scanner;

public class Factorial {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = s.nextInt();		
		
		
		int i=1 ,fact = 1;
		
		while(i<=num) {
			fact *= i;
			i++;
		}
		System.out.println("The factorial of "+num+" is: "+fact);
		s.close();	
	}
	
}
