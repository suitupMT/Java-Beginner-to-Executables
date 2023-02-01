import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial") // to be covered in much later section
public class myFrame extends JFrame implements ActionListener{ //inherits the Jframe class
//must implement the listener for the button to have an action 
	JButton button; //declare the button globally
	JLabel label; //declare the label globally
	boolean visible = false;
	myFrame(){
		//-----------------------------Image section
		//------Button Image
		//importing and fitting an image
		ImageIcon icon = new ImageIcon("thumb.jpg");
		//resize
		Image image = icon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg);  // transform it back
		//-----------------------------------------
		//Label Image for dynamic display
		//-------------------------
		ImageIcon icon2 = new ImageIcon("smiley.png");
		image = icon2.getImage(); // transform it 
		newimg = image.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon2 = new ImageIcon(newimg);  // transform it back
		
		
		//--------This will display when the button is clicked-----
		//create a label
		label = new JLabel();
		label.setIcon(icon2); 
		label.setBounds(150, 300, 150, 150);
		label.setVisible(false); // can't see until method called
		
		//------------------------------------------------------------
		
		//------------------------------------
		//create the button
		button = new JButton();
		button.setBounds(150, 150 , 150, 150); //x, y, width, height
		button.addActionListener(this); // must be added to work with actionPerformed method
		//specify size of Frame and properties
		
		//advanced lambda expression - if you use this you don't need the actionPerformed method
		// you also don't need to implement the ActionListenr 
		//button.addActionListener(e -> System.out.println("You clicked the button"));
		// lambdas will be covered in its own section 
		
		
		//button design and properties
		button.setText("I'm a button"); //text inside button
		button.setFocusable(false); //removes box from around text
		button.setIcon(icon);//adds the image
		button.setHorizontalTextPosition(JButton.CENTER);  //aligns text within button
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sancs",Font.BOLD,25)); //sets the font properties of button
		button.setIconTextGap(1); // gap between text and icon
		button.setForeground(Color.cyan); //text color
		button.setBackground(Color.lightGray); //button background color
		button.setBorder(BorderFactory.createEtchedBorder()); //give better look
		//button.setEnabled(false); will disable a button
		
		//outer window properties
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);//adds the button to window
		this.add(label);//adds the invisible label to window

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				System.out.println("I clicked the button"); //upon click prints
				//if statement and stand alone variable allows up to create a toggle button
				if(visible == true) {
					label.setVisible(false);
					visible = false;
				}
				else {
					label.setVisible(true); //upon click makes label property visible
					visible = true;
				}
				
			}
	}
		
	
}
