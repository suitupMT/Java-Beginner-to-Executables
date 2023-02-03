import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class SliderDemo implements ChangeListener{

	JFrame frame; 
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50); //min value, max value, starting value
		
		//slider properties
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(10);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 10));
		slider.setOrientation(SwingConstants.VERTICAL);
		//makes the slider dynamic
		slider.addChangeListener(this);
		
		
		// label properties
		label.setText("°C = "+ slider.getValue());
		
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(400,400);
		frame.setVisible(true);
		
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = "+ slider.getValue());
		
	}
	
}
