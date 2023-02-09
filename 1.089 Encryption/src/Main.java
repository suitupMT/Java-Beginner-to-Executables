
public class Main {

	public static void main(String[] args) {
		// Encryption is the last lesson before separate projects will be created
		// on the github
		
		//This program is a basic substitution cipher, There are much better
		//and advanced ways to ensure encryption and decryption security
		//this is an introduction and other modules or repos may
		//explore cryptography in futher advanced detail
		
		
		//for actual encryption use in production look into at least the OTP
		//option for futher research
		
		
		// OTP = One-time pad
		/*
		 * encryption technique that cannot be cracked, but requires
		 * the use of a one-time pre-shared key
		 * the same size as, or longer than, the message being sent. 
		 * In this technique, plaintext is paired with a random secret key (one-time pad).
		 */
		
		//This encryption will use the ASCII Table 
		
		EncryptionProgram ep = new EncryptionProgram();
		
		// for program must generate a new key before encrypt or decrypt options
		
		// The NewKey and GetKey options are so you can see how the cipher works together
		
		
	}

}
