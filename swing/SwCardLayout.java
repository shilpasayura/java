import java.awt.*;  
import java.awt.event.*;  
  
import javax.swing.*;  
  
public class SwCardLayout extends JFrame implements ActionListener{  

CardLayout card;  
JButton b1,b2,b3;  
Container c;  
    SwCardLayout(){  
          
        c=getContentPane();  
//create CardLayout object with 40 hor space and 30 ver space 
   card=new CardLayout(40,30);  
   c.setLayout(card);  
          
        b1=new JButton("Dog");  
        b2=new JButton("Lion");  
        b3=new JButton("Cat");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
              
        c.add("D",b1);
	c.add("L",b2);
        c.add("C",b3);                            
    }  
    public void actionPerformed(ActionEvent e) {  
    	card.next(c);  
    }  
  
    public static void main(String[] args) {  
        SwCardLayout cl=new SwCardLayout();  
        cl.setSize(400,400);  
        cl.setVisible(true);  
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
}  
