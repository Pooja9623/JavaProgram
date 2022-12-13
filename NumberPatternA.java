package prog;

import java.util.Scanner;

public class NumberPatternA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			
		  for(int j=1; j<=i; j++) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
		}
		
		s.close();
	}

}
