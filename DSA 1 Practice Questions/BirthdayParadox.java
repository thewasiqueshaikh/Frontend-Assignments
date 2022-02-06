import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		Double p = scan.nextDouble();
		System.out.println((int)find(p));
	}

	public static double find(double p) {
    	return Math.ceil(Math.sqrt(2 * 365 * Math.log(1 / (1 - p))));
	}
}
