package prog;

class Time{
	private int hrs, mins, secs;
	
	public void setTime(int h, int m, int s) {
		hrs = h;
		mins = m;
		secs = s;
		
	}
	
	public void showTime() {
		System.out.println(hrs+":"+mins+":"+secs);
	}
	
	public int getSeconds() {
		return hrs*3600 + mins*60 + secs;
	}
	
	//return result of type Time
	public Time add(Time t) {
		Time u = new Time();
		int x = getSeconds() + t.getSeconds();
		u.hrs = x/3600;
		u.mins = (x%3600)/60;
		u.secs = x%60;
		
		return u;
	}
	
	public Time diff(Time t) {
		Time u = new Time();
		int x = getSeconds() - t.getSeconds();
		u.hrs = x/3600;
		u.mins = (x%3600)/60;
		u.secs = x%60;
		
		return u;
	}
	
}


public class TimeAddDiff {

	public static void main(String[] args) {
		Time t1 = new Time(),
			 t2 = new Time();
		
		t1.setTime(6, 45, 55);
		t2.setTime(3, 55, 40);
		
		Time t3 = t1.add(t2);
		     
		Time t4 = t1.diff(t2);
		     
		     t1.showTime();
		     t2.showTime();
		     t3.showTime();
		     t4.showTime();
	}

}
