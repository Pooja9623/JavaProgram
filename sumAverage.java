package prog;

public class sumAverage {

	public static void main(String[] args) {
		
		int LOWER_BOUND = 111;
		int UPPER_BOUND = 8899;
		
		int sum = 0;
		double avg;
		
		int count = 0;
		for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
			sum += i;
			count++;
			
		}
		avg = (double)sum/ count;
        System.out.println("The avg is "+avg);
	}
     
}
