import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// JOptionPane is a pop up standard dialog box that prompts users for a value
		// or informs them of info like an error
		
//		JOptionPane.showMessageDialog(null, "Generic Dialog Box", 
//				"title", JOptionPane.PLAIN_MESSAGE);
//									 //parentComponent, message, title, messageType
//		JOptionPane.showMessageDialog(null, "This is only here to tell you info", 
//				"INFORMATION", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "WHat are you trying to do User, break me?", 
//				"Question", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Warning: there is a virus", 
//				"Warning Type", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "ERROR 404: NOT FOUND", 
//				"ERROR", JOptionPane.ERROR_MESSAGE);
		
//		int answer = JOptionPane.showConfirmDialog(null,"Would you like to Delete your Hard Drive?", "Title of Box",
//				JOptionPane.YES_NO_CANCEL_OPTION);
//		//answers return integers can capture them in variables 0,1,2
//		System.out.println(answer);
//		
//		String name = JOptionPane.showInputDialog("What is your name?");
//		System.out.println("Hello "+ name);
		
		String[] customOptions = {"Yup", "Nope", "Maybe"};
		
		JOptionPane.showOptionDialog(null, //parentComponent
				"You are awesome!", //message
				"Secret", //title
				JOptionPane.YES_NO_CANCEL_OPTION,  //optionType
				JOptionPane.INFORMATION_MESSAGE, //messageType
				null, //custom icon
				customOptions, //custom options
				0); //initial value
		//if you want to get complicated and make custom boxes
		//can add your own icon in place of the default symbol
		//can add own options but requires an array of strings
	}

}
