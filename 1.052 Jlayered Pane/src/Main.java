import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JLayeredPane is a swing container that provides a third dimension for positioning 
		//components, ex. Z-index, depth
		//layers in the pane are named- default, palette, modal, popup, drag
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500); //x,y,width,height
		// create labels to put inside layeredPane
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50, 200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.green);
		label2.setBounds(100,100, 200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.blue);
		label3.setBounds(150,150, 200,200);
		// end of labels ---------------------------------------
		
		//create the window
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		layeredPane.add(label1, Integer.valueOf(0)); //long way is JLayeredPane.DEFAULT_LAYER(must remember layers)
		layeredPane.add(label2, Integer.valueOf(2));
		layeredPane.add(label3, Integer.valueOf(1)); //higher number is the top label displayed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
