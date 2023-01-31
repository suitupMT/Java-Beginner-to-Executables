
public class constructor {

	public static void main(String[] args) {
		// constructor is a special method when an object is instantiated (created)
		
		Human human1 = new Human("Bob", 70, 189);  
		Human human2 = new Human("Steve", 30, 200);
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human1.eat();
		human2.eat();
		human1.drink();
	}

}
