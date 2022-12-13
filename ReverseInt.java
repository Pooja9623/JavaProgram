package prog;
import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a positive integer:");
		int n = s.nextInt();
		
		int i = 0;
		while(n>0) {
			i = i * 10 + n%10;
			n /= 10;
		}
		System.out.println("The reverse number is "+i);
	}

}
