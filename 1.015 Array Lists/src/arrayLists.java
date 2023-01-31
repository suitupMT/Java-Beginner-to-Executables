import java.util.ArrayList;
public class arrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList is a resizable array.
		//elements can be added and removed after compilations and store ref data types
		//wrapper classes inside the List
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//food.set(index, elementValue)
		food.set(0, "sushi");
		food.remove(2);
//		food.clear(); clears all content of arrayList
		
		//arrayLists don't use .length(), they use .size
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		
	}

}
