package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class FourthApplet extends Applet
{
 @Override
 public void init()
 {
  System.out.println("init() ...");
  setBackground(Color.yellow);
  setForeground(Color.blue);
 }
 
 @Override
 public void start()
 {
  System.out.println("start() ...");
 }
 
 @Override
 public void stop()
 {
  System.out.println("stop() ...");
 }
 
 @Override
 public void destroy()
 {
  System.out.println("destroy() ...");
 }
 
 @Override
 public void paint(Graphics g)
 {
  System.out.println("paint() ...");
  g.drawString("Computer Science", 50, 120);
  g.drawLine(0, 0, 100, 100);
 }
} 













