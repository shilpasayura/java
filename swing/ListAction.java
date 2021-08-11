import javax.swing.*;  
public class ListAction {  
     ListAction(){  
        JFrame f= new JFrame();  

        DefaultListModel<String> listM1 = new DefaultListModel<>();       
        listM1.addElement("Yellow");  
        listM1.addElement("Red");  
        listM1.addElement("Green");  
          
        JList<String> list = new JList<>(listM1);  
        list.setBounds(100,100, 75,75);
        
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
            jList1ValueChanged(evt);
            }
          });          
        f.add(list);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     } 
 
   private void jList1ValueChanged(ListSelectionEvent evt) {
    if (!list.getValueIsAdjusting()) {
      list.setBackground(Color.YELLOW);
      // jList1.getSelectedValue());
    }
  }
  
public static void main(String args[]){  
   new ListAction();  
}}  
