import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		//HashMap implements the Map interface (need an import)
		//HashMap is similar to an ArrayList, but with key-value pairs
		//stores objects, need to use Wrapper Class
		//ex: (name, email), (username, userID), (country,capital)
		
		//      <Int, Int> to enforce that the Wrapper class is necessary
		HashMap<String,String> countries = new HashMap<>();
		
		//add a key and a value
		//THE KEY IS THE FIRST ITEM IN THE HASH MAP (key, value pair) 
		countries.put("USA","Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beijing");
		
		System.out.println(countries); //it will display ass the values and the key value pairs
		
		countries.replace("USA", "Chicago");
		System.out.println(countries);
		
		countries.remove("USA"); //remove takes away the full item and key
		System.out.println(countries);
		//countries.clear(); clears the whole Hashmap
		
		System.out.println(countries.get("Russia"));
		//System.out.println(countries.get("New Delhi"));
		
		System.out.println("The key is in the HashMap: "+ countries.containsKey("England")); // 
		
		System.out.println(countries.size()); //will print the amount of key value pairs in the list
		
		for(String i : countries.keySet()) {
			System.out.print(i+"  "+"= ");
			System.out.println(countries.get(i));
		}
		
	}

}
