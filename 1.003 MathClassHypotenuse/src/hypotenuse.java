import java.util.Scanner;

public class hypotenuse {
		public static double x = 3.14;
		public static double y = -10; 
	public static void main(String[] args) {
		
		//basic math operations
//		double z = Math.max(x, y);  // compares and assigns largest #
//		printMethod(z);
//		
//		z= Math.abs(y); //absolute value
//		printMethod(z);
//		
//		z = Math.sqrt(x);  //square root
//		printMethod(z);
//		
//		z = Math.round(x);  //rounding
//		printMethod(z);
//		
//		z = Math.ceil(x);  //always rounds up
//		printMethod(z);
//		
//		z = Math.floor(x); //always rounds down
//		printMethod(z);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		double z = hypotenuse(x, y);
		printMethod(z);
		
		scanner.close();
	}
	
	static void printMethod(double z) {
		System.out.println(z);
	}
	
	public static double hypotenuse(double a, double b) {
		double c = Math.sqrt((a*a)+(b*b));
		return c; 
	}
	
}
