package javaTutorial;

import java.util.Scanner;

public class PrintArrayInStars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of items:");
		int Num = in.nextInt();
		
		int arr[] = new int[Num];
		System.out.print("Enter the value of all items (separated by space): ");
		for(int i=0; i<Num; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i=0; i<Num; i++) {
			System.out.print(i+": ");
			
			for(int k=0;k<arr[i];k++) {
				System.out.print("*");
			}
			
			System.out.println("("+arr[i]+")");
			
		}
		
		in.close();
	}

}
