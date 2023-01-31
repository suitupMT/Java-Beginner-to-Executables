package package2;
import package1.*;

public class Asub extends A{
	
//	public static void main(String[] args) {
//		// modifiers 
//		// default is no modifier
//		//
//		C c = new C(); 
//		System.out.println(c.defaultMessage); //works because its in package 2
//
//	}
	public static void main(String[] args) {
		Asub asub = new Asub();
		System.out.println(asub.protectedMessage);
	}
}
