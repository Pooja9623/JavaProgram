package prog;

import java.util.Scanner;

public class TriangularPatternXB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=n; i>=1; i--) {
			
		  for(int j=1; j<=i; j++) {
			  System.out.printf("# ");
		  }
		  System.out.println();
		}
		s.close();

	}

}
