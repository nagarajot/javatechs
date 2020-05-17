package in.codersclub.javatechs.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo extends JFrame 
{ 
	private JTree tree; 
	private JLabel lbl;
	private DefaultMutableTreeNode top, a, b, a1, a2, b1, b2, b3;
	private JScrollPane sp;
	
	public JTreeDemo() 
	{
		// Create top node of tree. 
		top = new DefaultMutableTreeNode("Options");

		// Create subtree of "A". 
		a = new DefaultMutableTreeNode("A"); 

		// Create subtree of "B". 
		b = new DefaultMutableTreeNode("B"); 

		// create the components for subtree of a
		a1 = new DefaultMutableTreeNode("A1"); 
		a2 = new DefaultMutableTreeNode("A2"); 
		
		// create the components for subtree of b
		b1 = new DefaultMutableTreeNode("B1"); 
		b2 = new DefaultMutableTreeNode("B2"); 
		b3 = new DefaultMutableTreeNode("B3"); 

		// add the components a, b to top
		top.add(a); 
		a.add(a1); 
		a.add(a2);
		
		top.add(b); 
		b.add(b1); 
		b.add(b2); 
		b.add(b3);
		
		// Create the components 
		tree = new JTree(top);
		sp = new JScrollPane(tree);
		lbl = new JLabel(); 

		// Handle tree selection events 
		tree.addTreeSelectionListener(new TreeSelectionListener() { 
			public void valueChanged(TreeSelectionEvent tse) { 
				lbl.setText("Selection is " + tse.getPath()); 
			} 
		});

		// Add components 
		add(sp);
		add(lbl, BorderLayout.SOUTH);

		setTitle("JTreeDemo");
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[])
	{
		new JTreeDemo();
	}
}


