package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class CircleApplet extends Applet
{
	
	public void init()
	{
		setForeground(Color.yellow);
		setSize(200,300);
	}
	
	public void paint(Graphics g)
	{
		g.drawOval(60, 60, 80, 80);
		g.fillOval(60, 60, 80, 80);
		showStatus("Circle is drawn");
	}
}



