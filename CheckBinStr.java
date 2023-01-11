package javaTutorial;

import java.util.Scanner;

public class CheckBinStr {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter binary string:");
		String bin = in.next();
		boolean isValid=false;
		for(int i=0;i<bin.length();i++) {
			char j = bin.charAt(i);
			if(j=='1' || j=='0') isValid=true;
			else {System.out.println(bin+" is not a binary string.");
			isValid = false;
			break;
			}
			
			
		}
		if(isValid) System.out.println(bin+" is a binary string.");

		in.close();
	}

}
