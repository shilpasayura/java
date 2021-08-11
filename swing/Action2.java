
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.BoxLayout;
 
public class Action2 implements ActionListener {
 
    JFrame frame;
    JButton button;
    JButton buttonY, buttonR, buttonG;
    JPanel panel;
    
    public Action2() {
        
        
        buttonY = new JButton("Yellow");
        buttonR = new JButton("Red");
        buttonG = new JButton("Green");
        
        
        frame = new JFrame("Action Test");
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS); 
        panel.setLayout(boxlayout);
     
        buttonY.addActionListener(this);
        buttonR.addActionListener(this);
        buttonG.addActionListener(this);
        
        panel.add(buttonY);
        panel.add(buttonR);
        panel.add(buttonG);
        
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==buttonY){
		   buttonY.setBackground(Color.YELLOW);
	   }
	   else if(e.getSource()==buttonR){
	   	buttonR.setBackground(Color.RED);
	   }
      else if(e.getSource()==buttonG){
	   	buttonG.setBackground(Color.GREEN);
	   }
    }
 
    public static void main(String args[]) {
        Action2 test = new Action2();
    }
}

