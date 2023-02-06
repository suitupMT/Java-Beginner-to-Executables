import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

	Image image; 
	
	MyPanel(){
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		image = new ImageIcon("smiley.png").getImage();
	
		//cast graphics as 2D object
		Graphics2D g2D = (Graphics2D) g;
		//the last image drawn is the one that is placed on top in view, will overlap others
		
		g2D.drawImage(image, 0,0,null); //background image example
	
		g2D.setPaint(Color.pink);//sets color
		g2D.fillRect(10,10,200,100);
		g2D.setPaint(Color.blue);//sets color
		g2D.setStroke(new BasicStroke(3));  //sets thickness of the paint brush
//		g2D.drawLine(0,0,500,500);
		g2D.drawRect(10, 10, 200, 100);
		
		g2D.setPaint(Color.pink);//sets color
		g2D.fillOval(215,10,100,100);
		g2D.setPaint(Color.blue);//sets color
		g2D.drawOval(215,10,100,100);
		
		g2D.setPaint(Color.red);
		g2D.fillArc(10, 120, 100, 100, 0, 180); //x, y, width, height, vertical, degrees
		g2D.setPaint(Color.white);
		g2D.fillArc(10,120,100,100,180,180);
		
		int[] xPoints = {150,250,350};
		int[] yPoints = {300,150,300};
		g2D.setPaint(Color.yellow);
		g2D.fillPolygon(xPoints, yPoints, 3); // coordinates for object and then how many in array
		
		g2D.setPaint(Color.black);
		g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
		g2D.drawString("I Drew Words", 180, 180);
		
		//add image to graphic
		//g2D.drawImage(img, x, y, null)
	}
}
