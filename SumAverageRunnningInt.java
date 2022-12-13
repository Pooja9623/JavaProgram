package prog;

public class SumAverageRunnningInt {
	
    public static void main(String[] args) {
	final int LOWER_BOUND = 1;
	final int UPPER_BOUND = 100;
	
	int sum = 0;
	double avg;
	
	/*
	 * for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
		sum += i;
	}
	*/
	int i = LOWER_BOUND;
	while (i <= UPPER_BOUND) {
		sum += i;
		i++;
		
	}
    avg = sum / (UPPER_BOUND - LOWER_BOUND + 1);
    
    System.out.println("The sum of "+LOWER_BOUND+" to "+UPPER_BOUND+" is "+sum);
    System.out.println("The avg is "+avg);
	
  }
}
