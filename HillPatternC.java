package prog;

import java.util.Scanner;

public class HillPatternC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the rows:");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("# ");
			}
			
			System.out.println();
		}
		n--;
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("  ");
			}
			
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
