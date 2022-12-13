package prog;

class Rectangle{
	private float length, width;
	
	public void setLength(float l) {
		length = l;
	}
	
	public void setWidth(float w) {
		width = w;
	}
	
	public float getPerimeter() {
		return 2*(length + width);
	}
	
	public float getArea() {
		return length*width;
	}
	
	public void show() {
		System.out.println("Length:"+length+"\nWidth:"+width);
	}
}

public class RectangleParameters {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(),
				r2 = new Rectangle();
		
		r1.setLength(10.2f);
		r1.setWidth(5.67f);
		
		r2.setLength(34.6f);
		r2.setWidth(4.54f);
		
		
		r1.show();
		System.out.println("Perimeter:"+r1.getPerimeter()+"\nArea:"+r1.getArea());
		
		r2.show();
		System.out.println("Perimeter:"+r2.getPerimeter()+"\nArea:"+r2.getArea());

	}

}
