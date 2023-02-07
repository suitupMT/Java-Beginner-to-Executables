import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*Steps to deserialize
		 * ---------------------------------------------------------------
		 * 1. Delcare your object (don't instantiate)
		 * 2. You class should implement Serializable interface
		 * 3. add import java.io.Serializable interface
		 * 4. FileInputStream fileIn = new FileInputStream(file path);
		 * 5. ObjectInputStream in = newObject InputStream(fileIn);
		 * 6. objectName = (Class)in.readObject); 
		 * 7. in.clse(); 
		 * 8. fileIn.close();
		 * ---------------------------------------------------------------
		 */
		
		User user;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\Matthew Templeton"
				+ "\\eclipse-workspace\\Java-Beginner-to-Executables"
				+ "\\1.081 Serialization\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		// (user)casts as the class type
		user = (User)in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
	}

}
