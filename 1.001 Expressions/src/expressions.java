
public class expressions {
	//global variable for purposes of this example
	public static double friends = 10;
	
	public static void main(String[] args) {
		//expression = operands & operators
		//operands = values, variables, numbers, quantity
		//operators = + - * / %
		
		
		friends += 1;
		printMethod(); //save time on repeating print lines with method
		
		friends /= 3; 
		printMethod();
		System.out.println("division truncates decimals unless doubles are used \nDon't use int");
		
		friends --; 
		printMethod();
		
		friends %= 2;
		printMethod();
		
		
	}
	
	static void printMethod() {
		System.out.println(friends); 
	};

}
