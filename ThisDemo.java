package prog;

class Test1 {
	private int x,y;
	
	public Test1(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("I am in 2 arg ctor");
	}
	
	public Test1(int b) {
		this(b,b);
		System.out.println("I am in 1 arg ctor");
	}
	
	public Test1() {
		
		System.out.println("I am in default ctor");
	}
	

	public Test1 check(Test1 t) {
		if (this.x+this.y > t.x+t.y)return this;
		else return t;
		
	}
	public String toString() {
		return "The sum is "+(x+y);
	}
	
	
}
public class ThisDemo {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1(7,4),
			t2 = new Test1(1),
			t3 = new Test1();
		
		t3 = t2.check(t1);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}
