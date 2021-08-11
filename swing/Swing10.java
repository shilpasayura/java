import javax.swing.*;
import java.awt.*;
 
class GridLayoutClass {
    JFrame frame;
 
    GridLayoutClass() {
        frame=new JFrame("GridLayout Example");
        //create components to be laid out as per GridLayout
        JButton b1=new JButton("P");
        JButton b2=new JButton("Q");
        JButton b3=new JButton("R");
        JButton b4=new JButton("S");
        JButton b5=new JButton("T");
        JButton b6=new JButton("U");
        JButton b7=new JButton("V");
        JButton b8=new JButton("W");
        JButton b9=new JButton("X");
        //add components to the frame
        frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);frame.add(b5);
        frame.add(b6);frame.add(b7);frame.add(b8);frame.add(b9);
        //set frame layout to GridLayout of 3 rows and 3 columns
        frame.setLayout(new GridLayout(3,3));
 
        frame.setSize(300,300);
        frame.setVisible(true);
    }
 
}
public class Swing10{
    public static void main(String[] args) {
        new GridLayoutClass();
    }
}