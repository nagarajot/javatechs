/*
File       Edit       View        Help 
New                               Help
Open                              About                   
Close                  
Exit

Using function keys as accelerator keys
*
*/

package in.cdoc.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

public class Menu7 extends JFrame implements ActionListener
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
	
	public Menu7()
	{
		setTitle("Menu 7 - Using function keys as accelerator keys");
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

	    KeyStroke f1KeyStroke = KeyStroke.getKeyStroke("F1");
	    help.setAccelerator(f1KeyStroke);
	    
	    KeyStroke f2KeyStroke = KeyStroke.getKeyStroke("F2");
	    about.setAccelerator(f2KeyStroke);
	    
	    helpMenu.add(help);
        helpMenu.add(separator);
	    helpMenu.add(about);
	    
	    help.addActionListener(this);
	    about.addActionListener(this);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
        System.out.println("command = " + command);
		
		switch ( command )
		{
		case "Help" :
			JOptionPane.showMessageDialog(null,"Help option selected");
			break;
			
		case "About" :
			JOptionPane.showMessageDialog(null,"About option selected");
			break;
			
			
		}
	}
	
	public static void main(String args[])
	{
         new Menu7();
	}
}













