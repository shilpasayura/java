import javax.swing.*;
import java.awt.event.*;

public class SwingAction02 {
 
public void createApp() {
JFrame baseFrame =new JFrame();
JPanel contentPane=new JPanel();
baseFrame.setTitle("Base Container");
baseFrame.setSize(400, 400);
baseFrame.add(contentPane);
JButton demoButton =new JButton("click");
demoButton.setBounds(100,95,95,30);
JTextArea result =new JTextArea();
result.setBounds(130,140,95,30);
contentPane.add(demoButton);
contentPane.add(result);
 
baseFrame.setDefaultCloseOperation(baseFrame.EXIT_ON_CLOSE);
 
baseFrame.setVisible(true);
demoButton.addMouseListener(new
MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
result.setText("button clicked");
}
});
}
 
public static void main(String[] args) {
 
ContainerDemo c =new ContainerDemo();
c.createApp();
}
}