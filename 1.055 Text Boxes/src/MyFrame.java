import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame  implements ActionListener{
	//need to be global 
	JButton button;
	JTextField textField;
	
	//constructor
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//create a submit button for the text input
		button = new JButton("submit");
		button.addActionListener(this); //calls the actionPerformed() if pressed
		
		//can type stuff in this box
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas", Font.PLAIN, 35));;
		textField.setForeground(Color.green); //sets text color
		textField.setBackground(Color.black); //sets box background color
		textField.setCaretColor(Color.white); //sets the cursor color
		textField.setText("put username here");
		textField.setEditable(true);//you can make the input box uneditable
		
		this.add(button);
		this.add(textField); // do this before pack();
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Welcome "+ textField.getText());
			//button.setEnabled(false);
			//textField.setEditable(false);
			//the commented code would lock text entered and stop the button from working again
		}
	}
	
	
}
