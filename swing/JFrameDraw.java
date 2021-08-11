import java.awt.*;
import javax.swing.*;

public class JFrameDraw {
   public static void main(String[] a) {
      MyJFrame f = new MyJFrame();
      f.setTitle("Drawing Graphics in Frames");
      f.setBounds(100,50,500,300);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
   }
   
   static class MyJFrame extends JFrame {
      public void paint(Graphics g) {
         g.drawRect(20,10,100,60);
      }
   }
}