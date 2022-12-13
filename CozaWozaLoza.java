package prog;

public class CozaWozaLoza {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 110;

		for(int i = num1; i <= num2; i++) {
			boolean f = false;
			if(i%3==0) {
				System.out.print("Coza");
				f = true;
			} 
			if(i%5==0) {
				System.out.print("Loza");
				f = true;
			}
			if(i%7==0) {
				System.out.print("Woza");
				f = true;
			}
			if(!f) {
				System.out.print(i);
			}
			
			System.out.print(" ");
			
			if(i%11==0) {
				System.out.println();
			}
		}
	}

}
