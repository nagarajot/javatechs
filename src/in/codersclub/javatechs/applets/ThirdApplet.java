package in.codersclub.javatechs.applets;

import java.applet.Applet;
import java.awt.Graphics;

public class ThirdApplet extends Applet
{
 @Override
 public void init()
 {
  System.out.println("init() ...");
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
 }
 
} 

/*
Applet life cycle methods

public void init()
public void start()
public void paint(Graphics g)
public void stop()
public void destroy()
*/
