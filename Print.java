package javaTutorial;

//import java.util.Scanner;

public class Print {
	
	public static void print(int[] arr) {
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i==0) System.out.print(arr[i]);
			else System.out.print(", "+arr[i]);
		}
		
		System.out.println("]");
	}
	
	public static void print(double[] arr) {
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i==0) System.out.print(arr[i]);
			else System.out.print(": "+arr[i]);
		}
		
		System.out.println("]");
	}
	
	public static void print(float[] arr) {
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(i==0) System.out.print(arr[i]);
			else System.out.print("; "+arr[i]);
		}
		
		System.out.println("]");
	}

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int[] item = new int[in.nextInt()];
		
		if(item.length>0) {
			for(int i=0; i<item.length; i++) {
				System.out.printf("item[%d]:",i);
				item[i]= in.nextInt();
			}
	   }*/
		double[] item = new double[3];
		item[0]=43;
		item[1]=23;
		item[2]=3;
		print(item);
		
		int[] num = new int[3];
		num[0]=34;
		num[1]=23;
		num[2]=5;
		print(num);
		
		float[] number = new float[3];
		number[0]=34.7f;
		number[1]=64.2f;
		number[2]=3.2f;
		print(number);
	}
}
