import java.util.*; 
public class multiArrayLists {

	public static void main(String[] args) {
		// 2D ArrayList = dynamic list of lists
		// size can change during runtime
		
		//separate shopping lists then combined	
		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		System.out.println(bakeryList);
		System.out.println(bakeryList.get(0));
		
		ArrayList<String> produceList = new ArrayList<>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		System.out.println(produceList);
		
		ArrayList<String> drinksList = new ArrayList<>();
		drinksList.add("soda");
		drinksList.add("coffee");

		//create the multi-dimensional List
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		
		System.out.println(groceryList);
		//1st get is the 1st list object, 2nd get is the index of the selected list
		System.out.println(groceryList.get(0).get(1));
		
	}
	
	
}
