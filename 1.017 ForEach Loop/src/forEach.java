import java.util.ArrayList;

public class forEach {

	public static void main(String[] args) {
		// for-each = technique to iterate through elements in array or collection
			// has less steps, more readable, but less flexible
		
		String[] animals = {"cat", "dog", "rat", "bird"};
		
		ArrayList<String> animalsL = new ArrayList<String>();
		animalsL.add("bird");
		animalsL.add("rat");
		animalsL.add("dog");
		animalsL.add("cat");
		
		
		
		
		//for every string index i, : means in,  array animal
		for(String i : animals) {
			System.out.print(i+" ");
		}
		System.out.println();
		//exact same for the array list ref type
		for(String i : animalsL) {
			System.out.print(i+" ");
		}
	}

}
