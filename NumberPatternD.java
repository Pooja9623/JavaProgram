package prog;

import java.util.Scanner;

public class NumberPatternD {

	public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=n; i>=1; i--) {
			
		  for(int j=i; j>=1; j--) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
		}
		
		s.close();
	}

}
