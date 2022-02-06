import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      double p = sc.nextDouble(),R=sc.nextDouble(),T=sc.nextDouble();
                      double CI = (p*(Math.pow((1+(R/100)),T)))-p;
                      System.out.printf("%1.2f",CI);
	}
}