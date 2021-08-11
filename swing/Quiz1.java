import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.GridLayout;
import javax.swing.BoxLayout;


public class Quiz1 {

	public Quiz1() {
		
		JFrame f= new JFrame("Quiz");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds( xm y, width , height) 
		f.setBounds(100, 0, 800, 400);
	    
	    Border blackline = BorderFactory.createLineBorder(Color.black);
          
        JPanel toppanel=new JPanel();        
        f.setLayout(new GridLayout(3,3)); 
        
        //toppanel.setBounds(10,10,400,300);        
        //Create a border
        toppanel.setBorder(blackline);
        toppanel.setBackground(Color.gray);
        //add content
        JButton b1=new JButton("Button 1");     
        JButton b2=new JButton("Button 2");   
        
        toppanel.add(b1);
        toppanel.add(b2);  
        
        
        //add to frame
        f.add(toppanel);
          
        
        JPanel midpanel=new JPanel();        
        //midpanel.setBounds(30,10,400,300);        
        //Create a border
        midpanel.setBorder(blackline);
        midpanel.setBackground(Color.yellow);
        //add content
        JButton b3=new JButton("Button 3");     
        JButton b4=new JButton("Button 4");  
        JButton b5=new JButton("Button 5");     
        JButton b6=new JButton("Button 6");   
        
         
        midpanel.add(b3);
        midpanel.add(b4);  
        midpanel.add(b5);
        midpanel.add(b6);
        midpanel.setLayout(new BoxLayout(midpanel, BoxLayout.Y_AXIS));
        
        //add to frame
        f.add(midpanel);
        
         
        JPanel botpanel=new JPanel();        
        //midpanel.setBounds(30,10,400,300);        
        //Create a border
        midpanel.setBorder(blackline);
        midpanel.setBackground(Color.green);
        //add content
        JButton b7=new JButton("Button 7");     
        
         
        botpanel.add(b7);
        //add to frame
        f.add(botpanel);
         
    
        f.setVisible(true);
	  /*
	  setTitle("Quiz");
	  //add content Pane
	  contentPane = new JPanel();
	  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	  setContentPane(contentPane);
	  contentPane.setLayout(new BorderLayout(0, 0));
	  
	   JPanel panel = new JPanel();
       frame.getContentPane().add(panel);
       panel.add(new NewSlider(200, 100, 500, 0.1f, 150, 300));
	  */
	  }
	
	public static void main(String[] args) {
	
	Quiz1 frame = new Quiz1();
	   
	}

}


