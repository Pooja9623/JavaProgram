package prog;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
		  for(int j=1; j<=n; j++) {
			  System.out.printf("# ");
		  }
		  System.out.printf("\n");
		}
		
		s.close();
	}

}
