package prog;
import java.util.Scanner;

public class ComputePI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter maximum denominator:");
		int max_d = s.nextInt();
		double sum = 0.0;
		for(double d = 1; d<=max_d; d+=2) {
			
			if(d % 4 == 1) {
				sum += 1/d;
			} else if(d % 4 == 3) {
				sum -= 1/d;
			} else {// remainder 0/2
				System.out.print("Impossible!!");
			}
			
		}
		double pi = 4 * sum;
		System.out.println(pi);
		
		double per = pi/Math.PI * 100;
		System.out.println(per);
	}

}
