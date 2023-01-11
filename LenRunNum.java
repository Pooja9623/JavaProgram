package tutorialOOP;

public class LenRunNum {
	
	private static int numOfDigits(int n) {
		int sum=0;
		while(n>0) {
			sum++;
			n/=10;
		}
		return sum;	
	}
	
	private static int Len(int n) {
		if(n==1) return 1;
		else return Len(n-1)+numOfDigits(n);
	}
	 
	private static int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b,a%b);
	}

	public static void main(String[] args) {
		int n=13;
		System.out.println(Len(n));
		System.out.println(gcd(45,6));

	}

}
