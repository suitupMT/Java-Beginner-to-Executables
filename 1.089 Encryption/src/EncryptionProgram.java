import java.util.*;

public class EncryptionProgram {
	
	private Scanner scanner;
	private Random random;
	
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private String line;
	private char[] letters;
	private char[] secretLetters;
	
	EncryptionProgram(){
		
		scanner = new Scanner(System.in);
		random = new Random();
		list = new ArrayList();;
		shuffledList = new ArrayList();
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
		shuffledList = new ArrayList(list);
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
		System.out.println("encrypt");
	}
	private void decrypt() { //cipher text to plain text
		System.out.println("decrypt");
	}
	private void quit() { //exit the program
		System.out.println("quit");
		System.exit(0);
	}
	
}
