package prog;

class PrintData{
	
	//Method overloading: same name but different methods
	public void print(int x) {
		System.out.println("Value - "+x);
	}
	
	public void print(int x1, int x2) {
		System.out.println("Value1- ["+x1+", "+x2+"]");
	}
	
	public void print(String s) {
		System.out.println("Value - \""+s+"\"");
	}
	
	
}

public class Print {

	public static void main(String[] args) {
		PrintData pd = new PrintData();
		
		pd.print(100);
		pd.print(200, 400);
		pd.print("Ram");

	}

}
