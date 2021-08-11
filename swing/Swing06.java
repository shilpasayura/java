import javax.swing.*;
 
public class Swing06 {
    public static void main(String[] args) {
        JFrame frame= new JFrame("JList Example");
        //create a list model and add items to it
        DefaultListModel colors = new DefaultListModel();
        colors.addElement("Red");
        colors.addElement("Green");
        colors.addElement("Blue");
        //create JList object and add listModel to it
        JList colorsList = new JList(colors);
        colorsList.setBounds(100,100, 75,50);
        frame.add(colorsList);              //add list to the frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}