
public class oop {

	public static void main(String[] args) {
		// object is an instance of a class that may contain attributes and methods
		// example: (car, phone, desk, computer, coffee cup)
		// we will a car attributes and actions
		
		//create a variable called car that is defined in the class file we created called Car.java
		Car myCar = new Car(); 
		Car anotherCar = new Car();
		
		System.out.print(myCar.make + " ");
		System.out.println(myCar.model);
		myCar.drive(); 
		myCar.brake();
		
		System.out.print(anotherCar.make + " ");
		System.out.println(anotherCar.model);
		
		
		
	}
	
	

}
