import java.awt.*;
import java.awt.Color;  
import java.awt.Image;
import java.awt.Dimension;
import java.awt.event.*;  
import java.awt.Canvas;
import java.awt.Graphics2D;
import javax.swing.Timer;  
import javax.swing.ImageIcon;
import javax.swing.JPanel;  
import javax.swing.JFrame;
import java.util.Random;
  

class MyPanel extends JPanel implements ActionListener{
   final int PANEL_WIDTH = 420; 
   final int PANEL_HEIGHT = 420; 
   Image enemy; 
   Image backgroundImage; 
   Timer timer; 
   int xVelocity = 2; 
   int yVelocity = 1; 
   //int x = 0; 
   //int y = 0;
   Random random = new Random();
   int x=random.nextInt(PANEL_WIDTH-60);
   int y=random.nextInt(PANEL_WIDTH-60);
   
   
   MyPanel(){
      this.setPreferredSize(new Dimension(420, 420));
      System.out.println( x + " " + y);   
      //setPreferredSize(new Diamension(PANEL_WIDTH, PANEL_HEIGHT));
      this.setBackground(Color.BLACK);
      enemy=new ImageIcon("enemy.png").getImage();
      backgroundImage=new ImageIcon("earth.png").getImage();

      timer = new Timer(10 ,this);
      timer.start();
      
  }
  
  public void paint( Graphics g){
   super.paint(g);
   Graphics2D g2d= (Graphics2D) g;
   
   g2d.drawImage(backgroundImage, 0, 0, null);
   g2d.drawImage(enemy, x, y, null); 
  }
  
  
  public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH-enemy.getWidth(null) || x < 0 ) {
            xVelocity = xVelocity * -1;
            
        }
        
        if(y >= PANEL_HEIGHT-enemy.getHeight(null) || y < 0 ) {
            yVelocity = yVelocity * -1;
        }
         x = x + xVelocity ; 
         y = y + yVelocity;
          
         
         repaint();
  }
}
  


class MyFrame extends JFrame{ 
      MyPanel panel;
      
      MyFrame() {
         panel = new MyPanel();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         this.add(panel); 
         this.pack(); 
         this.setLocationRelativeTo(null); 
         this.setVisible(true);
         ImageIcon image = new ImageIcon("logo.png");
         this.setIconImage(image.getImage()); 
        //frame.getContentPane().setBackground(new Color(0,0,0));
    }  
  
}  


public class Animation {  
    public static void main(String[] args) {
      new MyFrame();
    }
}

/*
public void paint(Graphics g) {  
        g.drawString("Hello",40,40);  
        setBackground(Color.YELLOW);  
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
          
    }  
    
    */