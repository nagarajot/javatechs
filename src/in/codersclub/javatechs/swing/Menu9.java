/*
 * 
      Sub menus example 
 * 
 * 
 */

package in.cdoc.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.EtchedBorder;

public class Menu9 extends JFrame implements ActionListener
{
	JMenuBar menuBar;
	
	JMenu fileMenu;
	
	JMenuItem new1;
	JMenuItem open;
	JCheckBoxMenuItem status;
	JMenuItem close;

	JLabel statusBar;
	
	public Menu9()
	{
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		
        new1 = new JMenuItem("New");
        open = new JMenuItem("Open");
        status = new JCheckBoxMenuItem("Status",true);
        close = new JMenuItem("Close");
	
        statusBar = new JLabel("");
        
		setJMenuBar(menuBar);	
	    menuBar.add(fileMenu);

        setTitle("Menu8 - title");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
    
        fileMenu.add(new1);
        fileMenu.add(open);
        fileMenu.add(status);
        fileMenu.add(close);

	    status.setVisible(true);
 	    
	    status.addActionListener(this);
	    
        Container c = super.getContentPane();
        c.setLayout(new BorderLayout());

        statusBar.setBorder(new EtchedBorder());
        c.add(statusBar, BorderLayout.SOUTH);

	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if ( status.isSelected() )
		{	
//			status.setVisible(true);
            statusBar.setText("Status bar");
		}
		else
		{
//			status.setVisible(false);
			statusBar.setText("");
		}
	}

    public static void main(String args[])
    {
    	new Menu9();
    }

}







