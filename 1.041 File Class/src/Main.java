import java.io.File; // necessary 


public class Main {

	public static void main(String[] args) {
	// file is an abstract representation of file and directory pathnames 
	
		File file1 = new File("secret_message.txt");  //specify file name in ()
													// must copy file into project folder
		
		//full file path can also be used - probably preferred for complicated programs
		
		File file2 = new File("C:\\Users\\Matthew Templeton\\Desktop\\demo_message.txt"); 
		//must add the file extension type onto the full path if used this way
		//the double \\ are necessary for single \ characters in this syntax
		
		if(file1.exists()) {
			System.out.println("That file exists");
			System.out.println(file1.getPath());  //basic path
			System.out.println(file1.getAbsolutePath()); //full path
			System.out.println(file1.isFile());  //boolean
			//file1.delete(); would delete the file from existence
		}
		else {
			System.out.println("file1 does not exist");
		}
		if(file2.exists()) {
			System.out.println("File2 exists");
			
		}
		else {
			System.out.println("\nfile2 does not exist");
			
		}
	}
}
