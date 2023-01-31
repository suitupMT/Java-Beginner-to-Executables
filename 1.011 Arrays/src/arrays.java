
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//stores multiple values in a single variable 
		//all data types must be the same
		
		//declare string without values, just set number of elements
//		String[] cars = new String[3];
		
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		
		cars[0] = "Mustang"; 
		
		for(int i=0; i<=cars.length-1; i++) {
			System.out.println(cars[i]);
		}
		
		
	}

}
