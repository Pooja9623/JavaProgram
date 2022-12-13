package prog;

import java.util.Scanner;

public class CompPI {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		System.out.println("Enter maximum number of term:");
		int max_term = s.nextInt();
		double sum = 0.0;
		for(int term = 1; term <= max_term; term++) {
			
			if(term % 2 == 1) {
				sum += 1.0/(term*2 - 1);
			} else  {
				sum -= 1.0/(term*2 - 1);
			}
		}
		double pi = 4 * sum;
		System.out.println(pi);
		
		double per = pi/Math.PI * 100;
		System.out.println(per);
	}

}
