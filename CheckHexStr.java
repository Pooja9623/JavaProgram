package javaTutorial;

import java.util.Scanner;

public class CheckHexStr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter hexadecimal string:");
		String hex = in.nextLine();
		boolean isValid = false;
		for(int i=0; i<hex.length();i++) {
			char ch = hex.charAt(i);
			if((ch <= '9' && ch>= '0')|| (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f')) {
				isValid = true;
			}
			else {
				isValid = false;
				break;
				}
			}

		if(isValid) System.out.println(hex+" is a hexadecimal string");
		else  System.out.println(hex+" is a not hexadecimal string");
		
		in.close();
		}
		

	}


