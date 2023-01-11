package javaTutorial;

import java.util.Scanner;

public class Oct2Dec {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an Octal String");
		int Oct = in.nextInt();
		int Octal = Oct;
		int s=0,i=0;
		double p;
		while(Octal!=0) {
		  if(Octal%10 > 7) {System.out.println("error: invalid Octal string \""+Oct+"\""); break;}
		  p= Math.pow(8, i);
		  s+= Octal%10 * p;
		  Octal /= 10;
		  i++;
		  if(Octal!=0) continue;
		  System.out.println("The equivalent decimal number for Octal \""+Oct+"\" is:"+s);
		}
		
		
		
	in.close();	


	}

}
