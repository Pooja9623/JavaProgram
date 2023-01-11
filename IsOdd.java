package javaTutorial;

import java.util.Scanner;

public class IsOdd {
	
	public static boolean isOdd(int num) {
		if(num%2==0) return false;
		else return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = in.nextInt();
		
		if(isOdd(number)) {
			System.out.println(number+" is an odd number");
		}
		else System.out.println(number+" is an even number");
		
		in.close();
	}

}
