package prog;

import prog.Operations.*;

public class PackageTest2 {

	public static void main(String[] args) {
		Maximum ob1 = new Maximum();
		Addition ob2 = new Addition();
		
		System.out.println(ob1.max(20,15));
		System.out.println(ob2.add(10,20));
		System.out.println(ob2.sub(20,15));
		System.out.println(ob2.add(20.5f,15.5f));
		System.out.println(ob2.sub(13.5f,20.2f));

	}

}
