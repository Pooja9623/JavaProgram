package javaTutorial;

import java.util.Scanner;

public class CaesarCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a plain text String:");
		String nstr = "", str = in.next().toUpperCase();
		System.out.print("Enter no. of positions to be shifted:");
		int n = in.nextInt();
		
		char cha;
		for(int i=0; i<str.length();i++) {
			cha = str.charAt(i);
			if((cha+n)>90) cha-=26;
			char v = (char)(cha+n);
			nstr += v;
		}
		 
		System.out.print("\nThe ciphertext string is:"+nstr);
		
		in.close();
	}

}
