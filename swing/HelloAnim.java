import java.awt.*;  
import javax.swing.JFrame; 
/*
The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. 
*/

public class HelloAnim extends Canvas implements Runnable{
    static int x = 0;
    static int y = 0;

    static int width = 0;
    Thread my_thread = null;
    
    public static void init(){
        x = 200;
        y = 150;
        width = x;
      }

    public void start(){
        my_thread = new Thread(this);
        my_thread.start();
      }

    public void run(){
        while(true){
            repaint();
            x -= 10;
            if(x < 0){
              x = width;
            }
            try{
                Thread.sleep(100);
              }
            catch(InterruptedException e){
              System.out.println(e);
              }
          }
      }

    public void paint(Graphics g){
        g.drawString("Hello World!", x, y);
      }
      
      public static void main(String[] args){
         init();
      }
  }
