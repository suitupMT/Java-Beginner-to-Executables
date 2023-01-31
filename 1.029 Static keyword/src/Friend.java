
public class Friend {
	String name;
	// when you make this variable static it makes all objects share the same variable instead of 
	//each of them having their own attribute to count friends
	static int numberOfFriends; 
	
	Friend(String name){
		this.name = name;
		numberOfFriends +=1; 
	}
	
	static void displayFriends() {
		System.out.println("You have "+ numberOfFriends + " friends");
	}
}
