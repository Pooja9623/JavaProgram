package javaTutorial;

import java.util.Scanner;

public class TestPalindromicWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = in.next();
		
		String nstr = "";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			nstr = ch+nstr;
		}
		
		if(str.equalsIgnoreCase(nstr)) System.out.println(str+" is Palindrome");
		else System.out.println(str+" is not Palindrome");
		
		in.close();
	}

}
