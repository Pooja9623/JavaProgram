package prog;

class Fraction{
	private int n, d;
	
	
	private int getGCD() {
		int a = n, b = d;
		
		while(b!=0) {
			int t = a%b;
			a = b;
			b = t;	
    	}
	 return a;
  }
	
	public Fraction() {
		n = 0;
		d = 1;
	}
	
	public Fraction(int a, int b) {
		n = a;
		d = b;
		int x = getGCD();
		n /= x;
		d /= x;
	}
	
	public String toString() {
		return n+"/"+d;
	}
	
	public void getAdd(Fraction p, Fraction q) {
		n = p.n*q.d + q.n*p.d;
		d = p.d * q.d;
		int x = getGCD();
		n /= x;
		d /= x;
	}
	
	public void getSub(Fraction p, Fraction q) {
		n = p.n*q.d - q.n*p.d;
		d = p.d * q.d;
		int x = getGCD();
		n /= x;
		d /= x;
	}
	
	public void getMul(Fraction p, Fraction q) {
		n = p.n * q.n;
		d = p.d * q.d;
		int x = getGCD();
		n /= x;
		d /= x;
	}
	
	public void getDiv(Fraction p, Fraction q) {
		n = p.n * q.d;
		d = p.d * q.n;
		int x = getGCD();
		n /= x;
		d /= x;
	}
	
}

public class FractionTest {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(35, 49),
				f2 = new Fraction(36, 15),
				f3 = new Fraction();
		
		System.out.println(f1);
		System.out.println(f2);
		
		f3.getAdd(f1, f2);
		System.out.println(f3);
		
		f3.getSub(f1, f2);
		System.out.println(f3);
		
		f3.getMul(f1, f2);
		System.out.println(f3);
		
		f3.getDiv(f1, f2);
		System.out.println(f3);
		
		
		
	}

}
