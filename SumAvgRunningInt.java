package prog;

public class SumAvgRunningInt {

	public static void main(String[] args) {
		final int Lower_Bound = 1;
		final int Upper_Bound = 100;
		
		int sum = 0;
		int i = Lower_Bound;
		double avg;
		
		while(i<=Upper_Bound) {
			sum += i;
			i++;
		}
		
		avg = sum / (Upper_Bound - Lower_Bound + 1);
		
		System.out.println("The sum of "+Lower_Bound+" to "+Upper_Bound+" is "+sum);
	    System.out.println("The avg is "+avg);


	}

}
