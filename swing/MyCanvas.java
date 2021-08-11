import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MyCanvas extends JComponent {

  public void paint(Graphics g) {
    g.drawString (Long.toString(System.currentTimeMillis()), 10, 30); 
    repaint(1000);
  }
}

public class SettingFont {
  public static void main(String[] a) {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 300, 300);
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
  }
}