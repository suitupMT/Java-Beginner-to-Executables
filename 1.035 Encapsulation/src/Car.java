
public class Car {
	//attributes
	private String make; 
	private String model;
	private int year; 
	
	//object constructor
	Car(String make, String model, int year){
		// the constructor uses the set functions too
		this.setMake(make);
		this.setModel(model);
		this.setYear(year); 
	}
	
	//get methods for security
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	
	
	//Set methods for security
	public void setMake(String make) {
		this.make = make; 
	}
	public void setModel(String model) {
		this.model = model; 
	}
	public void setYear(int year) {
		this.year = year; 
	}
}
