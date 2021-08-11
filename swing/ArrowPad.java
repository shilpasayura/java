import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ArrowPad extends JPanel{
  JButton  down, left, right, up;
    public ArrowPad(){
     super();
     ArrowAction action;        
     down  = new JButton("\u2193");
        left  = new JButton("\u2190");
        right = new JButton("\u2192");
        up    = new JButton("\u2191");
 down.setActionCommand("DOWN");        
        left.setActionCommand("LEFT");        
        right.setActionCommand("RIGHT");        
        up.setActionCommand("UP");        

   // The same Action is used here for all of the JButton
   // objects. One could, instead, have a different Action for
        // each.
   action = new ArrowAction();
     down.addActionListener(action);
        left.addActionListener(action);
        right.addActionListener(action);
        up.addActionListener(action);

        setupKeyBindings();
        performLayout();
    }


    /*
     Perform the necessary steps to layout this ArrowPad.
     */

    private void performLayout(){
        Box bottom, main, top;
        setLayout(new FlowLayout(FlowLayout.CENTER));
        main   = Box.createVerticalBox();
        bottom = Box.createHorizontalBox();
        top    = Box.createHorizontalBox();
        top.add(up);
        bottom.add(left);
        bottom.add(down);
        bottom.add(right);
        main.add(top);
        main.add(bottom);
        add(main);
    }


    /*
     Setup the key bindings to use.
    In this implementation, the wasd keys correspond to the virtual
     * up, left, down, and right buttons. One could, alternatively or
     * additionally, use the arrow keys and/or the arrow keys on the
     * numeric keypad.
     */
    private void setupKeyBindings(){
        ActionMap actionMap;        
        InputMap  inputMap;
        actionMap = this.getActionMap();
        inputMap  = this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
 inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), "w");
        
actionMap.put("w", new ClickAction(up));
 inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), "a");

        actionMap.put("a", new ClickAction(left));
 inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "s");
        actionMap.put("s", new ClickAction(down));
 inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "d");
        actionMap.put("d", new ClickAction(right));
    }
}
