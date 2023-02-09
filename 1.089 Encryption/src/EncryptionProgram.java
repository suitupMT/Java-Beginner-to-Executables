import java.util.*;

public class EncryptionProgram {
	
	private Scanner scanner;
	
	
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private char[] letters;
	
	
	EncryptionProgram(){
		
		scanner = new Scanner(System.in);
		
		list = new ArrayList<Character>();  //list of all characters in order 
		shuffledList = new ArrayList<Character>();  //list of new random ordered substitution cipher
		character = ' ';
		
		newKey();
		askQuestion();
		
	}
	
	private void askQuestion(){ //ask the user
		while(true) {
			System.out.println("**************************************************");
			System.out.println("What do you want to do?");
			System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit");
			char response = Character.toUpperCase(scanner.nextLine().charAt(0));
			
			switch(response) {
				case 'N': newKey();
					break;
				case 'G': getKey();
					break;
				case 'E': encrypt();
					break;
				case 'D': decrypt();
					break;
				case 'Q': quit();
					break;
				default:
					System.out.println("Not a valid option");
			}
		}
		
	}
	
	private void newKey() {//generate the special key
		character = ' ';
		list.clear();
		shuffledList.clear();
		
		//creates a regular array of ascii characters 
		for(int i=32; i<127; i++) {
			list.add(Character.valueOf(character));
			character++;
		}
		//takes the array and shuffles its all up in an ArrayList
		shuffledList = new ArrayList<Character>(list);
		Collections.shuffle(shuffledList);
		System.out.println("A new Key has been generated!");
		
	}
	private void getKey() {//get the key to use it
		
		//shows all the ascii characters we created in the list
		System.out.println("Key: ");
		for(Character x : list) {
			System.out.print(x);
		}
		System.out.println();
		//shows the new combinaton of those characters
		for(Character x : shuffledList) {
			System.out.print(x);
		}
		System.out.println();
		
	}
	private void encrypt() { //plain text to cipher text
		System.out.println("Enter a message to be encrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();
		
		for(int i = 0; i<letters.length; i++) {
			
			for(int j=0; j<list.size();j++) {
				if(letters[i]==list.get(j)) {
					letters[i]=shuffledList.get(j);
					break;
				} 
			}
		}
		System.out.println("Encrypted: ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
	}
	
	
	
	private void decrypt() { //cipher text to plain text
		System.out.println("Enter a message to be decrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();
		
		for(int i = 0; i<letters.length; i++) {
			
			for(int j=0; j<shuffledList.size();j++) {
				if(letters[i]==shuffledList.get(j)) {
					letters[i]=list.get(j);
					break;
				} 
			}
		}
		System.out.println("Decrypted: ");
		for(char x : letters) {
			System.out.print(x);
		}
		System.out.println();
		
		
	}
	private void quit() { //exit the program
		System.out.println("The Program has terminated.");
		System.exit(0);
	}
	
}
