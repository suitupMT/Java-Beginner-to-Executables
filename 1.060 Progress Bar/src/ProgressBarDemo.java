import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();  //can pass in min and max
	
	ProgressBarDemo(){
		
		bar.setValue(0);
		bar.setBounds(10,30,390,25); //x,y,width,height
		bar.setStringPainted(true); //adds percentage inside of bar
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(430,430);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}

	public void fill() {
		int counter = 0;
		
		while(counter <=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(300); //sleeps program for 1 sec (is in milliseconds)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=10;
		}
		bar.setString("Done"); //after progress finishes changes to done
		
	}
}
