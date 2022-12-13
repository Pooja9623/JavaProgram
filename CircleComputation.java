package prog;
import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	       
	       System.out.print("Enter radius of circle:");
	       double radius = s.nextDouble();
	       
	       double d = 2 * radius;
	       double a = Math.PI * radius * radius;
	       double c = 2 * Math.PI * radius;
	       
	       System.out.printf("Diameter = %.2f\n",d);
	       System.out.printf("Area = %.2f\n",a);
	       System.out.printf("Circumference = %.2f\n",c);

	}

}
