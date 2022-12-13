package prog;

public class Fibonacci {

	public static void main(String[] args) {
	
		int n = 20;
		int a = 1, b = 1, c;
		System.out.println("The first "+n+" fibonacci numbers are:");
		
		double sum = 0;
		
		for(int i = 1; i<= n; i++) {
			sum +=a;
			System.out.print(a+" ");
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
		System.out.println("The Average is "+sum/n);
	}

}
