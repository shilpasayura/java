import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class PersonalInfo extends JFrame {

private static final long serialVersionUID = 1L;

public JTextField getTextField_5() {
   return UID;
}


public void setTextField_5(JTextField textField_5) {
   this.UID = textField_5;
}

private JFrame frame;

public JPasswordField getPasswordField() {
   return passwordField;
}

public void setPasswordField(JPasswordField passwordField) {
   this.passwordField = passwordField;
}

private JTextField txtFName;

ButtonGroup bg = new ButtonGroup();

public JTextField UID;

JButton btnNewButton;

JButton btnCancel;

PersonalInfo window;

private JPasswordField passwordField;

public static void main(String[] args) {
PersonalInfo window = new PersonalInfo();
window.frame.setVisible(true);
window.pack();
}

public PersonalInfo() {
   initialize();
}

private void initialize() { 
   frame = new JFrame();
   frame.setBounds(100, 100, 450, 468); 
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.getContentPane().setLayout(null);
   
   JLabel lblFullName = new JLabel("Full Name"); 
   lblFullName.setBounds(44, 94, 76, 14);
   frame.getContentPane().add(lblFullName); 
   JLabel lblNewLabel_3 = new JLabel("Personal Information Form");
   lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
   lblNewLabel_3.setBounds(115, 11, 200, 50);
   frame.getContentPane().add(lblNewLabel_3);
   txtFName = new JTextField();
   txtFName.setColumns(10); 
   txtFName.setBounds(159, 91, 180, 20);
   frame.getContentPane().add(txtFName);
   JLabel lblSex = new JLabel("Gender");
   lblSex.setBounds(44, 174, 92, 14);
   frame.getContentPane().add(lblSex);
   JRadioButton rdbtnMale = new JRadioButton("Male"); 
   rdbtnMale.setBounds(169, 168, 60, 23);
   frame.getContentPane().add(rdbtnMale);
   bg.add(rdbtnMale); 
   JRadioButton rdbtnFemale = new JRadioButton("Female");
   rdbtnFemale.setBounds(240, 168, 75, 23);
   frame.getContentPane().add(rdbtnFemale);
   bg.add(rdbtnFemale);
   JLabel lblNationalId = new JLabel("National ID");
   lblNationalId.setBounds(44, 67, 76, 14);
   frame.getContentPane().add(lblNationalId);
   JTextField txtNatid = new JTextField();
   txtNatid.setColumns(10);
   txtNatid.setBounds(159, 60, 180, 20);
   frame.getContentPane().add(txtNatid);
   JLabel lblUserId = new JLabel("Username");
   lblUserId.setBounds(44, 248, 76, 14);
   frame.getContentPane().add(lblUserId);
   UID = new JTextField();
   UID.setColumns(10);
   UID.setBounds(159, 245, 180, 20);
   frame.getContentPane().add(UID);
   JLabel lblPassword = new JLabel("Password");
   lblPassword.setBounds(44, 296, 76, 14);
   frame.getContentPane().add(lblPassword);
   btnNewButton = new JButton("Submit");
   btnNewButton.setBounds(159, 360, 89, 23);
   frame.getContentPane().add(btnNewButton);
   btnCancel = new JButton("Cancel");
   btnCancel.setBounds(258, 360, 89, 23);
   frame.getContentPane().add(btnCancel);
   passwordField = new JPasswordField();
   passwordField.setEchoChar('*'); 
   passwordField.setBounds(159,293, 180, 20);
   frame.getContentPane().add(passwordField);
   actionlogin();
}

   private void actionlogin() {
   }
}