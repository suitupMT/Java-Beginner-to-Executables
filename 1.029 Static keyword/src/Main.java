
public class Main {

	public static void main(String[] args) {
		//static is a modifier. A single copy of a variable/method is created and shared. 
		// The class "owns" the static member
		
		Friend friend1 = new Friend("Thomas the Tank");
		System.out.println(Friend.numberOfFriends);
		Friend.displayFriends();
		
		
		Friend friend2 = new Friend("Ash Ketchum");
		
		System.out.println(Friend.numberOfFriends);
		Friend.displayFriends();

	}

}
