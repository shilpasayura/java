import javax.swing.*;
import java.awt.event.*;
 
public class SwingAction01 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Button Click Example");
        final JTextField text_field=new JTextField();       //JTextField object
        text_field.setBounds(50,100, 150,20);
        JButton click_button=new JButton("Click Me!!!");    //JButton object
        click_button.setBounds(20,50,75,30);
        click_button.addActionListener(new ActionListener(){    //add an event and take action
            public void actionPerformed(ActionEvent e){
                
                text_field.setText("You Clicked the button");
            }
        });
         
//add button and textfield to the frame
        frame.add(click_button);frame.add(text_field);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}