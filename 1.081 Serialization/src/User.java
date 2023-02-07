import java.io.Serializable;

public class User implements Serializable{

	//we would like to save the state of a user
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4455946371439034950L;
	// if you put transient in front of variable it doesn't save the value in serialization
	// transient String name;
	String name;
	String password;
	
	
	
}
