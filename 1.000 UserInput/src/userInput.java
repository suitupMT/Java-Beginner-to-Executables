import java.util.Scanner;


public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerName = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scannerName.nextLine();
		System.out.println("How old are you?");
		int age = scannerName.nextInt();
		scannerName.nextLine(); // must be done to be able to enter in new strings after int
		System.out.println("What is your favorite food?");
		String food = scannerName.nextLine();
		System.out.println("Hello " + name);
		System.out.println("You are "+age+" years old.");
		System.out.println("You like "+food);
	}

}
