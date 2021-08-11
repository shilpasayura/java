 
import javax.swing.*;
class JPanelDemo {
    JPanelDemo(){
      JFrame frame = new JFrame("Pannel Demo");
      
      JPanel panelOuter = new JPanel(); 
      panelOuter.setBounds(0,0,500,500);
      
      JPanel panelInner1 = new JPanel(); 
      panelInner1.setBounds(0,0,300,100);
      JButton b1 = new JButton("Button Inner 1");
      b1.setBounds(0,0,100,40); 
      panelInner1.add(b1);
      panelOuter.add(panelInner1);
      
       
      JPanel panelInner2 = new JPanel(); 
      panelInner1.setBounds(0,200,300,100);
      JButton b2 = new JButton("Button Inner 2");
      b2.setBounds(0,0,100,40); 
      panelInner2.add(b2);
      panelOuter.add(panelInner2);
       
   
      frame.add(panelOuter);   //add panel to frame
      frame.setSize(600,600);
      frame.setLayout(null);
      frame.setVisible(true);
    }
}
public class JPanelMain2 {
    public static void main(String[] args) {
      new JPanelDemo(); 
    }
}

