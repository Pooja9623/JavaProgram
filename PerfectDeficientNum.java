package tutorialOOP;

public class PerfectDeficientNum {
	
	private static void Is_Perfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) sum+=i;
		}
		if(sum==n) System.out.print(n+" ");
	}
	
	private static void Is_Deficient(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) sum+=i;
		}
		if(sum<n) System.out.print(n+" ");
	}
	
	private static void Is_NotPerDef(int n) {
		int sum=0,count=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) sum+=i;
		}
		if(sum>n) System.out.print(n+" ");
	}

	public static void main(String[] args) {

		for(int i=1;i<5000;i++) {
			Is_Perfect(i);
		}
		System.out.println();
		for(int i=1;i<500;i++) {
			Is_Deficient(i);
		}
		
		System.out.println();
		for(int i=1;i<500;i++) {
			Is_NotPerDef(i);
		}

	}

}
