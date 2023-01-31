
public class methods {

	public static void main(String[] args) {
		//method is separate block of code from main that is executed when called upon
		String name = "Bob";
		int age = 21; 
		notMain(name, age);
		
		name = "Pedro";
		notMain(name, age);
		
		
		//example of return method
		
		int x = 3; 
		int y = 4; 
		
		
		//if you only call a returning method/function then it will not store the value
		//you must use the return as display or store it in another variable
		System.out.println(addition(x, y));  
		//or
		int z = addition(x,y);
		System.out.println(z);
		
	}
	//MUST SPECIFY VOID IF NOT RETURNING VALUE
	// can name it whatever you want but notMain is to illustrate a separate method here
	//value inside that is passed does not have to match the variable name passed into it but 
	//data type must match
	 static void notMain(String value, int number) {
		 System.out.println("Name is: " + value);
		 System.out.println("Age is: " + number+"\n");
	}
	 static int addition(int x, int y) {
		 int z = x + y;
		 return z;
	 }

}
