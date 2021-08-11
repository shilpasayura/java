import javax.swing.*;
import java.awt.*;
 
class FlowLayoutClass {
    JFrame frame;
    FlowLayoutClass() {
        frame = new JFrame("FlowLayout Example");
        //create button components
        JButton b1 = new JButton("A");
        JButton b2 = new JButton("B");
        JButton b3 = new JButton("C");
        JButton b4 = new JButton("D");
        JButton b5 = new JButton("E");
        //add components to the frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        //set layout as 'FlowLayout.CENTER'
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        //setting flow layout of right alignment
 
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
 
}

public class Swing09{
    public static void main(String[] args) {
        new FlowLayoutClass();
    }
}