import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// Layout Manger = Defines the natural layout for components within a container 
		
		//3 common managers
		
		//Border Layout places components in five areas": NORTH,SOUTH,EAST,WEST,CENTER
		//all extra space is placed in center area

		//west and east will resize vertically
		//the north and south will resize horizontally
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		//change layout manager
		frame.setLayout(new BorderLayout(10,10));
		//can send in margins for width and height in BorderLayout
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPreferredSize(new Dimension (100,100));
		panel2.setPreferredSize(new Dimension (100,100));
		panel3.setPreferredSize(new Dimension (100,100));
		panel4.setPreferredSize(new Dimension (100,100));
		panel5.setPreferredSize(new Dimension (100,100));
		
		//---------------------------------------------------------------
		//these are sub panels
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9  = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);
		
		//--------------------- Set new layout inside panel5
		panel5.setLayout(new BorderLayout());
		//-------------------------------
		
		panel6.setPreferredSize(new Dimension (50,50));
		panel7.setPreferredSize(new Dimension (50,50));
		panel8.setPreferredSize(new Dimension (50,50));
		panel9.setPreferredSize(new Dimension (50,50));
		panel10.setPreferredSize(new Dimension (50,50));
		
		
		//add sub-panels to the center panel
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.WEST);
		panel5.add(panel10, BorderLayout.CENTER);
		
		//----------------------add panels to the frame
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);
		
		
		
		
	
	}

}
