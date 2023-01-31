package package1;

import package2.*;

public class A {
		protected String protectedMessage = "This is protected";
		//protected access is only given across packages if the class is a sub class
	
	public static void main(String[] args) {
		// modifiers 
		// default is no modifier - access only within the same package
		//public is access across whole project
		//protected is access across packages only if one class is a sub class of another
		//private is access only within the class it contains
		
		
		C c = new C(); 
//		System.out.println(c.defaultMessage); doesn't work because access is only within a package

		//public modifier
		System.out.println(c.publicMessage); // works because public gives access to whole project
	
	}

}
