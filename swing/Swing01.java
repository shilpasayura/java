//Extending The JFrame Class

import javax.swing.*;

class FrameInherited extends JFrame{    
    JFrame f;
    FrameInherited(){
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       JButton b=new JButton("JFrame_Button");//create button object
        b.setBounds(100,50,150, 40);
        add(b);//add button on frame
        setSize(300,200);
        setLayout(null);
        setVisible(true);
    }
}
public class Swing01 {
    public static void main(String[] args) {
      FrameInherited f=new FrameInherited(); //create an object of FrameInherited class
    }
}