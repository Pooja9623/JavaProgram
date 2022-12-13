package prog;

import java.util.Scanner;

public class TriangularPatternXD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
				
			}
			
		  for(int j=1; j<=i; j++) {
			  System.out.printf("# ");
		  }
		  System.out.println();
		}
		s.close();
			
	}

}
