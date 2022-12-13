package prog;

import java.util.Scanner;

public class PensionContributionCalculator {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		final int ceil_sal = 6000,age,cont_sal,salary;
		final double emp_55_below = 0.2;
		final double emr_55_below = 0.17;
		final double emp_55to60 = 0.13;
		final double emr_55to60 = 0.13;
		final double emp_60to65 = 0.075;
		final double emr_60to65 = 0.09;
		final double emp_65_above = 0.05;
		final double emr_65_above = 0.075;
		
		double emp_cont, emr_cont, total_cont;
		
		System.out.print("Enter monthly salary of employee:$");
		salary = s.nextInt();
		
		
		System.out.print("Enter age of employee: ");
		age = s.nextInt();
		
		if(salary>ceil_sal) {
			cont_sal = 6000;
		} else cont_sal = salary;
		
		if(age<=55) {
			emp_cont = cont_sal*emp_55_below;
			emr_cont = cont_sal*emr_55_below;
		}else if(age<=60) {
			emp_cont = cont_sal*emp_55to60;
			emr_cont = cont_sal*emr_55to60;
		}else if(age<=65) {
			emp_cont = cont_sal*emp_60to65;
			emr_cont = cont_sal*emr_60to65;
		}else  {
			emp_cont = cont_sal*emp_65_above;
			emr_cont = cont_sal*emr_65_above;
		}
		
		System.out.printf("Employee's Contribution =$%.2f\n",emp_cont);
		System.out.printf("Employer's Contribution =$%.2f\n",emr_cont);
		
		total_cont = emp_cont + emr_cont;
		System.out.printf("Total Contribution =$%.2f",total_cont);
		
		
		s.close();
	}
	
}
