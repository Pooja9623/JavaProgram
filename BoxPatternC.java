package prog;

import java.util.Scanner;

public class BoxPatternC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			
		  for(int j=1; j<=n; j++) {
			 if( i==n || i==1 || i+j==n+1 ) {
				 System.out.printf("# ");
			 } else System.out.print("  ");
			  
		  }
		  System.out.println();
		}
		

	}

}
