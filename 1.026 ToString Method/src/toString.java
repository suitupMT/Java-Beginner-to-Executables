
public class toString {

	public static void main(String[] args) {
		// toString() = special method that all objects inherit,
						// that returns a string that textually represents an object
						// can be used implicityly an dexplicitly 
		
		//Car class, name of var is car, = new, Car() - is constuctor if present; 
		Car car = new Car(); 
		
		System.out.println(car); // will not display all the attributes like this only memory block
		//by overriding toString() in the Car class we will get all the object attributes
//		System.out.println(car.toString()); another way to call this

	}

}
