
public class Main {

	public static void main(String[] args) {
		/*Lambda expression-   feature for Java 8 and above
		  also known as an anonymous method or a shorter way to write anonymous
		  classes with only one method
		  
		  need to use a funcitonal interface or use a pre-defined functional interface
		  they contain only one abstract method
		  ex. ActionListener, Runnable, or user-defined interface
		  
		  can be used in any place where a funcitonal interface is required
		  How to use: 
		   (arguments) -> {statement/s}
		  
		 */
		String name = "firstNAME";
		String symbol = "!";
		
		//the abstract interface has a method that takes two arguments that are strings
		//the lambda creates that method and defines what it is
		//message() now takes in x and y and then the arrow function is defined here for
		//what it does
		MyInterface myInterface = (x,y) -> {System.out.println("Heeello World");
			System.out.println("It is a nice day outside " + x + y);
		};
		
		//when the method is called it executes what was defined in the lambda
		myInterface.message(name, symbol);
		
		MyInterface myInterface2 = (x,y) -> {
			System.out.println("Hello other Interface"+ x + y);
		};
		myInterface2.message(name, symbol);
		
		//example with a JFrame
		
		MyFrame myFrame = new MyFrame();
		
	}

}
