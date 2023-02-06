
public class Main {

	public static void main(String[] args) {
		// method chaining - common syntax for invoking multiple method calls, condensing code

		//simple example of why chaining is useful
		String name = "firstName"; 
		
//		name = name.concat(" lastName               ");
//		name = name.toUpperCase();
//		name = name.trim();
		
		//quicker method
		name = name.concat(" lastName    ").toUpperCase().trim();
		
		
		System.out.println(name);
		
		
	}

}
