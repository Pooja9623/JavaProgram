package prog;

import java.util.Scanner;

public class Factorial {
	
	public static int Factor(int num) {
      int i=1 ,fact = 1;
		
		while(i<=num) {
			fact *= i;
			i++;
		}
		
		return fact;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = s.nextInt();		
		
		Factorial f = new Factorial();
				
		System.out.println("The factorial of "+num+" is: "+(f.Factor(num)));
		s.close();	
	}
	
}
