
public class Main {

	public static void main(String[] args) {
		// basic gui jFrame example

		//JFrame is a gui window to add components to 
		//also called a swing
		
//		JFrame frame = new JFrame(); // creates a frame
//		// think basic window with minimize, maximize, and x buttons
//		
//		frame.setTitle("JFrame title goes here");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		// must specify or will run in background on close
//		//options are HIDE_ON_CLOSE, DO_NOTHING_ON_CLOSE, EXIT_ON_CLOSE
//		frame.setResizable(false);//prevent frame from being resized
//		frame.setSize(420, 420); //sets the x-dimension, and y-dimension of frame
//		frame.setVisible(true); // make frame visible
//		
//		ImageIcon image = new ImageIcon("lionLogo.jpg"); //create image icon
//		frame.setIconImage(image.getImage()); //changes display icon from basic java cup
//		
//		frame.getContentPane().setBackground(new Color(143,50,25)); //can set custom rgb values here
//		//can also place Color(0xFFFFFF) hexidecimal values just like in web dev or css/html
		
		
		//example using the frame with a constructor
		MyFrame myFrame = new MyFrame();
	}

}
