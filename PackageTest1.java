package prog;
import progMaths.*;
import prog.Stats.*;

public class PackageTest1 {

	public static void main(String[] args) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			
			System.out.println("Max ="+MathsOperations.max(a, b, c));
			System.out.println("Min ="+MathsOperations.min(a, b, c));
			System.out.println("Average ="+StatsOperations.avg3(a, b, c));
			System.out.println("Median ="+StatsOperations.median(a, b, c));
			

	}

}
