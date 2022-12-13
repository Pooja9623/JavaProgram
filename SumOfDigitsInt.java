package prog;
import java.util.Scanner;

public class SumOfDigitsInt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a positive integer:");
		int n = s.nextInt();
		
		int sum = 0;
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		System.out.println("The sum of digits is "+sum);
		s.close();
	}

}
