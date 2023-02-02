
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class MyFrame extends JFrame  implements ActionListener{
	//need to be global 
	JCheckBox checkbox;
	JButton button;
	//xIcon = new ImageIcon();
	//xIcon2 = new ImageIcon();
	//constructor
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		checkbox = new JCheckBox("I'm not a robot");
		checkbox.setFocusable(false); //takes box away from around text
		checkbox.setFont(new Font("Consolas", Font.PLAIN,35));
	//  checkbox.setIcon(xIcon); would add custom image for the checkbox
	//  checkbox.setSelectedIcon(xIcon2);
		button = new JButton("Submit");
		button.addActionListener(this);
		
		this.add(button);
		this.add(checkbox);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(checkbox.isSelected());
//			//button.setEnabled(false);
//			//textField.setEditable(false);
//			//the commented code would lock text entered and stop the button from working again
		}
	}
	
	
}
