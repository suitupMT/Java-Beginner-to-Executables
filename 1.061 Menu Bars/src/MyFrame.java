import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Image;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	//images
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("folder.png");
		Image image = loadIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(15, 15,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		loadIcon = new ImageIcon(newimg);  // transform it back
		
		saveIcon = new ImageIcon("save.png");
		image = saveIcon.getImage(); // transform it 
		newimg = image.getScaledInstance(15, 15,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		saveIcon = new ImageIcon(newimg);  // transform it back
		
		exitIcon = new ImageIcon("exit.png");
		image = exitIcon.getImage(); // transform it 
		newimg = image.getScaledInstance(15, 15,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		exitIcon = new ImageIcon(newimg);  // transform it back
		
		//create the menu bar
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		//create the main menu items
		 fileMenu = new JMenu("File");
		 editMenu = new JMenu("Edit");
		 helpMenu = new JMenu("Help");
		
		//sub menu options
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		//action listeners for sub menu Items
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		//adds the images to the menus
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		//adds a key Mnemonic to the main menu items
		//main menu items require the alt + shortcut
		fileMenu.setMnemonic(KeyEvent.VK_F); // require alt + F for file
		editMenu.setMnemonic(KeyEvent.VK_E); // requires alt + E for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // requires alt + H for help
		//adds a key Mnemonic to the menu item
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save
		exitItem.setMnemonic(KeyEvent.VK_E); // E for exit
		
		//adds the main options to the frame
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		//adds the sub-menu options to the main menu option
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem) {
			System.out.println("Loading the Item");
		}
		if(e.getSource()==saveItem) {
			System.out.println("The item was saved");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}
}
