import javax.swing.*;
import java.awt.*;  

class JPanelDemo {
    JPanelDemo(){
    JFrame f = new JFrame("Panel Demo");

  JButton b1 = new JButton("Button 1");
  JButton b2 = new JButton("Button 2");
  JButton b3 = new JButton("Button 3");
  JButton b4 = new JButton("Button 4");
  
  JPanel Panel0 = new JPanel();
  
  JPanel Panel1 = new JPanel();
  JPanel Panel2 = new JPanel();
  JPanel Panel3 = new JPanel();
  JPanel Panel4 = new JPanel();
  
  Panel1.add( b1);
  Panel2.add( b2);
  Panel3.add( b3);
  Panel4.add( b4);
  
  Panel0.add(Panel1); 
  Panel0.add(Panel2);
  Panel0.add(Panel3);
  Panel0.add(Panel4);
  Panel0.setSize(200,200);
   
  Panel0.setLayout(new BoxLayout(Panel0, BoxLayout.Y_AXIS));
  f.add(Panel0);
  f.setSize(200,250);
  f.setLayout(null);
  f.setVisible(true);
    }
}
public class LayoutYaxis {
    public static void main(String[] args) {
      new JPanelDemo(); 
    }
}
