import java.awt.*;
import javax.swing.*;
public class GridBagLayoutTest {
   public static void main(String[] a) {
      JFrame frame = new JFrame("GridBagLayout Test");
      Container myPane = frame.getContentPane();
      myPane.setLayout(new GridBagLayout());
      GridBagConstraints c = new GridBagConstraints();
      setMyConstraints(c,0,0,GridBagConstraints.CENTER);
      myPane.add(getFieldPanel(),c);
      setMyConstraints(c,0,1,GridBagConstraints.CENTER);
      myPane.add(getButtonPanel(),c);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 250);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   private static JPanel getFieldPanel() {
      JPanel p = new JPanel(new GridBagLayout());
      p.setBorder(BorderFactory.createTitledBorder("Details"));
      GridBagConstraints c = new GridBagConstraints();
      setMyConstraints(c,0,0,GridBagConstraints.EAST);
      p.add(new JLabel("Name:"),c);
      setMyConstraints(c,1,0,GridBagConstraints.WEST);
      p.add(new JTextField(16),c);
      setMyConstraints(c,0,1,GridBagConstraints.EAST);
      p.add(new JLabel("System:"),c);
      setMyConstraints(c,1,1,GridBagConstraints.WEST);
      p.add(getSystemPanel(),c);
      setMyConstraints(c,0,2,GridBagConstraints.EAST);
      p.add(new JLabel("Language:"),c);
      setMyConstraints(c,1,2,GridBagConstraints.WEST);
      p.add(getLanguagePanel(),c);
      setMyConstraints(c,0,3,GridBagConstraints.EAST);
      p.add(new JLabel("Year:"),c);
      setMyConstraints(c,1,3,GridBagConstraints.WEST);
      p.add(new JComboBox(new String[] {"2019","2020","2021"}),c);
      return p;
   }
   private static JPanel getButtonPanel() {
      JPanel p = new JPanel(new GridBagLayout());
      p.add(new JButton("OK"));
      p.add(new JButton("Cancel"));
      return p;
   }
   private static JPanel getSystemPanel() {
      JRadioButton winButton = new JRadioButton("Windows",true);
      JRadioButton macButton = new JRadioButton("Mac",false);
      ButtonGroup systemGroup = new ButtonGroup();
      systemGroup.add(winButton);
      systemGroup.add(macButton);
      JPanel p = new JPanel(new GridBagLayout());
      p.add(winButton);
      p.add(macButton);
      return p;
   }
   private static JPanel getLanguagePanel() {
     JPanel p = new JPanel(new GridBagLayout());
      p.add(new JCheckBox("Java",true));
      p.add(new JCheckBox("Python",true));
      p.add(new JCheckBox("Spark",false));
      return p;
   }
   private static void setMyConstraints(GridBagConstraints c, int gridx, int gridy, int anchor) {
      c.gridx = gridx;
      c.gridy = gridy;
      c.anchor = anchor;
   }
}
