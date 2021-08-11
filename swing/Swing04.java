import javax.swing.*;

class JTextAreaExample {
    JTextAreaExample(){
        JFrame frame= new JFrame();
        JTextArea t_area=new JTextArea("JTextArea example");   //create object of JTextArea
        t_area.setBounds(10,30, 150,100);  //set its dimensions
        frame.add(t_area);      //add it to the frame
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
 
}
public class Swing04 {
    public static void main(String[] args) {
      new JTextAreaExample(); //create an object of TextAreaExample class
    }
}