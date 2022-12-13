package prog;

public class SumofSquares {

	public static void main(String[] args) {
		int LB = 1;
		int UB = 100;
		
		int sum = 0;
		
		for(int i = LB; i <= UB; i++) {
			sum += i*i;
		}
		System.out.println("Sum of the Squares is "+sum);
	}

}
