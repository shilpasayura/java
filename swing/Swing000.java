import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swing000 extends JFrame {

    private JTextField textField;

    public static void main (String[] args) {
        Swing000 frame = new Swing000();
        frame.setSize(300, 200);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        textField = new JTextField("Hello!");
        window.add(textField);
    }
 }