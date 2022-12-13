package prog;

class CAT{
	int age;
	String color;
	float height;
}

public class OOPdemo1 {

	public static void main(String[] args) {

		CAT mani, kitty;
		 mani = new CAT();
		 kitty = new CAT();
		 
		 mani.age = 10;
		 mani.color = "White";
		 mani.height = 4.2f;
		 
		 kitty.age = 12;
		 kitty.color = "Black";
		 kitty.height = 5.2f;
		 
		 System.out.println("Meaow.. My age is "+mani.age+", my color is "+mani.color+" & my height is "+mani.height);
		 System.out.println("Meaow.. My age is "+kitty.age+", my color is "+kitty.color+" & my height is "+kitty.height);
			
	}

}
