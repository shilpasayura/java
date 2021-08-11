/*
A panel is a component that is contained inside a frame window. 
A frame can have more than one-panel components
each panel component can have several other components.
panels used to partition the frame. 


Swing API class implements JPanel. 
JPanel class inherits from JComponent
It has FlowLayout as its default layout.
*/

import javax.swing.*;

class JPanelExample {
    JPanelExample(){
        JFrame frame = new JFrame("Panel Example"); //create a frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(); //Create JPanel Object
        panel.setBounds(40,70,100,100); //set dimensions for Panel
        JButton b = new JButton("ButtonInPanel"); //create JButton object
        b.setBounds(60,50,80,40); //set dimensions for button
        panel.add(b);   //add button to the panel
        frame.add(panel);   //add panel to frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
 
}
public class Swing03 {
    public static void main(String[] args) {
      new JPanelExample(); //create an object of FrameInherited class
    }
}