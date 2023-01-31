import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		//JLabel - a GUI display area for text, images, or both
		
		JLabel label = new JLabel();
		label.setText("Set the text of the label here"); //what do you want it to say?
		
		ImageIcon image = new ImageIcon("tech.png");//creates the image
		label.setIcon(image);//applies the icon
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		label.setHorizontalTextPosition(JLabel.CENTER);//will take left, center, right
		label.setVerticalTextPosition(JLabel.TOP); //changes to top instead of side
		label.setForeground(new Color(0x00FF00));//set font color
		label.setFont(new Font("MV Boli",Font.PLAIN, 20));//change text font
		label.setIconTextGap(2);//padding between image and text, int value
		label.setBackground(Color.black); //the label will technically take up the entire background
		//this will be changed in the future
		label.setOpaque(true);//boolean for background color effect, must be true
		label.setBorder(border);//look at where the label area is, its the whole window if not restricted
		
		label.setVerticalAlignment(JLabel.CENTER);//unlike text this is for the whole label
		label.setHorizontalAlignment(JLabel.CENTER);//this is how you position the label object in the window
		// will maintain even if window is resized
	
		//until future layout manager lessons we can manually specify the sizes of the label
		//label.setBounds(100,0,300,300); // x, y, width, height
		
		//JFrame code from last lesson
		JFrame frame = new JFrame(); // creates a frame
		frame.setTitle("Label Examples");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500); //this is very important otherwise window will be tiny
		frame.setVisible(true); // make frame visible
		frame.add(label);
		frame.pack(); //frame will auto-size to fit components of frame
		
		
		frame.getContentPane().setBackground(new Color(0x808080)); //the color here does not work
		//as long as the label is unrestricted
		
		//frame.setLayout(null); // change from default to specify manual label sizes
		//does not resize with window
	}

}
