import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		
		label = new JLabel();
		label.setBounds(0,0, 100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		//if you add the mouse listener to the frame then the mouse responds to everything in the window
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// mouse button has been clicked (this means pressed and released) on a component
		System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// when the mouse is pressed and held down
		System.out.println("You pressed the mouse");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// mouse button is released
		System.out.println("You released the button");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// invoked when the mouse enters a component
		System.out.println("You hovered into the component");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// invoked when the mouse exits a component
		System.out.println("You hovered out of the component");
		label.setBackground(Color.orange);
	}
	
	
}
