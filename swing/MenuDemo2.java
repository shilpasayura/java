import javax.swing.*;
import java.awt.event.*;    
import java.awt.Color;
  
public class MenuDemo2 implements ActionListener {  
          JFrame f;
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
          
	MenuDemo2(){  
          f= new JFrame("Menu and MenuItem");
          f.getContentPane().setBackground(Color.YELLOW);  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("Item 1");  
          i2=new JMenuItem("Item 2");  
          i3=new JMenuItem("Item 3");  
          i4=new JMenuItem("Item 4");  
          i5=new JMenuItem("Item 5");
          
          i1.addActionListener(this);    
          i2.addActionListener(this);
          i3.addActionListener(this);    
          i4.addActionListener(this);
          i5.addActionListener(this);
          menu.add(i1); 
          menu.add(i2); 
          menu.add(i3);  
          submenu.add(i4); 
          submenu.add(i5);  
          menu.add(submenu);  
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}  

public void actionPerformed(ActionEvent e) {    

if(e.getSource()==i1)    {
   f.getContentPane().setBackground(Color.RED);
}
else if(e.getSource()==i2)    {
   f.getContentPane().setBackground(Color.GREEN);
}
else if(e.getSource()==i3)    {
   f.getContentPane().setBackground(Color.BLUE);
}
else if(e.getSource()==i4)    {
   f.getContentPane().setBackground(Color.YELLOW);
}
else if(e.getSource()==i5)    {
   f.getContentPane().setBackground(Color.WHITE);
}

}     


public static void main(String args[])  {  
new MenuDemo2();  
}}  


