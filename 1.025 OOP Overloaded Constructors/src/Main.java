
public class Main {

	public static void main(String[] args) {
		// overloaded constructors are multiple constructors within a class with the same name
		// they have different parameters - this difference in parameters is called a signature

		//name of class, object var name, = new, constructor name(); 
		Pizza pizza = new Pizza("thick crust", "tomato", "mozzerella", "pepperoni");
		Pizza pizza2 = new Pizza("thick crust", "tomato", "mozzerella");
				
		System.out.print("Here are the ingredients of your pizza: ");
		System.out.print(pizza.bread + ", ");
		System.out.print(pizza.sauce + ", ");
		System.out.print(pizza.cheese+ ", ");
		System.out.println(pizza.topping);
		
		//notice the new call goes to a new constructor and toppping is null
		System.out.print("Here are the ingredients of your pizza: ");
		System.out.print(pizza2.bread + ", ");
		System.out.print(pizza2.sauce + ", ");
		System.out.println(pizza2.cheese+ " ");
		System.out.println(pizza2.topping); // it recognizes the attribute for this object but will return null
		//the topping println is only there to show that an error isn't thrown
		
	}

}
