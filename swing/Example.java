import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class Example  {

    //declare the objects
    JPanel pane; 
    GridBagLayout layout;

    public Example(){
		JFrame f= new JFrame("Quiz 3");
      
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds( xm y, width , height) 
		f.setBounds(100, 0, 800, 400);
		
        pane = new JPanel();
        layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        
        JButton button1 = new JButton("Button 1");
        c.weightx = 0.5;
        c.fill = 2;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(button1, c);
        
        JButton button2 = new JButton("Button 2");
        c.fill = 2;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(button2, c);

        JButton button3 = new JButton("Button 3");
        c.fill = 2;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button3, c);
        
        JButton button4 = new JButton("Long-Named Button 4");
        c.fill = 2;
        c.ipady = 40;
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(button4, c);
        
        JButton button5 = new JButton("5");
        c.fill = 2;
        c.ipady = 0;
        c.weighty = 1.0;
        c.anchor = 20;
        c.insets = new Insets(10, 0, 0, 0);
        c.gridx = 1;
        c.gridwidth = 2;
        c.gridy = 2;
        pane.add(button5, c);
        
        //Setting the layout manager for our container (in this case the JPanel)
        pane.setLayout(layout);
        
         
        f.add(pane);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
	
	Example frame = new Example();
	   
	}
}
