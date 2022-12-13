package prog;

import java.util.Scanner;

public class BoxPatternB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			
		  for(int j=1; j<=n; j++) {
			 if( i==j || i==1 || i==n ) {
				 System.out.printf("# ");
			 } else System.out.print("  ");
			  
		  }
		  System.out.println();
		}
		
		s.close();
	}

}
