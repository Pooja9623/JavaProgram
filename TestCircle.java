package tutorialOOP;

class Circle {
	
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double radius, String c) {
		this.radius=radius;
		color = c;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return  2*Math.PI*radius;
	}
}

public class TestCircle {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.printf("C1:\nRadius:"+c1.getRadius()+"\nColor:"+c1.getColor()+
				"\nArea:%.2f\nCircumference:%.2f\n",c1.getArea(),c1.getCircumference());

		Circle c2 = new Circle(3,"Blue");
		System.out.printf("\nC2:\nRadius:"+c2.getRadius()+"\nColor:"+c2.getColor()+
				"\nArea:%.2f\nCircumference:%.2f",c2.getArea(),c2.getCircumference());

	}

}
