package tutorialOOP;

import java.util.Scanner;

public class LinearBinarySearch {

	private static int Linear_Search(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
			System.out.println("The key found at position:"+(1+i));
		 return 1;
		}
			}
		System.out.println("Key not found.");
		return -1;
		
	}
	
	private static void Binary_Search(int a[],int f, int l, int n) {
		int m= (l+f)/2;
		if(f>l) {System.out.println("Key not found."); return;}
		if(a[m]==n) System.out.println("Key found at: "+(1+m));
		else if(a[m]>n) Binary_Search(a,f,m-1,n);
		else  Binary_Search(a,m+1,l,n);
	
		}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = {4,6,45,7,98,32,7,3,6,98};
		
		int n=8;
		
		/*a = new int [10];
		for(int i=0;i<10;i++) {
			a[i] = in.nextInt();
		}
		*/
		Linear_Search(a, n);
	Binary_Search(a,0,9,n);	
  }

}
