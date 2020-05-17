package in.codersclub.javatechs.swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo extends JFrame 
{
	private JTable table;
	private JScrollPane sp;
	
	public JTableDemo() 
	{
		// Initialize column headings. 
		String[] colHeads = { "Name", "Extension", "ID#" };
		// Initialize data. 
		Object[][] data = { 
				{ "Gail", "4567", "865" }, 
				{ "Ken", "7566", "555" }, 
				{ "Viviane", "5634", "587" }, 
				{ "Melanie", "7345", "922" }, 
				{ "Anne", "1237", "333" }, 
				{ "John", "5656", "314" }, 
				{ "Matt", "5672", "217" }, 
				{ "Claire", "6741", "444" }, 
				{ "Erwin", "9023", "519" }, 
				{ "Ellen", "1134", "532" }, 
				{ "Jennifer", "5689", "112" }, 
				{ "Ed", "9030", "133" }, 
				{ "Helen", "6751", "145" } 
		};

		// Create the table. 
		table = new JTable(data, colHeads);
		
		// create component 
		sp = new JScrollPane(table);
		
		// Add the component 
		add(sp);
		
		setTitle("JTableDemo");
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new JTableDemo();
	}
}




