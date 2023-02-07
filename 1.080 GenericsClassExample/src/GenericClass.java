
public class GenericClass <T>{
	// common convention if there are multiple parameters it would be <T,V>
	//public class GenericClass <T,V>{}
	//----------------------------------------------------------------------
	// if you want to bind data types to the generic then you would write
	// public class GenericClass <T extends Number> {
	// }
	// when you extend the parent class it limits things to i.e numbers and doesn't accept
	// strings
	
	T x; 
	
	GenericClass(T x){
		this.x = x;
	}
	
	public T getValue() {
		return x;
	};
	
}
