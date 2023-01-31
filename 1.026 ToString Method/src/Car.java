
public class Car {
	String make = "Ford";
	String model = "Mustang";
	String color = "red"; 
	int year = 2021;
	
	//this will override the existing library toString method - first exposure to this concept
	public String toString() {
		String myString = make + "\n" + model + "\n" + color + "\n" + year; 
				return myString; 
	}
	
}
