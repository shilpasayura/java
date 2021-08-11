
import java.awt.*;  
class AwtDemo1 extends Frame{  
	AwtDemo1(){  
    
	Button b=new Button("Click me");
	// setting button position  
	b.setBounds(30,100,80,30);  
      add(b);//adding button into frame  
      setSize(300,300);//set frame size   
      setLayout(null);//no layout manager  
      setVisible(true);//frame becomes visible  
 }  
public static void main(String args[]){  
AwtDemo1 f=new AwtDemo1();  
}}  
