import java.awt.*;  
import java.awt.event.*;  

  
public class ActionEvent implements ActionListener{  

public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome Actions.");  
}

public static void main(String[] args) {  
    Frame f=new Frame("ActionListener Demo");  
    TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  
    
    b.addActionListener();  
    f.add(b);
    f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
  
}