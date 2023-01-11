package prog;
//Program to check how many time a string have to change its character minimum
//times to make it palindrome.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	       System.out.println("Enter string:");
	       String str = in.next();
	       int a=0;

	       for(int i=0,j=str.length()-1;i<(str.length())/2;i++,j--){
	           char ch = str.charAt(i);
	           char sh = str.charAt(j);
	           if(ch!=sh){a++;}
	       }

	       System.out.println(a);
	    
	
in.close();
	}

}
