
public class Main {

	public static void main(String[] args) {
		//anonymous class is an inner class without a name
		// only a single object is created from one
		//the object may have extras or changes with no need to create a seperate
		//inner class when only used once.
		//avoids cluttering code
		
		//Syntax is similar to a constructor, except there is also a class definition
		//great for listeners
		
		Greeting greeting = new Greeting() { // by placing the brackets after instantiation it makes a whole new class
			@Override
			public void Welcome() {
				System.out.println("What Up Dawg");  //used to make one small once per use override
			}
			
		};
		Greeting greeting2 = new Greeting();
		
		greeting.Welcome();
		greeting2.Welcome();
		
		
		//GUI example of the anonymous class
		MyFrame myFrame = new MyFrame();
		
	}
}
