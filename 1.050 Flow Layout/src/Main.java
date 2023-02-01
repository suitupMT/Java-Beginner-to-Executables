import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		//Layout Manger - defines the natural layout for components within a container
		
		//FlowLayout - places components in a row, sized at their preferred size. 
				       //if the horizontal space in the container is too small,
					   //the FlowLayout class uses the next available row
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); //by default frames use BorderLayout
										//alignment, px padding width, px padding height
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 250));
		panel.setBackground(Color.lightGray);
		
		
		
//		JButton button1 = new JButton();
//		frame.add(button1);  
		//shorter code for above 2 lines 
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("10"));
		//as window size is changed the buttons will move vertically below in order
		
		frame.add(panel);
		frame.setVisible(true);//set this after adding the components 

	}

}
