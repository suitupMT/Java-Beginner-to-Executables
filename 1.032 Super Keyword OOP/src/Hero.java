
public class Hero extends Person {
	String power;
	
	Hero(String name, int age, String power){
		
		super(name, age);// refers to Person (parent) class, this is the best way to do this
		this.power = power; 
		
	}
	
	@Override
	public String toString(){
		return super.toString() + this.power;
	}
	
	
}
