import java.awt.Color;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Swing12 {
 
public static void main(String[] args) {
 
JFrame baseFrame =new JFrame();
baseFrame.setTitle("Base Container");
JPanel contentPane=new JPanel();
 
contentPane.setBackground(Color.pink);
baseFrame.setSize(400, 400);
 
baseFrame.add(contentPane);
 
baseFrame.setDefaultCloseOperation(baseFrame.EXIT_ON_CLOSE);
 
baseFrame.setVisible(true);
}
 
}