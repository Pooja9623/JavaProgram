package javaTutorial;

import java.util.Scanner;

public class HasEight {
 public static boolean hasEight(int number) {
	 while(number>0) {
	int r = number%10;
	number /= 10;
	 if(r==8) return true;
	 }
	 return false;
 }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num,sum =0;
		
		do {
		System.out.print("Enter a positive integer (or -1 to end):");
		num = in.nextInt();
		if(hasEight(num)) sum += num;
		}while(num!=-1);
		
		System.out.println("The magic sum is: "+sum);
		
		in.close();
	}

}
