package javaTutorial;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op1,op2;
		char ch;
		
		String argums[] = new String[3];
		
		System.out.print("java arithmetic: ");
		for(int i=0; i<3;i++)  argums[i] = in.next();
		System.out.print(argums[0] + argums[2] + argums[1]+" = ");
		op1 = Integer.parseInt(argums[0]);
		op2 = Integer.parseInt(argums[1]);
		ch = argums[2].charAt(0);
		
		switch (ch) {
		case '+': System.out.println(op1+op2); break;
		
		case '-': System.out.println(op1-op2);	break;
		
		case '*': System.out.println(op1*op2);	break;
		
		case '/': System.out.println(op1/op2);	break;
			
		default: System.out.print("Enter valid Charachter!");
		
		}
	}

}
