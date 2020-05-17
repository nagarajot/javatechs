package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DrawApplet extends Applet
{
 String msg;
 @Override
 public void init()
 {
  setBackground(Color.cyan);
  setForeground(Color.red);
  msg = "init() ...\n";
 }
 
 @Override
 public void start()
 {
  msg += "start() ...\n";
 }
 
 @Override
 public void paint(Graphics g)
 {
  msg += "paint() ...\n";
  g.drawString(msg, 10, 30);
 }
 
 @Override
 public void stop()
 {
	 msg += "stop() ...";
 }
 
 @Override
 public void destroy()
 {
	 msg += "destroy()";
 }
 
}

/*
  init() id displayed only once.
  start() is displayed only once
  paint() is displayed multiple times.
  stop() is displayed, but not visible.
  destroy() is displayed, but not visible.
*/

