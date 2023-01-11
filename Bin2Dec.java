package javaTutorial;

import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a Binary String");
		int binary = in.nextInt();
		int bin=binary;
		int s=0,i=0;
		double p;
		while(bin!=0) {
		  if(bin%10 > 1) {System.out.println("error: invalid binary string \""+binary+"\""); break;}
		  p= Math.pow(2, i);
		  s+= bin%10 * p;
		  bin /= 10;
		  i++;
		  if(bin!=0) continue;
		  System.out.println("The equivalent decimal number for binary \""+binary+"\" is:"+s);
		}
		
		
		
	in.close();	

	}

}
