/*
File   Edit    View    Help 
New                    Help
Open                   ---------                   
Close                  About
Exit

separator line added using JSeparator
*/

package in.cdoc.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Menu4 extends JFrame 
{
	JMenu fileMenu;
	JMenu editMenu;
	JMenu viewMenu;
	JMenu helpMenu;

	JMenuBar menuBar;

	JMenuItem new1;
	JMenuItem open;
	JMenuItem close;
	JMenuItem exit;
	
	JMenuItem help;
	JMenuItem about;

	JSeparator separator;
	
	public Menu4()
	{
		setTitle("Menu 4 - Separator using JSeparator");
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		separator = new JSeparator();
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		viewMenu = new JMenu("View");
		helpMenu = new JMenu("Help");
		
	    setJMenuBar(menuBar);
	    
	    menuBar.add(fileMenu);
	    menuBar.add(editMenu);
	    menuBar.add(viewMenu);
	    menuBar.add(helpMenu);

	    new1 = new JMenuItem("New");
	    open = new JMenuItem("Open");
	    close = new JMenuItem("Close");
	    exit = new JMenuItem("Exit");
	    
	    fileMenu.add(new1);
	    fileMenu.add(open);
	    fileMenu.add(close);
	    fileMenu.add(exit);
	    
	    help = new JMenuItem("Help");
	    about = new JMenuItem("About");
	    
	    helpMenu.add(help);
        helpMenu.add(separator);
	    helpMenu.add(about);
    }
	
	public static void main(String args[])
	{
         new Menu4();
	}
}













