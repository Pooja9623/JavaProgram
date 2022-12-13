package prog;

import java.util.Scanner;

public class ExtractDigits {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Accept an integer: ");
		int n = s.nextInt();
		
		while(n>0) {
		 System.out.print(n%10+" ");
			n = n/10;
		}
      s.close();
	}

}
