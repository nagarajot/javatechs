package in.cdoc.applets;

import java.applet.Applet;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventsApplet extends Applet implements WindowListener
{
@Override
	public void init()
	{
//		addWindowListener(this);
	}
	
	@Override
	public void windowActivated(WindowEvent we)
	{
		System.out.println("windowActivated ...");
	}
	
	@Override
	public void windowDeactivated(WindowEvent we)
	{
		System.out.println("windowDeactivated ...");
	}
	
	
	public void windowClosed(WindowEvent we)
	{
		System.out.println("windowClosed ...");
	}
	
	public void windowClosing(WindowEvent we)
	{
		System.out.println("windowClosing ...");
	}
	
	public void windowOpened(WindowEvent we)
	{
		System.out.println("windowOpened");
	}
	
	@Override
	public void windowIconified(WindowEvent we)
	{
		System.out.println("window iconified ...");
	}
	
	@Override
	public void windowDeiconified(WindowEvent we)
	{
		System.out.println("window deiconified");
	}
	
	
}