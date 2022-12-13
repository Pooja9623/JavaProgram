package prog;

public class Tribonacci {

	public static void main(String[] args) {
		
		int a = 1, b = 1, c = 2 , d, n = 20;
       System.out.println("The first "+n+" tribonacci numbers are:");
		
		
		for(int i = 1; i<= n; i++) {
			
			System.out.print(a+" ");
			d = a + b +c;
			a = b;
			b = c;
			c = d;
		}

	}

}
