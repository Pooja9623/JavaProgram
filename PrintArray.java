package javaTutorial;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements:");
		final int Num  = in.nextInt();
		int[] item = new int[Num];
		
		if(item.length>0) {
			for(int i=0; i<Num; i++) {
				System.out.printf("item[%d]:",i);
				item[i]= in.nextInt();
			}
			
			
			for(int i=0; i<Num; i++) {
				if(i==0) System.out.print(item[i]);
				else System.out.print(", "+item[i]);
			}
			
			System.out.println();
			
			
			for(int i=Num-1;i>=0;i--) {
				if(i==Num-1) System.out.print(item[i]);
				else System.out.print(", "+item[i]);
			}
		} else System.out.println("Enter Valid Number of Elements!");
	in.close();
	}

}
