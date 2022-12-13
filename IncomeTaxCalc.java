package prog;

import java.util.Scanner;

public class IncomeTaxCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double Tax_R20 = 0.1;
		double Tax_R40 = 0.2;
		double Tax_R60 = 0.3;
		
		System.out.print("Enter Taxable Income: $");
		int taxableIncome = s.nextInt();
		
		double taxPayable;
		
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
		s.close();
	}

}
