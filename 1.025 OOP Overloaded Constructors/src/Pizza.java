
public class Pizza {

	//what attributes does a pizza have?
	String bread;
	String sauce; 
	String cheese; 
	String topping; 
	
	//same name as class for constructor
	Pizza(String bread, String sauce, String cheese, String topping){
		//remember you must use the this. to assign variables
		this.bread = bread;
		this.sauce = sauce; 
		this.cheese = cheese;
		this.topping = topping; 
		
	}
	
	
	//new constructor- same name but different parameters
	Pizza(String bread, String sauce, String cheese){
		//remember you must use the this. to assign variables
		this.bread = bread;
		this.sauce = sauce; 
		this.cheese = cheese;
		
	}
	
	
}
