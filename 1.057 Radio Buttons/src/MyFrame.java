
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class MyFrame extends JFrame  implements ActionListener{
	//need to be global 
	JButton button;
	JRadioButton pizzaButton;
	JRadioButton hotdogButton;
	JRadioButton hamburgerButton;
	//xIcon = new ImageIcon();
	//xIcon2 = new ImageIcon();
	//constructor
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//can use custom ImageIcons to customize the radio buttons if you want
		//but the images will be used as the circle objects - don't recommend unless user friendly
		
		pizzaButton = new JRadioButton("pizza");
		pizzaButton.addActionListener(this);
		
		hamburgerButton = new JRadioButton("hamburger");
		hamburgerButton.addActionListener(this);
		
		hotdogButton = new JRadioButton("hotdog");
		hotdogButton.addActionListener(this);
		
		
		
		
		//must use this grouping otherwise all radio options are available
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza");
		}
		else if(e.getSource()== hamburgerButton) {
			System.out.println("You ordered hamburgers");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered hotdogs");
		}
	}
	
	
}