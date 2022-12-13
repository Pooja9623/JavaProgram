package prog;

class Account{
	int cust_id,balance;
	String name;
	
	public void setAccount(int id,int bal,String n) {
		cust_id = id;
		balance = bal;
		name = n;
	}
	
	public void putAccount() {
		System.out.println ("Customer id:"+cust_id+"\nName:"+name+"\nBalance:"+balance);
	}
}

class Savings extends Account{
	int interest;
	
	public void setSavings(int inr) {
		interest = inr;
	}
	
	public void putSavings() {
		putAccount();
		System.out.println("Interest rate:%"+interest+"\n");
	}
}

class Current extends Account{
	int cred_lim;
	
	public void setCurrent(int inr) {
		cred_lim = inr;
	}
	
	public void putCurrent() {
		putAccount();
		System.out.println("Credit limit:%"+cred_lim+"\n");
	}
}

class Recurring extends Account{
	int interest,time;
	
	public void setRecurring(int inr, int t) {
		interest = inr;
		time = t;
	}
	
	public void putRecurring() {
		putAccount();
		System.out.println("Interest rate:%"+interest+"\nTime Period:"+time+"\n");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Savings s = new Savings();
		Current c = new Current();
		Recurring r = new Recurring();
		
		Account a = new Account();
		
		a.setAccount(3224, 30909, "Sham");
		s.setAccount(562167, 2350, "Riya");
		s.setSavings(3);
		
		c.setAccount(423, 14450, "Aru");
		c.setCurrent(5);
		
		r.setAccount(656752, 7670, "ERA");
		r.setRecurring(7, 2);
		
		a.putAccount();
		s.putSavings();
		c.putCurrent();
		r.putRecurring();
		

	}

}
