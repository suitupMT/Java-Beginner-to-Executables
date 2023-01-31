
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Chevrolet","Camaro", 2021);
		//Car car2 = new Car("Ford", "Mustang", 2022);
		
		// do not set car2 = to car1, it will go from two objects to pointing at a single object
		//car2.copy(car1);
		Car car2 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2); //where objects are stored in memory
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
	}

}
