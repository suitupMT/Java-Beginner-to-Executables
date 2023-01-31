import java.util.InputMismatchException;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		// exception is an event that occurs during the execution of a program
		// that disrupts the normal flow of instructions
		//errors like trying to divide by 0
	Scanner scanner = new Scanner(System.in);	
	
	try {	
		//tries the code if error goes to catch
		
		
		System.out.println("Enter a whole number to divide: ");
		double x = scanner.nextDouble();
		System.out.println("Enter a whole number to divide by: ");
		double y = scanner.nextDouble();
		
		double z = x/y; 
		
		System.out.printf("%.2f\n",z);
		
		}
		catch(ArithmeticException e){
			System.out.println("You can't divide by 0!");
			//this only works if the data type is integar, not doubles
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a number");
		}
		catch(Exception e) {
			System.out.println("A non-specific error occured");
		}
		finally {
			//System.out.println("this will always print if used");
			scanner.close();
		}
	
	}

}
