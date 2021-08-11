import javax.swing.*;
import java.awt.*;

/**
An applet that uses a label to display text.
*/
public class LabelDemo extends JFram{
 
 public static void main(String[] args) {
 LabelDemo frame = new LabelDemo();
 //frame.setBackground (Color.WHITE);
 //Create labels:
 JLabel label1 = new JLabel ("Hello ");
 JLabel label2 = new JLabel ("out there!");
 //Add labels:
 frame.add (label1);
 frame.add (label2);
 frame.setSize(400, 300);
 frame.setVisible(true);
 }
}