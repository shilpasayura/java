import javax.swing.*;
 
public class Swing05 {
    public static void main(String[] args) {
 
        JFrame frame=new JFrame("JButton Example"); //create JFrame object
        JButton button=new JButton("Button");        //Create a JButton object
        button.setBounds(50,50,75,35); //set dimensions for button
        frame.add(button);                                       //add button to the frame
        frame.setSize(250,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}