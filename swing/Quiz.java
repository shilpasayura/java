import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;


public class Quiz extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	//private ArrayList<Question> questions;
	//ArrayList<SingleQuestionPane> qpane;

	
	public Quiz() {
	  setTitle("Quiz");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setBounds(100, 100, 800, 400);
	  contentPane = new JPanel();
	  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	  setContentPane(contentPane);
	  contentPane.setLayout(new BorderLayout(0, 0));
		
	  JPanel panel = new JPanel();
	  contentPane.add(panel, BorderLayout.NORTH);
	  panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
	  JLabel lblName = new JLabel("Name: ");
	  panel.add(lblName);
		
	  txtName = new JTextField();
	  panel.add(txtName);
	  txtName.setColumns(10);
		
	  JScrollPane scrollPane = new JScrollPane();
	  panel.add(scrollPane);
	  panel.setBounds(0, 0, 800, 1200);
		
	  JButton btnSubmit = new JButton("Submit");
	
	  contentPane.add(btnSubmit, BorderLayout.SOUTH);
		
	  JScrollPane scrollPane_1 = new JScrollPane();
	  contentPane.add(scrollPane_1, BorderLayout.CENTER);
		
	  JPanel panel_1 = new JPanel();
	  scrollPane_1.setViewportView(panel_1);
	  panel_1.setLayout(new GridLayout(0, 1, 0, 0));
	}

public static void main(String[] args) {
	
	Quiz frame = new Quiz();
	   frame.setVisible(true);
	}


}
