import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image enemy; 
	Image space;
	javax.swing.Timer timer;
	int xVelocity = 10; //speed horizontal 
	int yVelocity = 10; //speed vertical
	int x = 0;
	int y = 0;
	
	MyPanel(){
	
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		this.setOpaque(true);
		
		
		space = new ImageIcon("space.jpg").getImage();
		Image newImage = space.getScaledInstance(500,500,Image.SCALE_SMOOTH);
		space = new ImageIcon(newImage).getImage();
		
		
		enemy = new ImageIcon("enemy.png").getImage();
		//simpler resize option
		newImage = enemy.getScaledInstance(100,100,Image.SCALE_SMOOTH);
		enemy = new ImageIcon(newImage).getImage();
		
		
		
		
		//must use the javax.swing version of Timer
		timer = new javax.swing.Timer(10, this);
		timer.start();
		
		
	}
	
	public void paint(Graphics g) {
		super.paint(g); //paints the background
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(space,0,0,null);
		g2D.drawImage(enemy, x, y, null);  // image name, x, y, null
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(x >= PANEL_WIDTH-enemy.getHeight(null) || x<0) {
			xVelocity = xVelocity * -1;
			y= y + yVelocity;
		}
		x = x + xVelocity;
		
		if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		//y = y + yVelocity; use this if you want diagonal bouncing
		repaint();
	}
}
