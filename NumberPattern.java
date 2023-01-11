package javaTutorial;

import java.util.Scanner;

public class NumberPattern {
	private static void NumPatternA(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
				
			System.out.println();
		}
	}

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter No. of rows:");
			int x = in.nextInt();
		
			in.close();
			
		NumPatternA(5);

	}

}
