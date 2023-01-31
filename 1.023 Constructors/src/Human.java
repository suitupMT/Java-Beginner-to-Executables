
public class Human {

	
	//define attributes the object will have
	String name; 
	int age; 
	double weight; 
	
	// constructor is within the object class
	//same name as the object just like a method/function
	//this method builds the object with the this keyword
	Human(String name, int age, double weight){
		this.name = name; 
		this.age = age; 
		this.weight = weight; 
	}
	
	//create the actions/methods an object can do- will be called with objectName.method();
	void eat() {
		System.out.println(this.name+" is eating.");
	}
	void drink() {
		System.out.println(this.name+" is driking.");
	}
}
