import javax.swing.*;

public class MyFrame extends JFrame{
	
	
	JButton myButton = new JButton("My Button");
	JButton button2 = new JButton("Button 2");
	MyFrame(){
		
		myButton.setBounds(100,100,200,100);
		myButton.addActionListener( (e) -> {
			System.out.println("You clicked a button");
		}
				);
		button2.setBounds(100,200,200,100);
		button2.addActionListener( (e) -> {
			System.out.println("This is the second button");
		}
				);
		
		
		this.add(myButton);
		this.add(button2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		
		this.setVisible(true);
		
	}
}
