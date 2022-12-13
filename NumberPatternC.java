package prog;

import java.util.Scanner;

public class NumberPatternC {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
				
			}
			
		  for(int j=i; j>=1; j--) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
		}
		s.close();
	}

}
