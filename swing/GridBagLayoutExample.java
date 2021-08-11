package swing_1;

import javax.swing.JFrame;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Container;

public class GridBagLayoutExample{
	
    static final boolean shouldFill = true;
    static final boolean shouldWeightX = true;
    static final boolean RIGHT_TO_LEFT = false;
    
    public GridBagLayoutExample() {
        pane.setLayout(new GridBagLayout());
        final GridBagConstraints c = new GridBagConstraints();
        c.fill = 2;
        JButton button = new JButton("Button 1");
        c.weightx = 0.5;
        c.fill = 2;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(button, c);
        button = new JButton("Button 2");
        c.fill = 2;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(button, c);
        button = new JButton("Button 3");
        c.fill = 2;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button, c);
        button = new JButton("Long-Named Button 4");
        c.fill = 2;
        c.ipady = 40;
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(button, c);
        button = new JButton("5");
        c.fill = 2;
        c.ipady = 0;
        c.weighty = 1.0;
        c.anchor = 20;
        c.insets = new Insets(10, 0, 0, 0);
        c.gridx = 1;
        c.gridwidth = 2;
        c.gridy = 2;
        pane.add(button, c);
    }
    
    private static void createAndShowGUI() {
        final JFrame frame = new JFrame("GridBagLayoutExample");
        frame.setDefaultCloseOperation(3);
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(final String[] args) {
        GridBagLayoutExample gbe=new GridBagLayoutExample();
    }
}


