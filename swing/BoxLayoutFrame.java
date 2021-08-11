
import java.awt.*;  
import javax.swing.*;  
  
public class BoxLayoutFrame {  
JFrame frame;  
BoxLayoutFrame(){  
    frame=new JFrame();  
    frame.setSize(450,300);  
    
    // Creating content panel to add buttons.
    JPanel panel = new JPanel();
    // Setting box layout to panel GUI
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	//panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
	//panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
	//panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
		
    panel.add(new JButton("Button1"));
	panel.add(new JButton("Button2"));
	panel.add(new JButton("Button3"));
	panel.add(new JButton("Button4"));
	panel.add(new JButton("Button5"));  
    
   //add panel to frame
   frame.add(panel);
   frame.setVisible(true);  
}  
public static void main(String[] args) {  
    new BoxLayoutFrame();  
}  
} 
