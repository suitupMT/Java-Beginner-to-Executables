import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// FileReader = read the contents of a file as a stream of characters. 
		// one by one read() returns an int value which contains the byte value 
		// when read() returns -1, there is no more data to read
		
		try {
			FileReader reader = new FileReader("art.txt");//take in file path
			
			int data = reader.read(); //use the editor hints, it will tell you what exceptions to add
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close(); //close the reader
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
