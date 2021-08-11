// Packages to import 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 

public class JTableDemo { 
	// frame 
	JFrame f; 
	
	// Table 
	JTable j; 

	// Constructor 
	JTableDemo() 
	{ 
		// Frame initiallization 
		f = new JFrame(); 

		// Frame Title 
		f.setTitle("JTable Demo"); 

		// Data to be displayed in the JTable 
		String[][] data = { 
			{ "Ama Perera", "2012", "Physics" }, 
			{ "Cima Silva", "6014", "ICT" },
			{ "Dima Sekar", "2014", "Math" } 
		}; 

		// Column Names 
		String[] columnNames = { "Name", "Code", "Subject" }; 

		// Initializing the JTable 
		j = new JTable(data, columnNames); 
		j.setBounds(30, 40, 200, 300); 

		// adding it to JScrollPane 
		JScrollPane sp = new JScrollPane(j); 
		f.add(sp); 
		// Frame Size 
		f.setSize(500, 200); 
		// Frame Visible = true 
		f.setVisible(true); 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		new JTableDemo(); 
	} 
} 
