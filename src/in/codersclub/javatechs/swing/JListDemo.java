package in.codersclub.javatechs.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame { 
	private JList jlst; 
	private JLabel lbl; 
	private JScrollPane scPane;

	// Create an array of cities. 
	String cities[] = { "New York", "Chicago", "Houston", "Seattle", "London", "Paris", "New Delhi", "Hong Kong", "Tokyo", "Sydney" };

	public JListDemo() {
		// set the layout. 
		setLayout(new FlowLayout());

		// Create the components 
		jlst = new JList(cities);
		scPane = new JScrollPane(jlst);
		lbl = new JLabel("Choose a City");

		// Set the list selection mode to single selection. 
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Set the preferred size of the scroll pane. 
		scPane.setPreferredSize(new Dimension(120, 90));
		
		// Add selection listener for the list. 
		jlst.addListSelectionListener(new ListSelectionListener() { 
			public void valueChanged(ListSelectionEvent le) { 
				// Get the index of the changed item. 
				int idx = jlst.getSelectedIndex();
				
				lbl.setText("Current selection: " + cities[idx]); 
			} 
		});
	
		// Add the list and label to the content pane. 
		add(scPane); 
		add(lbl);

		setTitle("JListDemo");
		setSize(600,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new JListDemo();
	}
}


