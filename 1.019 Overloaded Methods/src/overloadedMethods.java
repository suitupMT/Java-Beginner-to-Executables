
public class overloadedMethods {

	public static void main(String[] args) {
		// overloaded methods are methods that share the same name but have different parameters
		// method name + parameters = method signature
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3, 4));
		System.out.println(add(1, 2, 3));
		System.out.println(add(3,3,3));
		System.out.println(add(5,5,5,5));
		//can overload different types
		System.out.println(add(2.2,7.1));
		
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	static int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	static double add(double a, double b) {
		return a+b;
	}
	
}
