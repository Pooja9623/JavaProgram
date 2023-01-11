package tutorialOOP;

class Rectangle{
	private float length,width;
	
	public Rectangle() {
		length = 1.0f;
		width = 0.5f;
	}
	
	public Rectangle(float l, float w) {
		length = l;
		width = w;
	}
	
	public void setLength(float l) {
		length = l;
	}
	
	public void setWidth(float w) {
		width = w;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float getArea() {
		return length*width;
	}
	
	public float getPerimeter() {
		return 2*(length+width);
	}
	
	public String toString() {
	return "Rectangle [Length = "+length+", Width = "+width+"]\nArea = "+getArea()+"\tPerimeter = "+getPerimeter();
	}
}

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(3.2f,2.1f);
		System.out.println(r2);
		
		r1.setLength(5);
		r1.setWidth(2);
		System.out.println(r1+"\n"+r1.getLength()+"\t"+r1.getWidth()+"\n"+r1.getArea()+"\t"+r1.getPerimeter());
	}

}
