import java.awt.Button; 
import java.awt.Color;
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
import javax.swing.BorderFactory;
  
import javax.swing.*;  
public class GridBagLayoutx {  
    
    public static void main(String[] args) {  
            GridBagLayoutx a = new GridBagLayoutx();  
    }  
    
    public GridBagLayoutx() {  
		
		JFrame f = new JFrame();
		f.setTitle("GridBag Layout Example");
		
		
		//f.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		 
		f.setSize(300, 300);
		
		//Creates a grid bag layout manager
		GridBagLayout grid = new GridBagLayout();
		
		  
		//gbc will have defaultConstraints
		GridBagConstraints gbc = new GridBagConstraints();  
		
		
		f.setLayout(grid);  
		
		
		// fill display area horizontally,
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		gbc.gridx = 0;  
		gbc.gridy = 0;  
		Button bx= new Button("Button one");
		f.add(bx, gbc); 
		
		gbc.gridx = 1;  
		gbc.gridy = 0;  
		f.add(new Button("Button two"), gbc);  
		
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		//specifies the internal padding
		gbc.ipady = 20;
		gbc.ipadx = 20;  
		gbc.gridx = 0;  
		gbc.gridy = 1;  
		f.add(new Button("Button Three"), gbc);  
		
		gbc.gridx = 1;  
		gbc.gridy = 1;  
		f.add(new Button("Button Four"), gbc);  
		

		gbc.gridx = 0;  
		gbc.gridy = 2;  
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		gbc.gridwidth = 3;  
		f.add(new Button("Button Five"), gbc);  
		
			  
		
		/*
		GridBagLayout layout = new GridBagLayout();  
		this.setLayout(layout);  
		 
		    button.setPreferredSize(new Dimension( 420, 30));
            setPreferredSize(getSize()); 
            */ 
            f.setVisible(true);  
              
      
        }  
      
}  
