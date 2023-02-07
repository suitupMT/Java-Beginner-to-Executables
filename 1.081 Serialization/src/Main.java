import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		/*Serialization 
		 * 	the process of converting an object into a byte stream.
		 *  Persists (saves the state) the object after program exits
		 *  This byte stream can be saved as a file or sent over a network
		 *  can be sent to a different machine
		 *  Byte stream can be saved as a file (.ser) which is platform indepent 
		 *  (you are saving the file with the object's information)
		 */
		
		/*
		 * Deserialization is the reverse process of converting a byte stream into an object.
		 * (you are loading a saved file)
		 */
		
		
		/*---------------------------------------------------------------------------
		 * Steps to Serialize an object
		 * 1. You object class should impolment the Serializable interface
		 * 2. add import java.io.Serializable;
		 * 3. FileOutputStream fileOut = new FileOutputStream(file path);
		 * 4. ObjectOutputStream out = new Object OutputStream(fileOut);
		 * 5. out.writeObject(objectName);
		 * 6. out.close();
		 * 7. fileOut.close();
		 */
		
		User user = new User();
		
		user.name = "FirstName";
		user.password = "PASSWORD123@";
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("object info saved! ");
		
		// serialVerionUID --
		/*	a unique ID that functions like a verions # and verifies that the sender
		 *  and receiver of a serialized object have loaded classes for that object
		 *  that match. 
		 *  Ensures objects will be compatible between machines.
		 *  The numbers must match otherwise this will cause an InvalidClassException
		 *  A SerialVersionUID will be calculated based on class properites, members, etc.
		 *  A serializable class can declare its own serialVersionUID explicitly
		 * 
		 * 
		 * this is used for version control to make sure you don't use an old class with a new updated one
		 */
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
		
		
	}

}
