
public class Main {
	
	//Here is the Enum, you can create it in a separate file in the project but here its in the 
	//same class as Main
	enum Planet{
		
		MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URANUS(7), NEPTUNE(8);
		//besides the text each item has a parameter passed integer, you can add any parameter
		//or attribute to the each item but it has to be used in the constructor
		
		//define variable for parameters passed into constructor
		int number;
		
		//this becomes a constructor for a planet
		Planet(int number){
			this.number = number;
		}
	}
	
	

	public static void main(String[] args) {
		// Enum is an enumerated or ordered listing of items in a collection
		// Enums are Constants and only used as such - a group of constants
		//examples Days of the Week, Months in a year, Planets in a Solar System
		//things that will never change in your program or for their use-case
		
		Planet myPlanet = Planet.EARTH; //only the options available are in the enum list
		 
		canILiveHere(myPlanet); //sends the enum variable to method
		
		myPlanet= Planet.MARS;
		canILiveHere(myPlanet);
	}
	
	static void canILiveHere(Planet passedPlanet) {
		//simple use of making sure the variable passed has no errors with the enum option passed
		//to this switch
		switch(passedPlanet){
		case EARTH: 
			 System.out.println("This is "+ passedPlanet);
			 System.out.println("You can live here!");
			 System.out.printf("This is the #%d planet from the sun\n\n",passedPlanet.number);
			break;
		default: 
			System.out.println("This is "+ passedPlanet);
			System.out.println("You can't live here yet...call Elon Musk.");
			System.out.printf("This is the #%d planet from the sun\n\n",passedPlanet.number);
			break;
		}
	}

}
