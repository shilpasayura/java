
import java.awt.*;  
import javax.swing.*;  
  
public class SwingGridLayout {  
JFrame frame;  
SwingGridLayout(){  
    frame=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
    JButton b6=new JButton("6");  
    JButton b7=new JButton("7");  
    JButton b8=new JButton("8");  
    JButton b9=new JButton("9");  
          
    frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);frame.add(b5);  
    frame.add(b6);frame.add(b7);frame.add(b8);frame.add(b9);  
  
    //create grid layout of 3 rows and 3 columns
    frame.setLayout(new GridLayout(3,3));  
      
    frame.setSize(300,300);  
    frame.setVisible(true);  
}  
public static void main(String[] args) {  
    new SwingGridLayout();  
}  
} 
