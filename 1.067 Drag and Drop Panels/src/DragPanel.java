import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel{

	ImageIcon image = new ImageIcon("smiley.png");
//	final int WIDTH = image.getIconWidth();
//	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	
	DragPanel(){
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
		
		//resize the image, necessary because downloaded image is too big
		Image copyImage = image.getImage(); // transform it 
		Image newimg = copyImage.getScaledInstance(150, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	    image = new ImageIcon(newimg);  // transform it back
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();
			System.out.println(prevPt);
		}
	}
	
	//moves the image as mouse moves
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			
			imageCorner.translate(
					(int)(currentPt.getX()-prevPt.getX()),
					(int)(currentPt.getY()-prevPt.getY())
			);
			prevPt = currentPt;
			System.out.println(prevPt);
			repaint();
			
		}
	}
	
}
