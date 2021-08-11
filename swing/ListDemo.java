import javax.swing.*;  
public class ListDemo {  
     ListDemo(){  
        JFrame f= new JFrame();  

        DefaultListModel<String> listM1 = new DefaultListModel<>();       
        listM1.addElement("Yellow");  
        listM1.addElement("Red");  
        listM1.addElement("Green");  
          
        JList<String> list = new JList<>(listM1);  
        list.setBounds(100,100, 75,75);  
        f.add(list);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     } 
 
public static void main(String args[]){  
   new ListDemo();  
}}  
