import java.util.Scanner;

public class logicalOperators {

	public static void main(String[] args) {
		// && both are true
		// || or, only one has to be true
		// != not equal to 
		
		//basic example
		int temp = 25; 
		
		if(temp >30) {
			System.out.println("It is hot outside");
		}
		else if (temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is colde outside");
		}
		
		
		// example with scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if (response.equals("q")||response.equals("Q")) {
			System.out.println("You Quit the game");
		}
		else {
			System.out.println("You are still playing the game");
		}
		
		//The not operator is the exact opposite
//		if (!response.equals("q")||!response.equals("Q")) {		
//			System.out.println("You are still playing the game");
//		}
//		else {
//			System.out.println("You Quit the game");
//		}
//		
	}

}
