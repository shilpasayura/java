import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
 
public class Action implements ActionListener {
 
    JFrame frame;
    JButton button;
    
    public Action() {
        button = new JButton("Click Me");
        frame = new JFrame("Action Test");
        button.addActionListener(this);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setBackground(Color.YELLOW);
    }
 
    public static void main(String args[]) {
        Action test = new Action();
    }
}
