package javaTutorial;

import java.util.Scanner;

public class PatternPrintA {

	private static void PatternA(int n) {
		for(int i=n;i>0;i--) {
			
			for(int k=1;k<=n-i;k++)
				System.out.print("  ");
			for(int j=1;j<2*i;j++)
				System.out.print("# ");
			
			System.out.println();
		}
	}
	
	
	private static void PatternB(int n) {
		for(int i =1; i<=n;i++) {
		for(int j=n-i;j>0;j--)
			System.out.print("  ");
		for(int j=1;j<2*i;j++)
			System.out.print("# ");
		
		System.out.println();
		}
	}
	
	private static void PatternC(int n) {
		for(int i =1; i<=n;i++) {
			for(int j=n-i;j>0;j--)
				System.out.print("  ");
			for(int j=1;j<2*i;j++)
				System.out.print("# ");
			
			System.out.println();
			}
		
        for(int i=n-1;i>0;i--) {
			
			for(int k=1;k<=n-i;k++)
				System.out.print("  ");
			for(int j=1;j<2*i;j++)
				System.out.print("# ");
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter No. of rows:");
		int x = in.nextInt();
		PatternA(x);
		
		System.out.println();
		
		PatternB(x);
		
		System.out.println();
		
		PatternC(x);
		in.close();

	}

}
