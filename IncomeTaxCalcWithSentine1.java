package prog;

import java.util.Scanner;

public class IncomeTaxCalcWithSentine1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double Tax_R20 = 0.1;
		double Tax_R40 = 0.2;
		double Tax_R60 = 0.3;
		
		int taxableIncome = 0;
		double taxPayable; 
		final int SENTINE1 = -1;
     
		System.out.print("Enter Taxable Income: $");
		taxableIncome = s.nextInt();
		
		while(taxableIncome != SENTINE1) {
		
		
		
		if(taxableIncome<=20000) {
			taxPayable = 0;
			System.out.printf("The income tax payable is: $%.2f",taxPayable);
		} else if(taxableIncome<=40000) {
			taxPayable = (taxableIncome - 20000)*Tax_R20;
			System.out.printf("The income tax payable is: $%.2f",taxPayable);
		} else if(taxableIncome<=60000) {
			taxPayable = 2000 + (taxableIncome - 40000)*Tax_R40;
			System.out.printf("The income tax payable is: $%.2f",taxPayable);
		} else {
			taxPayable = 6000 + (taxableIncome - 60000)*Tax_R60;
			System.out.printf("The income tax payable is: $%.2f",taxPayable);
		} 
		   System.out.println("\n ");
		   
		   System.out.print("Enter Taxable Income: $");
			taxableIncome = s.nextInt();
		}
		
		System.out.println("Bye..!!");
		s.close();
	}

}
