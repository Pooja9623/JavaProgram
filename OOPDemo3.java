package prog;

class CAR{
	private String color;
	private int size;
	private float height;
	
	public CAR() {}
	public CAR(String c, int s, float h) {
	color = c;
	size = s;
	height = h;
	}


public String toString() {
	return "Color of car is "+color+", size is "+size+" & height is "+height;
	}

}

public class OOPDemo3 {
	
	public static void main(String[] args) {
	CAR suz = new CAR("White", 23, 30.2f);
	
	System.out.println(suz);
	}
}

