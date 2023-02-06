import javax.swing.*;

public class MyFrame extends JFrame{

	DragPanel dragPanel = new DragPanel();
	
	
	MyFrame(){
		//Frame Properties
		this.setTitle("Drag & Drop Demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add drag panel object
		this.add(dragPanel);
		
		
		
		this.setVisible(true);
	}
	
}
