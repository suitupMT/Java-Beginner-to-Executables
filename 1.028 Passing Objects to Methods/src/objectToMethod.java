
public class objectToMethod {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car = new Car("BMW"); 
		Car car2 = new Car("Tesla");
				
		garage.park(car);
		garage.park(car2);

	}

}
