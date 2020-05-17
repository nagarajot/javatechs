package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

public class CrossApplet extends Applet
{
	private Dimension dimension;
	
	@Override
	public void init()
	{
		dimension = getSize();
	}
	
	public void paint(Graphics g)
	{
        g.drawLine(0, 0, dimension.width, dimension.height);
        g.drawString("Hello World", 100, 100);
	}
	
}



