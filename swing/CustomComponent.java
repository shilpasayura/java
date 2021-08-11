import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomComponent extends JPanel{
	
	private int circleY = 0;
	
	public CustomComponent(){
      System.out.println("Hello");
		setBackground(new Color(0, 255, 255));
	
		new Timer(16, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				step();
				repaint();
			}
		}).start();
	}
	
	private void step(){
		circleY++;
		if(circleY > getHeight()){
			circleY = 0;
		}
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillOval(getWidth()/2 - 10, circleY, 20, 20);
	}
   
   public static void main(String args[])  { 
      CustomComponent c= new CustomComponent();  
   } 

}