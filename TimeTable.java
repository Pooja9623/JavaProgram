package prog;
import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the size:");
		int n = s.nextInt();
		
		System.out.print(" * |");
		
		for(int i=1; i<=n; i++) {
			System.out.printf("%4d",i);
		}
		
		System.out.println();
		
		for(int i=1; i<=n+1; i++) {
			System.out.printf("----");
		}
		
		System.out.println();
		
		for(int i=1; i<=n; i++) {
			System.out.printf("%2d |",i);
			
			for(int j=1; j<=n; j++) {
				System.out.printf("%4d",i*j);
			}
			
			System.out.println();
		}
		s.close();
	}

}
