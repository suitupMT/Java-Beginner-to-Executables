
public class Main {

	public static void main(String[] args) {
		// Generic methods and classes
		// generics enable types (classes and interfaces) to be parameters when defining:
		// classes, interfaces and methods
		// a benefit is to eliminate the need to create multiple versions of methods or classes
		//for various data types, Use 1 version for all reference data types
		
		//here are 4 different arrays of reference data types
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		Character[] charArray = {'H', 'E','L','L','O'};
		String[] stringArray = {"B","Y","E"};
		
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
		System.out.println("\n"+getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));

	}
	
	//there are 4 methods here of different reference data types here and its a lot of code
	//the methods are basically duplicate code but for different reference types
	//lets fix this below:
//	public static void displayArray(Integer[] array) {
//			for(Integer x : array) {
//				System.out.print(x + " ");
//			}
//			System.out.println();
//		}
//	public static void displayArray(Double[] array) {
//		for(Double x : array) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
//	public static void displayArray(Character[] array) {
//		for(Character x : array) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
//	public static void displayArray(String[] array) {
//		for(String x : array) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
	//for this lesson we write thing but common practice is just to write <T>
	//now all reference types go into this method without a need for 4 seperate types
	public static <Thing> void displayArray(Thing[] array) {
		for(Thing x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	//this is the generic way to return generics
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[0];
	}
	
	
	
	
	//main class end bracket
	}
