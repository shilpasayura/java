import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;




public class Quiz2 {

	public Quiz2() {
		
		JFrame f= new JFrame("Quiz");
		int qno=1;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds( xm y, width , height) 
		f.setBounds(100, 0, 800, 400);
	    
	    Border blackline = BorderFactory.createLineBorder(Color.black);
	    Border redline = BorderFactory.createLineBorder(Color.red);
          
        JPanel toppanel=new JPanel();        
        toppanel.setBorder( new EmptyBorder(20, 10, 10, 10 ) );
        
        f.setLayout(new GridLayout(3,3)); 
        
        //toppanel.setBounds(10,10,400,300);        
        //Create a border
        toppanel.setBorder(blackline);
        //toppanel.setBackground(Color.gray);
        //add content
        
        JLabel queustion=new JLabel("  " + qno + "  Who is the creator of Java ?");
        queustion.setBorder(redline); 
        toppanel.add(queustion); 
        
        //add to frame
        toppanel.setLayout(new BoxLayout(toppanel, BoxLayout.Y_AXIS));
        f.add(toppanel);
          
        
        JPanel midpanel=new JPanel();        
        //midpanel.setBounds(30,10,400,300);        
        //Create a border
        midpanel.setBorder(blackline);
        //midpanel.setBackground(Color.yellow);
        //add content
        JRadioButton opt1 = new JRadioButton("Microsoft", false);  
        JRadioButton opt2 = new JRadioButton("Oracle ", false);  
        JRadioButton opt3 = new JRadioButton("Sun Micro Systems", false);  
        JRadioButton opt4 = new JRadioButton("IBM", false);  
         
        midpanel.add(opt1);
        midpanel.add(opt2);  
        midpanel.add(opt3);
        midpanel.add(opt4);
        midpanel.setLayout(new BoxLayout(midpanel, BoxLayout.Y_AXIS));
        
        //add to frame
        f.add(midpanel);
        
         
        JPanel botpanel=new JPanel();        
        //midpanel.setBounds(30,10,400,300);        
        //Create a border
        midpanel.setBorder(blackline);
        //midpanel.setBackground(Color.green);
        //add content
        JButton submit=new JButton("Submit");     
        
         
        botpanel.add(submit);
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
	
	Quiz2 frame = new Quiz2();
	   
	}

}


