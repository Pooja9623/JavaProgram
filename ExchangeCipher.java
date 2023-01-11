package javaTutorial;

import java.util.Scanner;

public class ExchangeCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string");
		String str = in.nextLine().toUpperCase();
		char j = 'A'+'Z';
		String nStr = "";
		System.out.println(j);
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			nStr += (char)(j-ch);
		}
		
		System.out.print(nStr);
		in.close();
	}

}
