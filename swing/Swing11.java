import javax.swing.*;
public class Swing11 {
    public static void main(String arg[]) {
        JFrame frame = new JFrame("SetBounds Method Test");
        frame.setSize(375, 250);
        // Set layout as null
        frame.setLayout(null);
        // Create a Button
        JButton button = new JButton("ButtonWithSetBounds");
        // Set position and size of a button using setBounds
        button.setBounds(80,30,200,40);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}