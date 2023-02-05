import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JButton button2;
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a text color");
		button.addActionListener(this);
		
		button2 = new JButton("Pick a background color");
		button2.addActionListener(this);
		
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setOpaque(true); //must be set true for background color to work
		label.setText("This is some text");
		label.setFont(new Font("Arial", Font.PLAIN,100));
		
		
		
		
		this.add(button);
		this.add(button2);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JColorChooser colorChooser = new JColorChooser();
		Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
		
		if(e.getSource()==button) {
			
			label.setForeground(color);
			
		}
		if(e.getSource()==button2) {
			
			label.setBackground(color);
			
		}
		
	}

	
	
}
