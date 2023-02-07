import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// more generics example but with class creation
		
//		MyIntegerClass myInt = new MyIntegerClass(1);
//		MyDoubleClass myDouble = new MyDoubleClass(3.14);
//		MyCharacterClass myChar = new MyCharacterClass('@');
//		MyStringClass myString = new MyStringClass("Hello");

		
		//this is the new changes require for all reference type to go to one class
		GenericClass<Integer> myInt = new GenericClass<>(1);
		GenericClass<Double> myDouble = new GenericClass<>(3.14);
		GenericClass<Character> myChar = new GenericClass<>('@');
		GenericClass<String> myString = new GenericClass<>("Hello");
		
		// very similar to the array List
		ArrayList<String> myArrayList = new ArrayList<>();
		//the HashMap is also similar but with 2 parameters for key value pairs
		
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
	}
	
	

}
