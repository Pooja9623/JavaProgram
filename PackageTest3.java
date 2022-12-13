package prog;

import prog.pack1.*;
import prog.pack2.*;

public class PackageTest3 {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		Course c = new Course();
		College clg = new College();
		
		t.accept();
		c.accept();
		clg.accept();
		
		t.display();
		c.display();
		clg.display();

	}

}
