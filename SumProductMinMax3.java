package prog;
import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       
	       System.out.print("Enter first integer:");
	       int a = s.nextInt();
	       System.out.print("Enter second integer:");
	       int b = s.nextInt();
	       System.out.print("Enter third integer:");
	       int c = s.nextInt();
	       
	       int d = a + b + c;
	       int e = a * b * c;
	       
	       System.out.println("Sum = "+d);
	       System.out.println("Product = "+e);
	       int max = a>b?(a>c?a:c):(b>c?b:c);
		   System.out.println("Max = "+max);
		   int min = a<b?(a<c?a:c):(b<c?b:c);
		   System.out.println("Min = "+min);
		   
		   s.close();
	}

}
