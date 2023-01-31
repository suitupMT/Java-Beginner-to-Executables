
public class ifStatements {

	public static void main(String[] args) {
		// conditional statements
		
		int age = 75;
		
		//if true run code in brackets
		// == is the operator
		if (age >= 18 && age < 75) {
			System.out.println("You are an adult");
		}
		else if(age >= 75) {
			System.out.println("You are very old, congratulations!");
		}
		else if (age >=13 && age < 18) {
			System.out.println("You are a teenager ");
		}
		else {
			System.out.println("You are not an adult");
		}
	}

}
