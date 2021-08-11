import javax.swing.*;
class InheritedFrame extends JFrame{	
    JFrame f;
    InheritedFrame(){
        //create a button object
        JButton b=new JButton("JFrame_Button");
        b.setBounds(100,50,150, 40);
        add(b);//add button on frame
        setSize(300,200);
        setLayout(null);
        setVisible(true);
    }
}

public class FrameInherited {
    public static void main(String[] args) {
      //create an object of FrameInherited class
      new InheritedFrame(); 
    }
}