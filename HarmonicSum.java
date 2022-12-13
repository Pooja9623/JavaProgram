package prog;

public class HarmonicSum {

	public static void main(String[] args) {
		final int Max_den = 50000;
		double sumLR = 0;
		double sumRL = 0;
		double absDiff;
		
		for(int den = 1; den<= Max_den; den++) {
			sumLR += 1.0/den;
		}
		System.out.println("The harmonic sum from left to right is "+sumLR);
		
		for(int deno = Max_den; deno >=1; deno--) {
			sumRL += 1.0/deno;
		}
		System.out.println("The harmonic sum from right to left is "+sumRL);
		
		if(sumLR > sumRL) {
			absDiff = sumLR-sumRL;
			System.out.println("The absolute difference is"+absDiff);
		} else {
			absDiff = sumRL-sumLR;
			System.out.println("The absolute difference is"+absDiff);
		}
		

	}

}
