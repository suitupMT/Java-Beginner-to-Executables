
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame{
	
	// can create resusable frame assets this way with specific designs/formats
	MyFrame(){
		
		this.setTitle("JFrame title goes here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// must specify or will run in background on close
		//options are HIDE_ON_CLOSE, DO_NOTHING_ON_CLOSE, EXIT_ON_CLOSE
		this.setResizable(false);//prevent this from being resized
		this.setSize(420, 420); //sets the x-dimension, and y-dimension of this
		this.setVisible(true); // make this visible
	
		ImageIcon image = new ImageIcon("lionLogo.jpg"); //create image icon
		this.setIconImage(image.getImage()); //changes display icon from basic java cup
	
		this.getContentPane().setBackground(new Color(143,50,25)); //can set custom rgb values here
		//can also place Color(0xFFFFFF) hexidecimal values just like in web dev or css/html
	}
	
	
	
}
