package prog;

import java.util.Scanner;



public class CountVowelsDigits {
	
	static void CountVD(String str) {
		int count=0, vow=0, dig=0;
		
		for(int i=0; i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			count++;
			
			if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U') {
				vow++;
			}
		
			if(ch>='0' && ch <= '9') {
				dig++;
			}
		}
			
		double pvow = (double)vow/count*100;
		double pdig = (double)dig/count*100;
			System.out.printf("Number of vowels: %3d  %.2f\n",vow,pvow);
			System.out.printf("Number of digits: %3d  %.2f\n",dig,pdig);
			System.out.println(count);
	}	
		

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 String str = in.nextLine();
	
				
		CountVD(str);
		in.close();
	}

	
	
}