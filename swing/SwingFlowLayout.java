import java.awt.*;  
import javax.swing.*;  
  
public class SwingFlowLayout{  
JFrame frame;  
SwingFlowLayout(){  
	
    frame=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
              
    frame.add(b1);
    frame.add(b2);
    frame.add(b3);
    frame.add(b4);
    frame.add(b5);  
      
    //setting flow layout of center alignment
    frame.setLayout(new FlowLayout(FlowLayout.CENTER));  
      
  
    frame.setSize(300,300);  
    frame.setVisible(true);  
}  
public static void main(String[] args) {  
    new SwingFlowLayout();  
}  
}  
