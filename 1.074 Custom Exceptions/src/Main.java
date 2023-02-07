import java.util.*;

public class Main {

	public static void main(String[] args) {
		// exception is an error - disrupts runtime
		// custom exceptions are user defined
		// these exceptions may be specific to the use-case
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age = scan.nextInt();
		
		try {
		checkAge(age);
			
		}
		//if the custom exception does not work then this catch will give generic error
		catch(Exception e) {
			System.out.println("A problem occured: " + e);
		}
		

	}
	static void checkAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("\n You must be 18 or older to sign up.");
		}
		else {
			System.out.println("You are signed up!");
		}
	}	
	
		
}
