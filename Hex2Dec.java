package javaTutorial;

import java.util.Scanner;

public class Hex2Dec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a Hexadecimal String:");
		String hex = in.next();
		int s = 0,j=0;
		boolean isValid = true;
		for(int i=hex.length()-1,k=0; i>=0 && isValid;k++,i--) {
			char ch = hex.charAt(i);
			
			if(ch>='0' && ch<='9' || ch>='a' && ch<='f' || ch>='A' && ch<='F') {
			
			switch(ch) {
			case '0': j=0;  break;  case '1': j=1;  break;
				
			case '2': j=2;  break;  case '3': j=3;	break;
				
			case '4': j=4;  break;  case '5': j=5;	break;
				
			case '6': j=6;	break;  case '7': j=7;  break;
			
			case '8': j=8;	break;  case '9': j=9;	break;
				
			case 'A': case 'a': j=10;  break;
			
			case 'B': case 'b': j=11;  break;
			
			case 'C': case 'c': j=12;  break;
			
			case 'D': case 'd': j=13;	break;
				
			case 'E': case 'e': j=14; break;
			
			case 'F': case 'f': j=15; break;
			
			}
			double p = Math.pow(16, k);
			s += j*p;
			
			if(i==0)System.out.println("The equivalent decimal number for hexadecimal \""+hex+"\" is:"+s);
			
			} else {
				System.out.println("error: invalid hexadecimal string \""+hex+"\"");
				isValid = false;
				break;
			   }
		}

		in.close();
	}

}
