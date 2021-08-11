// importing swing package for JFrame, JButton controls
import javax.swing.*;
// importing to use Container class
import java.awt.*;

public class BoxLayoutTest extends JFrame {
	public BoxLayoutTest(){
		// Setting Title to the JFrame GUI
		setTitle("Grid Bag Layout Test Java Code");
		
                // Creating content panel to add the panels.
		Container container = getContentPane();
		JPanel panel = new JPanel();
		// Setting box layout to JFrame GUI
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// Adding buttons using Box Layout
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("Button4"));
		panel.add(new JButton("Button5"));
		
                // adds panel into Container
		container.add(panel);
                //Adjust the size of all components.
		this.pack();

	}
	public static void main(String[] args){
		// Create JFrame for GUI frame and title as 'Add Button in JFrame Java Code'
		BoxLayoutTest frame = new BoxLayoutTest();
		frame.setSize(500,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
