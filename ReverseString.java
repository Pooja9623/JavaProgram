package javaTutorial;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String nstr="", str = s.next();
		int strlen = str.length();
		char cha ;
		for(int i=0; i<strlen; i++) {
			cha =str.charAt(i);
			nstr = cha+nstr;
		}
		
		System.out.println(nstr);
		/*for(int i=strlen-1;i>=0;i--) {
			System.out.print(nstr.charAt(i));
		}*/
				
		s.close();
	}

}
