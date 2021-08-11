import java.awt.*;  
import javax.swing.*;  
  
public class SwingBLYaxis { 
 
 JFrame frame;  
 Button buttons[];  
  
 public SwingBLYaxis () {  
   frame=new JFrame();  
   buttons = new Button [5];  
    
   for (int i = 0;i<5;i++) {  
      buttons[i] = new Button ("Button " + (i + 1));  
      frame.add(buttons[i]);  
    }  
    BoxLayout layout=new BoxLayout(frame, BoxLayout.X_AXIS);
    
    frame.setLayout(layout);
    
//setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
    frame.setSize(300,300);  
    frame.setVisible(true);   
}  
  
public static void main(String args[]){  
SwingBLYaxis b=new SwingBLYaxis();  
}  
}
