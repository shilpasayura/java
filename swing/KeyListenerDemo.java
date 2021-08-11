import java.awt.*;  
import java.awt.event.*;  
public class KeyListenerDemo extends Frame implements KeyListener{  
    Label l;  
    TextArea area;  
    KeyListenerDemo(){  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
          
        add(l);add(area);  
        setSize(400,400);  
        setLayout(null);
      
      addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
   
        setVisible(true);  
    }  
    
    public void keyPressed(KeyEvent e) {  
        l.setText("Key Pressed");  
        int keyCode = e.getKeyCode();
        char c=e.getKeyChar();
        System.out.println(keyCode);
        System.out.println(c);
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) {  
        new KeyListenerDemo();  
    }  
}  