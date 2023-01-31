
public class wrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// wrapper class uses primitive data types as reference data types
		
		//primitive- boolean, char, int, double
		//wrapper-  Boolean, Character, Integer, Double   -these are reference types
		// a wrapper class may contain useful pre-built in methods
		
		//autoboxing - the automatic conversion that the Java compiler makes
		//unboxing - the reverse of autoboxing. automatic conversion of wrapper class
		
		// 4 reference data type values here
		Boolean a = true; 
		Character b = '@';
		Integer c = 123;
		Double d = 3.14; 
		String e = "Name";
		
		//ctrl + spacebar pulls up intellisense of available methods
		
		if(a == true) { //treated as primitive (unboxing)
			System.out.println("This is true."); 
		}
		
	}

}
