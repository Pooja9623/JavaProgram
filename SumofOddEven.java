package prog;

public class SumofOddEven {

	public static void main(String[] args) {
		int LB = 1;
		int UB = 100;
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = LB; i <= UB; i++) {
         if(i%2==0) sum1 += i;
          else sum2 += i;
	}
		System.out.println("Sum of odd numbers is"+sum2);
		System.out.println("Sum of even numbers is"+sum1);
		
		int diff = sum1>sum2?sum1-sum2:sum2-sum1;
		System.out.println("Absolute difference is"+diff);
 }
}
