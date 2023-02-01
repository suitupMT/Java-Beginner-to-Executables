import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//More Layout Manger
		//default layout manager is borderlayout and must be changed
		
		// Grid Layout- places components in a grid of cell.
		//				Each component takes all the available space within its cell,
		//				and each cell is the same size.

		
		
		
		
		//just the outer window
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(4,3)); //parameters are rows, columns
		//notice it will create blank space if not enough is there to fill it up
		
		
//		JButton button1 = new JButton("1");
//		frame.add(button1);
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);
	}

}
