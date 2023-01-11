package tutorialOOP;

public class Automorphic_number {
	
	static boolean is_automorphic(int n) {
		int square = n*n;
		
		while(n>0)
		{
		  if(square%10!=n%10) return false;
		  else {
			  square/=10;
		      n/=10;
		  }
		}
		return true;
	}

	public static void main(String[] args) {
//	System.out.println(is_automorphic(25)?"Is Automorphic":"Is not Automorphic");
		
		for(int i=1; i<500; i++) {
			if(is_automorphic(i)) System.out.print(i+" ");
		}

	}

}
