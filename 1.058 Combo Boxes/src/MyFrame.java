import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JComboBox comboBox;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		String[] animals = {"dog","cat","bird"};
		//must pass in array of reference data types or objects, must use wrapper class and be an array
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		comboBox.setEditable(false); //if set true items become editable to use in searches etc.
		//comboBox.addItem("example string"); adds to the array
		//comboBox.insertItemAt("string", index); places new string at array index
		//comboBox.setSelectedIndex(0); sets startup index shown
		//comboBox.removeItem("string"); removes the matching item from array
		//comboBox.removeItemAt(0); removes the item at array index
		//comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem()); //actual value
			System.out.println(comboBox.getSelectedIndex()); //array index
		}
		
	}
	
}
