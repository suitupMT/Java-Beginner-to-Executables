import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		// after running program press f5 to refresh package explorer to see new file
		
		
		try {
			FileWriter writer = new FileWriter("poem.txt"); //creates writer and file name
			
			writer.write("Roses are red \nViolets are blue \nSome more text\nLast line of poem.");
			//will over write each instance running
			writer.append("\n\nby - Signature");
			//will add onto existing file text
			
			writer.close(); //must close writer
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
