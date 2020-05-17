/*
 * 
      Sub menus example 
 * 
 * 
 */

package in.cdoc.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu8 extends JFrame 
{
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu tableMenu;
    JMenu printMenu;
	
	JMenuItem new1;
	JMenuItem open;
	JMenuItem print;
	JMenuItem save;
	JMenuItem close;
	
	JMenuItem portrait;
	JMenuItem landscape;
	
	public Menu8()
	{
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		printMenu = new JMenu("Print");
		
        new1 = new JMenuItem("New");
        open = new JMenuItem("Open");
        print = new JMenuItem("Print");
        save = new JMenuItem("Save");
        close = new JMenuItem("Close");
        
        portrait = new JMenuItem("Portrait");
        landscape = new JMenuItem("Landscape");
        
		
		setJMenuBar(menuBar);	
	    menuBar.add(fileMenu);

        setTitle("Menu8 - title");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	    
	    
	    
        printMenu.add(portrait);
        printMenu.add(landscape);
    
        fileMenu.add(new1);
        fileMenu.add(open);
        fileMenu.add(printMenu);
       fileMenu.add(save);
       fileMenu.add(close);
	    
	}
	
	public static void main(String args[])
	{
		new Menu8();
	}
}







