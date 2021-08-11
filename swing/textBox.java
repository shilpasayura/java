import java.awt.event.*;
import javax.swing.*;

public class textBox extends JFrame implements ActionListener {
	static JTextField t;// JTextField
	static JFrame f;
	static JButton b;
	static JLabel l;

	// default constructor
	textBox(){}
   
   void createGUI(textBox te){
      f = new JFrame("textfield");
   	l = new JLabel("nothing entered");
   	b = new JButton("submit");
   	
   	// addActionListener to button
   	b.addActionListener(te);
   	// create a object of JTextField with 16 columns
   	t = new JTextField(16);
   	JPanel p = new JPanel();
   	p.add(t);
   	p.add(b);
   	p.add(l);
   	f.add(p);
      f.setSize(300, 300);
   	f.show();
   }
	public static void main(String[] args){
   textBox te = new textBox();
	te.createGUI(te);
	}

	// if the button is pressed
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if (s.equals("submit")) {
		// set the text of the label to the text of the field
		l.setText(t.getText());
	   // set the text of field to blank
		t.setText(" ");
		}
	}
}
