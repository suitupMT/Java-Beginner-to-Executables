import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1; 
		
		//continuous execution until condition is no longer true
		while(x==1) {
			System.out.println("Printing the line");
			x += 1; //stops condition from continuing
		}
		
		// Example with scanner 
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
		// do while loop  -- same thing but will always execute at least once
		do {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		
		
	}

		
}
