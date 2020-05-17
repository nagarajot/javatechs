package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventsApplet extends Applet implements KeyListener
{
	@Override
	public void init()
	{
		addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent ke)
	{
	   System.out.println("Key pressed ...");	
	}
	
	@Override
	public void keyReleased(KeyEvent ke)
	{
		System.out.println("Key released ...");
	}
	
	@Override
	public void keyTyped(KeyEvent ke)
	{
		System.out.println("key typed ...");
	}
}


