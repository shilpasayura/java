//Instantiating The JFrame Class

import javax.swing.*;
public class Swing02 {
 
    public static void main(String[] args) {
        JFrame f=new JFrame("JFrameInstanceExample");//create a JFrame object
 
        JButton b=new JButton("JFrameButton");//create instance of JButton
        b.setBounds(100,50,150, 40);//dimensions of JButton object
 
        f.add(b);//add button in JFrame
 
        f.setSize(300,200);//set frame width = 300 and height = 200
        f.setLayout(null);//no layout manager specified
        f.setVisible(true);//make the frame visible
    }
}