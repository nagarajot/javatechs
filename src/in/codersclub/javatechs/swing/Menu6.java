/*
File   Edit    View    Help 
New                    Help
Open                   ---------                   
Close                  About
Exit

Hot keys may be set by using 2 methods.
Use of setMnemonic() method.
Set the hot key in the constructor of menu item.
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

public class Menu6 extends JFrame implements ActionListener
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
	
	public Menu6()
	{
		setTitle("Menu 6 - Using hot keys setMnemonic() methods");
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
	    open = new JMenuItem("Open",KeyEvent.VK_O);
	    close = new JMenuItem("Close");
	    exit = new JMenuItem("Exit");

        new1.setMnemonic('N');
	    
	    fileMenu.add(new1);
	    fileMenu.add(open);
	    fileMenu.add(close);
	    fileMenu.add(exit);
	    
	    help = new JMenuItem("Help");
	    about = new JMenuItem("About");
	    
	    helpMenu.add(help);
        helpMenu.add(separator);
	    helpMenu.add(about);
	    
	    new1.addActionListener(this);
	    open.addActionListener(this);
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
        System.out.println("command = " + command);
		
		switch ( command )
		{
		case "New" :
			JOptionPane.showMessageDialog(null,"New option selected");
			break;
			
		case "Open" :
			JOptionPane.showMessageDialog(null,"Open option selected");
			break;
		}
	}
	
	public static void main(String args[])
	{
         new Menu6();
	}
}













