import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// http://www.cs.stir.ac.uk/~sbj/examples/Java-applications/

public class DrawExample extends JFrame 
    implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        DrawExample frame = new DrawExample();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        paper.drawLine(0, 0, 100, 100);
    }
}