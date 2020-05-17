package in.codersclub.javatechs.swing;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo extends JFrame 
{
	private JTabbedPane tp;
	
	public JTabbedPaneDemo() 
	{
		tp = new JTabbedPane(); 
		tp.addTab("Cities", new CitiesPanel()); 
		tp.addTab("Colors", new ColorsPanel()); 
		tp.addTab("Flavors", new FlavorsPanel()); 
		
		// add components
		add(tp);
		
		setTitle("JTabbedPaneDemo");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new JTabbedPaneDemo();
	}
}

// Make the panels that will be added to the tabbed pane. 
class CitiesPanel extends JPanel 
{
	private JButton btn1, btn2, btn3, btn4;
	
	public CitiesPanel() {
		
		// create components
		btn1 = new JButton("New York"); 
		btn2 = new JButton("London"); 
		btn3 = new JButton("Hong Kong");
		btn4 = new JButton("Tokyo"); 

		// add components
		add(btn1); 
		add(btn2); 
		add(btn3); 
		add(btn4);
	}
}


class ColorsPanel extends JPanel 
{
	private JCheckBox cb1, cb2, cb3;
	
	public ColorsPanel() 
	{ 
		// create components
		cb1 = new JCheckBox("Red"); 
		cb2 = new JCheckBox("Green"); 
		cb3 = new JCheckBox("Blue"); 

		// add components
		add(cb1); 
		add(cb2); 
		add(cb3); 
	}
}

class FlavorsPanel extends JPanel 
{
	private JComboBox cb;
	
	public FlavorsPanel() 
	{ 
		// create components
		cb = new JComboBox(); 
		cb.addItem("Vanilla"); 
		cb.addItem("Chocolate"); 
		cb.addItem("Strawberry"); 
		
		// add components
		add(cb); 
	}
}





