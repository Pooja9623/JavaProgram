package prog;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		final int LOWER_BOUND = 1;
		final int UPPER_BOUND = 100;
		
		int sum = 0;
		double avg;
		
		int i = LOWER_BOUND;
		do {
			sum += i;
			i++;
		} while (i <= UPPER_BOUND);
		
		
	    avg = sum / (UPPER_BOUND - LOWER_BOUND + 1);
	    
	    System.out.println("The sum of "+LOWER_BOUND+" to "+UPPER_BOUND+" is "+sum);
	    System.out.println("The avg of "+avg);


	}

}
