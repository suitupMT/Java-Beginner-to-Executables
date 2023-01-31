
public class printF {

	public static void main(String[] args) {
		// printf()  an optional method to control, format, and display text in console window
		//           two arguments = format string + (object/variable/value)
		// 			 % [flags] [precision] [width] [conversion-character]

		//%b
		boolean myBoolean = true; 
		//%c
		char myChar= '@';
		//%x
		String myString = "Name";
		//%d
		int myInt = 50;
		//%f
		double myDouble = 1000; 
		// [width] minimum number of character before or after
		
		//% and s puts the number in that place and formats string with 10 spaces after
		System.out.printf("%-10s \n", myString);
		
		System.out.printf("The statement is %b \n", myBoolean);
		System.out.printf("The statement is %c \n", myChar);
		//  + or - sign for numeric value, 0 makes 0 padded numbers, , groups numbers 1000 and above
		System.out.printf("The statement is %+d \n", myInt);
		System.out.printf("The statement is %,.2f \n", myDouble); //.2 display 2 decimals only
		
		
	}

}
