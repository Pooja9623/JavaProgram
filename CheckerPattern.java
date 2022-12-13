package prog;

import java.util.Scanner;

public class CheckerPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.print("Enter size:");
		n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(" ");
			}
		  for(int j=1; j<=n; j++) {
			  System.out.printf("# ");
		  }
		  System.out.println();
		}
		

	}

}
