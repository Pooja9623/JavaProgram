package prog;

class DOG{
	private int age;
	private String color;
	private float height;
	
	public void setData(int a, String c, float h) {
		age = a;
		color = c;
		height = h;
	}
	public void putData() {
		System.out.printf("Meaow.. My age is %d , my color is %s & my height is %f\n",age,color,height);
	}
}
public class OOPDemo2 {

	public static void main(String[] args) {

		DOG tom = new DOG(),
		    kitty = new DOG();
		
		tom.setData(2, "White", 4.2f);
		kitty.setData(4, "Black", 5.8f);
		
		tom.putData();
		kitty.putData();
	}

}
