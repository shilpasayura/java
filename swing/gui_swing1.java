import javax.swing.*;
class gui_swing1{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       //Create a Button
       JButton button = new JButton("Press Me");
       // Adds Button to content pane of frame
       frame.getContentPane().add(button); 
       frame.setVisible(true);
    }
}
