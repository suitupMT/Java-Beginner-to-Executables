import java.util.Random; 
public class random {

	public static void main(String[] args) {
		
		Random random = new Random(); 
		
		int x = random.nextInt();  // -2 billion to 2 billion
		printMethod(x);
		
		int y = random.nextInt(6); // goes from 0 to 5
		printMethod(y);
		
		int z = random.nextInt(6)+1; // is required for values 1 through 6
		printMethod(z);
		
		double a = random.nextDouble(); // generates between 0 and 1 
		printMethod(a);
		
		boolean b = random.nextBoolean(); 
		printMethod(b);
	}
	
	public static void printMethod(int value) {
		System.out.println(value);
	}
	public static void printMethod(double value) {
		System.out.println("Random doubles only generate between 0 and 1: "+ value);
	}
	public static void printMethod(boolean value) {
		System.out.println("True or False: " + value);
	}

}
