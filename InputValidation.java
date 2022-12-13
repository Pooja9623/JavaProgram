package prog;
import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean flag = false;
		int n = 0;
		do {
			System.out.print("Enter a number between 0-10 or 90-100: ");
			n = s.nextInt();
			if((n>=0 && n<=10) || (n>=90 && n<=100)) {
				flag = true;
			}
				else {
					System.out.println("Invalid input, try again...");
				}
		} while (!flag);
		
		System.out.println("You have entered: "+n);
		
		s.close();
	}

}
