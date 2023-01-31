package beginnerProgram;

public class Basics {

	public static void main(String[] args) {
		// this is a comment
		System.out.print("Hello World! \n");
		System.out.println("Print Statements for Beginners");
		System.out.print("Println in previous code moves cursor to new line after printing");
		System.out.println("\n \t new line tabbed over");
		System.out.println("\\ this is how you print the slash");
		/*
		 * this is a multiple line comment
		 */
		//Variables
		int x; //declaration
		x = 123;
		// initialization
		int w = 125; 

		long q = 123209384092830423L; // must put a L behind the last number in long
		byte s = 100; // holds up to 127 in numerical value
		double r = 123.05; //decimal numbers
		float t = 3.14f; //must be followed with an f, less precision
		boolean z = false;
		char symbol = '@';
		String word = "zebra"; //String must be capitalized
		
		System.out.println("My number is: " + x);
		System.out.println(z);
		System.out.println(symbol);
		System.out.println("The animal is a " + word);
		
		String p = "water";
		String y = "Kool-Aid";
		String temp; 
		//swap values with temp var
		temp = p; 
		p = y;
		y = temp;
		System.out.println("x: " +x);
		System.out.println("y: " +y);
	}

}
