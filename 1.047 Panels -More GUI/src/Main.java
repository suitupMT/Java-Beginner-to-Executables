import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		//JPanel is a GUI component that functions as a container to hold other components
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250); //x,y,width,height
		//redPanel.setLayout(null); use this if you want to specify absolute position coordinates
		
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250); //x,y,width,height
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250); //x,y,width,height
		greenPanel.setLayout(new BorderLayout());
		
		
		//JLabel - text and images
		JLabel label = new JLabel();
		label.setText("Hello");
		ImageIcon icon = new ImageIcon("tech.png");//create image icon
		label.setIcon(icon);//adds image to the label
		label.setVerticalAlignment(JLabel.CENTER);//start using ctrl + space bar to find positioning options
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0,0,200,200); // only works if the panel has a setLayout = to null
		
		
		//JFrame is the outer components, main window
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.add(redPanel); //adds panel to window
		
		frame.add(bluePanel); //adds panel to window
		frame.add(greenPanel); //adds panel to window
		//redPanel.add(label);
		greenPanel.add(label);//see that we add the label inside the panel like a container
		
		
	}

}
