package classObject;

class Room{
	private double width, length;
	private int floor;
	
	public Room() {
		width = 10;
		length = 12.5;
		floor = 1;
	}
	
	public void setWidth(double w) {
		if(w>0) width = w;		
	}
	
	public void setLength(double l) {
		if(l>0) length = l;		
	}
	
	public void setFloor(int f) {
		if(f>0) floor = f;		
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public Room(double w, double l, int f) {
		if(l>w) {
			setWidth(w);
			setLength(l);
		}
		else { setWidth(l);
		   setLength(w);	
		}
		
		setFloor(f);
	}
	
	public String toString() {
		return length +" x "+width+" on floor "+ floor;
	}
}

class Classroom extends Room{
	private int numStudents;
	
	public Classroom(double width, double length, int floor, int num) {
		super(width, length, floor);
		numStudents = num;
	}
	
	public String toString() {
	 	super.toString();
	return super.toString()+"\ncapacity = "+numStudents+" students\n";
	}
	
	
	
   public static Classroom[] sortRoom(Room r[]) {
	   Classroom h[] = new Classroom[10];
	   int i = 0;
	   for(Room t : r) {
		   if(t instanceof Classroom) {
			   h[i++]=(Classroom) t;
		   }
	   }
	
	  return h;
		
	}
}



public class RoomTest {
	

	public static void main(String[] args) {
		Room r[] = new Room[10];
		
		r[0] = new Classroom(12,14,2,4);
		r[1] = new Room();
		r[2] = new Room(23,4,2);
		r[3] = new Classroom(8,3,1,3);
		r[4] = new Room(45,21,3);
		r[5] = new Room(12,6,1);
		r[6] = new Classroom(12,2,3,0);
		r[7] = new Room(2,34,2);
		r[8] = new Classroom(31,22,5,4);
		r[9] = new Room(3,4,4);
		
       Classroom t[] = Classroom.sortRoom(r);
		
		for(Room m : t) {
			if(m == null) continue;
			System.out.println(m);
		
		}

	}

}
