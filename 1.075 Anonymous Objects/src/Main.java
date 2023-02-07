import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		// nameless objects or anonymous objects
		
		//JLabel label1 = new JLable();   this object doesn't actually need a name always
		
		//this example uses playing cards, imagine if you had to use 52 or 54 images
		
		
		JFrame frame = new JFrame();
		
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		//------------    this would have to be done for each card in the deck
//		ImageIcon cardBack = new ImageIcon("playing card.png");
//		JLabel cardLabel = new JLabel(cardBack);
//		deck.add(cardLabel);
//		
//		ImageIcon jackS = new ImageIcon("playing card 2.png");
//		JLabel jackSLabel = new JLabel(jackS);
//		deck.add(jackSLabel);
		//------- the long way is above
		
		//Shortcut with anonymous labels or objects
		for(int i =1; i<=4; i++) {
			//we created a nameless label with a nameless image, and each individually went
			//into our ArrayList 
			deck.add(new JLabel(new ImageIcon("src\\playing card " +i+ ".png")));
			//adding each label to our frame
			frame.add(deck.get(i-1));
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		
		frame.setVisible(true);
			
		
		

	}

}
