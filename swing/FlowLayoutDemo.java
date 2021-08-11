import javax.swing.*;
import java.awt.*;  


class FlowLayoutEx {
    FlowLayoutEx(){
      JFrame f = new JFrame("Panel Demo");
       
  JButton b1 = new JButton("Button 1");
  JButton b2 = new JButton("Button 2");
  JButton b3 = new JButton("Button 3");
  JButton b4 = new JButton("Button 3");
  
  JPanel Panel1 = new JPanel();
  JPanel Panel2 = new JPanel();
  JPanel Panel3 = new JPanel();
  JPanel Panel4 = new JPanel();
  
  Panel1.add( b1);
  Panel2.add( b2);
  Panel3.add( b3);
  Panel4.add( b4);
  
  f.add(Panel1); 
  f.add(Panel2);
  f.add(Panel3);
  f.add(Panel4);
  f.setSize(600,600);
  //f.setLayout(new FlowLayout());
  
  f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));

  f.setVisible(true);
    }
}
public class FlowLayoutDemo {
    public static void main(String[] args) {
      new FlowLayoutEx(); 
    }
}
