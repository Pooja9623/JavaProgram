package prog;

import java.util.Scanner;

public class PensionContCalcSenst {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		final int ceil_sal = 6000;
		int age,cont_sal,sal;
		final double emp_55_below = 0.2;
		final double emr_55_below = 0.17;
		final double emp_55to60 = 0.13;
		final double emr_55to60 = 0.13;
		final double emp_60to65 = 0.075;
		final double emr_60to65 = 0.09;
		final double emp_65_above = 0.05;
		final double emr_65_above = 0.075;
		
		double em_cont, er_cont, total_cont;
		
		System.out.print("Enter monthly salary of employee:$");
		sal = s.nextInt();
		
		while(sal!=-1) {
		System.out.print("Enter age of employee: ");
		age = s.nextInt();
		
		if(sal>ceil_sal) {
			cont_sal = 6000;
		} else cont_sal = sal;
		
		if(age<=55) {
			em_cont = cont_sal*emp_55_below;
			er_cont = cont_sal*emr_55_below;
		}else if(age<=60) {
			em_cont = cont_sal*emp_55to60;
			er_cont = cont_sal*emr_55to60;
		}else if(age<=65) {
			em_cont = cont_sal*emp_60to65;
			er_cont = cont_sal*emr_60to65;
		}else  {
			em_cont = cont_sal*emp_65_above;
			er_cont = cont_sal*emr_65_above;
		}
		
		System.out.printf("Employee's Contribution =$%.2f\n",em_cont);
		System.out.printf("Employer's Contribution =$%.2f\n",er_cont);
		
		total_cont = em_cont + er_cont;
		System.out.printf("Total Contribution =$%.2f",total_cont);
		
		System.out.println("\n");
		System.out.print("Enter monthly salary of employee:$");
		sal = s.nextInt();
		}
		
		
		s.close();
	

	}

}
