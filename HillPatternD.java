package prog;

import java.util.Scanner;

public class HillPatternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the rows:");
		int n = s.nextInt();
		
		for(int i=1; i<=n*2-1; i++) {
			
				System.out.print("# ");
		}
		System.out.println();
		
		for(int i=n-1; i>=1; i--) {
			
			  for(int j=1; j<=i; j++) {
				  System.out.printf("# ");
			  }
			  
			  for(int j=1;j<=2*(n-i)-1;j++) {
				  System.out.print("  ");
			  }
			  
			  for(int j=1; j<=i; j++) {
				  System.out.printf("# ");
			  }
			  
			  System.out.println();
		  }
		    
		for(int i=2;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("# ");
			}
			
			for(int j=2*(n-i)-1;j>=1;j--) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("# ");
			}
			
			 System.out.println();
		}
		for(int i=1; i<=n*2-1; i++) {
			
			System.out.print("# ");
	}
		s.close();
	}

}
