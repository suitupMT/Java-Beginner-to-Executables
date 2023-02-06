import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	JLabel label2;
	ImageIcon icon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this); // adds key events to the frame
		
		icon = new ImageIcon("Rocket.png");
		Image image = icon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	    icon = new ImageIcon(newimg);  // transform it back
		
		label2 = new JLabel();
		label2.setBounds(0,0,400,20);
	    label2.setText("Move the object around with arrow keys or 'w-a-s-d' keys");
		label2.setFont(new Font("Arial", Font.PLAIN,15));
		label2.setForeground(Color.white);
		
		
		label = new JLabel();
		label.setBounds(0,25,100,100);
		//background
		label.setBackground(Color.black);
		label.setOpaque(true); //necessary for background to display
		
		
		label.setIcon(icon);
		
		
		
		
		this.getContentPane().setBackground(Color.black);
		this.add(label2);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//keyTyped is invoked when a key is typed. Has a character output
		//uses KeyChar
		
		switch(e.getKeyChar()) {
		case 'a': 
			label.setLocation(label.getX()-5, label.getY());
			break;
		case 'w':
			label.setLocation(label.getX(), label.getY()-5);
			break;
		case 's':
			label.setLocation(label.getX(), label.getY()+5);
			break;
		case 'd':
			label.setLocation(label.getX()+5, label.getY() );
			break;
		}
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//keyPressed is invoked when a physical key is pressed down. Has an int output.
		//uses KeyCode
		switch(e.getKeyCode()) {
		case 37: //left
			label.setLocation(label.getX()-10, label.getY());
			break;
		case 38: //up
			label.setLocation(label.getX(), label.getY()-10);
			break;
		case 39: //right
			label.setLocation(label.getX()+10, label.getY() );
			break;	
		case 40: //down
			label.setLocation(label.getX(), label.getY()+10);
			break;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased is called whenever a physical button is released
		
		System.out.println("You released a key char: " + e.getKeyChar()); 
		System.out.println("You released a key code: " + e.getKeyCode()); //capital keyCode is same as lowercase
	}
	
	
}
