package prog;


class Furniture{
	private int length,breadth;
	
	public void setFurniture(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void putFurniture() {
		System.out.println("Length:"+length+"\nBreadth:"+breadth);
	}
}

class Chair extends Furniture{
	int height;
	
	public void setChair(int height) {
		this.height = height;
	}
	
	public void putChair() {
		putFurniture();
		System.out.println("Height:"+height);
	}
	
	
} 
public class SingleInheritance {
	public static void main(String[] args) {
		
		Chair c = new Chair();
		
		c.setFurniture(10, 5);
		c.height = 23;
		
		c.putChair();
		
		Furniture f = new Chair();
		f.setFurniture(34, 26);
		f.putFurniture();
		
	}

}
