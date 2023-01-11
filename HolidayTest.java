package classObject;

import java.util.Scanner;

class Holiday{
	private String name;
	private int day;
	private String month;
	
	public Holiday(String n, int d, String m){
		name = n;
		day = d;
		month = m;
	}
	
	public boolean inSameMonth(Holiday t) {
		return month.equals(t.month);
	}
	
	public static double avgDate(Holiday t[]) {
		double s=0;
		for(int i=0; i<t.length;i++) {
			s += t[i].day;
		}
		
		return s/t.length;
	}
	
	public String toString() {
		return "\nName: "+name+"\nDay: "+day+"\nMonth: "+month;
	}
	
	
}

public class HolidayTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
			Holiday H = new Holiday("Republic",23,"June");
			Holiday G = new Holiday("Independence",14,"June");
			Holiday I = new Holiday("Gudi",04,"July");
			
			
			
			System.out.println(G.inSameMonth(I));
			System.out.println(H.inSameMonth(G));
			
			int a = s.nextInt();
			Holiday J[] = new Holiday[a];
			s.nextLine();
			for(int i=0;i<J.length; i++) {
				System.out.println("\nEnter name, day, month:");
				String n = s.nextLine();
				int d = s.nextInt();
				s.nextLine();
				String m = s.nextLine();
				J[i] = new Holiday(n,d,m);
			}
			
			for(int i=0; i<J.length;i++) {
				System.out.println(J[i]);
			}
	
	//****************** Another method to write for loop for array********************
			for(Holiday t : J) {
				System.out.println(t);
			}
			
			System.out.println("\nAverage:"+Holiday.avgDate(J));
			System.out.println(H);
	}

}
