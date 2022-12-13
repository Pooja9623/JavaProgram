package prog;

public class Product1Ton {

	public static void main(String[] args) {
	   int LB = 1;
	   int UB = 20;
	   
	   long product = 1;
	   for(int i = LB; i <= UB; i++) {
		   product *= i;
	   }
         System.out.println("The product of "+LB+" to "+UB+" is "+product);
	}

}
