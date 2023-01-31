import java.util.Random;
public class DiceRoller {

	
	// in this example rather than just building an object the constructor performs a function
	// immediately upon setting up a random class object and variable
	public DiceRoller() {
		Random random = new Random();
		int number = 0;
		//the local variables must be passed to outside method roll
		roll(number, random);
	}
	
	// must pass value types and variable names into this method
	void roll(int number, Random random) {
		number = random.nextInt(6)+1;  //numbers rolled 0 to 5, +1 needed for 6 sides
		System.out.println(number);
	}
	
}
